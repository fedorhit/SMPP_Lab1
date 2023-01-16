package SMPP_Lab1.service;

import SMPP_Lab1.dao.PersonDao;
import SMPP_Lab1.model.Person;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonService {
    private final PersonDao personDao;

    public List<Person> findAll(){
        return personDao.findAll();
    }

    public Person findById(int id){
        return personDao.findById(id);
    }

    public Person findByName(String name){
        return personDao.findByName(name);
    }
}
