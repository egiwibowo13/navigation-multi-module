package co.id.egiwibowo.navigation.modulea

import android.app.Activity
import android.content.Intent

interface IModuleARouteContract {
    fun screenAIntent(fromActivity: Activity): Intent
}