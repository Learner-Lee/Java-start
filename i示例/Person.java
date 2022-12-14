package i示例;
/**
 * Title: Person类<br>
 * Description: 通过Person类来说明Java中的文档注释<br>
 * Company: peizheng
 * @author long
 * @version 1.0
 */
public class Person {
	public String name;
	/**
	 * 这是Person类的构造方法
	 * @param name Person的名字
	 */
	public Person(String name){
		this.name=name;
	}
	/**
	 * 这是read()方法的说明
	 * @param bookName 读的书的名字
	 * @param time 读书所需的时间
	 * @return 读的书的数量
	 */
	public int read(String bookName,int time){
		return time;
	}
}
