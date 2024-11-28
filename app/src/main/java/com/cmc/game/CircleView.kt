package com.cmc.game

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class CircleView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {

    private val paint = Paint().apply {
        color = Color.BLUE
        isAntiAlias = true
        style = Paint.Style.FILL
    }

    private var circleX = 0f
    private var circleY = 0f
    private val radius = 100f

    init {
        post {
            circleX = width / 2f
            circleY = height / 2f
        }
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        canvas.drawCircle(circleX, circleY, radius, paint)
    }

    fun moveCircle(dx: Float, dy: Float) {
        circleX += dx
        circleY += dy

        circleX = circleX.coerceIn(radius, width - radius)
        circleY = circleY.coerceIn(radius, height - radius)

        invalidate()
    }
}