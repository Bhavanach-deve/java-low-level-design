package com.learning.lld.SOLIDDesignPrinciples.Main;

import com.learning.lld.SOLIDDesignPrinciples.NotificationService.ReportExporterService;
import com.learning.lld.SOLIDDesignPrinciples.Notifications.ReportExporter.DataExporter;
import com.learning.lld.SOLIDDesignPrinciples.Notifications.ReportExporter.ExcelExpo;
import com.learning.lld.SOLIDDesignPrinciples.Notifications.ReportExporter.PDFExpo;

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
