package net.kdt.pojavlaunch.prefs;

import android.os.*;
import net.kdt.pojavlaunch.*;
import android.support.v7.preference.PreferenceFragmentCompat;

public class LauncherPreferenceFragment extends PreferenceFragmentCompat
{
	@Override
	public void onCreatePreferences(Bundle b, String str) {
		addPreferencesFromResource(R.xml.pref_main);
		
		// Disable freeform mode in Android 6.0 or below.
		getPreferenceScreen().findPreference("freeform").setEnabled(Build.VERSION.SDK_INT >= 24);
	}
}
