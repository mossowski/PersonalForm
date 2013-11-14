<%@page import="com.example.servletjspdemo.domain.Person"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Personal form</title>
</head>
<body>
<jsp:useBean id="storage" class="com.example.servletjspdemo.service.StorageService" scope="application" />
<fieldset>
<legend>All persons</legend>
<%
  for (Person person : storage.getAllPersons()) 
  {
    out.println("<p> First name: " + "<b>" + person.getFirstName() + "</b>"
	  + "</br> Last name: " + "<b>" + person.getLastName() + "</b>"
	  + "</br> Year of birth: " + "<b>" + person.getYob() + "</b>" 
	  + "</br> Gender: " + "<b>" + person.getGender() + "</b>"
	  + "</br> Town: "); 
    if(person.getTowns() != null)
      for(int i=0;i<person.getTownsLength();i++)
	    out.println("<b>" + person.getTownsValue(i) + "</b>");
	
    out.println("</br> Languages: "); 
    if(person.getLanguages() != null)
      for(int i=0;i<person.getLanguagesLength();i++)
	    out.println("<b>" + person.getLanguagesValue(i) + "</b>");
     
    out.println("</br> Additional info: " + "<b>" + person.getAdditionalInfo() + "</b>");
  }
%>
</fieldset>
<p>
  <a href="getNewPersonData.jsp">Add another person</a>
</p>
</body>
</html>