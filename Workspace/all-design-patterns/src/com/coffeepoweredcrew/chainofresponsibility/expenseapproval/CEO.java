package com.coffeepoweredcrew.chainofresponsibility.expenseapproval;

public class CEO extends ExpenseHandler {

    @Override
    public void approveExpense(double amount) {
        if (amount <= 1000.0) {
            System.out.println("CEO approved the expense of " + amount);
        } else if (nextHandler != null) {
            nextHandler.approveExpense(amount);
        }
    }
}
