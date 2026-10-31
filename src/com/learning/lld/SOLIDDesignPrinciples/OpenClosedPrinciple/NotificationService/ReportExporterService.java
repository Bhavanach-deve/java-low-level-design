package com.learning.lld.SOLIDDesignPrinciples.OpenClosedPrinciple.NotificationService;

import com.learning.lld.SOLIDDesignPrinciples.OpenClosedPrinciple.ReportExporter.DataExporter;

public class ReportExporterService
{
    public void export(DataExporter generator,String reportContent)
    {
        generator.export(reportContent);
    }
}
