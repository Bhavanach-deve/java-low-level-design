package com.learning.lld.SOLIDDesignPrinciples.Notifications.ReportExporter;

public class PDFExpo implements DataExporter
{
    @Override
    public void export(String reportContent) {
        System.out.println("Exported data to PDF file: "+ reportContent);
    }
}
