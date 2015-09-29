package org.dimigo.exception;

/**
 * Created by WOF on 15. 9. 22..
 */
public class AgeCheckException extends Exception{
    public AgeCheckException() {

    }

    public AgeCheckException(Movie movie) {
        super(movie.getTitle() + "은/는" + movie.getLimitAge() + "세 이상 관람가입니다. ");
    }
}