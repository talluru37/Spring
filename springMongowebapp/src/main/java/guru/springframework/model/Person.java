package guru.springframework.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "myCollection")
public class Person {


	@Id
    String id;
    public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getHp() {
		return hp;
	}


	public void setHp(String hp) {
		this.hp = hp;
	}


	String name;
    String hp;
  

    public Person() {
    }
	
    public Person(String id,String name,String hp) {
    	this.id = id;
    	this.name = name;
    	this.hp=hp;
    }
    
}
