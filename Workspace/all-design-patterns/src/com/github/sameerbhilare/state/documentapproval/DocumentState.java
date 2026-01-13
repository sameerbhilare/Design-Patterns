package com.github.sameerbhilare.state.documentapproval;

public interface DocumentState {

    /**
     * Allowed actions depend on the current state:
     * Draft → submit for review
     * Review → approve or reject
     * Approved / Rejected → no further changes
     */
    void submit(Document document);
    void approve(Document document);
    void reject(Document document);
}
