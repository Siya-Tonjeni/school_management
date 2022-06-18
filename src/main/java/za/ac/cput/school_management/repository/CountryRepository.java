package za.ac.cput.school_management.repository;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import za.ac.cput.school_management.domain.Country;

import java.util.*;
import java.util.Optional;
import java.util.function.Function;

public class CountryRepository implements ICountryRepository{
    private static CountryRepository repository = null;
    private List<Country> countryDB = null;

    private CountryRepository(){
        countryDB = new ArrayList<>();
            }

    public static CountryRepository getRepository() {
        if (repository == null)
            repository = new CountryRepository();
        return repository;
    }

    @Override
    public Country save(Country country) {
        Optional<Country> read = read(country.getId());
        if(read.isPresent()){
            delete(read.get());
        }
        this.countryDB.add(country);
        return country;
    }

   // @Override
    public Optional<Country> read(String id) {
        return this.countryDB.stream()
                .filter(s->s.getId().equalsIgnoreCase(id))
                .findFirst();
    }

    @Override
    public void delete(Country country) {
    this.countryDB.remove(country);
    }

    @Override
    public void deleteAllById(Iterable<? extends String> strings) {

    }

    @Override
    public void deleteAll(Iterable<? extends Country> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Country> getAll() {
        return countryDB;
    }

    @Override
    public List<Country> findAll() {
        return null;
    }

    @Override
    public List<Country> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Country> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Country> findAllById(Iterable<String> strings) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(String s) {

    }

    @Override
    public <S extends Country> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Country> findById(String s) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(String s) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Country> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Country> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Country> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<String> strings) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Country getOne(String s) {
        return null;
    }

    @Override
    public Country getById(String s) {
        return null;
    }

    @Override
    public <S extends Country> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Country> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Country> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Country> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Country> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Country> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Country, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
