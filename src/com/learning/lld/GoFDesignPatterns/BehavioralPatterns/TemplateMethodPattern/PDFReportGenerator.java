package com.learning.lld.GoFDesignPatterns.BehavioralPatterns.TemplateMethodPattern;

public class PDFReportGenerator extends ReportGenerator
{

    @Override
    protected void formatData() {
        System.out.println("Formatting data for PDF");
    }

    @Override
    protected void exportReport() {
        System.out.println("Exporting PDF report");
    }
}
