package controllers;

import models.Task;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;

public class Application extends Controller {
  
	static Form<Task> taskForm = Form.form(Task.class);
	
    public static Result index() {
    	//String s = routes.Application.tasks;
        return redirect(routes.Application.tasks());
    }
    
    public static Result tasks(){
    	System.out.println("tasks...");
    	return ok( views.html.index.render(Task.all(), taskForm) ); 
    }
    
    public static Result addTask(){
    	System.out.println("adicionando uma task...");
    	Form<Task> filledForm = taskForm.bindFromRequest(); // Gera formulario populado com dados da requisicao
    	if(filledForm.hasErrors()){
    		return badRequest(views.html.index.render(Task.all(), filledForm));
    	}else{
    		for(String key : filledForm.data().keySet()){
    			System.out.println("Campo: "+key+", valor: "+filledForm.data().get(key));
    		}
    		Task.add(filledForm.get());
    		return redirect(routes.Application.tasks());
    	}
    }
    
    public static Result deleteTask(Long id){
    	return TODO;
    }
    
}
