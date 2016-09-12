package tutorial.lesson47

import groovy.json.JsonSlurper
import jodd.http.HttpRequest
import jodd.http.HttpResponse

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType


@Path("/lesson47")
@Produces(MediaType.APPLICATION_JSON)
class Lesson47Resource {

    @GET
    public static def whosInSpace()
    {
        HttpRequest httpRequest = HttpRequest.get('http://api.open-notify.org/astros.json')
        HttpResponse response = httpRequest.send()

        if(response.statusCode() == 200){
            response.body()
        }else{
            "Status: " + response.statusCode()
        }

    }

}
