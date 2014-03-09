package com.framework.classes;

import java.util.Date;
import java.lang.System;


public class Event {

	private String E_Title;
	private String E_Data;
	private Date E_Date;
	
	Event(){
		E_Title = null;
		E_Date = null;
		E_Date = null;		
	}
	
	Event(String e_title, String e_data, Date e_date){		
		E_Title = e_title;
		E_Data = e_data;
		E_Date = e_date;
	}
	
	void printvalues(){
	
	System.out.println("Title" + E_Title);
	System.out.println("Data" + E_Data);
	System.out.println("Date" + E_Date);
	}
}
