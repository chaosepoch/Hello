//ͼ����
public class Books {

	private String name;// ����
	private String author;// ����

	public Books(String name,String author)
	{
		this.name = name;
		this.author = author;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.name.hashCode()+this.author.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Books)
		{
			Books b = (Books)obj;
			if(this.name.equals(b.getName())&&this.author.equals(((Books) obj).getAuthor()))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}
	}

	public String toString()
	{
		return "������"+this.name+"�����ߣ�"+this.author;
	}
}
