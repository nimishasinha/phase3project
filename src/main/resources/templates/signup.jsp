<!doctype html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
<meta charset="UTF-8" />
<title>SignUp form</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
	

</head>
<body>

   <div class="container">
        <div class="row mt-5">
			<div class="col-md-4 offset-md-3">
				<button class="text-center" onclick="window.location='home'" >Home Page</button>

			</div>
          </div>
          </div>
	<div class="container">
		<form action="/welcome" method="post" >
			<div class="mb-3">
				<label for="userName" class="form-label">Name
					</label> <input type="text" class="form-control"
					id="userName" name="userName" placeholder="Enter your name here" aria-describedby="emailHelp">
				
			</div>
			<div class="mb-3">
				<label for="mobileNo" class="form-label">Phone No.
					</label> <input type="text" class="form-control"
					id="mobileNo" placeholder="Enter your phone no. here" name="mobileNo" aria-describedby="emailHelp">
				
			</div>
			<div class="mb-3">
				<label for="gender" class="form-label">Gender</label> <select
					id="gender" name="gender" class="form-select">
					<option>Male</option>
					<option>Female</option>
				</select>
			</div>
			<div class="mb-3">
				<label for="exampleInputEmail1" class="form-label">City</label>
				 <input type="text" class="form-control" name="city"
					id="city" aria-describedby="emailHelp">
				
			</div>
			<div class="mb-3">
				<label for="password" class="form-label">Password</label>
				<input type="password" class="form-control" name="password"
					id="password">
			</div>
			
			<button type="submit"  id="btnShow" class="btn btn-primary">Submit</button>
			
		</form>

	</div>
</body>
</html>