package tutorial.lesson2

class lesson2 {

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
        print(inputString + ' has ' + inputStringLength + ' characters')
    }
}
