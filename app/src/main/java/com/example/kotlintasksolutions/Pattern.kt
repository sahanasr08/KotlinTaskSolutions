package com.example.kotlintasksolutions

fun main() {
    val kotlin = "*"
    val lines = 4
    var initial = 1
    repeat(lines){
        repeat(initial){
            print("$kotlin")
        }
        initial++
        println()
    }
}