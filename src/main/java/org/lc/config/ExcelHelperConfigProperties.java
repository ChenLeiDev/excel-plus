package org.lc.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "excel-helper")
public class ExcelHelperConfigProperties {

    private String formFieldName;

    private Boolean multiThread;

    private Integer multiThreadNum;

    private Integer pageLimit;

    private String templatePath;

    public String getFormFieldName() {
        return formFieldName;
    }

    public void setFormFieldName(String formFieldName) {
        this.formFieldName = formFieldName;
    }

    public Boolean getMultiThread() {
        return multiThread;
    }

    public void setMultiThread(Boolean multiThread) {
        this.multiThread = multiThread;
    }

    public Integer getMultiThreadNum() {
        return multiThreadNum;
    }

    public void setMultiThreadNum(Integer multiThreadNum) {
        this.multiThreadNum = multiThreadNum;
    }

    public Integer getPageLimit() {
        return pageLimit;
    }

    public void setPageLimit(Integer pageLimit) {
        this.pageLimit = pageLimit;
    }

    public String getTemplatePath() {
        return templatePath;
    }

    public void setTemplatePath(String templatePath) {
        this.templatePath = templatePath;
    }
}
