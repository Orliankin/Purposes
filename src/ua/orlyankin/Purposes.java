package ua.orlyankin;

class Purposes {
	private String date;
	private String name;
	private String description;

	Purposes(String date, String name, String description) {
		this.setDate(date);
		this.setName(name);
		this.setDescription(description);
	}

	public String getDate() {
		return date + " ";
	}

	public String getName() {
		return name + " ";
	}

	public String getDescription() {
		return description + " ";
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return this.date + " " + this.name + " " + this.description;

	}
}
