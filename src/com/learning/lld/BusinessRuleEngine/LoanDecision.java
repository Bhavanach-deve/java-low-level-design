package com.learning.lld.BusinessRuleEngine;

import java.util.List;

public class LoanDecision
{
    private final LoanStatus status;
    private final List<String> rejectionReasons;

    public LoanDecision(LoanStatus status,List<String>rejectionReasons){
       this.status=status;
       this.rejectionReasons=List.copyOf(rejectionReasons);

    }
    public LoanStatus getStatus(){
        return status;
    }
    public List<String> getRejectionReasons(){
        return rejectionReasons;
    }

}
