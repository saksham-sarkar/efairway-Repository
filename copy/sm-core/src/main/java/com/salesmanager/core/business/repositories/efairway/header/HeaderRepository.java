package com.salesmanager.core.business.repositories.efairway.header;


import com.salesmanager.core.model.efairway.model.header.Header;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;

public interface HeaderRepository extends JpaRepository<Header, Integer> {


    @Query(value = "SELECT now() FROM dual", nativeQuery = true)
    Date getDbNow();

}
