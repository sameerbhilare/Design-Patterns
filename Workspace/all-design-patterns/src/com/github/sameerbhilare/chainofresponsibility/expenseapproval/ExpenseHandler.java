package com.github.sameerbhilare.chainofresponsibility.expenseapproval;

public abstract class ExpenseHandler {

    protected ExpenseHandler nextHandler;

    public void setExpenseHandler(ExpenseHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void approveExpense(double amount);
}
