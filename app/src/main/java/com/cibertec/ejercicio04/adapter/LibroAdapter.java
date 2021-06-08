package com.cibertec.ejercicio04.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.cibertec.ejercicio04.R;
import com.cibertec.ejercicio04.entity.Libro;

import java.util.List;

public class LibroAdapter extends ArrayAdapter<Libro> {

    private Context context;
    private List<Libro> lista;

    public LibroAdapter(@NonNull Context context, int resource, @NonNull List<Libro> lista) {
        super(context, resource, lista);
        this.context = context;
        this.lista = lista;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(R.layout.activity_libro_crud_item, parent, false);

        Libro obj = lista.get(position);
        TextView txtTitulo = row.findViewById(R.id.idItemCrudLibroTitulo);
        txtTitulo.setText(obj.getTitulo());

        return row;
    }
}
