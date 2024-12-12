package com.aas.customeexceptions;

public class InvalidBrowserExeption extends Exception {
	private String msg;

	public InvalidBrowserExeption(String browser) {
		this.msg = "InvalidBrowserExeption" + browser;
	}

	@Override
	public String toString() {
		return msg;
	}
}
