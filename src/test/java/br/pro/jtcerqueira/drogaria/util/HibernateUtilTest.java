package br.pro.jtcerqueira.drogaria.util;

import org.hibernate.Session;
import org.junit.Test;

public class HibernateUtilTest {
	@Test
	public void connect() {
		Session sess = HibernateUtil.getSessionFactory().openSession();
		sess.close();
		HibernateUtil.getSessionFactory().close();
	}
}
