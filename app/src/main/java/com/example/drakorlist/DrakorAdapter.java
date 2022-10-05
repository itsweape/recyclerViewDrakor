package com.example.drakorlist;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DrakorAdapter extends RecyclerView.Adapter<DrakorAdapter.ViewHolder> {
    private final ArrayList<Drakor> values; //nampung data recycle
    private final LayoutInflater inflater; //buat ngeset view

    public DrakorAdapter(Context context, ArrayList<Drakor> values) {
        this.values = values;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public DrakorAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_drakor, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DrakorAdapter.ViewHolder holder, int position) {
        final Drakor drakor = values.get(position); //ambil data sesuai posisinya

        //setText tampilan
        holder.txtName.setText(drakor.name);
        holder.txtGenre.setText(drakor.genre);
        holder.txtSinopsis.setText(drakor.sinopsis);

        holder.itemView.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(holder.itemView.getContext(), DetailDrakorActivity.class);
                intent.putExtra("name", drakor.name);
                intent.putExtra("genre", drakor.genre);
                intent.putExtra("sinopsis", drakor.sinopsis);
                holder.itemView.getContext().startActivity(intent);
                /*Toast.makeText(holder.itemView.getContext(), String.valueOf(position), Toast.LENGTH_LONG).show();*/
            }
        });
    }

    @Override
    public int getItemCount() {
        return values.size();
    }

    //pengenalan/inisiasi id
    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView txtName;
        TextView txtGenre;
        TextView txtSinopsis;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.txt_name);
            txtGenre = itemView.findViewById(R.id.txt_genre);
            txtSinopsis = itemView.findViewById(R.id.txt_sinopsis);
        }
    }
}
