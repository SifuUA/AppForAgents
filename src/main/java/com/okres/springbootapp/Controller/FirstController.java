package com.okres.springbootapp.Controller;

import com.okres.springbootapp.Entity.DocCommonEntity;
import com.okres.springbootapp.Repository.DocCommonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class FirstController {

    @Autowired
    public DocCommonRepository docCommonRepository;

    @GetMapping(value = "/say")
    public String say() {
        return "Hello from method!";
    }

    @PostMapping(value = "/all/{date}")
    public List<DocCommonEntity> getAllOnDate(@PathVariable String date) {
        Date tmp = date
        return docCommonRepository.findByDocdateEquals(date);
    }
}
