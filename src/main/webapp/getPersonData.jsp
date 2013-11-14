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

<fieldset>
  <legend>Personal Information</legend>
  First name : <input type="text" name="firstName" value="${person.firstName}"/><br/>
  Last name : <input type="text" name="lastName" value="${person.lastName}"/><br/>
  Year of birth : <input type="text"  name="yob" value="${person.yob}"/><br/>
  Gender : 
<%  
  for(genderEnum e: genderEnum.values()) 
  {
    if(e.toString().equals(person.getGender()))
	  out.println("<input type='radio' name='gender' value=" + e.toString() + " checked >" + e.toString());
	else
      out.println("<input type='radio' name='gender' value=" + e.toString() + ">" + e.toString());
  }
  out.println("</br>");
%>  
  Town : <select name="towns" size="4" multiple="multiple">   
<% 
  boolean checked = false;
                
  for(townsEnum e: townsEnum.values())
  {
    if(person.getTowns() != null)
    {
      for(int i=0; i<person.getTownsLength();i++)
        if(person.getTownsValue(i).equals(e.toString()))
        {
          out.print("<option value=" + e.toString() +  " selected >" + e.toString() + "</option><br/>");
          checked = true;
        }
    }
    if(!checked)
      out.print("<option value=" + e.toString() + ">" + e.toString() + "</option><br/>");
    checked = false;
 }
%>
</select><br/>
</fieldset>
<fieldset>
<legend>Favorite Languages</legend>
<% 
  checked = false;
                
  for(languagesEnum e: languagesEnum.values())
  {
    if(person.getLanguages() != null)
    {
      for(int i=0; i<person.getLanguagesLength();i++)
        if(person.getLanguagesValue(i).equals(e.toString()))
        {
          out.print("<input type='checkbox' name='languages' value=" + e.toString() + " checked>" + e.toString() + "<br/>");
          checked = true;
        }
    }
    if(!checked)
      out.print("<input type='checkbox' name='languages' value=" + e.toString() + ">" + e.toString() + "<br/>");
    checked = false;
 }
%>
</fieldset>
<fieldset>
  <legend>Additional information</legend>
  <textarea rows="6" cols="50" name="additionalInfo">${person.additionalInfo}</textarea>
</fieldset><br>
        <input type="submit" value=" OK "/>
    
</form>
</body>
</html>