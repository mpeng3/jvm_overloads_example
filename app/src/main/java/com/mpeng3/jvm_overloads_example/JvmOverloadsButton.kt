package com.mpeng3.jvm_overloads_example

import android.content.Context
import android.util.AttributeSet
import android.widget.Button

class JvmOverloadsButton @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : Button(context, attrs, defStyleAttr)
