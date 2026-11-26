package com.learning.lld.BusinessRuleEngine;

public class LoanApplicant
{
    private String name;
    private int age;
    private double income;
    private int creditScore;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getIncome() {
        return income;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }
}
