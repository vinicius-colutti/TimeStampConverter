package com.colutti.timestampconverter;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		// timestamp to Date
		long timestamp = 1144371015641L; //Example -> in ms
		Date d = new Date(timestamp );
		System.out.println(d);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		System.out.println(sdf.format(d));
//		//If you want the current timestamp :
//		Calendar c = Calendar.getInstance();
		

	}

}
