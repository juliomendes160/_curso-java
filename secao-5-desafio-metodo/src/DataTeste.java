
public class DataTeste {
	public static void main(String[] args) {
		
		Data data1 = new Data();
		Data data2 = new Data(17, 6, 2024);
		
		System.out.println("1ª Data: "+ data1.Formatar());
		System.out.println("2ª Data: "+ data2.Formatar());
		System.out.println();
	}
}
