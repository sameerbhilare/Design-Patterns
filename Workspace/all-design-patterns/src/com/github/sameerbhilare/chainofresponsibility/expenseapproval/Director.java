package com.github.sameerbhilare.chainofresponsibility.expenseapproval;

public class Director extends ExpenseHandler {

    @Override
    public void approveExpense(double amount) {
        if (amount <= 100.0) {
            System.out.println("Director approved the expense of " + amount);
        } else if (nextHandler != null) {
            nextHandler.approveExpense(amount);
        }
    }
}
