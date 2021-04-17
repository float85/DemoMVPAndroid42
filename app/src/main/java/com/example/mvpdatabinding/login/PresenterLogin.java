package com.example.mvpdatabinding.login;

public class PresenterLogin {
    ILoginN iLoginN;

    public PresenterLogin(ILoginN iLoginN) {
        this.iLoginN = iLoginN;
    }

    public void onLogin(String username, String pass) {

        if (username.equals("1234")) {
            iLoginN.onSuccessFul();
        } else iLoginN.onMessenger("Login không thành công");
    }

    public void getNumberPhone(){

    }
}
