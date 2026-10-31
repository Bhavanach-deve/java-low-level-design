package com.learning.lld.SOLIDDesignPrinciples.InterfaceSeggregation.ImplementingClasses;

import com.learning.lld.SOLIDDesignPrinciples.InterfaceSeggregation.Downloadable;

public class Admin implements Downloadable {
    @Override
    public void downloadReport() {
        System.out.println("Admin downloading report");
    }
}
