package com.learning.lld.BusinessRuleEngine;

import java.util.ArrayList;
import java.util.List;

public class RuleEngine
{
    private List<Rule> rules;
    public RuleEngine(List<Rule> rules)
    {
        this.rules = rules;
    }
    public List<RuleResult>evaluate(LoanApplicant applicant)
    {
        List<RuleResult> results = new ArrayList<RuleResult>();
        for(Rule rule : rules){
            results.add(rule.evaluate(applicant));
        }
        return  results;
    }
}
