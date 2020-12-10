package pl.pozadr.datauiapp.services;

import pl.pozadr.datauiapp.models.Sail;

import java.util.List;
import java.util.Optional;

public interface SailService {
    List<Sail> getSails();
    Optional<Sail> getSailById(Integer id);
    void addSail(Sail sail);
    void updateSail(Sail sail);
    void deleteSail(Integer id);
}
