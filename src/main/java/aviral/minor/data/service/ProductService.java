package aviral.minor.data.service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import aviral.minor.data.model.Product;
import aviral.minor.data.repository.ProductRepository;
@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;
    public List<Product> getAllProduct()
    {
        return productRepository.findAll();
    }
    public void addProduct(Product product)
    {
        productRepository.save(product);
    }
    public void removeProductById(long id)
    {
        productRepository.deleteById(id);
    }
    public Optional<Product> getProductById(long id)
    {
        return productRepository.findById(id);
    }
    public List<Product> getAllProductsByCategoryId(int id)
    {
        return productRepository.findAllByCategory_Id(id);
    }
    public List<Product> getAllProducts()
    {
        List<Product> list=(List<Product>)productRepository.findAll();
        return list;
    }
    public List<Product> getByKeyword(String keyword)
    {
        return productRepository.findByKeyword(keyword);
    }
}
