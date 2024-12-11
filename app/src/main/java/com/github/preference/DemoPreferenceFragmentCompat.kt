package com.github.preference

import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat

class DemoPreferenceFragmentCompat : PreferenceFragmentCompat() {
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.preferences, rootKey);
    }
}