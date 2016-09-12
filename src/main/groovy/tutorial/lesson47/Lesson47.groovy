package tutorial.lesson47

import groovy.json.JsonSlurper
import jodd.http.HttpRequest
import jodd.http.HttpResponse
import tutorial.main.LessonInterface


class Lesson47 implements LessonInterface {

    void run(String[] args) {


        def run = new Lesson47Application<>().run(defaulted(args))

        /*HttpRequest request = HttpRequest.get("http://api.open-notify.org/astros/")
        HttpResponse response = request.send()

        if(response.statusCode() == 200){

            println("Status: " + response.statusCode())

            println("Content Type: " + response.contentType().toString())

            JsonSlurper slurp = new JsonSlurper()
            def json = slurp.parseText(response.body())

            println("Who's in space?")

            if(json.number > 0){
                for(int i = 0; i < json.number; i ++){
                    println("Name: " + json.people[i].name + ", Craft: " + json.people[i].craft)
                }
            }else{
                println("no one is in space")
            }


        }else {
            println("Error: " + response.statusCode())
        }


        response.close()*/

    }

    public String getLessonName(){
        return "Lesson 47: Who's in space"
    }

    private static String[] defaulted(String[] args) {
        args ? args : ['server'].toArray()
    }

}
