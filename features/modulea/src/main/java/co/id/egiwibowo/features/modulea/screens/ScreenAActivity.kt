package co.id.egiwibowo.features.modulea.screens

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import co.id.egiwibowo.features.modulea.R
import co.id.egiwibowo.navigation.moduleb.IModuleBRouteContract
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class ScreenAActivity : AppCompatActivity() {

    companion object {
        fun getIntent(context: Context): Intent {
            return Intent(context, ScreenAActivity::class.java)
        }
    }

    @Inject
    lateinit var moduleBRoutes: IModuleBRouteContract

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen_a)

        val btnA = findViewById<Button>(R.id.btn_screen_a)
        btnA.setOnClickListener {
            startActivity(moduleBRoutes.screenCIntent(this, "from module a"))
        }
    }
}