package com.example.testprojectfordandd.mainScreenDnD5.main.data

data class Party(
    val name:String,
    val img:String,
    val status:String
){
    companion object{
        fun mock():Party
        {
            return Party("AAAA","https://get.wallhere.com/photo/5092x3438-px-animals-leopard-1098679.jpg","GM")
        }
    }
}
