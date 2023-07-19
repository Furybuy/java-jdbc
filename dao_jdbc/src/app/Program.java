package app;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("===Test1:findById");
		Seller seller = sellerDao.findById(3); 
		
		System.out.println(seller);
		
		System.out.println("===Test2:findByDepartment");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("===Test3:findByDepartment");
		list = sellerDao.findAll();
		
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("===Test5:SellerInsert");
		seller = sellerDao.findById(1);
		seller.setName("Alice Bob");
		sellerDao.update(seller);
		System.out.println("update completed");
		
		
	}

}
