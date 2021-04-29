package hu.nive.ujratervezes.kepesitovizsga.jurassic;

public class Dino {
    private String breed;
    private int expected;
    private int actual;

    public Dino(String breed, int expected, int actual) {
        this.breed = breed;
        this.expected = expected;
        this.actual = actual;
    }

    public String getBreed() {
        return breed;
    }

    public int getExpected() {
        return expected;
    }

    public int getActual() {
        return actual;
    }
}
