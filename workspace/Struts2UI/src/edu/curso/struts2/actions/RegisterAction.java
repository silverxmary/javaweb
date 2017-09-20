package edu.curso.struts2.actions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;

import edu.curso.struts2.bo.Country;
import edu.curso.struts2.models.Persona;

public class RegisterAction extends ActionSupport {

	private static Logger log = Logger.getLogger(RegisterAction.class);
    
	private String userName;

	private String password;

	private String gender;

	private String about;

	private String country;

	private ArrayList<Country> countryList;
	private ArrayList<Persona> personaList = new ArrayList<Persona>();
	
	public RegisterAction(){};
	private String[] community;

	private ArrayList<String> communityList;

	private Boolean mailingList;

	public String populate() {
		populateData();

		return "populate";
	}

	private void populateData() {
		log.info("Recuperando datos iniciales del formulario");
		
		countryList = new ArrayList<Country>();
		countryList.add(new Country(1, "Brasil"));
		countryList.add(new Country(2, "Uruguay"));
		countryList.add(new Country(3, "Argentina"));

		communityList = new ArrayList<String>();
		communityList.add("Java");
		communityList.add(".Net");
		communityList.add("SOA");

		community = new String[] { "Java", ".Net" };
		
	}

	public String guardar() {
		log.warn("Falta esto....Ejecutando el guardar....");
		Persona p = new Persona(getUserName(), getPassword(), getGender(), 
				getCountry(),getCountry(), getAbout(), getCommunityList(),getMailingList());
		
		personaList.add(p);
		
		
		// TODO: Guardar los datos en la base de datos...
		return SUCCESS;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public ArrayList<Country> getCountryList() {
		return countryList;
	}

	public void setCountryList(ArrayList<Country> countryList) {
		this.countryList = countryList;
	}

	public String[] getCommunity() {
		return community;
	}

	public void setCommunity(String[] community) {
		this.community = community;
	}

	public ArrayList<String> getCommunityList() {
		return communityList;
	}

	public void setCommunityList(ArrayList<String> communityList) {
		this.communityList = communityList;
	}

	public Boolean getMailingList() {
		return mailingList;
	}

	public void setMailingList(Boolean mailingList) {
		this.mailingList = mailingList;
	}
	
	public void validate() {
		populateData();
		
		log.info("validando....");
		if (userName != null) {
			if(userName.length() == 0) {
				
				addFieldError("userName", "El userName es requerido");
			}
		}
	}	

}
