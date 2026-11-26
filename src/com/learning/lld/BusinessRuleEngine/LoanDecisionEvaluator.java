package com.learning.lld.BusinessRuleEngine;

import java.util.ArrayList;
import java.util.List;

public class LoanDecisionEvaluator
{
    public LoanDecision evaluate(List<RuleResult>results){
        List<String> rejectionReasons= new ArrayList<>();
        for(RuleResult r:results)
        {
            if(!r.isPassed()){
                rejectionReasons.add(r.getMessage());
            }

        }
        LoanStatus status;
        if(rejectionReasons.isEmpty()){
            status=LoanStatus.APPROVED;
        }else{
            status=LoanStatus.REJECTED;
        }
        return new LoanDecision(status,rejectionReasons);
    }
}
