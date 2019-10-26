package business;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;


public class CountriesIO {

	   	private ArrayList<String> countries = null;
	    private Path countriesPath = null;
	    private File countriesFile = null;

	    private final String FIELD_SEP = "\t";

	    public CountriesIO() {
	        // initialize the class variables
	    	countriesPath = Paths.get("countries.txt");
	    	countriesFile = countriesPath.toFile();
	    	countries = this.getCountries();
	    }	
	
	
	
	
	
	
	public ArrayList<String> getCountries() {
		
		// if the customers file has already been read, don't read it again
        if (countries != null) {
            return countries;
        }

        countries = new ArrayList<String>();
        
        if (Files.exists(countriesPath)) {
        	try (BufferedReader in = new BufferedReader ( new FileReader(countriesFile))){
        			//read products from file into array list
        			String line = in.readLine();
        			while (line != null) {
        				
        				String[] fields = line.split(FIELD_SEP);
        				
        				for (int i=0; i <fields.length; i++) {
        					countries.add(fields[i]);
        				}
        	
        				line = in.readLine();        				
        			}
        
        			in.close();
        			
			} catch (IOException e) {
				System.out.println(e);
				return null;
			}
        } else {
        	
        	System.out.println(countriesPath.toAbsolutePath()+ "doesn't exist.");
        	return null;
        }
        
      
     
        return countries;
		
	}
			
	public boolean saveCountries(ArrayList<String> countries) {
		
        	
    	try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(countriesFile)))) {
    		
    	   		
    		
    		for (String c: countries ) {
    			
    			out.print(c + FIELD_SEP);
    		  			
    		}
    		
    		out.close();
    		return true;
    		
    	} catch (IOException e) {
    		
    		System.out.println(e);
    		return false;
    		
    	}
		
		
	
	}
	
	
}
