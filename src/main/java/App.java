import static spark.Spark.*;

import java.util.HashMap;

import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

public class App {
    public static void main(String[] args) {
        staticFileLocation("/public");

        get("/", (request, response) -> {
            return new ModelAndView(new HashMap(), "hello.hbs");
        }, new HandlebarsTemplateEngine());

        get("/favorite_photos", (request, response) ->
                "<DOCTYPE html>" +
                        "<html>" +
                        "<head>" +
                        "<title>Hello Friend!</title>" +
                        "<link rel='stylesheet' href='http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootsrap.min.css'>" +
                        "</head>" +
                        "<body>" +
                        "<h1>Favorite Travelling Photos</h1>" +
                        "<ul>" +
                        "<li><img src='/images/alex-quezada-VJWocACP39g-unsplash.jpg' alt='A photo of an Old building.'/></li>" +
                        "<li><img src='/images/kristina-delp-LHetkULYo3I-unsplash.jpg' alt='A photo of a bird.'/></li>" +
                        "</ul>" +
                        "</body>" + "</html>"
        );
    }
}