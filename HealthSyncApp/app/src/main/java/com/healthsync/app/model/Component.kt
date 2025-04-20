package com.healthsync.app.model

data class Component(
    val idComponent: Int,
    val componentName: String
){
    override fun toString(): String {
        return componentName
    }
}
