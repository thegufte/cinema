
public class Hall {
	private int id;
	private int rows;
	private int cols;
	private String name;
	
	public Hall (String name, int rows, int cols){
		this.name = name;
		this.cols = cols;
		this.rows = rows;
	}

	public int getRows() {
		return rows;
	}

	public int getCols() {
		return cols;
	}

	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Hall [id=" + id + ", rows=" + rows + ", cols=" + cols
				+ ", name=" + name + "]";
	}
}
