# RESTful-JAX-RS
Web service developed in Java

# Overview

This repository contains a RESTful type project where the POST, PUT, GET and DELETE methods are treated as "subsystems" available through the implementation of the Facade design pattern.

The data access is "Dummy" type, so, that contains a fictitious data source and does not need a Database.


# Development environment

- Windows 10
- Java version 1.8.0_141
- JDK 1.8.0_141
- JRE 1.8.0_141
- JBoss Developer Studio 10.4.0.GA
- JBoss EAP 7.1.0
- SoapUI 5.3.0



# Architecture

The core of this architecture is the Domain, similar to the onion architecture, but here, a service layer is not implemented, but the "adapters" layer is implemented alongside the anti-pattern DTO. It is decided to implement this old but not obsolete pattern due to its nature specially created to be implemented in remote WebServices type interfaces. This is why Inheritance or implementation is not implemented and instead, dependency injection is used.

On the other hand, the design pattern "Facade", is defined as the door (or entrance) which gives access to the rest of the system functions. The facade is aware of the classes involved in the system and may contain implementation of such classes to provide functionality.



# Development Order

0) **Entity**: The DTO classes are the main classes that will contain other classes in charge of Request and Response data transport. As is usual in the domain layer, these classes do not have any type of implementation.

1) **DataAccess**: In the current project, a "Dummy" data source is implemented, however, in the real world, stored procedures or data sources can be implemented which are configured in the Standalone or Domain xml according to the nature of the server.

2) **Business**: The business acts as an intermediary between the data access class and the facade.

3) **Adapters**: These classes are responsible for configuring the Request and Response of the web service. They may also contain configuration pieces for Http protocols or standardized response codes (error or success).

4) **Façade**: The façade acts as a gateway to the system's functionalities and there may be more than one façade depending on the subsystems to be operated. The façade has knowledge of the classes that are used, so you can implement them to configure access to the functionalities of those classes.

5) **REST service**: In this layer there are "Resource JAX" classes type  which will contain the GET, POST, PUT and DELETE methods.



# Testing the service

