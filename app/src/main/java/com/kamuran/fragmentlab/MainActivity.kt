package com.kamuran.fragmentlab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.constraintlayout.widget.ConstraintSet.Constraint

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ft= supportFragmentManager.beginTransaction()
        ft.replace(R.id.container, FragmentBuyuk())
        ft.commit()


        var containerKucuk= findViewById<View>(R.id.container_kucuk)
        containerKucuk.visibility= View.INVISIBLE //gizle

    }

    fun btn_kucukOnClick(view: View) {
        var containerKucuk= findViewById<View>(R.id.container_kucuk)
        containerKucuk.visibility= View.VISIBLE //göster


        val ft= supportFragmentManager.beginTransaction()
        ft.replace(R.id.container_kucuk, FragmentKucuk())
        ft.commit()
    }
}