
public class DataTeste {
	public static void main(String[] args) {
		
		Data data1 = new Data();
		data1.dia = 5;
		data1.mes = 6;
		data1.ano = 2024;
		
		Data data2 = new Data();
		data1.dia = 17;
		data1.mes = 6;
		data1.ano = 2024;
		
		System.out.println("1ª Data: "+ data1.Formatar());
		System.out.println("2ª Data: "+ data2.Formatar());
		System.out.println();
	}
}
