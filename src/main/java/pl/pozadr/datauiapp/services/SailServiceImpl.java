package pl.pozadr.datauiapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import pl.pozadr.datauiapp.models.Sail;
import pl.pozadr.datauiapp.repositories.SailRepository;

import java.util.List;

public class SailServiceImpl implements SailService {
    private SailRepository sailRepository;

    @Autowired
    public SailServiceImpl(SailRepository sailRepository) {
        this.sailRepository = sailRepository;
    }

    public List<Sail> getSails() {
        return (List<Sail>) sailRepository.findAll();
    }

}
