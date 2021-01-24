package com.example.cornuluc_planete;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class rec_adapter extends RecyclerView.Adapter<rec_adapter.ViewHolder> {
    private String[] mDataSet; //Déclarer votre tableau de données

    //Le viewHolder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        //Y declarer les objets de la vue qui seront chargés (par le tableau de données)
        public TextView mTextView;
        //Constructeur du holder : le viewHolder a une reference vers tous les objets de la liste
        public ViewHolder(View v) {
            super(v);
            mTextView = (TextView) v.findViewById(R.id.title);
        }
    }

    //Constructeur de l'adaptateur : initialisations de l’adapter et des données
    public rec_adapter(String[] monDataset) {
        mDataSet = monDataset;
    }

    //Chargement du layout et initialisation du viewHolder
    @Override
    public rec_adapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.canvas_row, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    //Lien entre viewHolder et données
    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        holder.mTextView.setText(mDataSet[position]);
        Log.d("debug", "onBindViewHolder: XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    }

    //Nombre d’éléments de la liste
    @Override
    public int getItemCount() {
        return mDataSet.length;
    }
}//Fin de la classe de l’adaptateur
