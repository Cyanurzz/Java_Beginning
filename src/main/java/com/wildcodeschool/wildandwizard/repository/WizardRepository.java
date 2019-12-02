package com.wildcodeschool.wildandwizard.repository;

import com.wildcodeschool.wildandwizard.entity.Wizard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WizardRepository extends JpaRepository<Wizard, Long> {
}
