package com.github.sameerbhilare.state.documentapproval;

public class ApprovedState implements DocumentState {
    @Override
    public void submit(Document document) {
        System.out.println("Approved document cannot be resubmitted.");
    }

    @Override
    public void approve(Document document) {
        System.out.println("Document already approved.");
    }

    @Override
    public void reject(Document document) {
        System.out.println("Approved document cannot be rejected.");
    }
}
