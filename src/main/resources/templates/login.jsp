
<!doctype html>

<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
<meta charset="UTF-8" />
<title>login form</title>
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

		<div class="row mt-5">
			<div class="col-md-6 offset-md-3">
				<h1 class="text-center">Login Here !!</h1>
				<h1 th:text="${msg }"></h1>
			</div>
		</div>

		<form action="/editProduct" , method="post">
			<div class="mb-3">
				<label for="username" class="form-label">Usename</label> <input type="text" class="form-control"
					id="username" name="username" aria-describedby="emailHelp">
				
			</div>
			<div class="mb-3">
				<label for="password" class="form-label">Password</label>
				<input type="password" class="form-control" name="password"
					id="password">
			</div>
			
			<button type="submit" class="btn btn-primary">Submit</button>
		</form>


	</div>

	</div>
</body>
</html>