package com.example.coding.codingchallenge;

import android.app.AlertDialog;
import android.app.ListFragment;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.example.coding.codingchallenge.deals.CheeseContent;

public class CheeseListFragment extends ListFragment {


    public CheeseListFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new CheeseListItemAdapter(getActivity(), new LoaderManager().getSortedCheeseList()));
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        AlertDialog alertDialog = new AlertDialog.Builder(getActivity()).create();
        alertDialog.setTitle("Product Id");
        alertDialog.setMessage(CheeseContent.ITEMS.get(position).id);
        alertDialog.setCancelable(true);
        alertDialog.show();
    }

}