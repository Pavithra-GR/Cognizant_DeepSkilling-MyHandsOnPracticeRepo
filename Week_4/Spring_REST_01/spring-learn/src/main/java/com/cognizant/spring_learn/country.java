package com.cognizant.spring_learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class country {
	String nameString;
	String codeString;
	Logger logger=LoggerFactory.getLogger(country.class);
	public country() {
		logger.debug("Inside Country constructor");
	}
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public String getCodeString() {
		return codeString;
	}
	public void setCodeString(String codeString) {
		this.codeString = codeString;
	}
	@Override
	public String toString() {
		return "country [nameString=" + nameString + ", codeString=" + codeString + "]";
	}
	
	
}
