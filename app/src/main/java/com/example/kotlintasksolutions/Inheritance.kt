package com.example.kotlintasksolutions

open class Vehicle(val make: String, val model: String, val year: Int){
    open fun start(){
        println("Start() of vehicle class")
    }
    open fun stop(){
        println("Stop() of vehicle class")
    }
}
class Car(make: String, model: String, year: Int, val numDoors: Int): Vehicle(make, model, year){
    override fun start(){
        println("Start() of Car class")
        println("make: ${make}, model: ${model}, year: $year, has $numDoors doors")
        println()
    }
    override fun stop(){
        println("Stop() of Car class")
        println()
    }
}
class Truck(make: String, model: String, year: Int, val loadCapacity: Double): Vehicle(make, model, year){
    override fun start(){
        println("Start() of Truck class")
        println("make: ${make}, model: ${model}, year: $year, has $loadCapacity tons of capacity")
        println()
    }
    override fun stop(){
        println("Stop() of Truck class")
        println()
    }
}
class Motorcycle(make: String, model: String, year: Int): Vehicle(make, model, year){
    override fun start(){
        println("Start() of Motorcycle class")
        println("make: ${make}, model: ${model}, year: $year")
        println()
    }
    override fun stop(){
        println("Stop() of Motorcycle class")
        println()
    }
}
fun main() {
    val car = Car("makeCar","modelCar",2022,4)
    val truck = Truck("makeTruck","modelTruck",2023,200.0)
    val motorCycle = Motorcycle("makeMotorCycle","modelMotorCycle",2024)
    car.start()
    car.stop()
    truck.start()
    truck.stop()
    motorCycle.start()
    motorCycle.stop()
}