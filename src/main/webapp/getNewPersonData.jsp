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
<% session.invalidate(); %>
<fieldset>
  <legend>Personal Information</legend>
  First name : <input type="text" name="firstName" value="${person.firstName}"/><br/>
  Last name : <input type="text" name="lastName" value="${person.lastName}"/><br/>
  Year of birth : <input type="text"  name="yob" value="${person.yob}"/><br/>
  Gender : <input type="radio" name="gender" value="Male" />Male
           <input type="radio" name="gender" value="Female"/>Female<br/>
  Town : <select name="towns" size="4" multiple="multiple">
    <option value="Gdańsk">Gdańsk</option>
    <option value="Gdynia">Gdynia</option>
    <option value="Sopot">Sopot</option>
    <option value="Kartuzy">Kartuzy</option>
  </select><br/>
</fieldset>
<fieldset>
<legend>Favorite Languages</legend>
        <input type="checkbox" name="languages" value="Java"/>Java
        <input type="checkbox" name="languages" value="C++"/>C++
        <input type="checkbox" name="languages" value="C#"/>C#
        <input type="checkbox" name="languages" value="PHP"/>PHP
        <input type="checkbox" name="languages" value="JavaScript"/>JavaScript
        <input type="checkbox" name="languages" value="Python"/>Python
        <input type="checkbox" name="languages" value="Perl"/>Perl
        <input type="checkbox" name="languages" value="Ruby"/>Ruby
</fieldset>
<fieldset>
  <legend>Additional information</legend>
  <textarea rows="6" cols="50" name="additionalInfo"></textarea>
</fieldset><br>
        <input type="submit" value=" OK "/>
</form>
</body>
</html>