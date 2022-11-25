package kodlama.io.rentACar.dataAcces.concretes;

import kodlama.io.rentACar.dataAcces.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryBrandRepository implements BrandRepository {
    ArrayList<Brand> brands;

    public InMemoryBrandRepository() {
        brands = new ArrayList<Brand>();
        brands.add(new Brand(1, "bmv"));
        brands.add(new Brand(1, "bmv"));
        brands.add(new Brand(1, "bmv"));
        brands.add(new Brand(1, "bmv"));


    }

    @Override
    public List<Brand> getAll() {


        return brands;
    }
}
