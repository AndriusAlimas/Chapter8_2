<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View</title>
</head>
<body>
	<!-- We have body and inside body its conditional if bean object doesnot
exist, we do inside body to create new bean object and set default values -->
	<jsp:useBean id="person_object" class="foo.other.Person"
		scope="request">
		<jsp:setProperty name="person_object" property="name"
			value="NEW_DEFAULT_NAME" />
	</jsp:useBean>

	<hr>
	Using standart action beans we get property value :
	<jsp:getProperty name="person_object" property="name" />

</body>
</html>