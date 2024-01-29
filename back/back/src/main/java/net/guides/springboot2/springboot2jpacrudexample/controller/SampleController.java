package net.guides.springboot2.springboot2jpacrudexample.controller;

import net.guides.springboot2.springboot2jpacrudexample.modele.SampleEntity;
import net.guides.springboot2.springboot2jpacrudexample.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
public class SampleController {

    @Autowired
    SampleService sampleService;

    @RequestMapping(value = "/sample" ,method = RequestMethod.GET)
    public List<SampleEntity> sample() {
        return sampleService.getAll();
    }

    @RequestMapping(value = "/createsample", method = RequestMethod.POST)
    public SampleEntity createSample(@Valid   @RequestParam String nom ,@RequestParam int age) {

        return sampleService.createSample(new SampleEntity(nom,age));
    }

    @RequestMapping(value = "/deletesample/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Object> deleteSample(@RequestParam Long id) {
        return sampleService.deleteSample(id);
    }

    @RequestMapping(value = "/updatesample/{id}", method = RequestMethod.PUT)
    public SampleEntity updateSample( @RequestParam Long id ,@RequestParam String nom ,@RequestParam int age) {
        return sampleService.updateSample(id, new SampleEntity(nom,age));
    }


}