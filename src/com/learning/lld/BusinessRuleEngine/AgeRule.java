package com.learning.lld.BusinessRuleEngine;

public class AgeRule implements Rule
{
    @Override
    public RuleResult evaluate(LoanApplicant applicant) {
        if(applicant.getAge()>=18){
            return new RuleResult("AgeRule",true,"Age eligibility passed!");
        }
        return new RuleResult("AgeRule",false,"Age eligibility passed!");

    }

    @Override
    public String getRuleName() {
        return "AgeRule";
    }
}
