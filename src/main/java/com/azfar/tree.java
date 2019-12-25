package com.azfar;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Set;

public class tree {

    public static void main(String[] args) {
    	
    	   
    	int n=0;
    	String size = System.getProperty("tree_size","small");
    	switch (size) { 
        case "small": 
            n = 5; 
            break; 
        case "medium": 
        	n = 10; 
            break; 
        case "large": 
        	n = 15; 
            break; 
        case "xlarge": 
        	n = 20; 
            break; 
        case "xxlarge": 
        	n = 25; 
            break; 
        
        }
    	
    	
    	for (int i = 0; i < n; i++) {
            for (int j = n - 1; j > i; j--)
                System.out.print(' ');
            for (int j = i * 2; j >= 0; j--) 
                System.out.print('*');
                System.out.println();
        }
    	System.out.println();
    	System.out.println("###################################################");
    	System.out.println("#      Merry Christmas  $$                        #");
    	System.out.println("#                                                 #");
    	System.out.println("#              && :) :)   $$ Happy New Year $$    #");
    	System.out.println("###################################################");
    	
    }

   
}
