package problem6;

public class Person implements Cloneable
 {
 String name;
 Computer computer; 
public Person(String name,Computer computer) {
	this.name = name;
	this.computer = computer;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Computer getComputer() {
	return computer;
}

public void setComputer(Computer computer) {
	this.computer = computer;
}

@Override
public String toString() {
	return "Name: " + name + "    Manuf: " + computer.manufacturer + " Processor: " + computer.processor + " Ram: " + computer.ramSize + " Hard Disk: " + computer.diskSize + " Speed: " + computer.processorSpeed;
}

public Object cloneShallow() throws CloneNotSupportedException {
	 Person clone=(Person)super.clone();    
	    return clone;
	  }

public Object cloneDeep() throws CloneNotSupportedException {
	 Person clone=(Person)super.clone();   
	 clone.computer=(Computer)this.computer.cloneDeep(); 
	    return clone;
	  }

 }
