package com.demo.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Job {
	static final Logger logger = LoggerFactory.getLogger(Job.class);

	public void doIt() {
		logger.debug("Did it again!");
	}
}
