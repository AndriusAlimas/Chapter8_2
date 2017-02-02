package foo.other;

public class Person {
	// FIELD:
	private String name;

	//CONSTRUCTORS:
	public Person(String name) {
		this.name = name;
	}
	// JAVA BEAN MUST HAVE NO_ARG CONSTRUCTOR:
	public Person() {
	}
	//GETTER(accesor):
	public String getName() {
		return this.name;
	}
	// SETTER(mutator):
	public void setName(String name) {
		this.name = name;
	}
}
