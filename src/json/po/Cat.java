package json.po;
/**
 * 
 * @author Mr.bai
 * 
 */
public class Cat {
	
	private String name;
	private String species;
	private Integer age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public Cat(String name, String species, Integer age) {
		super();
		this.name = name;
		this.species = species;
		this.age = age;
	}
	
	public Cat() {
		super();
	}
	
	/**
	 * ��дtoString�����ڲ���
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "����:-->"+this.name+" ����:-->"+this.species+" ����:-->"+this.age;
	}
}
