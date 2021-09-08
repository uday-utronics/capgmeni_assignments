package Implement_abstract;

public abstract class shape {

	abstract void draw();
}
class rectangle extends shape{
	void draw() {
		System.out.println("hey i am rectangle"
				+ "#");
		
	}
}
class circle extends shape{
	void draw() {
		System.out.println("I AM CIRCLE    O ");
	}
}
class square extends shape{
	void draw() {
		System.out.println("I AM SQUARE []");
	}
}