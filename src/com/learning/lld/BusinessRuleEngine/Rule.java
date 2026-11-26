package com.learning.lld.BusinessRuleEngine;

public interface Rule
{
    RuleResult evaluate(LoanApplicant applicant);
    String getRuleName();

}
