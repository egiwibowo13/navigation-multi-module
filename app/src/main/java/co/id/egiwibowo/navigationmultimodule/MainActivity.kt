package co.id.egiwibowo.navigationmultimodule

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import co.id.egiwibowo.features.modulea.screens.ScreenBActivity
import co.id.egiwibowo.navigation.modulea.IModuleARouteContract
import co.id.egiwibowo.navigation.moduleb.IModuleBRouteContract
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var moduleARoutes: IModuleARouteContract

    @Inject
    lateinit var moduleBRoutes: IModuleBRouteContract

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnA = findViewById<Button>(R.id.btn_screen_a)
        val btnB = findViewById<Button>(R.id.btn_screen_b)
        val btnC = findViewById<Button>(R.id.btn_screen_c)

        btnA.setOnClickListener {
            startActivity(moduleARoutes.screenAIntent(this))
        }

        btnB.setOnClickListener {
            startActivity(ScreenBActivity.getIntent(this))
        }

        btnC.setOnClickListener {
            startActivity(moduleBRoutes.screenCIntent(this, "from main module"))
        }
    }
}