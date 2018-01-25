package com.example.coding.codingchallenge;

import android.content.Context;

import com.example.coding.codingchallenge.deals.CheeseItem;
import com.example.coding.codingchallenge.deals.CheeseContent;

import java.util.ArrayList;
import java.util.List;

public class LoaderManager {

    /**
     * Retrieves the sorted list of the cheeses.
     * @return the sorted list of cheeses.
     */
    public List<CheeseItem> getSortedCheeseList() {
        List<CheeseItem> cheeseList = CheeseContent.ITEMS;
        // TODO: sort the list here alphabetical order.
        return cheeseList;
    }

    /**
     * Retrieves the sorted list of the cheeses from the web.
     * @param context the Android context.
     * @return the sorted list of cheeses.
     */
    public ArrayList<String> getSortedCheeseListFromServer(Context context) {
        // Make server request and load from cheese list
        return null;
    }
}
