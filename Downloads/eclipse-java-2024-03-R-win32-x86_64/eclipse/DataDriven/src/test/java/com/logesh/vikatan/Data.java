package com.logesh.vikatan;

public class Data {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String url="https://books.vikatan.com/category/literature";
		
		int indexOf = url.lastIndexOf('/')+1;
		
		System.out.println(indexOf);
		
		String reUrl = url.substring(indexOf);
		
		System.out.println(reUrl);
	}

}
