package com.example.uservalidation;

import java.time.LocalDate;
import java.util.HashMap;

public class StatisticsManager {
    private  static HashMap<String , Integer> monthsRevenue = new HashMap<>();
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

     public  static void analyseMonthRevenue () {
         for (User it : HelloApplication.users)
         {
             highestPlan.get(it.subscription.getStartDate().getMonth().name()).replace(it.subscription.getSubscriptionPlan()+"_"+it.subscription.getStartDate().getMonth().name() , 1 + highestPlan.get(it.subscription.getStartDate().getMonth().name()).get(it.subscription.getSubscriptionPlan()+"_"+it.subscription.getStartDate().getMonth().name()));
             StatisticsManager.monthsRevenue.replace(it.subscription.getStartDate().getMonth().name() , (StatisticsManager.monthsRevenue.get(it.subscription.getStartDate().getMonth().name())) + it.subscription.getPrice() );
         }
     }

        public static HashMap<String, Integer> getMonthsRevenue() {
        return monthsRevenue;
    }

    public static HashMap<String , HashMap<String, Integer>> getHighestPlan() {
        return highestPlan;
    }



}
