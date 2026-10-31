package com.learning.lld.SOLIDDesignPrinciples.InterfaceSegregation.ImplementingClasses;

import com.learning.lld.SOLIDDesignPrinciples.InterfaceSegregation.Downloadable;

public class Admin implements Downloadable {
    @Override
    public void downloadReport() {
        System.out.println("Admin downloading report");
    }
}
