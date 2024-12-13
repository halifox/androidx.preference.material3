package androidx.preference

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.updateLayoutParams
import androidx.core.view.updateMargins
import com.google.android.material.appbar.AppBarLayout
import com.google.android.material.appbar.CollapsingToolbarLayout
import com.google.android.material.appbar.MaterialToolbar

abstract class PreferenceFragmentWithToolbar : PreferenceFragmentCompat() {
    init {
        mLayoutResId = R.layout.preference_list_fragment_toolbar
    }

    lateinit var coordinatorLayout: CoordinatorLayout
    lateinit var appbar: AppBarLayout
    lateinit var collapsingToolbarLayout: CollapsingToolbarLayout
    lateinit var toolbar: MaterialToolbar

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        coordinatorLayout = view.findViewById<CoordinatorLayout>(R.id.coordinator_layout)
        appbar = view.findViewById<AppBarLayout>(R.id.appbar)
        collapsingToolbarLayout = view.findViewById<CollapsingToolbarLayout>(R.id.collapsing_toolbar_layout)
        toolbar = view.findViewById<MaterialToolbar>(R.id.toolbar)
        enableEdgeToEdge()
    }

    private fun enableEdgeToEdge() {
        requireActivity().enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(appbar) { view, insets ->
            val systemBarsInsets = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            view.updateLayoutParams<CoordinatorLayout.LayoutParams> {
                updateMargins(systemBarsInsets.left, systemBarsInsets.top, systemBarsInsets.right, 0)
            }
            listContainer.setPadding(0, 0, 0, systemBarsInsets.top + systemBarsInsets.bottom)
            insets
        }
    }
}