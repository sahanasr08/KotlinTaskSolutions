package com.example.kotlintasksolutions

fun main(){
    val kotlin = "Radar"
    val kotlinSmall = kotlin.lowercase()
    val palindrome = kotlinSmall.reversed()
    if(kotlinSmall==palindrome){
        println("Given string \"$kotlin\" is a palindrome")
    }else{
        println("Given string \"$kotlin\" is NOT a palindrome")
    }
}