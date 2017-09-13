package problem6;

public class Computer implements Cloneable{

	String manufacturer;
	String processor;
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public void setRamSize(int ramSize) {
		this.ramSize = ramSize;
	}
	public void setDiskSize(int diskSize) {
		this.diskSize = diskSize;
	}
	public void setProcessorSpeed(double processorSpeed) {
		this.processorSpeed = processorSpeed;
	}
	int ramSize;
	int diskSize;
	double processorSpeed;
	
	public Computer(String manufacturer, String processor, int ramSize,	int diskSize, double processorSpeed) {
		this.manufacturer = manufacturer;
		this.processor = processor;
		this.ramSize = ramSize;
		this.diskSize = diskSize;
		this.processorSpeed = processorSpeed;
	}
	int getRamSize() {
		return ramSize;
	}
	int getDiskSize() {
		return diskSize;
	}
	double getProcessorSpeed() {
		return processorSpeed;
	}
	public Object cloneDeep() throws CloneNotSupportedException {
		 Computer clone=(Computer)super.clone();   	 
		    return clone;
		  }
@Override
	public String toString() {
		return "Computer [manufacturer=" + manufacturer + ", processor="
				+ processor + ", ramSize=" + ramSize + ", diskSize=" + diskSize
				+ ", processorSpeed=" + processorSpeed + "]";
	}
	//	public String toString()
//	{
//		return manufacturer;		
//	}
	public boolean equals(Object ob) {
		if(ob == null) return false;
		if(this==ob) return true;
		if(!(ob instanceof Computer)) return false;
		Computer comp = (Computer)ob;		
		return comp.manufacturer.toString()==manufacturer && comp.processor.toString()==processor && (this.diskSize==getDiskSize()) && (this.ramSize==getRamSize() && (this.processorSpeed==getProcessorSpeed()));	
	}
	public int hashCode() {
				int hCode = (int) (66 * manufacturer.hashCode() + processor.hashCode() + Integer.valueOf(diskSize) + Integer.valueOf(ramSize) + Double.valueOf(processorSpeed)); 
	return hCode;
	}
	
}
