package co.id.egiwibowo.features.modulea.routes

import android.app.Activity
import android.content.Intent
import co.id.egiwibowo.features.modulea.screens.ScreenAActivity
import co.id.egiwibowo.navigation.modulea.IModuleARouteContract

class ModuleARoutes: IModuleARouteContract {
    override fun screenAIntent(fromActivity: Activity): Intent {
        return ScreenAActivity.getIntent(fromActivity)
    }
}