To perform the tests, the tool "SoapUI" is used, which is functionally similar to Postman. Both are feasible. Configuring SoapUI is simple and they [explain](https://restpatterns.mindtouch.us/HTTP_Status_Codes) it very well.

## GetUsers service method

`The first service` delivers a list of users including, first name, last name, creation date (current date always) and email.

| URI  | Type method |
| ------------- | ------------- |
| `http://localhost:8080/RWS_FacadePattern/rest/User/List/`  | POST  |

- **Web services input parameters:**

`Empty`

- **Results:**

```Java
{"resultResponse": {"dtoUser": {
   "user": null,
   "users":    [
            {
         "firstName": "Daryl",
         "lastName": "Dixon",
         "dateCreated": "Oct 2, 2017 11:28:28 AM",
         "email": "ddixon@jmail.com"
      },
            {
         "firstName": "Rick",
         "lastName": "Grimes",
         "dateCreated": "Oct 2, 2017 11:28:28 AM",
         "email": "rgrimes@jmail.com"
      },
            {
         "firstName": "Glenn",
         "lastName": "Rhee",
         "dateCreated": "Oct 2, 2017 11:28:28 AM",
         "email": "grhee@jmail.com"
      },
            {
         "firstName": "Maggie",
         "lastName": "Greene",
         "dateCreated": "Oct 2, 2017 11:28:28 AM",
         "email": "mgreene@jmail.com"
      },
            {
         "firstName": "Carl",
         "lastName": "Grimes",
         "dateCreated": "Oct 2, 2017 11:28:28 AM",
         "email": "cgrimes@jmail.com"
      },
            {
         "firstName": "Hershel",
         "lastName": "Greene",
         "dateCreated": "Oct 2, 2017 11:28:28 AM",
         "email": "hgreene@jmail.com"
      },
            {
         "firstName": "Shane",
         "lastName": "Walsh",
         "dateCreated": "Oct 2, 2017 11:28:28 AM",
         "email": "swalsh@jmail.com"
      }
   ]
}}}
```

This service, returns the complete list of existing users. Regarding the result, the following objects can be appreciated:

- resultResponse: The service response. Contains an object of DTO type.
- dtoUser: Object that encapsulates other objects. Contains the object "user" and "users".
- user: Object that is used to return a single record.
- users: The object used to return a list of records.

## GetUser service method

`The second service` return a specific user.

| URI  | Type method |
| ------------- | ------------- |
| `http://localhost:8080/RWS_FacadePattern/rest/User/SingleUser/`  | POST  |

- **Web services input parameters:**

```Java
{
          "name": "Daryl"
}
```

- **Results:**

```Java
{"resultResponse": {"dtoUser": {
   "user":    {
      "firstName": "Daryl",
      "lastName": "Dixon",
      "dateCreated": "Oct 2, 2017 11:36:20 AM",
      "email": "ddixon@jmail.com"
   },
   "users": null
}}}
```
## UpdateUser service method

`The third service` update a user's name and *return* it.

| URI  | Type method |
| ------------- | ------------- |
| `http://localhost:8080/RWS_FacadePattern/rest/User/Update/`  | PUT |

- **Web services input parameters:**

```Java
{
	"name": "Daryl",
	"newName": "Steve"
}
```

- **Results:**

```Java
{
{"resultResponse": {"dtoUser": {
   "user":    {
      "firstName": "Steve",
      "lastName": "Dixon",
      "dateCreated": "Oct 2, 2017 11:43:40 AM",
      "email": "ddixon@jmail.com"
   },
   "users": null
}}}
```

## DeleteUser service method

`The fourth  service` delete a user and *list* the rest of existing users.

| URI  | Type method |
| ------------- | ------------- |
| `ttp://localhost:8080/RWS_FacadePattern/rest/User/Delete/`  | DELETE |

- **Web services input parameters:**

Input Parameters:

```Java
{
          "name": "Daryl"
}
```

- **Results:**

```Java
{"resultResponse": {"dtoUser": {
   "user": null,
   "users":    [
            {
         "firstName": "Rick",
         "lastName": "Grimes",
         "dateCreated": "Oct 2, 2017 11:50:49 AM",
         "email": "rgrimes@jmail.com"
      },
            {
         "firstName": "Glenn",
         "lastName": "Rhee",
         "dateCreated": "Oct 2, 2017 11:50:49 AM",
         "email": "grhee@jmail.com"
      },
            {
         "firstName": "Maggie",
         "lastName": "Greene",
         "dateCreated": "Oct 2, 2017 11:50:49 AM",
         "email": "mgreene@jmail.com"
      },
            {
         "firstName": "Carl",
         "lastName": "Grimes",
         "dateCreated": "Oct 2, 2017 11:50:49 AM",
         "email": "cgrimes@jmail.com"
      },
            {
         "firstName": "Hershel",
         "lastName": "Greene",
         "dateCreated": "Oct 2, 2017 11:50:49 AM",
         "email": "hgreene@jmail.com"
      },
            {
         "firstName": "Shane",
         "lastName": "Walsh",
         "dateCreated": "Oct 2, 2017 11:50:49 AM",
         "email": "swalsh@jmail.com"
      }
   ]
}}}
```

## Note
For test purposes, the PUT and DELETE methods are returning data. In strict rigor, these methods should not respond with data but with state codes.

| **Code**  | **Description** |
| :--- | :--- |
| 200 | OK |
| 201 | Created |
| 202 | Accepted |
| 204 | No content |

More [codes](https://restpatterns.mindtouch.us/HTTP_Status_Codes).

# Validations

This project is not robust, it needs implementation of validations. In case you want to incorporate them take into account:

- Validations are not specific to business logic.
- The validations are transversal and can go in any layer respecting its context and implementation.
- Including many "If / else" blocks does not mean that the system is not very elegant. Validations must be robust and control as many incidents as possible.

---------------------------------------------

and that's it





