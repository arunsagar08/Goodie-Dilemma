package com;
import java.util.Scanner;
public class GoodyDilemma{
	String goody;
	int cost;
	GoodyDilemma(String goody,int cost){
		this.goody=goody;
		this.cost=cost;
	}
public static void main(String[] args) {
	GoodyDilemma h1=new GoodyDilemma("Fitbit Plus",7980);
	GoodyDilemma h2=new GoodyDilemma("IPods",22349);
	GoodyDilemma h3=new GoodyDilemma("MI Band",999);
	GoodyDilemma h4=new GoodyDilemma("Cult Pass",2799);
	GoodyDilemma h5=new GoodyDilemma("Macbook Pro",229900);
	GoodyDilemma h6=new GoodyDilemma("Digital Camera",11101);
	GoodyDilemma h7=new GoodyDilemma("Alexa",9999);
	GoodyDilemma h8=new GoodyDilemma("SAndWich Toaster",2195);
	GoodyDilemma h9=new GoodyDilemma("Microwave Oven",9800);
	GoodyDilemma h10=new GoodyDilemma("Scale",4999);
		System.out.println("enter a number of employees :");
		Scanner s=new Scanner(System.in);
		int emp=s.nextInt();
		GoodyDilemma[] h= {h1,h2,h3,h4,h5,h6,h7,h8,h9,h10};
		int min=h[0].cost;
		int max=h[0].cost;
		for(int i=0;i<emp;i++) {
			if(min<h[i].cost) {
				min=h[i].cost;

			}
			if(max>h[i].cost) {
				max=h[i].cost;
			}
			System.out.println(h[i].goody+" :"+h[i].cost);

		}
		System.out.println("The difference between the chosen goodie with highest price and lowest price is: "+(min-max));

	}

}






