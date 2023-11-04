package com.tta.datadriventesting;

import java.io.*;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
/**
 * Created by TheTestingAcademy
 *
 * **/
public class ExcelReader {

    public FileInputStream fi;
    public FileOutputStream fo;
    public XSSFWorkbook workbook;
    public XSSFSheet sheet;
    public XSSFRow row;
    public XSSFCell cell;
    public CellStyle style;
    String path;
    public ExcelReader(String path)
    {
        this.path=path;
    }




    public int getRowCount(String sheetName) throws IOException {
        fi=new FileInputStream(path);
        workbook=new XSSFWorkbook(fi);
        int index = workbook.getSheetIndex(sheetName);
        if(index==-1)
            return 0;
        else{
            sheet = workbook.getSheetAt(index);
            int number=sheet.getLastRowNum()+1;
            return number;
        }
    }


    public int getCellCount(String sheetName,int rownum) throws IOException
    {
        fi=new FileInputStream(path);
        workbook=new XSSFWorkbook(fi);
        sheet=workbook.getSheet(sheetName);
        row=sheet.getRow(rownum);
        int cellcount=row.getLastCellNum();
        workbook.close();
        fi.close();
        return cellcount;
    }


    public String getCellData(String sheetName,int rownum,int colnum) throws IOException
    {
        fi=new FileInputStream(path);
        workbook=new XSSFWorkbook(fi);
        sheet=workbook.getSheet(sheetName);
        row=sheet.getRow(rownum);
        cell=row.getCell(colnum);

        DataFormatter formatter = new DataFormatter();
        String data;
        try{
            data = formatter.formatCellValue(cell); //Returns the formatted value of a cell as a String regardless of the cell type.
        }
        catch(Exception e)
        {
            data="";
        }
        workbook.close();
        fi.close();
        return data;
    }

    public void setCellData(String sheetName,int rownum,int colnum,String data) throws IOException
    {
        File xlfile=new File(path);
        if(!xlfile.exists())    // If file not exists then create new file
        {
            workbook=new XSSFWorkbook();
            fo=new FileOutputStream(path);
            workbook.write(fo);
        }

        fi=new FileInputStream(path);
        workbook=new XSSFWorkbook(fi);

        if(workbook.getSheetIndex(sheetName)==-1) // If sheet not exists then create new Sheet
            workbook.createSheet(sheetName);

        sheet=workbook.getSheet(sheetName);

        if(sheet.getRow(rownum)==null)   // If row not exists then create new Row
            sheet.createRow(rownum);
        row=sheet.getRow(rownum);

        cell=row.createCell(colnum);
        cell.setCellValue(data);
        fo=new FileOutputStream(path);
        workbook.write(fo);
        workbook.close();
        fi.close();
        fo.close();
    }


    public void fillGreenColor(String sheetName,int rownum,int colnum) throws IOException
    {
        fi=new FileInputStream(path);
        workbook=new XSSFWorkbook(fi);
        sheet=workbook.getSheet(sheetName);

        row=sheet.getRow(rownum);
        cell=row.getCell(colnum);

        style=workbook.createCellStyle();

        style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
        style.setFillPattern(FillPatternType.SOLID_FOREGROUND);

        cell.setCellStyle(style);
        workbook.write(fo);
        workbook.close();
        fi.close();
        fo.close();
    }


    public void fillRedColor(String sheetName,int rownum,int colnum) throws IOException
    {
        fi=new FileInputStream(path);
        workbook=new XSSFWorkbook(fi);
        sheet=workbook.getSheet(sheetName);
        row=sheet.getRow(rownum);
        cell=row.getCell(colnum);

        style=workbook.createCellStyle();

        style.setFillForegroundColor(IndexedColors.RED.getIndex());
        style.setFillPattern(FillPatternType.SOLID_FOREGROUND);

        cell.setCellStyle(style);
        workbook.write(fo);
        workbook.close();
        fi.close();
        fo.close();
    }



    public String[][] getDataFromSheet(String workbookLocation, String workSheetName) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook(System.getProperty("user.dir") + "/" + workbookLocation);
        XSSFSheet workSheet = workbook.getSheet(workSheetName);

        int noOfRows = workSheet.getLastRowNum() + 1;
        int noOfColumns = workSheet.getRow(0).getLastCellNum();
        String[][] dataTable = new String[noOfRows][noOfColumns];

        for (int i = workSheet.getFirstRowNum(); i < workSheet.getLastRowNum() + 1; i++) {
            Row row = workSheet.getRow(i);
            for (int j = row.getFirstCellNum(); j < row.getLastCellNum(); j++) {
                Cell cell = row.getCell(j);
                dataTable[i][j] = cell.getStringCellValue();
            }
        }

        workbook.close();
        return dataTable;
    }

}
