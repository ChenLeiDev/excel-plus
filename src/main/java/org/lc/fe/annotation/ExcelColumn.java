package org.lc.fe.annotation;

import org.lc.fe.constant.AnnotationConstants;
import org.lc.fe.constant.Type;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ExcelColumn {
    String column();
    Type type() default Type.STRING;
    String format() default AnnotationConstants.DEFAULT_DATA_FORMAT_PATTERN;
    String pulls() default AnnotationConstants.DEFAULT_PULLS_FLAG;
}
