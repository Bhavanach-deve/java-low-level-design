package com.learning.lld.BusinessRuleEngine;

import java.util.ArrayList;
import java.util.List;

public class RuleEngine
{
    private List<Rule> rules;
    public RuleEngine(List<Rule> rules)
    {
        if(rules==null || rules.isEmpty()){
            throw new IllegalArgumentException("RuleEngine must contain atleast one rule");
        }
        this.rules = new ArrayList<>(rules);
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
