package com.maxxxwk.hometask3_2

fun main() {
    var map = mapOf<Int, String>(5 to "five", 2 to "two",
                            3 to "three", 1 to "one", 4 to "four")
    println(map)
    map = map.toList().sortedBy { (key, value) -> key}.toMap()
    println(map)
}