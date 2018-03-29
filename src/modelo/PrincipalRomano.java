package modelo;

import java.util.Scanner;

public class PrincipalRomano {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// I=1, V=5, X=10, L=50, C=100, D=500, M=1000;
		int res=0;
		int numero=0;	
		Scanner entrada, confirmar;
		do{

			int contador=0;
			int aux=0, num=0, aux2=0, num2=0, numres=0;
			String salida="";
			System.out.println("Ingrese la cantidad a convertir del 1 al 1,000");
			entrada= new Scanner(System.in);
			numero=Integer.parseInt(entrada.nextLine());
			num=numero / 10;
			num2=numero / 100;
			numres=numero%10;

			if(num<1){
				while(contador!=numero){
					contador++;
					aux++;
				}
				salida=metodo2(aux);
			}
			if(num==1){
				salida="X";
				contador=10;
				if(numero>contador){
					while(contador!=numero){
						contador++;
						aux++;
					}
					salida=salida+metodo2(aux);
				}
			}

			if(num==2){
				salida="XX";
				contador=20;
				if(numero>contador){
					while(contador!=numero){
						contador++;
						aux++;
					}
					salida=salida+metodo2(aux);
				}
			}
			if(num==3){
				salida="XXX";
				contador=30;
				if(numero>contador){
					while(contador!=numero){
						contador++;
						aux++;
					}
					salida=salida+metodo2(aux);
				}
			}
			if(num==4){
				salida="XL";
				contador=40;
				if(numero>contador){
					while(contador!=numero){
						contador++;
						aux++;
					}
					salida=salida+metodo2(aux);
				}
			}
			if(num==5){
				salida="L";
				contador=50;
				if(numero>contador){
					while(contador!=numero){
						contador++;
						aux++;
					}
					salida=salida+metodo2(aux);
				}
			}
			if(num==6){
				salida="LX";
				contador=60;
				if(numero>contador){
					while(contador!=numero){
						contador++;
						aux++;
					}
					salida=salida+metodo2(aux);
				}
			}

			if(num==7){
				salida="LXX";
				contador=70;
				if(numero>contador){
					while(contador!=numero){
						contador++;
						aux++;
					}
					salida=salida+metodo2(aux);
				}
			}

			if(num==8){
				salida="LXXX";
				contador=80;
				if(numero>contador){
					while(contador!=numero){
						contador++;
						aux++;
					}
					salida=salida+metodo2(aux);
				}
			}
			if(num==9){
				salida="XC";
				contador=90;
				if(numero>contador){
					while(contador!=numero){
						contador++;
						aux++;
					}
					salida=salida+metodo2(aux);
				}
			}

			if(num2==1){
				salida="C";
				contador=100;
				if(numero>contador){
					if(num>10){
						aux2=10;

						if(numres!=0){
							while(aux2!=num){
								aux2=aux2+1;
							}
							while(aux!=numres){
								aux++;
							}
							salida=salida+metodo1(aux2)+metodo2(aux);
						}else{
							while(aux2!=num){
								aux2=aux2+1;
							}
							salida=salida+metodo1(aux2);
						}
					}else{
						while(aux!=numres){
							aux++;
						}
						salida=salida+metodo2(aux);
					}
				}
			}

			if(num2==2){
				salida="CC";
				contador=200;
				if(numero>contador){
					if(num>20){
						aux2=10;
						if(numres!=0){
							while(aux2!=num){
								aux2=aux2+1;
							}
							aux2=aux2-10;
							while(aux!=numres){
								aux++;
							}
							salida=salida+metodo1(aux2)+metodo2(aux);
						}else{
							while(aux2!=num){
								aux2=aux2+1;
							}
							aux2=aux2-10;
							salida=salida+metodo1(aux2);
						}
					}else{
						while(aux!=numres){
							aux++;
						}
						salida=salida+metodo2(aux);
					}
				}
			}

			if(num2==3){
				salida="CCC";
				contador=300;
				if(numero>contador){
					if(num>30){
						aux2=10;
						if(numres!=0){
							while(aux2!=num){
								aux2=aux2+1;
							}
							aux2=aux2-20;
							while(aux!=numres){
								aux++;
							}
							salida=salida+metodo1(aux2)+metodo2(aux);
						}else{
							while(aux2!=num){
								aux2=aux2+1;
							}
							aux2=aux2-20;
							salida=salida+metodo1(aux2);
						}
					}else{
						while(aux!=numres){
							aux++;
						}
						salida=salida+metodo2(aux);
					}
				}
			}

			if(num2==4){
				salida="CD";
				contador=400;
				if(numero>contador){
					if(num>40){
						aux2=10;
						if(numres!=0){
							while(aux2!=num){
								aux2=aux2+1;
							}
							aux2=aux2-30;
							while(aux!=numres){
								aux++;
							}
							salida=salida+metodo1(aux2)+metodo2(aux);
						}else{
							while(aux2!=num){
								aux2=aux2+1;
							}
							aux2=aux2-30;
							salida=salida+metodo1(aux2);
						}
					}else{
						while(aux!=numres){
							aux++;
						}
						salida=salida+metodo2(aux);
					}
				}
			}

			if(num2==5){
				salida="D";
				contador=500;
				if(numero>contador){
					if(num>50){
						aux2=10;
						if(numres!=0){
							while(aux2!=num){
								aux2=aux2+1;
							}
							aux2=aux2-40;
							while(aux!=numres){
								aux++;
							}
							salida=salida+metodo1(aux2)+metodo2(aux);
						}else{
							while(aux2!=num){
								aux2=aux2+1;
							}
							aux2=aux2-40;
							salida=salida+metodo1(aux2);
						}
					}else{
						while(aux!=numres){
							aux++;
						}
						salida=salida+metodo2(aux);
					}
				}
			}

			if(num2==6){
				salida="DC";
				contador=600;
				if(numero>contador){
					if(num>60){
						aux2=10;
						if(numres!=0){
							while(aux2!=num){
								aux2=aux2+1;
							}
							aux2=aux2-50;
							while(aux!=numres){
								aux++;
							}
							salida=salida+metodo1(aux2)+metodo2(aux);
						}else{
							while(aux2!=num){
								aux2=aux2+1;
							}
							aux2=aux2-50;
							salida=salida+metodo1(aux2);
						}
					}else{
						while(aux!=numres){
							aux++;
						}
						salida=salida+metodo2(aux);
					}
				}
			}

			if(num2==7){
				salida="DCC";
				contador=700;
				if(numero>contador){
					if(num>70){
						aux2=10;
						if(numres!=0){
							while(aux2!=num){
								aux2=aux2+1;
							}
							aux2=aux2-60;
							while(aux!=numres){
								aux++;
							}
							salida=salida+metodo1(aux2)+metodo2(aux);
						}else{
							while(aux2!=num){
								aux2=aux2+1;
							}
							aux2=aux2-60;
							salida=salida+metodo1(aux2);
						}
					}else{
						while(aux!=numres){
							aux++;
						}
						salida=salida+metodo2(aux);
					}
				}
			}

			if(num2==8){
				salida="DCCC";
				contador=800;
				if(numero>contador){
					if(num>80){
						aux2=10;
						if(numres!=0){
							while(aux2!=num){
								aux2=aux2+1;
							}
							aux2=aux2-70;
							while(aux!=numres){
								aux++;
							}
							salida=salida+metodo1(aux2)+metodo2(aux);
						}else{
							while(aux2!=num){
								aux2=aux2+1;
							}
							aux2=aux2-70;
							salida=salida+metodo1(aux2);
						}
					}else{
						while(aux!=numres){
							aux++;
						}
						salida=salida+metodo2(aux);
					}
				}
			}

			if(num2==9){
				salida="CM";
				contador=900;
				if(numero>contador){
					if(num>90){
						aux2=10;
						if(numres!=0){
							while(aux2!=num){
								aux2=aux2+1;
							}
							aux2=aux2-80;
							while(aux!=numres){
								aux++;
							}
							salida=salida+metodo1(aux2)+metodo2(aux);
						}else{
							while(aux2!=num){
								aux2=aux2+1;
							}
							aux2=aux2-80;
							salida=salida+metodo1(aux2);
						}
					}else{
						while(aux!=numres){
							aux++;
						}
						salida=salida+metodo2(aux);
					}
				}
			}
			if(num2==10){
				if(numero>1000){
					System.out.println("El número esta fuera de rango");
				}else{
					salida="M";
					contador=1000;
				}
			}



			System.out.println(salida);
			System.out.println("¿Desea ingresar otra cantidad? \n 1......Si \n 2.....No");
			confirmar= new Scanner(System.in);
			res=Integer.parseInt(confirmar.nextLine());

		}while(res==1);

	}



	public static String metodo2(int numero){
		String salida="";
		int contador=0, cI=0;
		while(cI<3){
			salida=salida+"I";
			cI++;
			contador++;
			if(contador==numero){
				cI=4;
			}
		}

		if(contador!=numero){
			salida="V";
			contador=5;
			if(numero<contador){
				salida="IV";
			}
			if(numero>contador && numero<=9){
				cI=0;
				while(cI<3){
					salida=salida+"I";
					cI++;
					contador++;
					if(contador==numero){
						cI=4;
					}
				}
				if(numero>contador){
					salida="IX";
				}

			}
		}
		return salida;
	}

	public static String metodo1(int numero){
		String salida="";
		int contador=10, cX=0;
		while(cX<3){
			salida=salida+"X";
			cX++;
			contador++;
			if(contador==numero){
				cX=4;
			}
		}

		if(contador!=numero){
			salida="L";
			contador=15;
			if(numero<contador){
				salida="XL";
			}
			if(numero>contador && numero<=19){
				cX=0;
				while(cX<3){
					salida=salida+"X";
					cX++;
					contador++;
					if(contador==numero){
						cX=4;
					}
				}
				if(numero>contador){
					salida="XC";
				}

			}
		}
		return salida;
	}

}


