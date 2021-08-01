package co.id.egiwibowo.navigation.moduleb

import android.app.Activity
import android.content.Intent

interface IModuleBRouteContract {
    fun screenCIntent(fromActivity: Activity, name: String): Intent
}