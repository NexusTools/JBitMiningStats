package net.nexustools.jcoinminingstats.activity;

import net.nexustools.jcoinminingstats.R;
import android.os.Bundle;
import android.preference.PreferenceActivity;

public class MiningStatisticsSettingsActivity extends PreferenceActivity {
	@SuppressWarnings("deprecation")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.settings);
	}
}
