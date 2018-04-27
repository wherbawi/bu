package edu.bu.domain;

public class Sound {
	private int db;

	public Sound(int i) {
		this.db = i;
	}

	public Sound() {
	}

	public int getDb() {
		return db;
	}

	public void setDb(int db) {
		this.db = db;
	}

	@Override
	public String toString() {
		return "Sound [db=" + db + "]";
	}
	
	
}
