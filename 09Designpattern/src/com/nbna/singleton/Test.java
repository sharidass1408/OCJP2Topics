package com.nbna.singleton;

public class Test {

	
	public static void main(String[] args) {
		
		DataConnectionEx dce =  DataConnectionEx.getInstance();
		DataConnectionEx dce2 = DataConnectionEx.getInstance();
		DataConnectionEx dce3 = DataConnectionEx.getInstance();

	}

}
