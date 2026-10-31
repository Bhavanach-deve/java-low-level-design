package com.learning.lld.SOLIDDesignPrinciples.OpenClosedPrinciple.ReportExporter;

public class PDFExpo implements DataExporter
{
    @Override
    public void export(String reportContent) {
        System.out.println("Exported data to PDF file: "+ reportContent);
    }
}
