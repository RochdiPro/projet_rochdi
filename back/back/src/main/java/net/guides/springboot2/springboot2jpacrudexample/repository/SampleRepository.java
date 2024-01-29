package net.guides.springboot2.springboot2jpacrudexample.repository;

import java.util.List;

 import net.guides.springboot2.springboot2jpacrudexample.modele.SampleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface SampleRepository extends JpaRepository<SampleEntity, Long> {

}
