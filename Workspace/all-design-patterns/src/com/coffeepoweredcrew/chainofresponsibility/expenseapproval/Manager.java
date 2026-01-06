package com.coffeepoweredcrew.chainofresponsibility.expenseapproval;

public class Manager extends ExpenseHandler {

    @Override
    public void approveExpense(double amount) {
        if (amount <= 50.0) {
            System.out.println("Manager approved the expense of " + amount);
        } else if (nextHandler != null) {
            nextHandler.approveExpense(amount);
        }
    }
}
