package com.learning.lld.SOLIDDesignPrinciples.OpenClosedPrinciple.ReportExporter;

public class ExcelExpo implements DataExporter
{
    @Override
    public void export(String  reportContent) {
        System.out.println("Exported data to Excel file: "+reportContent);
    }
}
