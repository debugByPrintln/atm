package com.example.atm.data;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    public static int rubBalance = 400000;
    public static int dollarBalance = 300000;
    public static int euroBalance = 200000;
    public static int wtfBalance = 100000;

    public static List<Integer> rubBanknotes = List.of(50, 100, 200, 500, 1000, 5000);
    public static List<Integer> dollarBanknotes = List.of(1, 2, 5, 10, 50, 100);
    public static List<Integer> euroBanknotes = List.of(1, 5, 10, 50, 100, 500);
    public static List<Integer> wtfBanknotes = List.of(3, 7, 11, 13, 21, 47);

    public static List<Integer> getRubbles(int howMuch){
        int tmp = rubBalance;
        int originalBalance = rubBalance;
        int ostatok = tmp-howMuch;
        int datOstalos = howMuch;
        List<Integer> res = new ArrayList<>();

        if (rubBalance < howMuch){
            res.add(-1);
            return res;
        }

        int first = rubBanknotes.get(0);
        int second = rubBanknotes.get(1);
        int third = rubBanknotes.get(2);
        int fourth = rubBanknotes.get(3);
        int fifth = rubBanknotes.get(4);
        int sixth = rubBanknotes.get(5);
        while (rubBalance > ostatok){
            if (datOstalos >= sixth){
                res.add(sixth);
                rubBalance-=sixth;
                datOstalos-=sixth;
            }
            else{
                if (datOstalos >= fifth){
                    res.add(fifth);
                    rubBalance-=fifth;
                    datOstalos-=fifth;
                }
                else{
                    if (datOstalos >= fourth){
                        res.add(fourth);
                        rubBalance-=fourth;
                        datOstalos-=fourth;
                    }
                    else {
                        if (datOstalos >= third){
                            res.add(third);
                            rubBalance-=third;
                            datOstalos-=third;
                        }
                        else {
                            if (datOstalos >= second){
                                res.add(second);
                                rubBalance-=second;
                                datOstalos-=second;
                            }
                            else {
                                if (datOstalos >= first){
                                    res.add(first);
                                    rubBalance-=first;
                                    datOstalos-=first;
                                }
                                else {
                                    res.add(-1);
                                    rubBalance = originalBalance;
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        return res;
    }

    public static List<Integer> getDollars(int howMuch){
        int tmp = dollarBalance;
        int originalBalance = dollarBalance;
        int ostatok = tmp-howMuch;
        int datOstalos = howMuch;
        List<Integer> res = new ArrayList<>();

        if (dollarBalance < howMuch){
            res.add(-1);
            return res;
        }

        int first = dollarBanknotes.get(0);
        int second = dollarBanknotes.get(1);
        int third = dollarBanknotes.get(2);
        int fourth = dollarBanknotes.get(3);
        int fifth = dollarBanknotes.get(4);
        int sixth = dollarBanknotes.get(5);
        while (dollarBalance > ostatok){
            if (datOstalos >= sixth){
                res.add(sixth);
                dollarBalance-=sixth;
                datOstalos-=sixth;
            }
            else{
                if (datOstalos >= fifth){
                    res.add(fifth);
                    dollarBalance-=fifth;
                    datOstalos-=fifth;
                }
                else{
                    if (datOstalos >= fourth){
                        res.add(fourth);
                        dollarBalance-=fourth;
                        datOstalos-=fourth;
                    }
                    else {
                        if (datOstalos >= third){
                            res.add(third);
                            dollarBalance-=third;
                            datOstalos-=third;
                        }
                        else {
                            if (datOstalos >= second){
                                res.add(second);
                                dollarBalance-=second;
                                datOstalos-=second;
                            }
                            else {
                                if (datOstalos >= first){
                                    res.add(first);
                                    dollarBalance-=first;
                                    datOstalos-=first;
                                }
                                else {
                                    res.add(-1);
                                    dollarBalance = originalBalance;
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        return res;
    }

    public static List<Integer> getEuros(int howMuch){
        int tmp = euroBalance;
        int originalBalance = euroBalance;
        int ostatok = tmp-howMuch;
        int datOstalos = howMuch;
        List<Integer> res = new ArrayList<>();

        if (euroBalance < howMuch){
            res.add(-1);
            return res;
        }

        int first = euroBanknotes.get(0);
        int second = euroBanknotes.get(1);
        int third = euroBanknotes.get(2);
        int fourth = euroBanknotes.get(3);
        int fifth = euroBanknotes.get(4);
        int sixth = euroBanknotes.get(5);
        while (euroBalance > ostatok){
            if (datOstalos >= sixth){
                res.add(sixth);
                euroBalance-=sixth;
                datOstalos-=sixth;
            }
            else{
                if (datOstalos >= fifth){
                    res.add(fifth);
                    euroBalance-=fifth;
                    datOstalos-=fifth;
                }
                else{
                    if (datOstalos >= fourth){
                        res.add(fourth);
                        euroBalance-=fourth;
                        datOstalos-=fourth;
                    }
                    else {
                        if (datOstalos >= third){
                            res.add(third);
                            euroBalance-=third;
                            datOstalos-=third;
                        }
                        else {
                            if (datOstalos >= second){
                                res.add(second);
                                euroBalance-=second;
                                datOstalos-=second;
                            }
                            else {
                                if (datOstalos >= first){
                                    res.add(first);
                                    euroBalance-=first;
                                    datOstalos-=first;
                                }
                                else {
                                    res.add(-1);
                                    euroBalance = originalBalance;
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        return res;
    }

    public static List<Integer> getWtf(int howMuch){
        int tmp = wtfBalance;
        int originalBalance = wtfBalance;
        int ostatok = tmp-howMuch;
        int datOstalos = howMuch;
        List<Integer> res = new ArrayList<>();

        if (wtfBalance < howMuch){
            res.add(-1);
            return res;
        }

        int first = wtfBanknotes.get(0);
        int second = wtfBanknotes.get(1);
        int third = wtfBanknotes.get(2);
        int fourth = wtfBanknotes.get(3);
        int fifth = wtfBanknotes.get(4);
        int sixth = wtfBanknotes.get(5);
        while (wtfBalance > ostatok){
            if (datOstalos >= sixth){
                res.add(sixth);
                wtfBalance-=sixth;
                datOstalos-=sixth;
            }
            else{
                if (datOstalos >= fifth){
                    res.add(fifth);
                    wtfBalance-=fifth;
                    datOstalos-=fifth;
                }
                else{
                    if (datOstalos >= fourth){
                        res.add(fourth);
                        wtfBalance-=fourth;
                        datOstalos-=fourth;
                    }
                    else {
                        if (datOstalos >= third){
                            res.add(third);
                            wtfBalance-=third;
                            datOstalos-=third;
                        }
                        else {
                            if (datOstalos >= second){
                                res.add(second);
                                wtfBalance-=second;
                                datOstalos-=second;
                            }
                            else {
                                if (datOstalos >= first){
                                    res.add(first);
                                    wtfBalance-=first;
                                    datOstalos-=first;
                                }
                                else {
                                    res.add(-1);
                                    wtfBalance = originalBalance;
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        return res;
    }
}


