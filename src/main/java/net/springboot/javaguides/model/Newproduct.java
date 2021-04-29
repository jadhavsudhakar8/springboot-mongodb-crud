package net.springboot.javaguides.model;

import javax.validation.constraints.NotBlank;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document (collection = "Product")
public class Newproduct {
	
	@Id
	private int product_id;
	
	@NotBlank
	private String product_name;
	private String product_price;
	private String product_quantity;
	

}
