package tutorial.main

import tutorial.lesson2.Lesson2
import tutorial.lesson47.Lesson47

class Main {

    static void main(String[] args){

        switch(args[0]){
            case("2"):
                LessonInterface lesson = new Lesson2()
                println(lesson.getLessonName())
                lesson.run()
                break
            case("47"):
                LessonInterface lesson = new Lesson47().run()
                break
            default:
                println("Please pass a lesson number to run...")
        }

    }
}
