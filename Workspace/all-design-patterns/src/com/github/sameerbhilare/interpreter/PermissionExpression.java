package com.github.sameerbhilare.interpreter;

//Abstract expression
public interface PermissionExpression {

	boolean interpret(User user); 
}
