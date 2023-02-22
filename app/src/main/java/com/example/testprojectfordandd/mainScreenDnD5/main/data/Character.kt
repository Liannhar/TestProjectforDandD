package com.example.testprojectfordandd.mainScreenDnD5.main.data

data class Character(
    val name:String,
    val img:String,
    val classCharacter:String,
){
    companion object{
        fun mock():Character{
            return Character("AAAAAA","https://proprikol.ru/wp-content/uploads/2020/04/krasivye-kartinki-vysokogo-razresheniya-3.jpg","lvl1")
        }
    }
}
