package com.newrestarter.persiancal.view.preferences;

import com.newrestarter.persiancal.adapter.LocationAdapter;
import com.newrestarter.persiancal.util.Utils;

import androidx.appcompat.app.AlertDialog;
import androidx.preference.PreferenceDialogFragmentCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/**
 * persian_calendar
 * Author: hamidsafdari22@gmail.com
 * Date: 1/17/16
 */
public class LocationPreferenceDialog extends PreferenceDialogFragmentCompat {

    @Override
    protected void onPrepareDialogBuilder(AlertDialog.Builder builder) {
        super.onPrepareDialogBuilder(builder);

        RecyclerView recyclerView = new RecyclerView(getContext());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(new LocationAdapter(this,
                Utils.getAllCities(getContext(), true)));

        builder.setPositiveButton("", null);
        builder.setNegativeButton("", null);
        builder.setView(recyclerView);
    }

    @Override
    public void onDialogClosed(boolean positiveResult) {
    }

    public void selectItem(String city) {
        ((LocationPreference) getPreference()).setSelected(city);
        dismiss();
    }
}
