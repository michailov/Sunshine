package com.example.anton.sunshine;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    ArrayAdapter<String> forecastAdapter;
    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String[] forecastData = {
                "Today - Sunny - 23",
                "Tomorrow - Sunny - 21",
                "Mon - Cloudy - 20",
                "Tue - Cloudy - 19",
                "Wed - Foggy - 24",
                "Thu - Rainy - 22",
                "Friday - Sunny - 27",
        };

        List<String> forecastWeek = new ArrayList<>(Arrays.asList(forecastData));

        forecastAdapter = new ArrayAdapter<>(
                getActivity(),
                R.layout.list_item_forecast,
                R.id.list_item_forecast_textview,
                forecastWeek
        );

        View view = inflater.inflate(R.layout.fragment_main, container, false);

        ListView forecastListView = (ListView) view.findViewById(R.id.listview_forecast);
        forecastListView.setAdapter(forecastAdapter);

        return view;
    }
}
