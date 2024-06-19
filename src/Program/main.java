package Program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<>();

		System.out.print("Quantos contribuintes você vai digitar? ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.println("Digite os dados do "+ (i+1) +"o contribuinte:");
			
			System.out.print("Renda anual com salário: ");
			double rendaAnual = sc.nextDouble();
			System.out.print("Renda anual com prestação de serviço: ");
			double servico = sc.nextDouble();
			System.out.print("Renda anual com ganho de capital: ");
			double capital = sc.nextDouble();
			System.out.print("Gastos médicos: ");
			double medico = sc.nextDouble();
			System.out.print("Gastos educacionais: ");
			double educacao = sc.nextDouble();
			System.out.println("");
			
			list.add(new TaxPayer(rendaAnual, servico, capital, medico, educacao));
		}
		
			n = 1;
			for(TaxPayer payer : list) {
				System.out.println("Resumo do " + n +"o contribuinte:");
				n += 1;
				System.out.println("Imposto bruto total: " + String.format("%.2f", payer.grossTax()));
				System.out.println("Abatimento: " + String.format("%.2f", payer.taxRebate()));
				System.out.println("Imposto devido: " + String.format("%.2f", payer.netTax()));
				System.out.println();
			
		
		}
		
		sc.close();

		
		

	}

}
