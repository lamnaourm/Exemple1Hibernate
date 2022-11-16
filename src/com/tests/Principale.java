package com.tests;



import org.hibernate.Session;
import org.hibernate.Transaction;

import com.exemple.Utils.HibernateUtils;
import com.exemple.model.Produit;

public class Principale {

	public static void main(String[] args) {
		
		
		Session session = HibernateUtils.getSessionfactory().getCurrentSession(); 
		Transaction t = session.beginTransaction();
		
		Produit p = new Produit(2,"Test hibernate tttt", "Famille ttttwww",320,5450);
		
		session.delete(p);
		
		t.commit();
		session.close();
	}

}
