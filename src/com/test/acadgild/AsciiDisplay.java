package com.test.acadgild;

public class AsciiDisplay {

	    public static void main(String args[])
	    {
		
	        String ch;
	        for(int i=65; i<=90; i++)
	        {
	            ch = new Character((char)i).toString();
	            System.out.println(i+ "-" +ch);
	        }
			
	    }
	}

