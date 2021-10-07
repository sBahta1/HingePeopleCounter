package com.samb.hingepeoplecounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isInvisible
import androidx.lifecycle.ViewModelProvider
import com.samb.hingepeoplecounter.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
   lateinit var presenter :MainPresenter
    private val ui: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(ui.root)
        presenter = ViewModelProvider(this,MainPresenterFactory()).get(MainPresenter::class.java)
        updateState()

        ui.plusBtn.setOnClickListener {
           presenter.addPerson()
            updateState()
        }

        ui.minusBtn.setOnClickListener {
           presenter.removePerson()
            updateState()
        }

        ui.resetBtn.setOnClickListener {
            presenter.resetCount()
            updateState()
        }
    }
    fun updateState(){
        ui.mainCountText.text = presenter.getMainCount()
        ui.totalCountText.text = presenter.getTotalCount()
        ui.mainCountText.setTextColor(presenter.getMCColor())
        ui.minusBtn.isInvisible = presenter.isMinusBtnInvisible()
    }

}