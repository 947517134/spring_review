package com.demo01;

//租客
public class Client {
    public static void main(String[] args) {
        Landlord landlord = new Landlord();
        //代理，代理一般会有附加操作
        Proxy proxy = new Proxy(landlord);

        //不用面对房东，直接找中介租房
        proxy.rent();
    }
}
