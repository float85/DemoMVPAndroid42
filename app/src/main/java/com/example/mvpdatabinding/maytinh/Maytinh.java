package com.example.mvpdatabinding.maytinh;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ObservableInt;
import androidx.fragment.app.Fragment;

import com.example.mvpdatabinding.R;
import com.example.mvpdatabinding.databinding.FragmentMaytinhBinding;

public class Maytinh extends Fragment implements IMaytinh {

    FragmentMaytinhBinding binding;
    MaytinhPresenter maytinhPresenter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_maytinh, container, false);
        maytinhPresenter = new MaytinhPresenter(this);

        binding.btnCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                maytinhPresenter.onCong(
                        binding.etNumberOne.getText().toString(),
                        binding.etNumberTwo.getText().toString()
                        );
            }
        });

        return binding.getRoot();
    }

    @Override
    public void onSuccessFul(String mes) {
        binding.tvKetqua.setText(mes);
    }

    @Override
    public void onMessenger(String mes) {
        Toast.makeText(getContext(), mes, Toast.LENGTH_LONG).show();
    }
}
