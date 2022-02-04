package png_Collection;

public class Bean_Class2 {
	private int id;
	private String name;
	private long contact;
	public Bean_Class2(int id, String name, long contact) {
		// TODO Auto-generated constructor stub
		this.contact=contact;
		this.name=name;
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
}