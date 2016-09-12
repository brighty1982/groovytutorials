package tutorial.lesson47

import groovyx.net.http.RESTClient
import net.sf.json.JSON
import tutorial.main.LessonInterface


class Lesson47 implements LessonInterface {

    void run(String[] args) {

        def client = new RESTClient("http://api.open-notify.org/")
        def response = client.get(path: 'astros.json')

        assert response.status == 200: "Received status " + response.status
        assert response.contentType.toString() == "application/json": "Received content type " + response.contentType.toString()

        println(response.data)
    }

    public String getLessonName(){
        return "Lesson 47: Consume JSON REST API"
    }

}
