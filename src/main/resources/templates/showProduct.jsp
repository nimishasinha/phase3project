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
				<h1 class="text-center">Show Products</h1>

			</div>
		</div>

		<div class="container">

			<form>
				

				<table class="table table-success table-striped">
  <thead>
    <tr>
     <th>Id No</th>
		<th>Product Name</th>
		<th>Category</th>
		<th>Price</th>
		<th>Operations</th>
		
    </tr>
  </thead>
  <tbody>
   
		
			<tr  th:each="repos : ${repo }">
			
			
				<td th:text="${repos.id }"></td>
				<td th:text="${ repos.productName}">${name}</td>
				<td th:text="${ repos.category}"></td>
				<td th:text="${repos.price }"></td>
				<!-- <td><button type="submit" class="btn btn-success">Edit</button><button type="submit" class="btn btn-danger">Delete</button></td> -->
				<td><form th:action="@{|/delete/${repos.id}|}" method="post">
            <button type="submit">Delete</button>
        </form></td>

			</tr>
		
   
  </tbody>
    </table>
    
    <div class="container text-center">
    
    <a th:href="@{/addProduct}">Add Product</a>
     
    
    
    </div>
			</form>

		</div>
</body>
</html>