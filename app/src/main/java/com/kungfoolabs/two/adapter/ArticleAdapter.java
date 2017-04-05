package com.kungfoolabs.two.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.kungfoolabs.two.R;
import com.kungfoolabs.two.api.NYTResponse;

import java.util.List;

/**
 * Created by ckung on 2/21/17.
 */

public class ArticleAdapter extends RecyclerView.Adapter<ArticleAdapter.ViewHolder> {

    private final List<NYTResponse.Doc> documents;

    public ArticleAdapter(List<NYTResponse.Doc> documents) {
        this.documents = documents;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LinearLayout v = (LinearLayout) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.article_item, parent, false);

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        NYTResponse.Doc doc = documents.get(position);

        holder.textView.setText(doc.snippet);

    }

    @Override
    public int getItemCount() {
        return documents.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public LinearLayout view;
        public TextView textView;
        public ViewHolder(LinearLayout v) {
            super(v);
            view = v;
            textView = (TextView)v.findViewById(R.id.textView);
        }
    }



}
