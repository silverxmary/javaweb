package edu.curso.struts2.actions;

import com.opensymphony.xwork2.ActionSupport;

public class Calculadora extends ActionSupport  {

    private String message;
    
    private String operacion;
    private String n1;
    private String n2;

    
    public String getN1() {
		return n1;
	}

	public void setN1(String n1) {
		this.n1 = n1;
	}

	public String getN2() {
		return n2;
	}

	public void setN2(String n2) {
		this.n2 = n2;
	}

	public Calculadora() {
    }

	public String calcular(){
		int nu1 = Integer.parseInt(getN1());
		int nu2 = Integer.parseInt(getN2());
		int total = 0;
		if (getOperacion()=="sumar"){
			total = nu1+nu2;
		}
		if (getOperacion()=="restar"){
			total = nu1-nu2;
		}
		if (getOperacion()=="multiplicar"){
			total = nu1*nu2;
		}
		if (getOperacion()=="dividir"){
			total = nu1/nu2;
		}
		setMessage("resultado !!!! " + nu1+nu2);
        addActionMessage("Esto es un msg de strtus...");
		
		 return "SUCCESS";
	}
	
	
    public String execute() {
        setMessage("HolaMundo!!!! " );
        addActionMessage("Esto es un msg de strtus...");
        return "SUCCESS";
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

	public String getOperacion() {
		return operacion;
	}

	public void setOperacion(String operacion) {
		this.operacion = operacion;
	}

    /**
     * @return the userName
     */
  
}