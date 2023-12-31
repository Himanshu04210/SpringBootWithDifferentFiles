package com.masai;

import java.io.FileReader;

import com.opencsv.CSVReader;

public class CSVFileReader {
	
	public static void readDataLineByLine(String file)
	{
	  
	    try {
	  
	        FileReader filereader = new FileReader(file);
	  
	        CSVReader csvReader = new CSVReader(filereader);
	        String[] nextRecord;
	  
	        while ((nextRecord = csvReader.readNext()) != null) {
	            for (String cell : nextRecord) {
	                System.out.print(cell + "\t");
	            }
	            System.out.println();
	        }
	    }
	    catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	
	public static void main(String[] args) {
		readDataLineByLine("C:\\Users\\Himanshu Sahu\\Downloads\\Data.csv");
	}
	
}
