package tutorial.lesson2

class Lesson2 {

    def inputString = ''
    def inputStringLength = 0

    void getInput(){
        inputString = ''

        while(inputString == ''){
            println('Lesson 2: What is the input string?')
            inputString = System.in.newReader().readLine()
            if(inputString == ''){
                println('You must enter a value.')
            }
        }
    }

    void setLength(){
        inputStringLength = getLength(inputString)
    }

    int getLength(String inputStr){
        inputStr.length()
    }

    void printLength(){
        println(inputString + ' has ' + inputStringLength + ' characters')
    }
}
