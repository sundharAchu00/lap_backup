package edu.jsp.productDetails;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ProductDriver {
	public static void main(String[] args) {
		boolean b = true;
		Scanner sc = new Scanner(System.in);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		do {
		System.out.println("\t\tWelcome....");
		System.out.println("1.Add Product");
		System.out.println("2.Read All Product Details");
		System.out.println("3.Sort Product in Ascending");
		System.out.println("4.Sort Product in descending");
		System.out.println("5.Search Product by Brand Name ");
		System.out.println("6.Search Product In range");
		System.out.println("7.Read name and price of the product");
		System.out.println("8.Fetch Product Having Two 'a' in the brand name");
		System.out.println("9.Exit");
		Product p = new Product();
		switch (sc.nextInt()) {
		case 1: {
			System.out.println("Enter Product ID : ");
			p.setId(sc.nextInt());
			System.out.println("Enter Product Name : ");
			p.setName(sc.next());
			System.out.println("Enter Brand Name : ");
			p.setBrandName(sc.next());
			System.out.println("Enter Price : ");
			p.setPrice(sc.nextDouble());
			System.out.println("Enter Vendor : ");
			p.setVendor(sc.next());
			et.begin();
			em.persist(p);
			et.commit();
			System.out.println("Data Inserted Successfully...");
			break;
		}
		case 2: {
			Query q = em.createQuery("select p from Product p");
			List<Product>  lp =  q.getResultList();
			System.out.println(lp);
			break;
		}
		case 3: {
			Query q = em.createQuery("select p from Product p order by brandName asc");
			List<Product>  lp =  q.getResultList();
			System.out.println(lp);
			break;
		}		
		case 4: {
			Query q = em.createQuery("select p from Product p order by brandName desc");
			List<Product>  lp =  q.getResultList();
			System.out.println(lp);
			break;
		}
		case 5: {
			Query q = em.createQuery("select p from Product p where vendor ='unilever'");
			List<Product>  lp =  q.getResultList();
			System.out.println(lp);
			break;
		}
		case 6: {
			System.out.println("Products from 20  to 50");
			Query q = em.createQuery("select p from Product p where price between 20 and 50");
			List<Product>  lp =  q.getResultList();
			System.out.println(lp);
			break;
		}
		case 7: {
			Query q = em.createQuery("select p.name,p.price from Product p");
			List<Object[]>  lp =  q.getResultList();
			for (Object[] o : lp) {
				System.out.println("Product Name : "+o[0]);
				System.out.println("Product Price : "+o[1]);
			}
			break;
		}
		case 8: {
			Query q = em.createQuery("select p from Product p where p.brandName like '%a%a%'");
			List<Product>  lp =  q.getResultList();
			System.out.println(lp);
			break;
		}

		case 9: {
			b= false;
			System.out.println("Thank You....");
			break;
		}
		default:
			System.err.println("Choose With In The Range...");
			break;
		}
		} while (b);
	}
}
