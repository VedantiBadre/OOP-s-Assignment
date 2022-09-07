package com.oops.Finalize;

public class ClassEmployee {

	    private int id;



	   public int getId() {
	        return id;
	    }



	   public void setId(int id) {
	        this.id = id;
	    }



	   @Override
	    public String toString() {
	        return "Employee [id=" + id + "]";
	    }



	   public ClassEmployee(int i) {
	        super();
	        // TODO Auto-generated constructor stub
	    }



	   @Override
	    protected void finalize() throws Throwable {
	        System.out.println("id= "+this.id);
	    }
	}

