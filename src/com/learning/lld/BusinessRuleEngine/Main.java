
package com.learning.lld.BusinessRuleEngine;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        LoanApplicant l1 = new LoanApplicant();
        l1.setName("Mahi");
        l1.setAge(30);
        l1.setIncome(30000);
        l1.setCreditScore(850);

        LoanApplicant l2 = new LoanApplicant();
        l2.setName("Prakruthi");
        l2.setAge(22);
        l2.setIncome(20000);
        l2.setCreditScore(850);

        Rule age = new AgeRule();
        Rule in = new IncomeRule();
        Rule cs = new CreditScoreRule();

        List<Rule> rules = new ArrayList<>();
        rules.add(age);
        rules.add(cs);
        rules.add(in);

        RuleEngine re = new RuleEngine(rules);
        LoanDecisionEvaluator lde = new LoanDecisionEvaluator();

        // Applicant 1
        List<RuleResult> results1 = re.evaluate(l1);

        LoanDecision decision1 = lde.evaluate(results1);

        displayReport(l1, results1, decision1);

        System.out.println("-----------------------------------------");

        // Applicant 2
        List<RuleResult> results2 = re.evaluate(l2);

        LoanDecision decision2 = lde.evaluate(results2);

        displayReport(l2, results2, decision2);
    }

    public static void displayReport(
            LoanApplicant applicant,
            List<RuleResult> results,
            LoanDecision decision) {

        System.out.println("Applicant: " + applicant.getName());

        for (RuleResult result : results) {
            System.out.println("Rule: " + result.getRuleName());
            System.out.println("Passed: " + result.isPassed());
            System.out.println("Message: " + result.getMessage());
        }

        System.out.println("Final Loan Status: " + decision.getStatus());

        if (decision.getStatus() == LoanStatus.REJECTED) {
            System.out.println("Rejection Reasons:");

            for (String reason : decision.getRejectionReasons()) {
                System.out.println("- " + reason);
            }
        }
    }
}
