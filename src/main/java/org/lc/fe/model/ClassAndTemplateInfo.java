package org.lc.fe.model;

import org.apache.poi.xssf.usermodel.XSSFDrawing;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.lc.fe.ExcelDataValidator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClassAndTemplateInfo {

    public Map<String, UnitElement> unitElements = new HashMap<>();

    public List<ExcelDataValidator> validators;

    public PullNodes pullNodes;

    public String templateName;

    public int headerRowNum;

    public int startRowNum;

    public XSSFSheet xssfSheet;

    public XSSFWorkbook xssfWorkbook;

    public String[] headerCells;

    public int baseRowNum;

    public XSSFDrawing drawingPatriarch;


}
