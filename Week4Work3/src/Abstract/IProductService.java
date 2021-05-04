package Abstract;

import Entities.Product;

public interface IProductService {

	void SaveProduct(Product product);
	
	void UpdateProduct(Product product);
	
	void DeleteProduct(Product product);
	
}
