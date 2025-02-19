package library;

public class BorrowingRecord {
        private Member member;
        private String date;
        private Book[] books;

        public BorrowingRecord(Member member, String date, Book[] books) {
            this.member = member;
            this.date = date;
            this.books = books;
        }

        public void getBorringRecodUser () {
            System.out.println(this.member.getFirstName());
            System.out.println(this.member.getSecondName());
            System.out.println(this.member.getDni());
        }

}
