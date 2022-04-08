package book.chap10;
class AA {
	String nameString;
	AA (String nameString){
		this.nameString = nameString;
	}
}

class BB{
	String nameString;
	BB (String nameString){
		this.nameString = nameString;
	}
	
	@Override
	public String toString() {
		return nameString.toString();
	}
	
	@Override
	public boolean equals(Object obj) {
		//if(obj instanceof B) {
			if (this.nameString == ((BB)obj).nameString) {
				return true;
			}else {
				return false;
			}
		//}
	}
}
public class String_Ex02 {

	public static void main(String[] args) {
		String s1 = new String("¾È³ç");  //String°´Ã¼
		String s2 = "¾È³ç";
		System.out.println(s2);
		System.out.println(s2.equals(s1));
	}

}
