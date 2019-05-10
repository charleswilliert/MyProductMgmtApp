package edu.mum.cs.cs425.prodmgmt;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.mum.cs.cs425.prodmgmt.model.Product;
import edu.mum.cs.cs425.prodmgmt.repository.ProductRepository;

@SpringBootApplication
public class MyProductMgmtAppApplication implements CommandLineRunner{
	
@Autowired
private ProductRepository pp;
	public static void main(String[] args) {
		SpringApplication.run(MyProductMgmtAppApplication.class, args);
	} 

	
	void saveProduct() {
		
		Product p=new Product();
		p.setPid(1001);
		p.setName(":iPhone XS Max");
		p.setProductNumber(1);
		p.setUnitPrice(1500.2f);
		p.setDateMfd(LocalDate.of(2018, 10, 24));
		
		pp.save(p);
	}


	@Override
	public void run(String... args) throws Exception {
		saveProduct();
		
	}
}
