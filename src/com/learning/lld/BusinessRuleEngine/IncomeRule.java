package com.learning.lld.BusinessRuleEngine;

public class IncomeRule implements Rule
{

    @Override
    public RuleResult evaluate(LoanApplicant applicant) {
        if(applicant.getIncome() >=30000) {
            return new RuleResult(getRuleName(),true,"Income rule has been passed!");
        }
        return new RuleResult(getRuleName(),false,"Income rule has been failed!");
    }

    @Override
    public String getRuleName() {
        return "IncomeRule";
    }
}
