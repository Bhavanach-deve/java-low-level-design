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


    public RuleResult(String ruleName, boolean passed, String message)
    {
        if (ruleName == null || ruleName.isBlank()) {
            throw new IllegalArgumentException(
                    "Rule name cannot be null or blank"
            );
        }
        if (message == null || message.isBlank()) {
            throw new IllegalArgumentException(
                    "Rule message cannot be null or blank"
            );
        }

        this.ruleName = ruleName;
        this.passed = passed;
        this.message = message;
    }
}
