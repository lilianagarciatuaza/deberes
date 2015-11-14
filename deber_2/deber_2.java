package deber_2;
import java.util.Scanner;

public class deber_2 {
	
	private static final String JOptionPane = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int i,imp,opc,opc2;
				double desc,total;
				do
					{
				i=1;
				while (i<=1)
					{
					imp=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el importe"));
					opc=Integer.parseInt(JOptionPane.showInputDialog("¿Cual es el color de la bolita?\n1.Roja\n2.Amarilla\n3.Blanca"));
				switch (opc){
					case 1:
						desc=imp*0.4;
						total=imp-desc;
						JOptionPane.showMessageDialog(null,"El total a pagar es:$ "+total);
					break;
					case 2:
						desc=imp*0.25;
						total=imp-desc;
						JOptionPane.showMessageDialog(null,"El total a pagar es:$ "+total);
					break;
					case 3:
						desc=imp;
						JOptionPane.showMessageDialog(null,"El total a pagar es:$ "+desc);
					break;
				}
					i++;
				}
				
				opc2=Integer.parseInt(JOptionPane.showInputDialog("Desea otro calculo\n1.SI\n2.NO"));
				}
				while (opc2==1);
			 
			}
	}

		 
			