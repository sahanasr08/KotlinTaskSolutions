package com.example.kotlintasksolutions

fun main() {
    var numberOfTerms = 10
    fiboSequence(numberOfTerms)
}

fun fiboSequence(terms: Int){

    tailrec fun fibSeries(terms: Int, first: Int, second: Int){
        if(terms==0) return
        print("$first ")
        fibSeries(terms-1, second, first+second)
    }
    fibSeries(terms, 0, 1)
}