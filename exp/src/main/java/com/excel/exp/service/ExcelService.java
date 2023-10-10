package com.excel.exp.service;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excel.exp.entity.DbEntity;
import com.excel.exp.jparepo.CustomQueryRepository;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

@Service
public class ExcelService {

    @Autowired
    private CustomQueryRepository repository;

    public void generateExcelFile() {
        List<DbEntity> data = repository.findAll();

        try (Workbook workbook = new XSSFWorkbook()) {
            Sheet sheet = workbook.createSheet("Data");

            // Create header row (column names)
            Row headerRow = sheet.createRow(0);
            headerRow.createCell(0).setCellValue("sr_No");
            headerRow.createCell(1).setCellValue("crew_Id");
            headerRow.createCell(2).setCellValue("resource_name");
            headerRow.createCell(3).setCellValue("vg_email");
            
         
            
            // Add more cells for other fields if necessary

            // Populate data rows
            int rowNum = 1;
            for (DbEntity entity : data) {
                Row row = sheet.createRow(rowNum++);
                row.createCell(0).setCellValue(entity.getSr_No());
                row.createCell(1).setCellValue(entity.getCrew_Id());
                row.createCell(2).setCellValue(entity.getResource_name());
                row.createCell(3).setCellValue(entity.getVg_email());
                
                
                // Add more cells for other fields if necessary
            }

            try (FileOutputStream outputStream = new FileOutputStream("target/data.xlsx")) {
                workbook.write(outputStream);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}