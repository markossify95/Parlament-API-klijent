package domain;

import java.util.Date;

public class Poslanik {
	private int id;
	private String name;
	private String lastName;
	private Date birthDate;
	
	public Poslanik() {
		super();
	}
	public Poslanik(int id, String name, String lastName, Date birthDate) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.birthDate = birthDate;
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
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	@Override
	public String toString() {
		return "Poslanik [id=" + id + ", ime=" + name + ", prezime=" + lastName + ", datum rodjenja=" + birthDate + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((birthDate == null) ? 0 : birthDate.hashCode());
		result = prime * result + id;
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj != null){
			if(obj instanceof Poslanik){
				Poslanik p = (Poslanik) obj;
				if(p.id == this.id){
					return true;
				}
			}
		}
		return false;
	}
	
	
}
