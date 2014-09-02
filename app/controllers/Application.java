package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public static Result index() {
        //return ok(index.render("Your new application is ready."));
        return ok("Hello World!");
    }
    public static Result hello(String name) {
        return ok(hello.render(name));
        //return ok("Hello World!"+ name);
    }

}
