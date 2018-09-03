package com.sandeep.day7;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.LinkedList;

public class Assignment {

	File assgn;
	LocalDate date;
	static LinkedList<Assignment> a=new LinkedList<>();
	public Assignment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Assignment(File assgn, LocalDate date) {
		super();
		this.assgn = assgn;
		this.date = date;
	}

	public static void addAssignment(Assignment addToList) throws IOException
	{
		a.add(addToList);
		addToList.assgn.createNewFile();
	}

	public static boolean removeAssignment(Assignment remName)
	{
		
		remName.assgn.delete();
		
		return a.remove(remName);
	}

	@Override
	public String toString() {
		return "Assignment [assgn=" + assgn + ", date=" + date + "]";
	}



	public static Assignment getNearest() {
		// TODO Auto-generated method stub
		Assignment near=a.getFirst();
		for (Assignment assignment : a) {

			if(near.date.compareTo(assignment.date)>=0)
				near=assignment;


		}	
		System.out.println(near);
		return near;
		
	}
}


