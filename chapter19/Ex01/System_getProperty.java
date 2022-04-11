package book.chapter19.Ex01;

public class System_getProperty {

	public static void main(String[] args) {
		// System.getProperty() 메서드의 유용한 정보들
		System.out.println(System.getProperty("user.dir"));
		System.out.println(System.getProperty("java.version")); //Java버전
		System.out.println(System.getProperty("java.vendor"));  //Eclipse Adoptium
		System.out.println(System.getProperty("java.vendor.url"));
		System.out.println(System.getProperty("java.home"));
		System.out.println(System.getProperty("java.class.version"));
		System.out.println(System.getProperty("java.class.path"));
		System.out.println(System.getProperty("user.name"));
		System.out.println(System.getProperty("user.home"));
		System.out.println(System.getProperty("os.name")); //Windows 11
		System.out.println(System.getProperty("os.arch")); //amd64
		System.out.println(System.getProperty("os.version")); //10.0
		System.out.println(System.getProperty("file.separator")); //폴더구분자가 뭐냐 -> \
		System.out.println(System.getProperty("path.separator")); // ;
		
		


	}

}
