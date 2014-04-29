package fitnesse;

import person.Person;
import fitnesse.slim.SystemUnderTest;

public class PersonFixture {

	@SystemUnderTest
	public Person person = new Person();

	public int nameLength() {
		return 0;
	}

}
