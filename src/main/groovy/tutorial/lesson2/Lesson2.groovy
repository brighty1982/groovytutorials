package tutorial.lesson2

import tutorial.main.LessonInterface

class Lesson2 implements LessonInterface{

    void run(String[] args){

        String inputString = ''

        while(inputString == ''){
            println('What is the input string?')
            inputString = System.in.newReader().readLine()
            if(inputString == ''){
                println('You must enter a value.')
            } else{
                def StrLen = new StringLength(inputString)
                println(StrLen.inputString + ' has ' + StrLen.inputStringLength + ' characters')
            }
        }
    }

    public String getLessonName(){
        return "Lesson 2: Counting the number of characters"
    }

}

class StringLength {

    def inputString = ''
    def inputStringLength = 0

    StringLength(String InputString){
        inputString = InputString
        inputStringLength = InputString.length()
    }

}
