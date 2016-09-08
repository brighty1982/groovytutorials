package tutorial.lesson2

class Lesson2 {

    static void Run(){

        String inputString = ''

        while(inputString == ''){
            println('Lesson 2: What is the input string?')
            inputString = System.in.newReader().readLine()
            if(inputString == ''){
                println('You must enter a value.')
            } else{
                def StrLen = new StringLength(inputString)
                println(StrLen.inputString + ' has ' + StrLen.inputStringLength + ' characters')
            }
        }
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
