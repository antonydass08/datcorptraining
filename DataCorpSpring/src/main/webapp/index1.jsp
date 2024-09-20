<!DOCTYPE html>
<html>
<body>

<h1>Enter Details:</h1>
<form action="putUsers">
Id:<input type="text" name=id><br>
Name:<input type="text" name="name"><br>
price:<input type="text" name="price">
<input type="submit">
</form><br>

<h1>Display One User
<form action="getUsers">
	Id:<input type="text" name=id><br>
	<input type="submit">
</form><br>

<h1>Modify User
<form action="modifyUsers">
	Id:<input type="text" name="id">
	<input type="submit">
</form>

<h1>Delete User
<form action="deleteUser">
	Id:<input type="text" name="id">
	<input type="submit">
</form>
	
	


	
</body>
</html>