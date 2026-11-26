package com.learning.lld.BusinessRuleEngine;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RuleEngine
{
    private List<Rule> rules;
    public RuleEngine(List<Rule> rules)
    {
        if(rules==null || rules.isEmpty()){
            throw new IllegalArgumentException("RuleEngine must contain atleast one rule");
        }
        Set<Class<?>> ruleTypes=new HashSet<>();
        for(Rule rule:rules){
            if(rule==null){
                throw new IllegalArgumentException("RuleEngine cannot contain null rules");
            }
            if(!ruleTypes.add(rule.getClass())){
                throw new IllegalArgumentException("Duplicate Rule detected "+ rule.getClass().getSimpleName());
            }
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
