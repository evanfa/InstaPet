package com.dissidentmind.evanfa.instapet;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by Fabio on 7/23/2017.
 */

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder> {

    ArrayList<Pet> items;
    Activity activity;
    //TextView voteValue;


    public ItemAdapter(ArrayList<Pet> items, Activity activity/*, TextView voteValue*/){
        this.items = items;
        this.activity = activity;
        //this.voteValue = voteValue;
    }

    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) { //Populate Layout - Infate Layout and pass it to viewholder to get ecah element
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_item,parent,false);
        return new ItemViewHolder(v);
        //return null;
    }

    @Override
    public void onBindViewHolder(final ItemViewHolder holder, int position) { //Associate each element from the list to each view

        //System.out.println("Holder: "+holder.votosPet+" Position: "+position);

        final Pet item = items.get(position);

        holder.namePet.setText(String.valueOf(item.getNamePet()));
        holder.votosPet.setText(String.valueOf(item.getValuePet()));
        holder.fotoPet.setImageResource(item.getFotoPet());

        holder.fotoPet.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(activity, item.getNamePet(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(activity, FiveStarsPets.class);

                intent.putExtra("petname",item.getNamePet());
                intent.putExtra("petcalif", item.getValuePet());
                intent.putExtra("petpic", item.getFotoPet());
                activity.startActivity(intent);
            }
        });

        holder.btnVote.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

               // item.votosPet.setText(String.valueOf(item.getValuePet()));
                //item.setValuePet(Integer.valueOf(item.getValuePet()+1));

                //int txV = (int) R.id.tvCalif;

                  //      txV.setText(item.getValuePet()+1);


               // voteValue.setText(item.getValuePet()+1);

                //item.setValuePet(item.getValuePet()+1);
                //System.out.println("PetNAme: "+item.getNamePet()+" Total Votes: "+ item.getValuePet()+1);
                //Toast.makeText(activity,"Test: "+item.getValuePet(), Toast.LENGTH_SHORT).show();
                //item.setValuePet(item.getValuePet()+1);
                //TextView txV= (TextView) v.findViewById(R.id.tvCalif);
                //txV.setText(String.valueOf(item.getValuePet()+1));
                //System.out.print("--------------------->"+txV.getId());
                //ItemViewHolder itmVH = new ItemViewHolder(v);
                //itmVH.votosPet.setText(String.valueOf(item.getValuePet()+1));
               // item.setValuePet(item.getValuePet());

            }
        });

    }

    //private void updateCounter(Pet)

    @Override
    public int getItemCount() { //List Size
        //return 0;
        return items.size();
    }

    public static class ItemViewHolder extends RecyclerView.ViewHolder {

        /**
         * Declaración Views
         *
         * @param itemView
         */
        private ImageView fotoPet;
        private TextView namePet;
        private TextView votosPet;
        private ImageButton btnVote;

        public ItemViewHolder(View itemView) {
            super(itemView);

            fotoPet = (ImageView) itemView.findViewById(R.id.imgFoto);
            namePet = (TextView) itemView.findViewById(R.id.tvName);
            votosPet = (TextView) itemView.findViewById(R.id.tvCalif);
            btnVote = (ImageButton) itemView.findViewById(R.id.btnVote);
        }
    }
}
