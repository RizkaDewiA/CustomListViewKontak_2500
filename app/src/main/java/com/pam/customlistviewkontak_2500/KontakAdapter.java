package com.pam.customlistviewkontak_2500;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class KontakAdapter extends ArrayAdapter<Kontak> {

    private Context mContext;
    int mResource;

    public KontakAdapter(@NonNull Context context, int resource, ArrayList<Kontak> kontak){
        super(context, resource, kontak);
        mContext = context;
        mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //mendapatkan data kontak dengan posisi

        String Nama = getItem(position).getNama();
        String No = getItem(position).getNo();

        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResource,parent,false);

        TextView txtNama = convertView.findViewById(R.id.txtNama);
        TextView txtNo = convertView.findViewById(R.id.txtNo);

        txtNama.setText(Nama);
        txtNo.setText(No);

        return convertView;
    }
}
