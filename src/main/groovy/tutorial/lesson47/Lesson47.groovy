package tutorial.lesson47

import groovy.json.JsonSlurper
import jodd.http.HttpRequest
import jodd.http.HttpResponse
import tutorial.main.LessonInterface


class Lesson47 implements LessonInterface {

    void run(String[] args) {
        def run = new Lesson47Application<>().run(defaulted(args))
    }

    public String getLessonName(){
        return "Lesson 47: Who's in space"
    }

    private static String[] defaulted(String[] args) {
        args ? args : ['server'].toArray()
    }

}
