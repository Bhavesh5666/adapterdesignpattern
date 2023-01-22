package com.jspiders.adapterdesignpattern.adapter;

import com.jspiders.adapterdesignpattern.interfaces.Mock;
import com.jspiders.adapterdesignpattern.object.Wejm4;

public class Adapter extends Wejm4 implements Mock{
	
	private static Adapter adapter = new Adapter();
	public static void main(String[] args) {
		adapter.rating();
	}
 
    @Override
    public void rating() {
    	
    	adapter.setId(001);
    	adapter.setName("bhavesh");
    	adapter.setComm_rating("*");
    	adapter.setTech_rating("*");
    	System.out.println(adapter.getName()
    			+ " has technical rating as : "
    			+ adapter.getTech_rating()
    			+ " and has communication rating as : "
    			+ adapter.getComm_rating());
    	
    }
}
