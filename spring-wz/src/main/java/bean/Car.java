package bean;

/**
 * @author wangzou1995
 * @Title: null.java
 * @Package bean
 * @Description: 汽车
 * @date 2020/8/19/ 2:32 下午
 */
public class Car {
	private String id;
	private String name;

	public Car() {
		System.out.println("init Car");
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Car{" +
				"id='" + id + '\'' +
				", name='" + name + '\'' +
				'}';
	}
	public void init () {
		this.id = "xis1";
		this.name = "bwn";
	}
	public void destroy () {
		System.out.println("销毁Car");
	}
}
