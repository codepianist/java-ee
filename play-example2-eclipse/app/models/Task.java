package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.data.Form;
import play.data.validation.Constraints.Required;
import play.db.ebean.Model;

@Entity
public class Task extends Model{

	@Id
	public Long id;
	
	@Required
	public String label;
	

	
	// helper para iniciar as queries
	public static Finder<Long,Task> find = new Finder(Long.class, Task.class);
	
	// CRUD
	
	public static List<Task> all(){
		return find.all();
	}
	
	public static void add(Task task){
		task.save();
	}
	
	public static void delete(Long id){
		find.ref(id).delete();
	}
	
}
