package com.training.services;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int key=13;
      StringService service=new StringService();
      System.out.println(String.format("%3$.4f %2$.3f %1$.2f",100.45,200.76,444.33,321.3,344.3));
      switch (key) {
	case 1:
		service.stringEquals("ram", "ram");
		
		break;
	case 2:
		service.stringObjectEquals();
		break;
	case 3:
		service.usingTrim("   ramesh   ");
		break;
	case 4:
		service.lengthOfString("   ramesh");
		break;
	case 5:
	            service.usingSubString("ramesh");
		break;
		
	case 6:
		service.usingCharAtAndIndexof("ram@abc.com");
		break;
	case 7:
		service.usingReplace("ram@abc.com","welcome to chennai");
		break;
		
	case 8:
		service.usingConcat("Hii", "kawin");
		break;
	case 9:
		service.usingCompareTo("kawin","kavin");
		break;
		
	case 10:
		service.usingStringFormat("ram",45.292);
		break;
		
	case 11:
		service.usingStringFormat(17);
		break;
		
	case 12:
		service.usingStringFormat("ram", "ram");
	
	case 13:
		service.usingStringformat(9,16);
		break;
	default:
		break;
	}
      
	}
}
