package com.learning.lld.SOLIDDesignPrinciples.NotificationService;

import com.learning.lld.SOLIDDesignPrinciples.Notifications.ReportExporter.DataExporter;

public class ReportExporterService
{
    public void export(DataExporter generator,String reportContent)
    {
        generator.export(reportContent);
    }
}
