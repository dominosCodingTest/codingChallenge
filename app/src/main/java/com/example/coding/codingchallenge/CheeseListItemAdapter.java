package com.example.coding.codingchallenge;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.coding.codingchallenge.deals.CheeseItem;

import java.util.List;

public class CheeseListItemAdapter extends BaseAdapter {
    private LayoutInflater inflater;
    private List<CheeseItem> mCheeseItems;
    private Context context;


    public static CheeseListItemAdapter newInstance(Context context, List<CheeseItem> items) {
        return new CheeseListItemAdapter(context, items);
    }

    protected CheeseListItemAdapter(Context ctx, List<CheeseItem> items) {
        super();
        context = ctx;
        inflater = LayoutInflater.from(context);
        mCheeseItems = items;
    }

    @Override
    public int getCount() {
        return mCheeseItems.size();
    }

    @Override
    public Object getItem(int position){
        try {
            return mCheeseItems.get(position);
        } catch (IndexOutOfBoundsException e) {
            return null;
        }
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        ViewHolder holder;
        if(convertView == null) {
            view = inflater.inflate(R.layout.deal_list_item, parent, false);
            holder = new ViewHolder();
            holder.productImage = (ImageView)view.findViewById(R.id.deal_list_item_image_view);
            holder.title = (TextView)view.findViewById(R.id.deal_list_item_title);
            holder.price = (TextView)view.findViewById(R.id.deal_list_item_price);
            view.setTag(holder);
        } else {
            view = convertView;
            holder = (ViewHolder)view.getTag();
        }

        CheeseItem cheeseItem = mCheeseItems.get(position);
        holder.productImage.setImageBitmap(cheeseItem.getProductImage(context));
        holder.title.setText(cheeseItem.title);
        holder.price.setText(cheeseItem.salePrice);

        return view;
    }

    private class ViewHolder {
        public ImageView productImage;
        public TextView title, price;
    }
}
