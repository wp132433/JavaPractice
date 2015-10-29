/**
 * 
 */
package org.dimigo.collection;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;

/**
 * <pre>
 * org.dimigo.collection
 *   |_ JSONTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 10. 12.
 * </pre>
 *
 * @author		: 이름
 * @version		: 1.0
 */
public class JSONTest {

	private static final String FILE_PATH = "json_input.txt";
	
	public static void main(String[] args) {
		
		try(BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
					
			String result;
			StringBuilder jsonString = new StringBuilder();
					
			// 1 라인씩 읽어오기
			while((result = br.readLine()) != null) {
				jsonString.append(result);
			}
			
			System.out.println(jsonString);
			
			// JSON String을 Parsing하여 Person 객체에 담기
            Person person = new Person();

            JSONParser parser = new JSONParser();
            JSONObject object = (JSONObject) parser.parse(jsonString.toString());

            person.setName((String) object.get("Name"));
            person.setAge((Integer) object.get("Age"));
            person.setDetailAddress((String) object.get("Address"));
            person.setDong((String) object.get("Dongs"));
            person.setPhoneNumbers((List<Phone>) object.get("PhoneNumbers"));
            person.setSido((String) object.get("Sido"));


		} catch (Exception e) {
			e.printStackTrace();
		}	
	}	

}
