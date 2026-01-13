package com.github.sameerbhilare.state.documentapproval;

public class Client {

    public static void main(String[] args) {

        Document document = new Document();

        document.approve();  // Not allowed
        document.submit();   // Draft → Review
        document.approve();  // Review → Approved
        document.reject();   // Not allowed
    }
}
