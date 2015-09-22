package org.dimigo.exception;

/**
 * Created by WOF on 15. 9. 22..
 */
public class MovieTest {
    public static void main(String[] args) {
        Movie[] movies = {
                new Movie("배트맨", 12),
                new Movie("사도", 12),
                new Movie("베테랑", 15)
        };

        int age = 13;

        for(Movie movie : movies) {
            try {
                buyTicket(movie, age);
            } catch (AgeCheckException e) {
                System.out.println(e.getMessage());
            }
        }

        return;
    }

    static void buyTicket(Movie movie, int age) throws AgeCheckException {
        if(movie.getLimitAge() > age)
            throw new AgeCheckException(movie);
        else
            System.out.println(movie.getTitle() + "즐감하세요");
    }
}
