package co.id.egiwibowo.features.moduleb.routes

import android.app.Activity
import android.content.Intent
import co.id.egiwibowo.features.moduleb.screens.ScreenCActivity
import co.id.egiwibowo.navigation.moduleb.IModuleBRouteContract

class ModuleBRoutes: IModuleBRouteContract {
    override fun screenCIntent(fromActivity: Activity, name: String): Intent {
        return ScreenCActivity.getIntent(fromActivity)
    }
}