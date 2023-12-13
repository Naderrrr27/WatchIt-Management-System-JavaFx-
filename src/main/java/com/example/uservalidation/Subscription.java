package com.example.uservalidation;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
public class Subscription {
    private String subscriptionPlan ;
    private int price ;
    private LocalDate startDate;
    private LocalDate endDate;
    private Byte capacity ;
    private static HashMap<String , Integer> monthsRevenue = new HashMap<>();
    private static HashMap<String , HashMap<String, Integer>> highestPlan = new HashMap<>();
    private  static HashMap<String , Integer> plan1 = new HashMap<>();
    private  static HashMap<String , Integer> plan2 = new HashMap<>();
    private  static HashMap<String , Integer> plan3 = new HashMap<>();
    private  static HashMap<String , Integer> plan4 = new HashMap<>();
    private  static HashMap<String , Integer> plan5 = new HashMap<>();
    private  static HashMap<String , Integer> plan6 = new HashMap<>();
    private  static HashMap<String , Integer> plan7 = new HashMap<>();
    private  static HashMap<String , Integer> plan8 = new HashMap<>();
    private  static HashMap<String , Integer> plan9 = new HashMap<>();
    private  static HashMap<String , Integer> plan10 = new HashMap<>();
    private  static HashMap<String , Integer> plan11 = new HashMap<>();
    private  static HashMap<String , Integer> plan12 = new HashMap<>();
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
            capacity = 10 ;
        }
        else if(subscriptionPlan == "Premuim" )
        {
            price = 150;
            capacity = 30 ;
        }
        setMonthsRevenue();
        setHighestPlan();
    }
    static {
        monthsRevenue.put("JANUARY", 0);
        monthsRevenue.put("FEBRUARY", 0);
        monthsRevenue.put("MARCH", 0);
        monthsRevenue.put("APRIL", 0);
        monthsRevenue.put("MAY", 0);
        monthsRevenue.put("JUNE", 0);
        monthsRevenue.put("JULY", 0);
        monthsRevenue.put("AUGUST", 0);
        monthsRevenue.put("SEPTEMBER", 0);
        monthsRevenue.put("OCTOBER", 0);
        monthsRevenue.put("NOVEMBER", 0);
        monthsRevenue.put("DECEMBER", 0);
    }
    static {
        plan1.put("Basic_JANUARY" , 0);
        plan1.put("Standard_JANUARY" , 0);
        plan1.put("Premium_JANUARY" , 0);
        plan2.put("Basic_FEBRUARY" , 0);
        plan2.put("Standard_FEBRUARY" , 0);
        plan2.put("Premium_FEBRUARY" , 0);
        plan3.put("Basic_MARCH" , 0);
        plan3.put("Standard_MARCH" , 0);
        plan3.put("Premium_MARCH" , 0);
        plan4.put("Basic_APRIL" , 0);
        plan4.put("Standard_APRIL" , 0);
        plan4.put("Premium_APRIL" , 0);
        plan5.put("Basic_MAY", 0);
        plan5.put("Standard_MAY" , 0);
        plan5.put("Premium_MAY" , 0);
        plan6.put("Basic_JUNE" , 0);
        plan6.put("Standard_JUNE" , 0);
        plan6.put("Premium_JUNE" , 0);
        plan7.put("Basic_JULY" , 0);
        plan7.put("Standard_JULY" , 0);
        plan7.put("Premium_JULY" , 0);
        plan8.put("Basic_AUGUST" , 0);
        plan8.put("Standard_AUGUST" , 0);
        plan8.put("Premium_AUGUST" , 0);
        plan9.put("Basic_SEPTEMBER" , 0);
        plan9.put("Standard_SEPTEMBER" , 0);
        plan9.put("Premium_SEPTEMBER" , 0);
        plan10.put("Basic_OCTOBER" , 0);
        plan10.put("Standard_OCTOBER" , 0);
        plan10.put("Premium_OCTOBER" , 0);
        plan11.put("Basic_NOVEMBER" , 0);
        plan11.put("Standard_NOVEMBER" , 0);
        plan11.put("Premium_NOVEMBER" , 0);
        plan12.put("Basic_DECEMBER" , 0);
        plan12.put("Standard_DECEMBER" , 0);
        plan12.put("Premium_DECEMBER" , 0);
    }
    static {
        highestPlan.put("JANUARY", plan1);
        highestPlan.put("FEBRUARY", plan2);
        highestPlan.put("MARCH", plan3);
        highestPlan.put("APRIL", plan4);
        highestPlan.put("MAY", plan5);
        highestPlan.put("JUNE", plan6);
        highestPlan.put("JULY", plan7);
        highestPlan.put("AUGUST", plan8);
        highestPlan.put("SEPTEMBER", plan9);
        highestPlan.put("OCTOBER", plan10);
        highestPlan.put("NOVEMBER", plan11);
        highestPlan.put("DECEMBER", plan12);
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

    public void setMonthsRevenue(){
        monthsRevenue.replace(startDate.getMonth().name(),monthsRevenue.get(startDate.getMonth().name()) + getPrice());
    }
    public void setHighestPlan() {
        highestPlan.get(startDate.getMonth().name()).replace(subscriptionPlan+"_"+startDate.getMonth().name() , 1 + highestPlan.get(startDate.getMonth().name()).get(subscriptionPlan+"_"+startDate.getMonth().name()));
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

    public static HashMap<String, Integer> getMonthsRevenue() {
        return monthsRevenue;
    }

    public static HashMap<String , HashMap<String, Integer>> getHighestPlan() {
        return highestPlan;
    }

    public void displaySubInfo ()
    {
        System.out.println("PLAN : " + getSubscriptionPlan());
        System.out.println("Price : " + getPrice());
        System.out.println("Capacity : " + getCapacity());
        System.out.println("Start date of your subscription plan " + getStartDate());
        System.out.println("End date of your subscription plan " +getEndDate());
    }
}
