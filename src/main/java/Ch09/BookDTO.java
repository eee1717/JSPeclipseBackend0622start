package Ch09;

public class BookDTO {
	
	private int no;
	private int bookcode;
	private String bookname;
	private String publisher;
	private int totalpage;
	private int amount;
	
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getBookcode() {
		return bookcode;
	}
	public void setBookcode(int bookcode) {
		this.bookcode = bookcode;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getTotalpage() {
		return totalpage;
	}
	public void setTotalpage(int totalpage) {
		this.totalpage = totalpage;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "BookDTO [no=" + no + ", bookcode=" + bookcode + ", bookname=" + bookname + ", publisher=" + publisher
				+ ", totalpage=" + totalpage + ", amount=" + amount + "]";
	}
	
	
	
	
	
	
	
	
}
