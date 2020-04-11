package com.example.app_5;

public interface IDataAccess {
    public Balance loadBalance(double bal);
    public double saveBalance(Balance balance);
}
