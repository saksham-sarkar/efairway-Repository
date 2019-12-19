package com.efairway.shop.utils.slx;

        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStream;
        import java.io.InputStreamReader;
        import java.io.Reader;
        import java.net.URL;
        import java.nio.charset.Charset;
        import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.Collections;
        import java.util.List;

        import org.json.JSONArray;
        import org.json.JSONException;
        import org.json.JSONObject;


public class JsonReader {
    private static String readAll(Reader rd) throws IOException {
        StringBuilder sb = new StringBuilder();
        int cp;
        while ((cp = rd.read()) != -1) {
            sb.append((char) cp);
        }
        return sb.toString();
    }

    public static JSONObject readJsonFromUrl(String url) throws IOException, JSONException {
        InputStream is = new URL(url).openStream();

        try {
            BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
            String jsonText = readAll(rd);
            JSONObject json = new JSONObject(jsonText);
            return json;
        } finally {
            is.close();
        }
    }

    private static String[] getStringArray( String url) throws IOException {
        JSONObject json = readJsonFromUrl(url);
        JSONArray data = json.getJSONArray("data");
        String[] titles =  new String[data.length()];
        if (data != null) {
            for (int i = 0; i < data.length(); i++) {
                titles[i] = data.getJSONObject(i).getString("Title");
            }
        }
        return titles;
    }

    private static List<String> getList(int pages, String url, List<String> list) throws IOException {
        int count = 0;
        while (count < pages) {
            count++;
            int index = url.lastIndexOf("=")+1;
            url = url.replaceAll(url.substring(index),String.valueOf(count));
            String[] titles = getStringArray(url);
            list.addAll(Arrays.asList(titles));
        }
        Collections.sort(list);
        return list;
    }

    public static void main(String[] args) throws IOException, JSONException {
        String url = "https://jsonmock.hackerrank.com/api/movies/search/?Title=spiderman&page=1";
        JSONObject json = readJsonFromUrl(url);
        int pages = (int) json.get("total_pages");

        List<String> list = new ArrayList<>();
        List<String> requiredList = getList(pages, url, list);
        for(String title:requiredList){
            System.out.println(title);
        }

    }
}