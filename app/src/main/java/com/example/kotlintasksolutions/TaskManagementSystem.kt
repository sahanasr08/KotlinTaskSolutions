package com.example.kotlintasksolutions

data class Task(var id: Int, var title: String, var description: String, var completed: Boolean)

class TaskManager{

    private val tasks = mutableListOf<Task>()

    fun addTask(task: Task){
        tasks.add(task)
    }
    fun completeTask(taskId: Int){
        tasks.find { it.id == taskId}?.completed=true
    }
    fun removeTask(taskId: Int){
        tasks.removeAll { it.id ==taskId }
    }
    fun getTaskById(taskId: Int): Task? {
        return tasks.find { it.id == taskId }
    }
    fun getAllTasks(): List<Task>{
        return tasks
    }
}

fun main(){
    val taskManager = TaskManager()

    taskManager.addTask(Task(1,"Task1","task1 description",false))
    taskManager.addTask(Task(2,"Task2","task2 description",true))
    taskManager.addTask(Task(3,"Task3","task3 description",true))
    taskManager.addTask(Task(4,"Task4","task4 description",false))
    taskManager.addTask(Task(5,"Task5","task5 description",true))

    taskManager.completeTask(4)

    taskManager.removeTask(2)

    val taskById = taskManager.getTaskById(5)
    println("$taskById")
    println()

    val allTasks = taskManager.getAllTasks()
    allTasks.forEach{println(it)}
    println()
}
