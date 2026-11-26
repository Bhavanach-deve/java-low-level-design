package com.learning.lld.BusinessRuleEngine;

public class IncomeRule implements Rule
{

    @Override
    public RuleResult evaluate(LoanApplicant applicant) {
        if(applicant.getIncome() >=30000) {
            return new RuleResult("IncomeRule",true,"Income rule has been passed!");
        }
        return new RuleResult("IncomeRule",false,"Income rule has been failed!");
    }

    @Override
    public String getRuleName() {
        return "IncomeRule";
    }
}
