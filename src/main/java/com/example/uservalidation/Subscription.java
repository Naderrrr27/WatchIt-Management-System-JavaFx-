package com.example.uservalidation;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
public class Subscription implements Serializable {
    private String subscriptionPlan ;
    private int price ;
    private LocalDate startDate;
    private LocalDate endDate;
    private Byte capacity ;




    public Subscription(String subPlan) {
        renewPlan(subPlan);
    }
    public void renewPlan(String subPlan) {
        subscriptionPlan = subPlan;
        startDate = LocalDate.now();
        setEndDate();
        if(subscriptionPlan == "Basic")
        {
            price = 100;
            capacity = 5;
        }
        else if(subscriptionPlan == "Standard")
        {
            price = 120;
            capacity = 10;
        }
        else if(subscriptionPlan == "Premium" )
        {
            price = 150;
            capacity = 15;
        }

    }

    public void setSubscriptionPlan(String subscriptionPlan) {
        this.subscriptionPlan = subscriptionPlan;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCapacity(Byte capacity) {
        this.capacity = capacity;
    }

    public void setStartDate() {
        startDate = LocalDate.now();
    }

    public void setEndDate() {
        endDate = startDate.plusDays(30);
    }

    public Byte getCapacity() {
        return capacity;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public String getSubscriptionPlan() {
        return subscriptionPlan;
    }

    public int getPrice() {
        return price;
    }
    public long getRemaningDays(){
        LocalDate today = LocalDate.now() ;
        return ChronoUnit.DAYS.between(today, endDate) ;
    }

    public Byte getRemanaingMovies(){
        return  1;
    }

    public boolean isSubscriptionActive(){
        if(getRemaningDays() == 0 || getRemanaingMovies() == 0 )
            return false;
        else
            return true;
    }




    public void displaySubInfo ()
    {
        System.out.println("PLAN : " + getSubscriptionPlan());
        System.out.println("Price : " + getPrice());
        System.out.println("Capacity : " + getCapacity());
        System.out.println("Start date of your subscription plan " + getStartDate());
        System.out.println("End date of your subscription plan " +getEndDate());
    }

    @Override
    public String toString() {
        return "Subscription{" +
                "subscriptionPlan='" + subscriptionPlan + '\'' +
                ", price=" + price +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", capacity=" + capacity +
                '}';
    }
}
