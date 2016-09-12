package tutorial.main

import tutorial.lesson2.Lesson2
import tutorial.lesson47.Lesson47

class Main {

    static void main(String[] args){

        args = defaulted(args)

        switch(args[0]){
            case("2"):
                LessonInterface lesson = new Lesson2()
                println(lesson.getLessonName())
                lesson.run()
                break
            case("47"):
                LessonInterface lesson = new Lesson47()
                println(lesson.getLessonName())
                lesson.run()
                break
            default:
                println("Please pass a lesson number to run...")
        }

    }

    private static String[] defaulted(String[] args) {
        println("No lesson specified. Deaulting to Lesson 47: Who's in Space")
        args ? args : ['47'].toArray()
    }
}
