package com.example.kotlintasksolutions

fun main() {
    val dog = Dog1()
    val cat = Cat1()
    val cow = Cow()
    dog.makeSound()
    cat.makeSound()
    cow.makeSound()
}
abstract class Animals{
    abstract fun makeSound()
}
class Dog1: Animals(){
    override fun makeSound(){
        println("makeSound() of Dog class is called")
    }
}
class Cat1: Animals(){
    override fun makeSound(){
        println("makeSound() of Cat class is called")
    }
}
class Cow: Animals(){
    override fun makeSound(){
        println("makeSound() of Cow class is called")
    }
}