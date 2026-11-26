package com.learning.lld.BusinessRuleEngine;

public class RuleResult
{
   private String ruleName;
   private boolean passed;
   private String message;

    public String getMessage() {
        return message;
    }

    public String getRuleName() {
        return ruleName;
    }

    public boolean isPassed() {
        return passed;
    }


    public RuleResult(String ruleName, boolean passed, String message) {
        this.ruleName = ruleName;
        this.passed = passed;
        this.message = message;
    }
}
