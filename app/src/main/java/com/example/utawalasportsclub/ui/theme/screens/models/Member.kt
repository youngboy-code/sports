package com.example.utawalasportsclub.models

class Product {
    var name:String = ""
    var sport:String = ""
    var description:String = ""
    var phone:String = ""
    var imageUrl:String = ""
    var id:String = ""

    constructor(name: String, quantity: String, price: String,phone: String, imageUrl: String, id: String) {
        this.name = name
        this.sport = quantity
        this.description = price
        this.phone = phone
        this.imageUrl = imageUrl
        this.id = id
    }

    constructor()
}