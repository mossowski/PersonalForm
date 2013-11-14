<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Personal form</title>
</head>
<body>
<jsp:useBean id="person" class="com.example.servletjspdemo.domain.Person" scope="session" />

<jsp:setProperty name="person" property="*" /> 

<jsp:useBean id="storage" class="com.example.servletjspdemo.service.StorageService" scope="application" />

<fieldset>
<legend>Person data</legend>
<p>First name : <b>${person.firstName}</b> </p>
<p>Last name : <b>${person.lastName}</b> </p>
<p>Year of birth : <b><jsp:getProperty name="person" property="yob"></jsp:getProperty></b></p>
<p>Gender : <b>${person.gender}</b></p>
<p>Town : 
<% 
   if(person.getTowns() != null)
     for(int i=0;i<person.getTownsLength();i++)
		  out.println("<b>" + person.getTownsValue(i) + "</b>");
%>
</p>
<p>Languages :
<%	
   if(person.getLanguages() != null)
     for(int i=0;i<person.getLanguagesLength();i++)
		  out.println("<b>" + person.getLanguagesValue(i) + "</b>");
%>
</p>
<p>Additional info : <b><jsp:getProperty name="person" property="additionalInfo"></jsp:getProperty></b></p>
</fieldset>
<p>
   <form action="addPerson.jsp">
        <input type="submit" value=" SUBMIT "/>
   </form>
   <form action="getPersonData.jsp">
        <input type="submit" value=" EDIT "/>
   </form>
</body>
</html>