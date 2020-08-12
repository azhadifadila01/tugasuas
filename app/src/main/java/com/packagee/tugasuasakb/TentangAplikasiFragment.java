package com.packagee.tugasuasakb;

/*
    Tanggal pengerjaan  : 11/8/2020
    NIM                 : 10117277
    Nama                : Azhadi Fadila
    Kelas               : IF - 8
 */

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class TentangAplikasiFragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_tentang_aplikasi, container, false);

        return rootView;
    }
}
