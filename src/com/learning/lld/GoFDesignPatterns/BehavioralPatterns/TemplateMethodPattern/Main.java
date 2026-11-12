package com.learning.lld.GoFDesignPatterns.BehavioralPatterns.TemplateMethodPattern;

public class Main
{
    public static void main(String[] args)
    {
       ReportGenerator pdf=new PDFReportGenerator();
       ReportGenerator excel=new ExcelReport();
       pdf.generateReport();
        System.out.println("----------------------------------");
        excel.generateReport();
    }
}
//Why use Template Method?
//- Avoids duplicating common algorithm steps.
//- Keeps the sequence consistent.
//- Allows subclasses to customize selected steps.
//- Supports code reuse through inheritance.
//Disadvantage: It relies on inheritance. Subclasses are coupled to the parent algorithm, and the fixed sequence can become restrictive when workflows need substantially different steps.