package com.example.corbaciuygulamas


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.core.view.isVisible

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        var ilkprogres = findViewById<ProgressBar>(R.id.ilkprogres)
        var s = findViewById<TextView>(R.id.s)
        var e = findViewById<TextView>(R.id.e)
        var h = findViewById<TextView>(R.id.h)
        var e2 = findViewById<TextView>(R.id.e2)
        var r = findViewById<TextView>(R.id.r)
        var scheck = findViewById<ImageView>(R.id.scheck)
        var echeck = findViewById<ImageView>(R.id.echeck)
        var hcheck = findViewById<ImageView>(R.id.hcheck)
        var e2check = findViewById<ImageView>(R.id.e2check)
        var rcheck = findViewById<ImageView>(R.id.rcheck)

        s.setOnClickListener {
            scheck.visibility = View.VISIBLE
            e.setOnClickListener {
                echeck.visibility = View.VISIBLE
                h.setOnClickListener {
                    hcheck.visibility = View.VISIBLE
                    e2.setOnClickListener {
                        e2check.visibility = View.VISIBLE
                        r.setOnClickListener {
                            rcheck.visibility = View.VISIBLE
                            ilkprogres.visibility = View.VISIBLE
                            if (rcheck.isVisible) {
                                Handler().postDelayed({
                                    var ucegecis =
                                        Intent(applicationContext, MainActivity4::class.java)
                                    startActivity(ucegecis)
                                    finish()
                                }, 2000)
                            }
                        }
                    }
                }

            }
        }
    }
}