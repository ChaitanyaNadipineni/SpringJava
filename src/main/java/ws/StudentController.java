package ws;


import Hibernate.Student;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;


// What is restful services, HEAD, PUT, POST, DELETE, OPTIONS, GET
// Http verbs
// resource ful api design
// https://www.thoughtworks.com/insights/blog/rest-api-design-resource-modeling
// https://stackoverflow.com/questions/671118/what-exactly-is-restful-programming
// https://spring.io/understanding/HATEOAS
// http://www.servicedesignpatterns.com/WebServiceAPIStyles/ResourceAPI
// https://www.google.com/search?q=http+resource+api&oq=http+resurce&aqs=chrome.3.69i57j0l5.6017j0j7&sourceid=chrome&ie=UTF-8
// https://developer.yahoo.com/social/rest_api_guide/uri-general.html
//
// curl, postman is for google chrome

// CRUD operations for Student


// Spring Boot

// Http Codes

@Path ("/student")
public class StudentController {

    @GET
    @Path("{id}")
    public Student getStudent(@PathParam("id") int id) {
        return new Student();
    }
}
