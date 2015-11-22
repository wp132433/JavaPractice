package org.dimigo.thread;

import com.google.common.base.*;

/**
 * Created by WOF on 2015. 11. 15..
 */
public class GuavaTest {
    private int tag;
    private String name;

    GuavaTest() {
        tag = 10;
        name = "name";
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.tag, this.name);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                   .addValue(this.tag)
                   .addValue(this.name)
                   .toString();
    }

    /*
    Test Class
    Objects - Object관련 도구들
    Strings - String관련 도구들
    Precondition - 조건 맞지 않을 시 예외발생
    Joiner - 여려개의 String 나열하기
     */

    public static void main(String[] args) {
        GuavaTest test = new GuavaTest();

        //Objects Test
        System.out.println(test.toString());
        System.out.println(test.hashCode());

        //Strings Test
        System.out.println(Strings.nullToEmpty(null));
        System.out.println(Strings.nullToEmpty("java"));

        System.out.println(Strings.isNullOrEmpty(null));
        System.out.println(Strings.isNullOrEmpty(""));
        System.out.println(Strings.isNullOrEmpty("java"));

        System.out.println(Strings.emptyToNull(""));

        //Precondition
        int value1 = 10;

//        Preconditions.checkArgument(
//                value1 > 20,
//                "20보다 커야합니다."
//        );
        //Exception

        Preconditions.checkArgument(
                value1 == 10,
                "10이여야 합니다."
        );

        //Joiner
        Joiner joiner = Joiner.on("; ").skipNulls();
        System.out.println(joiner.join("Holy", null, "DimiFi 5G2", "Water"));
    }
}
