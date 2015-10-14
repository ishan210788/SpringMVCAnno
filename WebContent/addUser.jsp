<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<div>
<h2>Create a User</h2>
<sf:form method="GET" modelAttribute="user" action="http://localhost:8080/SpringMVCAnnotation/ProcessUser.htm" >
	<fieldset>
	<table cellspacing="0">
		<tr>
			<th><sf:label path="username">Username:</sf:label></th>
			<td><sf:input path="username" size="15" maxlength="15" /> <small
				id="username_msg">No spaces, please.</small><br />
			<sf:errors path="username" /></td>
		</tr>

		<tr>
         <th><sf:label path="password">Password:</sf:label></th>
         <td><sf:password path="password" size="30" 
                            showPassword="true"/> 
             <small>6 characters or more (be tricky!)</small><br/>
             <sf:errors path="password" />
            </td>
      </tr>

      <tr>
         <th><sf:label path="email">Email Address:</sf:label></th>

         <td><sf:input path="email" size="30"/> 
             <small>In case you forget something</small><br/>
             <sf:errors path="email" />
            </td>
      </tr>


		<tr>
			<th></th>
			<td><input name="commit" type="submit" value="Save User" /></td>
		</tr>

	</table>
	</fieldset>
</sf:form></div>