package Daywise_classnotes;

public class Casting {

	public static void main(String[] args) {
	M11 m11 = new M11();
m11.read_word();
M10 m10 = new M11();
m10.read_pdf();
M11 nm10 = (M11) m10;
nm10.read_pdf();
nm10.read_word();
	}

}

class M10 {
	void read_pdf() {
		System.out.println("Read pdf file");
	}
}
class M11 extends M10{
	void read_word () {
		System.out.println("Read word file");
		
	}
	
}

class M12 extends M11{
	void read_file () {
		System.out.println("Read java file and .c");
	}
	}