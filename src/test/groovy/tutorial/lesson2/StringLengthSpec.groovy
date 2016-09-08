package tutorial.lesson2

import spock.lang.Specification

class StringLengthSpec extends Specification {

    def "Returns the correct number of characters for passed string"(){
        when:
            def InputStr = "Liverpool"
            def StrLen = new StringLength(InputStr)

        then:
            assert StrLen.inputStringLength == 9

    }
}
