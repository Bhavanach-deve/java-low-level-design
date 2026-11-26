package com.learning.lld.BusinessRuleEngine;

public class CreditScoreRule implements Rule
{

    @Override
    public RuleResult evaluate(LoanApplicant applicant) {
        if(applicant.getCreditScore()>= 750)
        {
            return new RuleResult("CreditScoreRule",true,"CreditScoreRule has been passed!");
        }
        return new RuleResult("CreditScoreRule",false,"CreditScore rule has been failed!");
    }

    @Override
    public String getRuleName() {
        return "CreditScoreRule";
    }
}
