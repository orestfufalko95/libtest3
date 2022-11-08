package com.example.testlib

import kotlin.random.Random

class Util {
    public fun callMeMaybe(): String = Random(100).nextFloat().toString()
}