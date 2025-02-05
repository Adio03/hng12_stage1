package com.example.hng12_stage1.controller;

import com.example.hng12_stage1.service.NumberClassificationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("api/")

public class NumberClassificationController {
    @Autowired
    private NumberClassificationService numberClassificationService;

    @GetMapping("classify-number")
    public Map<String, Object> getNumberClassification(@RequestParam("number") String number) {
        return numberClassificationService.getClassifyNumber(number);
    }

}

