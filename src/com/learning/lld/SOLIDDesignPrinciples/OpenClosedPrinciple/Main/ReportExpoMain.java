package com.learning.lld.SOLIDDesignPrinciples.OpenClosedPrinciple.Main;

import com.learning.lld.SOLIDDesignPrinciples.OpenClosedPrinciple.NotificationService.ReportExporterService;
import com.learning.lld.SOLIDDesignPrinciples.OpenClosedPrinciple.ReportExporter.DataExporter;
import com.learning.lld.SOLIDDesignPrinciples.OpenClosedPrinciple.ReportExporter.ExcelExpo;
import com.learning.lld.SOLIDDesignPrinciples.OpenClosedPrinciple.ReportExporter.PDFExpo;

public class ReportExpoMain
{
    static void main(String[] args)
    {
        ReportExporterService service = new ReportExporterService();
        DataExporter pdfexporter= new PDFExpo();
        service.export(pdfexporter,"Monthly library loans");

        DataExporter excelexporter= new ExcelExpo();
        service.export(excelexporter,"Monthly library loans");

        DataExporter csvexporter= new PDFExpo();
        service.export(csvexporter,"Monthly library loans");



    }
}
