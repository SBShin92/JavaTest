
public abstract class User {

	protected String id;
	protected String pw;
	protected String name;
	
	public User() {
	}

	public User(String id, String pw, String name) {
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "아이디:" + id + 
				"\t비번:" + pw + 
				"\t이름:" + name;
	}
	
	public abstract void showInfo();
}
