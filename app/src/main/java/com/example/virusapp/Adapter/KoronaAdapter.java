package com.example.virusapp.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.virusapp.CoronaDetailsActivity;
import com.example.virusapp.Model.Model;
import com.example.virusapp.R;

import java.util.List;

public class KoronaAdapter extends RecyclerView.Adapter<KoronaAdapter.ViewHolder> {

    //context+data
    private Context context;
    //model
    private List<Model> koronaList;

    public KoronaAdapter(Context context, List<Model> koronaList) {
        this.context = context;
        this.koronaList = koronaList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {//call 1st step

        View view= LayoutInflater.from(context).inflate(R.layout.korona_item_list,null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {//set 3 rd step
// img,name set

        viewHolder.imageView.setImageResource(koronaList.get(i).getImage());
        viewHolder.textView.setText(koronaList.get(i).getTitle());

    }

    @Override
    public int getItemCount() {
        return koronaList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{//find|hold 2nd step
        //find
        ImageView imageView;
        TextView textView;





        public ViewHolder(@NonNull View itemView) {

            super(itemView);
            imageView= itemView.findViewById(R.id.korona_img);
            textView= itemView.findViewById(R.id.korona_listId);

           textView.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {


                   if (getLayoutPosition()==0 ){
                       Intent intent = new Intent(context, CoronaDetailsActivity.class);
                       //array list valu show
                       String name = context.getString(R.string.item1C);
                       intent.putExtra("textView", name);
                       context.startActivity(intent);

                   }  if (getLayoutPosition()==1 ){

                       Intent intent = new Intent(context, CoronaDetailsActivity.class);
                       //array list valu show
                       String name = context.getString(R.string.item2C);
                       intent.putExtra("textView", name);
                       context.startActivity(intent);
                   }  if (getLayoutPosition()==2 ){

                       Intent intent = new Intent(context, CoronaDetailsActivity.class);
                       //array list valu show
                       String name = context.getString(R.string.item3C);
                       intent.putExtra("textView", name);
                       context.startActivity(intent);
                   }  if (getLayoutPosition()==3 ){

                       Intent intent = new Intent(context, CoronaDetailsActivity.class);
                       //array list valu show
                       String name = context.getString(R.string.item4C);
                       intent.putExtra("textView", name);
                       context.startActivity(intent);
                   }  if (getLayoutPosition()==4 ){

                       Intent intent = new Intent(context, CoronaDetailsActivity.class);
                       //array list valu show
                       String name = context.getString(R.string.item5C);
                       intent.putExtra("textView", name);
                       context.startActivity(intent);
                   }  if (getLayoutPosition()==5 ){

                       Intent intent = new Intent(context, CoronaDetailsActivity.class);
                       //array list valu show
                       String name = context.getString(R.string.item6C);
                       intent.putExtra("textView", name);
                       context.startActivity(intent);
                   }


               }
           });
        }


    }

}