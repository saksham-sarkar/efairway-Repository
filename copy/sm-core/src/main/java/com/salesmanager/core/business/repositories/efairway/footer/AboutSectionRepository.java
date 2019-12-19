package com.salesmanager.core.business.repositories.efairway.footer;


import com.salesmanager.core.model.efairway.model.aboutSection.AboutSection;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AboutSectionRepository extends JpaRepository<AboutSection,Long> {
    List<AboutSection> findByFooterId(Long id);
}