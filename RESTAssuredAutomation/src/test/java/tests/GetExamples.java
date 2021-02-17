package tests;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.BeforeAll;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import static org.hamcrest.Matchers.is;

public class GetExamples {

	@BeforeAll
	public static void setup() {
		RestAssured.baseURI = "https://serverest.dev";
	}

	@Test
	public void testGetOne() {
		baseURI = "https://serverest.dev";

		given().get("/usuarios").then().statusCode(200).body("usuarios.nome[0]", equalTo("Fulano da Silva"));

	}

	@Test
	public void testGetTwo() {
		baseURI = "https://serverest.dev";

		given().get("/usuarios").then().statusCode(200).body("usuarios.nome[1]", equalTo("Emory"));

	}

	@Test
	public void testGetThree() {
		baseURI = "https://serverest.dev";

		given().get("/usuarios").then().statusCode(200).body("usuarios.email[0]", equalTo("fulano@qa.com"));

	}

	@Test
	public void testGetFour() {
		baseURI = "https://serverest.dev/";

		given().get("/produtos").then().statusCode(200).body("produtos.descricao[1]",
				equalTo("deposit applications Dinar throughput Avon"));

	}

	@Test
	public void testGetFive() {
		baseURI = "https://serverest.dev/";

		given().get("/carrinhos").then().statusCode(200).body("produtos.idProduto[1]", equalTo(null));

	}

	@Test
	public void testGetSix() {
		baseURI = "https://serverest.dev/";

		given().get("/produtos").then().statusCode(200).body("produtos.nome[0]", is("Logitech MX Vertical"))
				.body("produtos.descricao[0]", is("Mouse"));

	}

	@Test
	public void testGetSeven() {
		baseURI = "https://serverest.dev/";

		given().get("/produtos").then().statusCode(200).body("produtos.nome[2]", is("Samsung 60 polegadas"))
				.body("produtos.descricao[2]", is("TV"));

	}

	
	@Test
	public void testGetEight() {
		baseURI = "https://serverest.dev/";

		given().get("/produtos").then().statusCode(200).body("produtos.nome[6]", is("monitor-611d20b6-538e-4086-9807-3a1914d6f32d"));
	}
	
	@Test
	public void testGetNine() {
		baseURI = "https://serverest.dev/";

		given().get("/usuarios").then().statusCode(200).body("usuarios.nome[6]", is("Brook"));
	}
	
	@Test
	public void testGetTen() {
		baseURI = "https://serverest.dev/";

		given().get("/usuarios").then().statusCode(200).body("usuarios.nome[2]", is("Marcelo Vasconcelos"))
				.body("usuarios.email[2]", is("446ury8@bemoldigital.com"));

	}
}
