package com.example.playlist_vitalii_tsoy;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SongsAdapter extends RecyclerView.Adapter<SongsAdapter.SongsViewHolder> {
    private ArrayList<Song> songsing;
    private TextView tvSong, tvSinger, tvTime, tvNumber;
    private OnItemClickListener clickListener;


    public SongsAdapter(ArrayList<Song> songsing, OnItemClickListener clickListener) {
        this.songsing = songsing;
        this.clickListener = clickListener;
    }

    @NonNull
    @Override
    public SongsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new SongsViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_songs, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull SongsViewHolder holder, int position) {
    holder.bind(songsing.get(position));
    holder.itemView.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            clickListener.OnItemClick(songsing.get(position));
        }
    });
    }

    @Override
    public int getItemCount() {
        return songsing.size() ;
    }

    class SongsViewHolder extends RecyclerView.ViewHolder {
        public SongsViewHolder(@NonNull View itemView) {
            super(itemView);
            tvSong = itemView.findViewById(R.id.song);
            tvSinger = itemView.findViewById(R.id.singer);
            tvTime = itemView.findViewById(R.id.time );
            tvNumber = itemView.findViewById(R.id.number);
        }

        public void bind(Song song) {
            tvSong.setText(song.getName());
            tvSinger.setText(song.getSinger());
            tvTime.setText(song.getTime());
            tvNumber.setText(song.getNumber());

        }
    }
}
