package com.salesmanager.core.business.repositories.efairway.homePage;

import com.salesmanager.core.model.efairway.model.homePage.HomePage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface HomePageRepository extends JpaRepository<HomePage, Long> {

    @Query("select h from HomePage h left join fetch h.homePageImages where h.id = ?1")
    List<HomePage> getImagesById(Long id);
}
