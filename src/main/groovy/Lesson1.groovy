class Lesson1 {

    static void GetInputString(){

        def inputstring = ''

        while(inputstring == ''){
            println('What is the input string?')
            inputstring = System.in.newReader().readLine()
            if(inputstring == ''){
                println('You must enter a value.')
            } else {
                println(inputstring + ' has ' + inputstring.length() + ' characters')
            }
        }


    }


    static void main(String[] args){
        GetInputString()
    }
}
