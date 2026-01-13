package com.github.sameerbhilare.state.documentapproval;

public class ReviewState implements DocumentState {
    @Override
    public void submit(Document document) {
        System.out.println("Document already submitted for review.");
    }

    @Override
    public void approve(Document document) {
        document.setState(new ApprovedState());
        System.out.println("Document approved.");
    }

    @Override
    public void reject(Document document) {
        document.setState(new RejectedState());
        System.out.println("Document rejected.");
    }
}
