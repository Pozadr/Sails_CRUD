package pl.pozadr.datauiapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.pozadr.datauiapp.models.Sail;
import pl.pozadr.datauiapp.repositories.SailRepository;

import java.util.List;
import java.util.Optional;

@Service
public class SailServiceImpl implements SailService {
    private final SailRepository sailRepository;

    @Autowired
    public SailServiceImpl(SailRepository sailRepository) {
        this.sailRepository = sailRepository;
    }

    @Override
    public List<Sail> getSails() {
        return (List<Sail>) sailRepository.findAll();
    }

    @Override
    public Optional<Sail> getSailById(Integer id) {
        return sailRepository.findById(id);
    }

    @Override
    public void addSail(Sail sail) {
        sailRepository.save(sail);
    }

    @Override
    public void updateSail(Sail sail) {
        sailRepository.save(sail);
    }

    @Override
    public void deleteSail(Integer id) {
        sailRepository.deleteById(id);
    }

}
