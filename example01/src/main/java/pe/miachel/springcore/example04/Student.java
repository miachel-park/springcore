package pe.miachel.springcore.example04;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Student {
	private String name;
	private int age;
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	/*
	 * @PostConstruct, @PreDestroy annotation을 사용하기 위행서는
	 * pom.xml에 다음과 같은 dependency가 추가 되어야 함
	 * 	<dependency>
  	 *		<groupId>javax.annotation</groupId>
     *		<artifactId>javax.annotation-api</artifactId>
  	 *		<version>1.3.2</version>
	 *	</dependency>
	 */
	@PostConstruct
	public void initMethod() {
		System.out.println("@PostConstruct-initMethod()");
		if ( ! name.isEmpty() ) {
			System.out.println(name);
		}
	}
	
	@PreDestroy
	public void destoryMethod() {
		System.out.println("@PreDestory-destoryMethod()");
		if ( name != null && !name.isEmpty() ) {
			System.out.println(name);
		}
	}
}
