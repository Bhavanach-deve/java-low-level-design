package com.learning.lld.GoFDesignPatterns.BehavioralPatterns.TemplateMethodPattern;

public class ExcelReport extends ReportGenerator {
    @Override
    protected void formatData() {
        System.out.println("Formatting data for Excel");
    }

    @Override
    protected void exportReport()
    {
        System.out.println("Exporting Excel report");

    }
}
