package com.example.kotlintasksolutions

fun main() {
    val dog = Dog()
    val cat = Cat()
    val bird = Bird()
    dog.makeSound()
    dog.move()
    cat.makeSound()
    cat.move()
    bird.makeSound()
    bird.move()
}
open class Animal{
    open fun makeSound(){
        println("makeSound() of Animal class is called")
    }
    open fun move(){
        println("move() of Animal class is called")
    }
}
class Dog: Animal(){
    override fun makeSound(){
        println("makeSound() of Dog class is called")
    }
    override fun move(){
        println("move() of Dog class is called")
    }
}
class Cat: Animal(){
    override fun makeSound(){
        println("makeSound() of Cat class is called")
    }
    override fun move(){
        println("move() of Cat class is called")
    }
}
class Bird: Animal(){
    override fun makeSound(){
        println("makeSound() of Bird class is called")
    }
    override fun move(){
        println("move() of Bird class is called")
    }
}
