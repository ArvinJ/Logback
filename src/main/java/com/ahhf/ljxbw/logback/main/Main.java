package com.ahhf.ljxbw.logback.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Main {

	static Logger logger = LoggerFactory.getLogger(Main.class);
	public static void main(String[] args) {
		logger.info("logger.infoMessage.");
		logger.info("logger.infoMessage111.");
		logger.info("logger.infoMessage222.");
	}
}
