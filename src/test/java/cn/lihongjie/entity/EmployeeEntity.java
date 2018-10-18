package cn.lihongjie.entity;

/**
 * @author 982264618@qq.com
 */
public class EmployeeEntity {


	private long id;
	private String lastName;
	private String email;
	private String gender;

	public EmployeeEntity() {
	}


	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("EmployeeEntity{");
		sb.append("id=").append(id);
		sb.append(", lastName='").append(lastName).append('\'');
		sb.append(", email='").append(email).append('\'');
		sb.append(", gender='").append(gender).append('\'');
		sb.append('}');
		return sb.toString();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
}
