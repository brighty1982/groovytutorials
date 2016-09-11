package tutorial.main

import tutorial.lesson2.Lesson2

class Main {

    static void main(String[] args){

        switch(args[0]){
            case("2"):
                def lesson2 = new Lesson2()
                lesson2.Run()
                break
            default:
                println("Please pass a lesson number to run...")
        }

    }
}
