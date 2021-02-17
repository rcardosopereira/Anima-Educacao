package tests;


import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import java.util.HashMap;
import java.util.Map;
import org.json.simple.JSONObject;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;


public class PostExamples {
	
	
	 private String validRequest = "{\n" +
	            "  \"nome\": \"Computador Desktop Dell\",\n" +
	            "  \"preco\": \"102\",\n" +
	            "  \"descricao\": \"Tecnologia da informacao\" \n" +
	            "  \"quantidade\": \"10\" \n}";
	 
	 private String userLogin = "{\n" +
	            "  \"email\": \"446ury8@bemoldigital.com\",\n" +
	            "  \"password\": \"teste\" \n}";
	 
	 private String jsonCarrinho = "{\n" +
	            "  \"idProduto\": \"0vnx0gqEHdpq0sal\",\n" +	
	            "  \"quantidade\": \"2\" \n}";

	 
	 
	 
	 
	 
	 
	 @Test
	    public void createUser() {
	        Response response = given()
	                .auth()
	                .preemptive()
	                .basic("rafael@teste.com", "teste123")
	                .header("Accept", ContentType.JSON.getAcceptHeader())
	                .contentType(ContentType.JSON)
	                .body(userLogin)
	                .post("https://serverest.dev/login")
	                .then().extract().response();

	        Assertions.assertEquals(200, response.getStatusCode());
	    }
	 
	
	@Test
	public void postOne() {
		given().log().all().contentType("application/json")
		.body(
				"{ \"nome\": \"Rafael\", \"email\": rafael@teste.com, \"password\": \"123\", \"administrador\": false  }")
				.when().post("https://serverest.dev/usuarios").then().log().all().statusCode(201);
	}
	
	
	@Test
	public void postTwo() {
		given().log().all().contentType("application/json")
				.body("{ \"email\": \"rafael@teste.com\", \"password\": teste123 }").when()
				.post("https://serverest.dev/login").then().log().all().statusCode(401);
	}

	
	@Test
	public void postThree() {
		given().log().all().contentType("application/json")
		        .header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6InBhdWxvQGcuY29tIiwicGFzc3dvcmQiOiJ0ZXN0ZSIsImlhdCI6MTU4ODQ1MTIxNiwiZXhwIjoxNTg4NTM3NjE2fQ.nhwC1-1tulXjhpFIgQLL0swklfaow5jkJYuU-20cKA8")
				.body(validRequest)
				.when()
				.post("https://serverest.dev/produtos").then().log().all().statusCode(201);
	}
	
	 @Test
	    public void postFour() {
	        	 	given().log().all().contentType("application/json")
	        		.header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6InBhdWxvQGcuY29tIiwicGFzc3dvcmQiOiJ0ZXN0ZSIsImlhdCI6MTU4ODQ1MTIxNiwiZXhwIjoxNTg4NTM3NjE2fQ.nhwC1-1tulXjhpFIgQLL0swklfaow5jkJYuU-20cKA8")
	                .auth()
	                .preemptive()
	                .basic("446ury8@bemoldigital.com", "teste")
	                .header("Accept", ContentType.JSON.getAcceptHeader())
	                .contentType(ContentType.JSON)
	                .body(userLogin)
	                .post("https://serverest.dev/login")
	                .then().log().all().statusCode(200);   
	    }
	
	 @Test
		public void postFive() {
			given().log().all().contentType("application/json")
					.body(validRequest)
					.when()
					.post("https://serverest.dev/produtos").then().log().all().statusCode(201);
	 }

		
		
	@Test
	public void postSix() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("nome", "Rafael");
		map.put("email", "rafaelteste@teste.com");
		map.put("password", "senha123");
		map.put("administrador", "true");		
		JSONObject request = new JSONObject();
		System.out.println(request.toJSONString());
		given().header("Content-Type", "application/json").contentType(ContentType.JSON).accept(ContentType.JSON)
				.body(request.toJSONString()).when().post("https://serverest.dev/usuarios").then().statusCode(201).log().all();

	}
	
	 @Test
	    public void postSeven() {
	        	 	given().log().all().contentType("application/json")
	        		.header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6InBhdWxvQGcuY29tIiwicGFzc3dvcmQiOiJ0ZXN0ZSIsImlhdCI6MTU4ODQ1MTIxNiwiZXhwIjoxNTg4NTM3NjE2fQ.nhwC1-1tulXjhpFIgQLL0swklfaow5jkJYuU-20cKA8")
	        		.auth()
	                .preemptive()
	                .basic("0vnx0gqEHdpq0sal", "2")
	                .header("Accept", ContentType.JSON.getAcceptHeader())
	                .contentType(ContentType.JSON)
	                .body(jsonCarrinho)
	                .post("https://serverest.dev/carrinhos")
	                .then().log().all().statusCode(200);   
	    }

	 @Test
	    public void postEight() {
	        	 	given().log().all().contentType("application/json")
	        		.header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6InBhdWxvQGcuY29tIiwicGFzc3dvcmQiOiJ0ZXN0ZSIsImlhdCI6MTU4ODQ1MTIxNiwiZXhwIjoxNTg4NTM3NjE2fQ.nhwC1-1tulXjhpFIgQLL0swklfaow5jkJYuU-20cKA8")
	                .auth()
	                .preemptive()
	                .basic("446ury8@bemoldigital.com", "teste")
	                .header("Accept", ContentType.JSON.getAcceptHeader())
	                .contentType(ContentType.JSON)
	                .body(userLogin)
	                .post("https://serverest.dev/login")
	                .then().log().all().statusCode(401); 
	 }
	 
	 @Test
	    public void postNine() {
	        	 	given().log().all().contentType("application/json")
	        		.header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6InBhdWxvQGcuY29tIiwicGFzc3dvcmQiOiJ0ZXN0ZSIsImlhdCI6MTU4ODQ1MTIxNiwiZXhwIjoxNTg4NTM3NjE2fQ.nhwC1-1tulXjhpFIgQLL0swklfaow5jkJYuU-20cKA8")
	        		.auth()
	                .preemptive()
	                .basic("0vnx0gqEHdpq0sal", "2")
	                .header("Accept", ContentType.JSON.getAcceptHeader())
	                .contentType(ContentType.JSON)
	                .body(jsonCarrinho)
	                .post("https://serverest.dev/carrinhos")
	                .then().log().all().statusCode(401);   
	    }
	 
	 

}
