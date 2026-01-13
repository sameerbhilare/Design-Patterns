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

    // actions on the documents triggering state changes
    public void submit() {
        state.submit(this);
    }

    // actions on the documents triggering state changes
    public void approve() {
        state.approve(this);
    }

    // actions on the documents triggering state changes
    public void reject() {
        state.reject(this);
    }
}
