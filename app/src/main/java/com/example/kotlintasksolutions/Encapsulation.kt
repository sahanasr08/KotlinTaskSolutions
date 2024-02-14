package com.example.kotlintasksolutions

class Counter{
    private var count: Int = -2
    fun increment() {
        count++
    }
    fun decrement() {
        if(count > 0){
            count--
        }else {
            println("count is negative")
        }
    }
    fun reset() {
        count = 0
    }
    fun getCount(): Int{
        return count
    }
}
fun main() {
    val counter = Counter()
    println("${counter.getCount()}")
    counter.increment()
    counter.increment()
    println("${counter.getCount()}")
    counter.decrement()
    println("${counter.getCount()}")
    counter.reset()
    println("${counter.getCount()}")
}