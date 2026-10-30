package com.learning.lld.SOLIDDesignPrinciples.Notifications.ReportExporter;

public class ExcelExpo implements DataExporter
{
    @Override
    public void export(String  reportContent) {
        System.out.println("Exported data to Excel file: "+reportContent);
    }
}
