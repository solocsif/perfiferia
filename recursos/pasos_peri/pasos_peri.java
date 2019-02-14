package pasos_peri;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import pagina_selenium.pagina_selenium;
public class pasos_peri {
	pagina_selenium peri=new pagina_selenium();
	@Given("^abrir el navegador chrome$")
	public void abrir_el_navegador_chrome() throws Exception{
	    peri.abrirnavegador();
	}

	@When("^ir a la pagina periticket$")
	public void ir_a_la_pagina_periticket() throws Exception{
	  peri.abrirperiticket();
	}

	@Then("^ingresar correo$")
	public void ingresar_correo() throws Exception{
	   peri.ingresarcorreo();
	}

	@Then("^ingresar contrasena$")
	public void ingresar_contrasena() throws Exception{
	    peri.ingresarcontraseña();
	}
}
