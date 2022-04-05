<!doctype html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

<title>Hello, world!</title>
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
				<h1 class="text-center">Edit Products</h1>

			</div>
		</div>

		<div class="container">

			<form action="/displayProduct" , method="post">
				<div class="mb-3">
					<label for="productName" class="form-label">Product Name</label> <input
						type="text" class="form-control" id="productName" name="productName"
						aria-describedby="emailHelp">

				</div>
				<div class="mb-3">
					<label for="category" class="form-label">Category</label>
					<select class="form-select" aria-label="Default select example" name="category">
						<option value="gents">Gents</option>
						<option value="ladies">Ladies</option>
						<option value="kids">Kids</option>
					</select>
				</div>
				<div class="mb-3">
					<label for="productName" class="form-label">Product Price</label> <input
						type="text" class="form-control" id="productPrice" name="price"
						aria-describedby="emailHelp">

				</div>
				<button type="submit" class="btn btn-primary">Submit</button>
			</form>

		</div>
</body>
</html>