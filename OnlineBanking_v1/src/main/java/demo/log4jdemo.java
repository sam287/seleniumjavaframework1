package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;




public class log4jdemo {

		private static Logger logger = LogManager.getLogger(log4jdemo.class);
		
					
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		logger.trace("this is trace msg");
		logger.info("this is info msg");
		logger.error("this is error msg");
		logger.warn("this is warn msg");
		logger.fatal("this is fatal msg");
		
		
		System.out.println("Compeleted");

		
	}

}
