package simuladorTributario;

public class SimuladorTributario {

		
public static double calcularImpostoAntigo (double valorFaturamento, int aliquotaBase) {
	return valorFaturamento * (aliquotaBase / 100.0);
}
public static double calcularImpostoProposto (double valorFaturamento, int aliquotaProposta) {
	return valorFaturamento * (aliquotaProposta / 100.0);
}
public static double calcularDiferenca (double impostoAntigo, double impostoProposto) {
	return impostoProposto - impostoAntigo;
}
public void statusDialogo (boolean acessoAoGoverno) {
	if (acessoAoGoverno) {
		System.out.println("STATUS: Diálogo aberto.  Há espaço para negociação.");
	} else {
		System.out.println("STATUS: Fintechs reclamam de falta de acesso ao governo. Risco de derrota política.");
	}
}
	
	
	public static void main(String[] args) {
		
		double faturamento = 50000000.00;
		System.out.println("=== Análise de Distribuição de Fintechs");
		System.out.println("Faturamento base: R$50000000.00.");
		
		//Proposta A
		double impostoAntigoA = calcularImpostoAntigo(faturamento, 9);
        double impostoPropostoA = calcularImpostoProposto(faturamento, 15);
        double diferencaA = calcularDiferenca(impostoAntigoA, impostoPropostoA);

        System.out.println("\n-- Proposta A (9% -> 15%) --");
        System.out.println("Imposto Antigo (9%): R$ " + impostoAntigoA);
        System.out.println("Imposto Proposto (15%): R$ " + impostoPropostoA);
        System.out.println("Aumento de Imposto: R$ " + diferencaA);

		//Proposta B
        double impostoAntigoB = calcularImpostoAntigo(faturamento, 15);
        double impostoPropostoB = calcularImpostoProposto(faturamento, 20);
        double diferencaB = calcularDiferenca(impostoAntigoB, impostoPropostoB);

        System.out.println("\n-- Proposta B (15% -> 20%) --");
        System.out.println("Imposto Antigo (15%): R$ " + impostoAntigoB);
        System.out.println("Imposto Proposto (20%): R$ " + impostoPropostoB);
        System.out.println("Aumento de Imposto: R$ " + diferencaB);
		
        //Análise Política
        System.out.println("\n-- Análise de Diálogo --");
        SimuladorTributario simulador = new SimuladorTributario();
        simulador.statusDialogo(true);
        simulador.statusDialogo(false);
        
	}
	}



