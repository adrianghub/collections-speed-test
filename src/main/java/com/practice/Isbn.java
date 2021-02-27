package com.practice;

import java.util.Random;

public class Isbn {
    private String letters;
    private int digits;

    public Isbn(String letters, int digits) {
        this.letters = letters;
        this.digits = digits;
    }

    @Override
    public boolean equals(Object o) {
        Isbn isbn = (Isbn) o;
        return (this.letters.equals(isbn.letters) && (this.digits == isbn.digits));
    }

    @Override
    public int hashCode() {
        Random ranNum = new Random();

        return ranNum.nextInt(500000) + this.digits;
    }

    public String generateRandomKey() {
        Random ranNum = new Random();

        return this.letters + Integer.toString(ranNum.nextInt(5000000) + this.digits);
    }
}
