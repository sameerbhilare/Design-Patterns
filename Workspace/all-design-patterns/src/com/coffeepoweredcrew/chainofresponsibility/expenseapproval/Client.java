package com.coffeepoweredcrew.chainofresponsibility.expenseapproval;

public class Client {

    public static void main(String[] args) {

        ExpenseHandler manager = new Manager();
        ExpenseHandler director = new Director();
        ExpenseHandler ceo = new CEO();

        manager.nextHandler = director;
        director.nextHandler = ceo;

        manager.approveExpense(50);
        manager.approveExpense(100);
        manager.approveExpense(1000);
    }
}
