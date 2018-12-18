package shpParser;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class main {

	public static void main(String[] args) {
		
		example1() ;
		example2() ;
		example3() ;

	}
	
	public static void example1(){
		/**
		 * Fill staff Class
		 */
		
		ObjectMapper mapper = new ObjectMapper();
		String jsonInString = "{\"name\" : \"mkyong\", \"last\" : \"arbi\"}";

		Staff obj = null ;
		//JSON from String to Object
		try {
			obj = mapper.readValue(jsonInString, Staff.class);
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(obj.toString());
	}
	
	public static void example2(){
		/**
		 * Fill staff Class with nested object
		 */
		
		ObjectMapper mapper = new ObjectMapper();
		String jsonInString = "{\"name\" : \"mkyong\","
							+ " \"last\" : \"arbi\" ,"
							+ " \"att\" : {\"name\" : \"zied\"}}";

		Staff2 obj = null ;
		//JSON from String to Object
		try {
			obj = mapper.readValue(jsonInString, Staff2.class);
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(obj.toString());
		System.out.println(obj.getAtt().toString());
	}
	
	public static void example3(){
		/**
		 * Fill staff Class with nested object
		 */
		
		ObjectMapper mapper = new ObjectMapper();
		String jsonInString = "{\"name\" : \"mkyong\","
							+ " \"last\" : \"arbi\" ,"
							+ " \"att\" : ["
										+ "	{\"name\" : \"zied\"}, "
										+ "	{\"name\" : \"sami\"} "
											+ "]}";

		Staff3 obj = null ;
		//JSON from String to Object
		try {
			obj = mapper.readValue(jsonInString, Staff3.class);
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(obj.toString());
		System.out.println(obj.getAtt()[0].toString());
		System.out.println(obj.getAtt()[1].toString());
	}

}
