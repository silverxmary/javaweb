package edu.curso.struts2.actions;

import com.opensymphony.xwork2.ActionSupport;

public class HolaMundo extends ActionSupport  {

    private String message;

    private String userName;
    private String n1;
    private String n2;

    
    public String getN1() {
		return n1;
	}

	public void setN1(String n1) {
		this.n1 = n1;
	}

	public String nu1() {
		return n2;
	}

	public void setN2(String n2) {
		this.n2 = n2;
	}

	public HolaMundo() {
    }

	public String sumar(String num1, String num2){
		int nu1 = Integer.parseInt(num1);
		int nu2 = Integer.parseInt(num2);
		setMessage("La suma de dos numeros !!!! " + nu1+nu2);
        addActionMessage("Esto es un msg de strtus...");
		
		 return "SUCCESS";
	}
	
	
    public String execute() {
        setMessage("HolaMundo!!!! " + getUserName());
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

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
    


}