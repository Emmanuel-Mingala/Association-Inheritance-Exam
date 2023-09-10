
public class Student extends Person{
	@Override
	public String toString() {
		return String.format(super.toString() + " I am a student");
	}
}
