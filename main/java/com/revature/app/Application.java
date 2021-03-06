package com.revature.app;

import com.revature.controller.ArithmeticController;
import com.revature.service.ArithmeticService;

import io.javalin.Javalin;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Javalin app = Javalin.create(); // using static create method from javalin
		// this gives us a handle on the Jetty webserver

		ArithmeticController controller1 = new ArithmeticController(new ArithmeticService());
		controller1.registerEndpoint(app);

		app.start(8080);// start server on 8080

	}

}
