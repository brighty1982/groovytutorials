package tutorial.lesson2

import spock.lang.Specification

class lesson2Spec extends Specification {

    def "Returns the correct number of characters for passed string"(){
        given:
            def lesson2 = new lesson2()
            lesson2.inputString = "Liverpool"

        when:
            lesson2.setLength()

        then:
            assert lesson2.inputStringLength == 9

    }
}
