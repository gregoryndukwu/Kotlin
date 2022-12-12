package com.example.cvbuilder.helpers

import android.text.TextUtils
import android.util.Patterns

class ValidEntry {
    companion object {
        fun isValidEmail(target: CharSequence?): Boolean {
            return !TextUtils.isEmpty(target) && Patterns.EMAIL_ADDRESS.matcher(target).matches()
        }
    }
}