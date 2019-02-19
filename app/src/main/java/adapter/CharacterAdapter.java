package adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.rickandmorty.R;
import com.squareup.picasso.Picasso;

import java.util.List;

import model.Character;

public class CharacterAdapter extends RecyclerView.Adapter<CharacterAdapter.CharacterViewHolder> {
   // private List<Character> characters;
    private List<Character>characters;
    private int rowLayout;
    private Context context;
    private String POSTER_PATH = "https://image.tmdb.org/t/p/w400";


    public static class CharacterViewHolder extends RecyclerView.ViewHolder{
        public ImageView thumbnail;
        LinearLayout characterLayout;
        TextView characterTitle;
        TextView characterGender, characterStatus, characterSpecies;

        public CharacterViewHolder(View v) {
            super(v);
            characterLayout =(LinearLayout)v.findViewById(R.id.movielayout);
            characterTitle = (TextView)v.findViewById(R.id.txtname);
            characterGender = (TextView)v.findViewById(R.id.txtgender);
            characterStatus = (TextView)v.findViewById(R.id.txtstatus);
            characterSpecies = (TextView)v.findViewById(R.id.txtspecies);
            thumbnail = (ImageView) v.findViewById(R.id.posterimg);
        }
    }
    public CharacterAdapter(List<Character>characters, int rowLayout, Context context){
        this.characters = characters;
        this.rowLayout = rowLayout;
        this.context = context;
    }


    @NonNull
    @Override
    public CharacterAdapter.CharacterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent,false);
        return new CharacterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CharacterViewHolder holder, final int position) {
        holder.characterTitle.setText(characters.get(position).getName());
        holder.characterSpecies.setText(characters.get(position).getSpecies());
        holder.characterStatus.setText(characters.get(position).getStatus());
        holder.characterGender.setText(characters.get(position).getGender());
        //load poster image with picasso
        Character character = characters.get(position);
        Picasso.get().load( characters.get(position).getImage_path()).into(holder.thumbnail);
        //.error(R.drawable.ic_launcher_background)
        //.placeholder(R.drawable.ic_launcher_background)
        // .into(holder.thumbnail);


    }

    @Override
    public int getItemCount() {
        return characters.size();
    }
}

