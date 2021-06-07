package org.lc.fe.model;

import org.lc.fe.ExcelDataValidator;
import org.lc.fe.constant.Function;
import org.lc.fe.constant.Type;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class UnitElement {
    public static final String HAS_FUNCTION = "HAS_FUNCTION";
    public List<ParentField> parents = new ArrayList<>(0);
    public Field field;
    public Type type;
    public String pullsFlag;
    public String[] pulls;
    public String format;
    public Function function;
    public String condition;
    public String column;
    public ExcelDataValidator dataValid;
}
