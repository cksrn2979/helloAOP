package kr.ac.hansung.aop;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Dog implements AnimalType {
	private String myName;
	
	@Override
	public void talk() {
		System.out.println(myName + "멍멍");

	}

}
