package com.excel.exp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.excel.exp.service.ExcelService;

@RestController
public class ExcelController {

    @Autowired
    private ExcelService excelService;

    @GetMapping("/generate-excel")
    public String generateExcel() {
        excelService.generateExcelFile();
        return "Excel file generated successfully!";
    }
}

