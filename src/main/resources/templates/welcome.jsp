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
				<h1 class="text-center">Welcome <span th:text="${user.getUserName }"></span> to shoe Shop</h1>

			</div>
		</div>
		
		<div class=" alert" role="alert">
            <p th:text="${message}"></p>
</div>

		<div class="row mt-5">
			<h2>Choose the Category  </h2>
			<div class="col-md-6 offset-md-1">
			<div class="btn-group-vertical" role="group" aria-label="Basic example">
		
            <button type="button" class="btn btn-primary" onclick="window.location='gents'">Gents</button>
 
				
				<button type="button" class="btn btn-primary" onclick="window.location='ladies'">Ladies</button>
				<button type="button" class="btn btn-primary" onclick="window.location='kids'">Kids</button>
			</div>
          </div>

       <!--  <div class="container">
		<div class="row mt-5">
			<div class="col-md-4 offset-md-3">
				<button class="text-center" onclick="window.location='login'" >Login Here !!</button>

			</div>
			<div class="col-md-4 offset-md-1">
				<button class="text-center" onclick="window.location='signup'" >SignUp Here !!</button>
                
			</div>
		</div>
		</div> -->

		</div>

	</div>
</body>
</html>