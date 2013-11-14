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
<jsp:useBean id="person" class="com.example.servletjspdemo.domain.Person" scope="session" />

<form action="confirm.jsp">

<%!
public String checkTown(String town,int length,String[] towns)
{
   for(int i=0;i<length;i++)
     if (town.equals(towns[i])) 
      return "selected";
   return "";
}

public String checkLanguage(String language,int length,String[] languages)
{
   for(int i=0;i<length;i++)
     if (language.equals(languages[i])) 
      return "checked";
   return "";
}
%>

<% 
 int lengthT = 0;
 int lengthL = 0;
 
 if(person.getTowns() != null)
	  lengthT = person.getTownsLength();
 if(person.getLanguages() != null)
	  lengthL = person.getLanguagesLength();
%>

<fieldset>
  <legend>Personal Information</legend>
  First name : <input type="text" name="firstName" value="${person.firstName}"/><br/>
  Last name : <input type="text" name="lastName" value="${person.lastName}"/><br/>
  Year of birth : <input type="text"  name="yob" value="${person.yob}"/><br/>
  Gender : <input type="radio" name="gender" value="Male" 
           <% if ("Male".equals(person.getGender())) 
                out.print("checked"); %>
           />Male
           <input type="radio" name="gender" value="Female"
           <% if ("Female".equals(person.getGender())) 
                out.print("checked"); %>
           />Female<br/>
  Town : <select name="towns" size="4" multiple="multiple">
    <option value="Gdańsk"
           <% out.print(checkTown("Gdańsk",lengthT,person.getTowns()));%>
    >Gdańsk</option>
    <option value="Gdynia"
           <% out.print(checkTown("Gdynia",lengthT,person.getTowns()));%>
    >Gdynia</option>
    <option value="Sopot"
           <% out.print(checkTown("Sopot",lengthT,person.getTowns()));%>
    >Sopot</option>
    <option value="Kartuzy"
           <% out.print(checkTown("Kartuzy",lengthT,person.getTowns()));%>
    >Kartuzy</option>
  </select><br/>
</fieldset>
<fieldset>
<legend>Favorite Languages</legend>
        <input type="checkbox" name="languages" value="Java" 
        <% out.print(checkLanguage("Java",lengthL,person.getLanguages()));%>/>Java
        <input type="checkbox" name="languages" value="C++"
        <% out.print(checkLanguage("C++",lengthL,person.getLanguages()));%>/>C++
        <input type="checkbox" name="languages" value="C#"
        <% out.print(checkLanguage("C#",lengthL,person.getLanguages()));%>/>C#
        <input type="checkbox" name="languages" value="PHP"
        <% out.print(checkLanguage("PHP",lengthL,person.getLanguages()));%>/>PHP
        <input type="checkbox" name="languages" value="JavaScript"
        <% out.print(checkLanguage("JavaScript",lengthL,person.getLanguages()));%>/>JavaScript
        <input type="checkbox" name="languages" value="Python"
        <% out.print(checkLanguage("Python",lengthL,person.getLanguages()));%>/>Python
        <input type="checkbox" name="languages" value="Perl"
        <% out.print(checkLanguage("Perl",lengthL,person.getLanguages()));%>/>Perl
        <input type="checkbox" name="languages" value="Ruby"
        <% out.print(checkLanguage("Ruby",lengthL,person.getLanguages()));%>/>Ruby
</fieldset>
<fieldset>
  <legend>Additional information</legend>
  <textarea rows="6" cols="50" name="additionalInfo">
       <% out.print(person.getAdditionalInfo()); %>
  </textarea>
</fieldset><br>
        <input type="submit" value=" OK "/>
    
</form>
</body>
</html>