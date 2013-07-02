package models;

import java.util.ArrayList;
import java.util.List;

import play.data.validation.Constraints.Required;

public class Task {
	public Long id;
	
	@Required
	public String label;
	
	static List<Task> all = new ArrayList<Task>();
	
	public static List<Task> all(){
		return all;
	}
	
	public static void add(Task task){
		all.add(task);
	}
	
	public static void delete(Long id){
		
	}
}
