package com.example.absence_application;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class EtudiantsAdapter extends RecyclerView.Adapter<EtudiantsAdapter.ViewHolder> {

    Context context;
    ArrayList<Etudiant> etudiant;

    public EtudiantsAdapter(Context context, ArrayList<Etudiant> etudiant){
        this.context = context;
        this.etudiant = etudiant;
    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.etudiants_recycler,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Etudiant etudiants = etudiant.get(position);
        holder.name.setText(etudiants.getNom()+" "+etudiants.getPrenom());
        Switch aSwitch = holder.aSwitch;
        aSwitch.setEnabled(true);
    }


    @Override
    public int getItemCount() {
        return etudiant.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView name;
        Switch aSwitch;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.etudiant_name);
            aSwitch = itemView.findViewById(R.id.switch1);
        }
    }
}
