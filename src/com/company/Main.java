package com.company;

import java.util.*;

public class Main{

    public static void main(String[] args) {
        Person person = new Person();
        ArrayList<String> a = new ArrayList<>();
        ArrayList<String> b = new ArrayList<>();
        ArrayList<String> c = new ArrayList<>();



        while (true){

            a.add(new Scanner(System.in).next());
            if (a.size() > 4){
                System.out.println(a);
                break;
            }

        }
        while (true){

            b.add(new Scanner(System.in).next());
            if (b.size() > 4){
                Collections.reverse(b);
                System.out.println(b);

                break;
            }

        }
        c.addAll(a);
        c.addAll(b);
        Iterator<String> iterator = c.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        

    }

}
