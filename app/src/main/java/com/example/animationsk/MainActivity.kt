package com.example.animationsk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import com.example.animationsk.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val fadeout=animation(R.anim.fadeout)
    private val fadein=animation(R.anim.fadein)
    private val zoomout=animation(R.anim.zoom_out)
    private val zoomin=animation(R.anim.zoom_in)
    private val rotate=animation(R.anim.rotate_clockwise)
    private val move=animation(R.anim.move)
    private val sequential=animation(R.anim.sqenecial)
    private val together=animation(R.anim.together)
    private val slideup=animation(R.anim.silde_up)
    private val slidedown=animation(R.anim.slide_down)
    private val bounce=animation(R.anim.bounce)



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnBlink.setOnClickListener {
             val blink=animation(R.anim.blink)
            binding.txtBlink.visibility=View.VISIBLE
            binding.txtBlink.startAnimation(blink)
        }
        binding.btnFadeIn.setOnClickListener {

           binding.txtFadeIn.startAnimation(fadein)

        }
        binding.btnFadeOut.setOnClickListener {
            binding.txtFadeOut.startAnimation(fadeout)

        }
        binding.btnCrossFade.setOnClickListener {
            binding.txtOut.startAnimation(fadein)
            binding.txtIn.startAnimation(fadeout)

        }
        binding.btnZoomIn.setOnClickListener {

            binding.txtZoomIn.startAnimation(zoomin)

        }
        binding.btnZoomOut.setOnClickListener {
            binding.txtZoomOut.startAnimation(zoomout)

        }
        binding.btnRotate.setOnClickListener {
            binding.txtRotate.startAnimation(rotate)

        }
        binding.btnMove.setOnClickListener {

            binding.txtMove.startAnimation(move)

        }
        binding.btnSlideUp.setOnClickListener {
            binding.txtSlideUp.startAnimation(slideup)

        }
        binding.btnSlideDown.setOnClickListener {
            binding.txtSlideDown.startAnimation(slidedown)

        }
        binding.btnBounce.setOnClickListener {

            binding.txtBounce.startAnimation(bounce)

        }
        binding.btnSequential.setOnClickListener {
            binding.txtSeq.startAnimation(sequential)

        }
        binding.btnTogether.setOnClickListener {
            binding.txtTog.startAnimation(together)

        }

    }

    private fun animation(value:Int):Animation
    {
        var anim= AnimationUtils.loadAnimation(this,value)
            return anim

    }
}