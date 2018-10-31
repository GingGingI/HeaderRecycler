package com.example.ginggingi.headerrecycler.Model

class ListItemModel {

    var Txt: String
    var Type: Int = 1

    constructor(str: String, type: Int) {
        this.Txt = str
        this.Type = type
    }
}