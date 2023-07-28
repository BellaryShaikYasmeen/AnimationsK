package com.example.animationsk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import com.example.animationsk.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnBlink.setOnClickListener {
             val blink=AnimationUtils.loadAnimation(this,R.anim.blink)
            binding.txtBlink.visibility=View.VISIBLE
            binding.txtBlink.startAnimation(blink)
        }
        val fadeout=AnimationUtils.loadAnimation(this,R.anim.fadeout)
        val fadein=AnimationUtils.loadAnimation(this,R.anim.fadein)

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
            val zoomin=AnimationUtils.loadAnimation(this,R.anim.zoom_in)

            binding.txtZoomIn.startAnimation(zoomin)

        }
        binding.btnZoomOut.setOnClickListener {
            val zoomout=AnimationUtils.loadAnimation(this,R.anim.zoom_out)

            binding.txtZoomOut.startAnimation(zoomout)

        }
        binding.btnRotate.setOnClickListener {
            val rotate=AnimationUtils.loadAnimation(this,R.anim.rotate_clockwise)

            binding.txtRotate.startAnimation(rotate)

        }
        binding.btnMove.setOnClickListener {
            val move=AnimationUtils.loadAnimation(this,R.anim.move)

            binding.txtMove.startAnimation(move)

        }
        binding.btnSlideUp.setOnClickListener {
            val slideup=AnimationUtils.loadAnimation(this,R.anim.silde_up)

            binding.txtSlideUp.startAnimation(slideup)

        }
        binding.btnSlideDown.setOnClickListener {
            val slidedown=AnimationUtils.loadAnimation(this,R.anim.slide_down)

            binding.txtSlideDown.startAnimation(slidedown)

        }
        binding.btnBounce.setOnClickListener {
            val bounce=AnimationUtils.loadAnimation(this,R.anim.bounce)

            binding.txtBounce.startAnimation(bounce)

        }
        binding.btnSequential.setOnClickListener {
            val sequential=AnimationUtils.loadAnimation(this,R.anim.sqenecial)

            binding.txtSeq.startAnimation(sequential)

        }
        binding.btnTogether.setOnClickListener {
            val together=AnimationUtils.loadAnimation(this,R.anim.together)

            binding.txtTog.startAnimation(together)

        }

    }


}