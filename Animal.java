
public abstract class Animal {
	String name = "";
	float weight = 0;
	
	abstract String getFood();
	
	public static void main(String[] args) {
		
    }
	
	
	Animal(){
		
	}
	Animal(String str, float w){
		name = str;
		weight = w;
	}
}


abstract class Mammal extends Animal{
	Mammal(String str, float w){
		super(str, w);
	}
	
	abstract String bark();
}

abstract class Reptile extends Animal{
	Reptile(String str, float w){
		super(str, w);
	}
	
	
}

final class Cat extends Mammal{
	String nameSlave = "";	
	
	String getFood() {
		System.out.println("Fish");
		return "Fish";
	}
	
	String bark() {
		System.out.println("Meow");
		return "Meow";
	}
	Cat(String str, float w, String str2){
		super(str,w);
		nameSlave = str2;
	}
	
	String getName() {
		return name;
	}
	
	void setName(String str) {
		name = str;
	}
	
	float getWeight() {
		return weight;
	}
	
	void setWeight(float w) {
		weight = w;
	}
	
	String getNameMaster() {
		return nameSlave;
	}
	
	void setNameMaster(String str) {
		nameSlave = str;
	}
	
}

final class Dog extends Mammal{
	String nameMaster = "";
	
	String getFood() {
		System.out.println("Apple");
		return "Apple";
	}
	
	String bark() {
		System.out.println("BowWow");
		return "BowWow";
	}
	Dog(String str, float w,String str2){
		super(str,w);
		nameMaster = str2;
	}
	
	String getName() {
		return name;
	}
	void setName(String str) {
		name = str;
	}
	float getWeight() {
		return weight;
	}
	void setWeight(float w) {
		weight = w;
	}
	String getNameMaster() {
		return nameMaster;
	}
	void setNameMaster(String str) {
		nameMaster = str;
	}
}

final class Crocodile extends Reptile{
	String getFood() {
		System.out.println("Meat");
		return "Meat";
	}
	
	String getName() {
		return name;
	}
	void setName(String str) {
		name = str;
	}
	float getWeight() {
		return weight;
	}
	void setWeight(float w) {
		weight = w;
	}
	
	Crocodile(String str, float w){
		super(str,w);
	}
	
}




