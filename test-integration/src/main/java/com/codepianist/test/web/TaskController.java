package com.codepianist.test.web;

import com.codepianist.test.model.Task;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/v1/task")
public class TaskController {

    @RequestMapping(value = "simple", method = RequestMethod.GET)
    public Task sampleTask(){
        final Task task = new Task();
        task.setName("Refactor application");
        task.setComplexity(8);
        task.setTime(8);
        return task;
    }

}
