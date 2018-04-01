package com.mindtree.springfive.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mindtree.springfive.beans.LibraryList;
import com.mindtree.springfive.beans.LibraryMap;
import com.mindtree.springfive.beans.LibrarySet;

public class TestLibraryList {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
		LibraryList libraryList = (LibraryList) applicationContext.getBean("objFour");
		System.out.println("Using list here: ");
		libraryList.displayBook();
		System.out.println();
		System.out.println("Using Set here: ");
		LibrarySet librarySet = (LibrarySet) applicationContext.getBean("objFive");
		librarySet.displayBooks();
		System.out.println();
		System.out.println("Using Map here: ");
		LibraryMap libraryMap = (LibraryMap) applicationContext.getBean("objSix");
		libraryMap.displayBook();
		
		LibraryList libraryListTwo = (LibraryList) applicationContext.getBean("objEight");
		System.out.println("Using list here: ");
		libraryListTwo.displayBook();
		
	}

}
