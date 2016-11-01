package kr.ac.hansung.aop;



import javax.annotation.Resource;

import lombok.Getter;

@Getter
public class PetOwner {
	
	//@Autowired
	//@Qualifier(value="qf_dog")
	@Resource(name="dog")
	private AnimalType pet;	
	
	public void petTalk() {
		pet.talk();
	}

}
