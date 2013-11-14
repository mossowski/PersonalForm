<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import ="com.example.servletjspdemo.domain.Person.languagesEnum"%>
<%@ page import ="com.example.servletjspdemo.domain.Person.townsEnum"%>
<%@ page import ="com.example.servletjspdemo.domain.Person.genderEnum"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Personal form</title>
</head>
<body>
<jsp:useBean id="storage" class="com.example.servletjspdemo.service.StorageService" scope="application" />
<jsp:useBean id="person" class="com.example.servletjspdemo.domain.Person" scope="session" />

<form action="confirm.jsp">
<% session.invalidate(); %>
<fieldset>
  <legend>Personal Information</legend>
  First name : <input type="text" name="firstName" value="${person.firstName}"/><br/>
  Last name : <input type="text" name="lastName" value="${person.lastName}"/><br/>
  Year of birth : <input type="text"  name="yob" value="${person.yob}"/><br/>
  Gender : 
<%  
  for(genderEnum e: genderEnum.values())
    out.println("<input type='radio' name='gender' value=" + e.toString() + " />" + e.toString());
  out.println("</br>");
%>
  Town : <select name="towns" size="4" multiple="multiple">
<%  
  for(townsEnum e: townsEnum.values())
    out.println("<option value=" + e.toString() + ">" + e.toString() + "</option><br/>");
%>
</select><br/>
</fieldset>
<fieldset>
<legend>Favorite Languages</legend>
<%  
  for(languagesEnum e: languagesEnum.values())
    out.println("<input type='checkbox' name='languages' value=" + e.toString() + ">" + e.toString() + "<br/>");
%>
</fieldset>
<fieldset>
  <legend>Additional information</legend>
  <textarea rows="6" cols="50" name="additionalInfo"></textarea>
</fieldset><br>
        <input type="submit" value=" OK "/>
</form>
</body>
</html>