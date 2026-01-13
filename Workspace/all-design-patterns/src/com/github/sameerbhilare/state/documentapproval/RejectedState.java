package com.github.sameerbhilare.state.documentapproval;

public class RejectedState implements DocumentState {
    @Override
    public void submit(Document document) {
        System.out.println("Rejected document cannot be resubmitted.");
    }

    @Override
    public void approve(Document document) {
        System.out.println("Rejected document cannot be approved.");
    }

    @Override
    public void reject(Document document) {
        System.out.println("Document already rejected.");
    }
}
