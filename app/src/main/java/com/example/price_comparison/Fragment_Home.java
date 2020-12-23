package com.example.price_comparison;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import butterknife.BindView;
import butterknife.ButterKnife;


public class Fragment_Home extends Fragment
{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View parent = inflater.inflate(R.layout.fragments_home,container,false);
        ButterKnife.bind(this,parent);
        return  parent;

        // Inflate the layout for this fragment
    }

}