package com.efairway.shop.utils.slx;

import com.google.gson.JsonArray;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.efairway.shop.constants.Constants;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class ExcelToJsonConverterUtils {
    private static final Logger LOGGER = LoggerFactory.getLogger(ExcelToJsonConverterUtils.class);

    public static JsonObject getExcelDataAsJsonObject(File excelFile) {

        JsonObject sheetsJsonObject = new JsonObject();
        Workbook workbook = null;
        String absolutePath = excelFile.getAbsolutePath();
        String extension = absolutePath
                .substring(absolutePath.lastIndexOf(".") + 1);
        try {
            switch (extension) {
                case Constants.XLSX:
                    workbook = new XSSFWorkbook(excelFile);
                    break;
                case Constants.XLS:
                    POIFSFileSystem poifsFileSystem = new POIFSFileSystem(excelFile);
                    workbook = new HSSFWorkbook(poifsFileSystem);
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + extension);
            }
        } catch (IOException | InvalidFormatException e) {
            LOGGER.error(
                    "ExcelUtils -> getExcelDataAsJsonObject() :: Exception thrown constructing XSSFWorkbook from provided excel file.  InvalidFormatException | IOException => ");
        }

        for (int i = 0; i < workbook.getNumberOfSheets(); i++) {

            JsonArray sheetArray = new JsonArray();
            ArrayList<String> columnNames = new ArrayList<String>();
            Sheet sheet = workbook.getSheetAt(i);
            Iterator<Row> sheetIterator = sheet.iterator();

            while (sheetIterator.hasNext()) {

                Row currentRow = sheetIterator.next();
                JsonObject jsonObject = new JsonObject();

                if (currentRow.getRowNum() != 0) {

                    for (int j = 0; j < columnNames.size(); j++) {

                        if (currentRow.getCell(j) != null) {
                            if (currentRow.getCell(j).getCellTypeEnum() == CellType.STRING) {
                                jsonObject.addProperty(columnNames.get(j), currentRow.getCell(j).getStringCellValue());
                            } else if (currentRow.getCell(j).getCellTypeEnum() == CellType.NUMERIC) {
                                Cell cell =currentRow.getCell(j);
                                if (DateUtil.isCellDateFormatted(cell)) {
                                    DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                                    Date date = cell.getDateCellValue();
                                    String reportDate = df.format(date);
                                    jsonObject.addProperty(columnNames.get(j), reportDate);
                                }
                                else {
                                    jsonObject.addProperty(columnNames.get(j), currentRow.getCell(j).getNumericCellValue());
                                }
                            } else if (currentRow.getCell(j).getCellTypeEnum() == CellType.BOOLEAN) {
                                jsonObject.addProperty(columnNames.get(j), currentRow.getCell(j).getBooleanCellValue());
                            } else if (currentRow.getCell(j).getCellTypeEnum() == CellType.BLANK) {
                                jsonObject.add(columnNames.get(j), JsonNull.INSTANCE);
                            }
                        } else {
                            jsonObject.add(columnNames.get(j), JsonNull.INSTANCE);
                        }

                    }

                    sheetArray.add(jsonObject);

                } else {
                    // store column names
                    for (int k = 0; k < currentRow.getPhysicalNumberOfCells(); k++) {
                        columnNames.add(currentRow.getCell(k).getStringCellValue());
                    }
                }

            }

            sheetsJsonObject.add(workbook.getSheetName(i), sheetArray);

        }

        return sheetsJsonObject;
    }
    }