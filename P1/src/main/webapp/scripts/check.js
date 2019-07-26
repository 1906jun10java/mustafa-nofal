let user = {};

window.onload = function() {
	populateUser();
}

function populateUser() {
	// send a GET request to SessionServlet to obtain session information
	fetch("http://localhost:8082/P1/Session").then(function(response) {
		return response.json(); // parsing json data in the response as a JS object
	}).then(function(data) {
		console.log(data);
		// check whether there is a valid session
		//define behavior for when there is no valid user
		if(data.session === null) {
			window.location = "http://localhost:8082/ProjectOne4/loginpage"
		} else {
			//define behavior for when a user is returned
			user = data;
			document.getElementById("Firstname").innerText = "Firstname: "+user.firstname;
			document.getElementById("Lastname").innerText = "Lastname: "+user.lastname;
			document.getElementById("Username").innerText = "Username: "+user.username;
			document.getElementById("Password").innerText = "Password: "+user.password;
			document.getElementById("ID").innerText = "ID: "+user.user_id;
			document.getElementById("Position Held").innerText = "Position Held: "+user.emp_or_mgr;
			document.getElementById("Email").innerText = "Email: "+user.email;
		}
	})
}




//let user = {};
//
//window.onload = function() {
//	populateUser();
//}
//
//function populateUser() {
//	// send a GET request to SessionServlet to obtain session information
//	fetch("http://localhost:8082/ServletDemo/session").then(function(response) {
//		return response.json(); // parsing json data in the response as a JS object
//	}).then(function(data) {
//		console.log(data);
//		// check whether there is a valid session
//		//define behavior for when there is no valid user
//		if(data.session === null) {
//			window.location = "http://localhost:8082/ServletDemo/login"
//		} else {
//			//define behavior for when a user is returned
//			user = data;
//			document.getElementById("username").innerText = "username: "+user.username;
//			document.getElementById("firstname").innerText = "firstname: "+user.firstname;
//			document.getElementById("lastname").innerText = "lastname: "+user.lastname;
//			document.getElementById("email").innerText = "email: "+user.email;
//		}
//	})
//}