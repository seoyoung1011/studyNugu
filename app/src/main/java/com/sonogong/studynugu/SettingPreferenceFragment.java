package com.sonogong.studynugu;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.preference.PreferenceFragment;

import androidx.annotation.Nullable;

public class SettingPreferenceFragment extends PreferenceFragment {

    SharedPreferences pref;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.setting);
    }
}
