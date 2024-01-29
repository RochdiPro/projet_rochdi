package net.guides.springboot2.springboot2jpacrudexample.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import net.guides.springboot2.springboot2jpacrudexample.modele.SampleEntity;
import net.guides.springboot2.springboot2jpacrudexample.repository.SampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


@Service
public class SampleService {

    @Autowired
    SampleRepository sampleRepo;

     public List<SampleEntity> getAll() {
        return (List<SampleEntity>) sampleRepo.findAll();
    }

    public SampleEntity createSample(SampleEntity sampleEntity) {
        return sampleRepo.save(sampleEntity);
    }

    public SampleEntity updateSample(Long Id, SampleEntity sampleEntity) {
        SampleEntity updatedSample;
        Optional<SampleEntity> searchEntity = sampleRepo.findById(Id);
        if (searchEntity.isPresent()) {
            SampleEntity sample = searchEntity.get();
            sample.setAge(sampleEntity.getAge());
            sample.setName(sampleEntity.getName());
            updatedSample = sampleRepo.save(sample);
        } else {
            throw new EntityNotFoundException();
        }
        return updatedSample;
    }

    public ResponseEntity<Object> deleteSample(Long Id) {
        Optional<SampleEntity> sampleEntity = sampleRepo.findById(Id);
        if (sampleEntity.isPresent()) {
            SampleEntity sample = sampleEntity.get();
            sampleRepo.delete(sample);
        } else {
            throw new EntityNotFoundException();
        }
        return ResponseEntity.ok().build();
    }

}