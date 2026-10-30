package com.learning.lld.SOLIDDesignPrinciples.Notifications.ReportExporter;

public class CSVExpo implements DataExporter
{
    @Override
    public void export(String  reportContent) {
        System.out.println("Exported data to CSV file: "+reportContent);
    }
}
