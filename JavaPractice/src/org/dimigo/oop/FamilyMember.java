package org.dimigo.oop;

public class FamilyMember {
	static int memberCnt;
	String memberName;
	
	public FamilyMember(String _memberName) {
		memberName = _memberName;
		memberCnt++;
	}
	
	String getMemberName() {
		return memberName;
	}
	
	static void printMemberCnt() {
		System.out.println("가족 총 인원 수 : " + memberCnt + "명");
	}

}
