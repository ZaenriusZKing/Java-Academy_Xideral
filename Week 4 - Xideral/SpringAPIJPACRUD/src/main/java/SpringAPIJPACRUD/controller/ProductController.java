package SpringAPIJPACRUD.controller;

import SpringAPIJPACRUD.entity.Product;
import SpringAPIJPACRUD.repository.RepositoryProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/productos")
public class ProductController {

    @Autowired
    private RepositoryProduct productoRepository;

    @GetMapping
    public List<Product> getAllProductos() {
        return productoRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductoById(@PathVariable Long id) {
        Optional<Product> producto = productoRepository.findById(id);
        return producto.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Product createProducto(@RequestBody Product product) {
        return productoRepository.save(product);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Product> updateProducto(@PathVariable Long id, @RequestBody Product productoDetails) {
        Optional<Product> optionalProducto = productoRepository.findById(id);
        if (optionalProducto.isPresent()) {
            Product product = optionalProducto.get();
            product.setNombre(productoDetails.getNombre());
            product.setPrecio(productoDetails.getPrecio());
            Product updatedProducto = productoRepository.save(product);
            return ResponseEntity.ok(updatedProducto);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProducto(@PathVariable Long id) {
        if (productoRepository.existsById(id)) {
            productoRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}

