package com.example.playlist_vitalii_tsoy;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;


public class SecondFragment extends Fragment implements OnItemClickListener{
    private RecyclerView recyclerView;
    private ArrayList<Song> songsing;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);


    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.recycles);
        loadData();
        SongsAdapter adapter = new SongsAdapter(songsing, this::OnItemClick);
        recyclerView.setAdapter(adapter);
    }

    private void loadData() {
        songsing = new ArrayList<>();
        songsing.add(new Song("Akon", "Beautiful", "3:15", "1"));
        songsing.add(new Song("Future", "WAIT FOR U", "3:32", "2"));
        songsing.add(new Song("Kendrick Lamar", "N95", "3:54", "3"));
        songsing.add(new Song("Jack Harlow", "First Class", "2:32", "4"));
        songsing.add(new Song("Morgan Wallen", "You Proof", "1:32", "5"));
        songsing.add(new Song("Lizzo", "About Damn Time", "2:15", "6"));
        songsing.add(new Song("Sia", "Unstoppable", "4:02", "7"));



    }


    @Override
    public void OnItemClick(Song song) {
        Intent intent = new Intent(requireActivity(),SecondActivity.class);
        intent.putExtra("song",song);
        startActivity(intent);
    }
}