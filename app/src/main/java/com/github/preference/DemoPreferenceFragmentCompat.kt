package com.github.preference

import android.os.Bundle
import android.view.View
import androidx.preference.PreferenceFragmentWithToolbar

class DemoPreferenceFragmentCompat : PreferenceFragmentWithToolbar() {
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.preferences, rootKey)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        toolbar.title = "设置"
    }
}