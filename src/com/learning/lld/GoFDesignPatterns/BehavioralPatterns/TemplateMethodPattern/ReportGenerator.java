package com.learning.lld.GoFDesignPatterns.BehavioralPatterns.TemplateMethodPattern;

public abstract class ReportGenerator
{
    public final void generateReport()
    {
        fetchData();

        validateData();

        formatData();

        exportReport();
    }
    private  void fetchData()
    {
        System.out.println("Fetching report data...");
    }
    private  void validateData()
    {
        System.out.println("Validating report data...");
    }
    protected abstract void formatData();

    protected abstract void exportReport();
}