package com.github.sameerbhilare.state.documentapproval;

// Context
public class Document {

    DocumentState state;

    public Document() {
        // initial state
        state = new DraftState();
    }

    public void setState(DocumentState state) {
        this.state = state;
    }

    public void submit() {
        state.submit(this);
    }

    public void approve() {
        state.approve(this);
    }

    public void reject() {
        state.reject(this);
    }
}
