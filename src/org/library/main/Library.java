package org.library.main;
import org.library.book.Book;
import org.library.member.Member;
import org.library.staff.Staff;
public class Library {
	public static void main(String[] args) {
		Book objB = new Book();
		Member objM = new Member();
		Staff objS = new Staff();
		System.out.println("----- LIBRARY DETAILS -----");
		System.out.println("BOOK:-");
		objB.bookName();
		objB.bookAuthor();
		objB.bookId();
		System.out.println("MEMBER:-");
		objM.memberName();
		objM.memberId();
		objM.memberType();
		System.out.println("STAFF:-");
		objS.staffName();
		objS.staffId();
	}
}
