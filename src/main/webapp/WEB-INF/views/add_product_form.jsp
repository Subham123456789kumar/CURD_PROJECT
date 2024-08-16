<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
	
	
		<%@ page isELIgnored="false" %>
		
		
	
		
		
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">


<title>Product Details Form</title>



<!-- Add any necessary CSS or other meta tags here -->

<%@include file="./base.jsp"%>


</head>
<body>

	<div class="container mt-3">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<h1 class="text-center mb-3">Fill the Product Details</h1>
				
				
				
				
				<form action="handle-product" method="post">
				
				
				
					<div class="form-group">
						<label for="name">Product Name</label> <input type="text"
							class="form-control" id="name" name="name"
							placeholder="Enter the product name here">
					</div>
					
					
					<div class="form-group">
						<label for="description">Product Description</label>
						<textarea class="form-control" id="description" name="description"
							rows="5" placeholder="Enter the product description"></textarea>
					</div>
					
					
					
					
					<div class="form-group">
						<label for="price">Product Price</label> <input type="text"
							class="form-control" id="price" placeholder="Enter Product Price"
							name="price">
					</div>
					
					
					
					
					<div class="container text-center">
					
					
					 
										
					
					<a href="<%= request.getContextPath() %>/index"   class="btn btn-outline-danger">Back</a>
					
				
				
					
			         <button type='submit' class='btn btn-primary'>Add</button>
					
					
				</div>
					
					
					
					
				</form>
				
			</div>
		</div>
	</div>
	<!-- Add any necessary JavaScript scripts or links here -->

</body>
</html>
