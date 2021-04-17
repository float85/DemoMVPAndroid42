package com.example.mvpdatabinding.maytinh;

public class MaytinhPresenter {
    IMaytinh iMaytinh;
    float ketqua;

    public MaytinhPresenter(IMaytinh iMaytinh) {
        this.iMaytinh = iMaytinh;
    }

    public void onCong(String number, String numberTwo) {
        try {
            ketqua = Float.parseFloat(number) + Float.parseFloat(numberTwo);
            iMaytinh.onMessenger(ketqua + "");
        } catch (Exception e) {
            iMaytinh.onMessenger("Error");
            e.printStackTrace();
        }
    }
}
