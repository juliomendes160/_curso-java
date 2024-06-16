import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map {
	
	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		List<String> stringBinaria = nums.stream()
	            .map(numero -> Integer.toBinaryString(numero))
	            .collect(Collectors.toList());
		
		List<String> stringBinariaInvertida = stringBinaria.stream()
	            .map(numeroBinario -> new StringBuilder(numeroBinario).reverse().toString())
	            .collect(Collectors.toList());
		
		 List<Integer> stringBinariaConvertida = stringBinaria.stream()
	                .map(numeroBinario -> Integer.parseInt(numeroBinario, 2))
	                .collect(Collectors.toList());
		
		System.out.println("Números:");
		System.out.println(nums);
		System.out.println();
			
		System.out.println("String Binária:");
		System.out.println(stringBinaria);
		System.out.println();
		
		System.out.println("String Binária Invertida:");
		System.out.println(stringBinariaInvertida);
		System.out.println();
		
		System.out.println("String Binária Convertida:");
		System.out.println(stringBinariaConvertida);
		System.out.println();
		
	}
}
