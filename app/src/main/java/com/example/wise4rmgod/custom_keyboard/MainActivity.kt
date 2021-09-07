package com.example.wise4rmgod.custom_keyboard

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.LinearLayout



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        close.setOnClickListener {

            val slidedown = AnimationUtils.loadAnimation(applicationContext,
                R.anim.abc_fade_in)
            keyboardparentlayout.startAnimation(slidedown)
            keyboardparentlayout.visibility= View.GONE
        }

        currentText.setOnClickListener {
            keyboardparentlayout.visibility= View.VISIBLE
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.abc_fade_in)
            keyboardparentlayout.startAnimation(slideup)
        }

        // method to disable android soft keyboard
        window.setFlags(
            WindowManager.LayoutParams.FLAG_ALT_FOCUSABLE_IM,
            WindowManager.LayoutParams.FLAG_ALT_FOCUSABLE_IM)
        a1.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            a1.startAnimation(slideup)
            currentText.append("1")
           // a1.setBackgroundColor(resources.getColor( R.color.white))
            a1.textSize= 30F
        }
        b2.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            b2.startAnimation(slideup)
            currentText.append("2")
          //  b2.setBackgroundColor(resources.getColor( R.color.white))
            b2.textSize= 30F
        }
        c3.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            c3.startAnimation(slideup)
            currentText.append("3")
            //  b2.setBackgroundColor(resources.getColor( R.color.white))
            c3.textSize= 30F
        }
        d4.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            d4.startAnimation(slideup)
            currentText.append("4")
            //  b2.setBackgroundColor(resources.getColor( R.color.white))
            d4.textSize= 30F
        }

        e5.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            e5.startAnimation(slideup)
            currentText.append("5")
            e5.textSize= 30F}
        f6.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            f6.startAnimation(slideup)
            currentText.append("6")
            f6.textSize= 30F}
        g7.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            g7.startAnimation(slideup)
            currentText.append("7")
            g7.textSize= 30F}
        h8.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            h8.startAnimation(slideup)
            currentText.append("8")
            h8.textSize= 30F}
        k9.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            k9.startAnimation(slideup)
            currentText.append("9")
            k9.textSize= 30F}
        l0.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            l0.startAnimation(slideup)
            currentText.append("0")
            l0.textSize= 30F}
        a.setOnClickListener {
            // list.add("a")
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            a.startAnimation(slideup)
            a.textSize= 30F
            currentText.append("a")
        }
        b.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            b.startAnimation(slideup)
            b.textSize= 30F
            currentText.append("b")
        }
        c.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            c.startAnimation(slideup)
            c.textSize= 30F
            currentText.append("c")
        }
        d.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            d.startAnimation(slideup)
            d.textSize= 30F
            currentText.append("d") }
        e.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            e.startAnimation(slideup)
            e.textSize= 30F
            currentText.append("e") }
        f.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            f.startAnimation(slideup)
            f.textSize= 30F
            currentText.append("f")}
        g.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            g.startAnimation(slideup)
            g.textSize= 30F
            currentText.append("g") }
        h.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            h.startAnimation(slideup)
            h.textSize= 30F
            currentText.append("h") }
        i.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            i.startAnimation(slideup)
            i.textSize= 30F
            currentText.append("i") }
        j.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            j.startAnimation(slideup)
            j.textSize= 30F
            currentText.append("j") }
        k.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            k.startAnimation(slideup)
            k.textSize= 30F
            currentText.append("k") }
        l.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            l.startAnimation(slideup)
            l.textSize= 30F
            currentText.append("l") }
        m.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            m.startAnimation(slideup)
            m.textSize= 30F
            currentText.append("m") }
        n.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            n.startAnimation(slideup)
            n.textSize= 30F
            currentText.append("n") }

        o.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            o.startAnimation(slideup)
            o.textSize= 30F
            currentText.append("o") }
        p.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            p.startAnimation(slideup)
            p.textSize= 30F
            currentText.append("p") }
        q.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            p.startAnimation(slideup)
            p.textSize= 30F
            currentText.append("q") }
        r.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            r.startAnimation(slideup)
            r.textSize= 30F
            currentText.append("r") }
        s.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            s.startAnimation(slideup)
            s.textSize= 30F
            currentText.append("s") }
        t.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            t.startAnimation(slideup)
            t.textSize= 30F
            currentText.append("t") }
        u.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            u.startAnimation(slideup)
            u.textSize= 30F
            currentText.append("u") }

        v.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            v.startAnimation(slideup)
            v.textSize= 30F
            currentText.append("v")}
        w.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            w.startAnimation(slideup)
            w.textSize= 30F
            currentText.append("w")}
        y.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            y.startAnimation(slideup)
            y.textSize= 30F
            currentText.append("y")}
        z.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            z.startAnimation(slideup)
            z.textSize= 30F
            currentText.append("z") }
        spacebar.setOnClickListener {
            currentText.append(" ")
        }

        back.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            back.startAnimation(slideup)
            val params = LinearLayout.LayoutParams(50, 60)
            back.layoutParams = params

            var str =currentText.text.toString()
            if (str.isEmpty()){

            }
            else {
                str = str.substring(0, str.length - 1)
                currentText.setText(str)
            }
        }


    }
}
