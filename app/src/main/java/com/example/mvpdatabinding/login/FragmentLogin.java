package com.example.mvpdatabinding.login;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.example.mvpdatabinding.R;
import com.example.mvpdatabinding.databinding.LoginFragmentBinding;

public class FragmentLogin extends Fragment implements ILoginN {
    LoginFragmentBinding binding;
    PresenterLogin presenterLogin;

    public static FragmentLogin newInstance() {

        Bundle args = new Bundle();

        FragmentLogin fragment = new FragmentLogin();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.login_fragment, container, false);
        presenterLogin = new PresenterLogin(this);

        binding.btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = binding.etUserName.getText().toString();
                String pass = binding.etPassword.getText().toString();

                presenterLogin.onLogin(username,pass);
            }
        });

        return binding.getRoot();
    }

    @Override
    public void onSuccessFul() {
        Toast.makeText(getContext(), "Login Thành Công", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onMessenger(String mes) {
        Toast.makeText(getContext(), mes, Toast.LENGTH_LONG).show();
    }

}
