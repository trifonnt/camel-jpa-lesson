package com.mycompany.camel.java.jpa;

import org.apache.camel.spring.Main;;

/**
 * A Camel Application
 */
public class MainApp {

	/**
	 * A main() so we can easily run these routing rules in our IDE
	 */
	public static void main(String... args) throws Exception {
		Main main = new Main();
		main.enableHangupSupport();
		//main.addRouteBuilder(new MyRouteBuilder());
		main.run( args );
	}
}
