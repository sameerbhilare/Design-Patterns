package com.github.sameerbhilare.state.documentapproval;

public class DraftState implements DocumentState {

    @Override
    public void submit(Document document) {
        document.setState(new ReviewState());
        System.out.println("Document submitted for review.");
    }

    @Override
    public void approve(Document document) {
        System.out.println("Document draft cannot be approved.");
    }

    @Override
    public void reject(Document document) {
        System.out.println("Document draft cannot be rejected.");
    }
}
