package com.example.demokotlinproject

import java.io.Serializable

class User(var age: Int, var name: String): Serializable   {
 override fun toString(): String {
  return "yoshi: "+age+" ,"+name
           }
        }
