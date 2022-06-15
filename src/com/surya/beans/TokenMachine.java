package com.surya.beans;

public abstract class TokenMachine {
	protected abstract Token createToken();
	public Token getToken()
	{
		return createToken();
	}
}
