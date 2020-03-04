package com.fhbn;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        int noBooks = 0, noLibraries = 0, noDays = 0;
        List<Integer> bookScores = new ArrayList<>();
        List<Integer> books = new ArrayList<>();
        int cntr = 0;
        File inputFile = new File("Resources/a_example.txt");
        Scanner sc = new Scanner(inputFile);

        //to get number of Books, Libraries, Days and also scores of each book

        String[] line1 = new String[3];
        line1 = sc.nextLine().split(" ", 0);
        noBooks = Integer.parseInt(line1[0]);
        noLibraries = Integer.parseInt(line1[1]);
        noDays = Integer.parseInt(line1[2]);
        System.out.println(noBooks +" "+noLibraries+" "+noDays);

        String[] line2 = new String[noBooks];
        line2 = sc.nextLine().split(" ", 0);
        for(String no : line2)
            bookScores.add(Integer.parseInt(no));
        System.out.println(bookScores);

        LibraryDetails[] libDetails = new LibraryDetails[noLibraries];

        //get the number of books library has, days to sign up, shipping details and the books which are in library.
        for(int i = 0; i < noLibraries; i++){
            libDetails[i] = new LibraryDetails();
            String[] line3 = new String[3];
            line3 = sc.nextLine().split(" ", 0);

            libDetails[i].setNoBooks(Integer.parseInt(line3[0]));
            libDetails[i].setSignUp(Integer.parseInt(line3[1]));
            libDetails[i].setShip(Integer.parseInt(line3[2]));
            System.out.println(line3[0]+" "+line3[1]+" "+line3[2]);

            String[] line4 = new String[libDetails[i].getNoBooks()];
            line4 = sc.nextLine().split(" ", 0);
            for(String no : line4){
                books.add(Integer.parseInt(no));
                cntr++;

                if(cntr == libDetails[i].getNoBooks()) {
                    libDetails[i].setBooks(books);
                    cntr = 0;
                    System.out.println(books);
                    books.clear();
                }
            }
        }

        // the main logic
        int days = noDays;
        if(days <= 0){
            for(int i = 0; i < noLibraries; i++){
                int signup = libDetails[i].getSignUp();
                if(signup > days){
                    days -= signup;
                }

            }

            days--;
        }
    }
}


