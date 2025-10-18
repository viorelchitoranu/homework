package com.devmind.springapp;



import java.util.Random;


public class Task implements Runnable {
    Random rand1 = new Random();

    static int numberOfTasks = 0;

   private String taskName;
   private Integer taskId;
   private Integer executionTime;

    private void performInitialization() {
        //Random rand2 = new Random();
        numberOfTasks++;
        System.out.println("Created-> "+numberOfTasks);
        taskId = generateId();
        taskName = "Task: " + taskId;
        System.out.println(this.taskName);
        executionTime = rand1.nextInt(1,20);

    }

    public void run(){
    try{
        Thread.sleep(executionTime);
    }
    catch(Exception e){
        System.out.println(e.getMessage());
    }

    }

    private Integer generateId(){
        return rand1.nextInt(0,100000);
    }

    public void destroy(){
        System.out.println(this.taskName);
        numberOfTasks--;
        System.out.println("Destroyed-> " + numberOfTasks);
    }

}
