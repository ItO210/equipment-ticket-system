package com.healthsync.app.utils

import android.content.Context
import androidx.core.content.ContextCompat
import com.healthsync.app.R

class StatusColorUtil {
    companion object{
        fun getColorForStatus(context: Context, status: String): Int{
            return when (status){
                "Sin empezar" -> ContextCompat.getColor(context, R.color.yellow)
                "En progreso"-> ContextCompat.getColor(context, R.color.blue)
                "Resuelto"-> ContextCompat.getColor(context, R.color.green)
                "Eliminado"-> ContextCompat.getColor(context, R.color.orange)
                "No resuelto"-> ContextCompat.getColor(context, R.color.purple)
                else -> ContextCompat.getColor(context, R.color.gray)
            }
        }
    }
}