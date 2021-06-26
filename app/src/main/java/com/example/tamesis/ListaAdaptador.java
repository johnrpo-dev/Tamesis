package com.example.tamesis;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;



public class ListaAdaptador extends RecyclerView.Adapter<ListaAdaptador.ViewHolder> {

    ArrayList<Turismo> listadeDatos;

    public ListaAdaptador(ArrayList<Turismo> listadeDatos) {
        this.listadeDatos = listadeDatos;
    }

    @NonNull
    @Override
    public ListaAdaptador.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View vistaItemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_lista,parent, false);

        return new ViewHolder(vistaItemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull ListaAdaptador.ViewHolder holder, int position) {
        holder.actualizarDatos(listadeDatos.get(position));

    }

    @Override
    public int getItemCount() {
        return listadeDatos.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView nombreTurismo;
        ImageView fotoTurismo;
        
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nombreTurismo = itemView.findViewById(R.id.Tamesis);
            fotoTurismo = itemView.findViewById(R.id.ppal);

        }

        public void actualizarDatos(Turismo turismo) {
            nombreTurismo.setText(turismo.getNombreTurismo() );

            Picasso.with( itemView.getContext() )
                    .load(turismo.getFotoTurismo())
                    .into(fotoTurismo);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent = new Intent(itemView.getContext(), VistaActividades.class);
                    intent.putExtra("datosTurismo", turismo);
                    itemView.getContext().startActivity(intent);

                }
            });
        }
    }
}
//123
//123456
