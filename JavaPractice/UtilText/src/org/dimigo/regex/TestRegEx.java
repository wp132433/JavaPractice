package org.dimigo.regex;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * <pre>
 * org.dimigo.regex
 *   |_ TestRegEx
 *
 * 1. 개요 : 정규표현식(Regular Expression) 문제
 * 2. 작성일 : 2015. 7. 14.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class TestRegEx {

	/**
	 * a로 시작하고, a 다음은 1개 문자만 오고, 마지막은 c로 끝남
	 */
	@Test
	public void testOne() {
		String regEx = "a.c";

		assertTrue("aac".matches(regEx));
		assertTrue("abc".matches(regEx));
		assertFalse("ac".matches(regEx));
		assertFalse("ab".matches(regEx));
	}

	/**
	 * 영어, 숫자, 한글(가~힣)만 허용
	 */
	@Test
	public void testTwo() {
		String regEx = "[a-zA-Z0-9가-힣]*";

		assertTrue("abc9".matches(regEx));
		assertTrue("zzz가".matches(regEx));
		assertFalse("abc!".matches(regEx));
		assertFalse("*^^*".matches(regEx));
	}

	/**
	 * 주민등록번호 체크 : 숫자 6개 + "-" + 1~4 사이의 숫자 + 숫자 6개
	 */
	@Test
	public void testThree() {
		String regEx = "[0-9]{6}-[1-4][0-9]{6}";

		assertTrue("980101-1234567".matches(regEx));
		assertTrue("000201-3234567".matches(regEx));
		assertFalse("980101-5234567".matches(regEx));
		assertFalse("asdf-1234567".matches(regEx));
	}

	/**
	 * 휴대폰 체크 : 010, 011, 016~019로 시작  + "-" + 숫자 3 or 4개 + "-" + 숫자 4개
	 */
	@Test
	public void testFour() {
		String regEx = "(010|011|(0+[6-9]))-[0-9]{3,4}-[0-9]{4}";

		assertTrue("010-111-2222".matches(regEx));
		assertTrue("011-1234-5678".matches(regEx));
		assertFalse("010-abc-abcd".matches(regEx));
		assertFalse("abc-111-2222".matches(regEx));
	}

	/**
	 * IP 체크 : 숫자 1~3개 + "." + 숫자 1~3개 + "." + 숫자 1~3개 + "." + 숫자 1~3개
	 */
	@Test
	public void testFive() {
		String regEx = "[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}";

		assertTrue("1.1.7.9".matches(regEx));
		assertTrue("172.18.6.4".matches(regEx));
		assertFalse("a.b.c.d".matches(regEx));
		assertFalse("1721.181.167.921".matches(regEx));
	}

	/**
	 * E-Mail : 문자와 숫자 조합 + "@" + 문자 숫자 조합 + "." + 문자 조합 + ("." + 문자조합)
	 */
	@Test
	public void testSix() {
		String regEx = "[a-zA-Z0-9]*@[a-zA-Z0-9]*\\.[a-zA-Z]*(\\.[a-zA-Z]*)?";

		assertTrue("asdf@naver.com".matches(regEx));
		assertTrue("asdf@dimigo.hs.kr".matches(regEx));
		assertFalse("asdf".matches(regEx));
		assertFalse("asdf@naver".matches(regEx));
	}

}