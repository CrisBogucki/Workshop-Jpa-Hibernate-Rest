package pl.asseco.workshop.asseco.market.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.asseco.workshop.asseco.market.model.Customer;
import pl.asseco.workshop.asseco.market.repository.CustomerRepository;


import java.util.List;

/**
 * Created by krzysztof.bogucki on 11 wrz 2017.
 */
@Controller
@RequestMapping(path="/customer")
public class CustomerController {

    @Autowired
    CustomerRepository customerReporitory;

    @GetMapping(path="/all")
    public @ResponseBody List<Customer> getAll(){
        return customerReporitory.findAll();
    }

    @GetMapping(path="/getByFirstName")
    public @ResponseBody Customer getByFirstName( @RequestParam(value = "name") String firstName){
        return customerReporitory.findByFirstName(firstName);
    }

    @GetMapping(path="/getByFirstNameNativeQ")
    public @ResponseBody Customer getByFirstNameNAtiveQ( @RequestParam(value = "name") String firstName){
        return customerReporitory.findByFirstNameNativeQ(firstName);
    }

    @GetMapping(path="/getByFirstNameJQPL")
    public @ResponseBody Customer getByFirstNameJQPL( @RequestParam(value = "name") String firstName){
        return customerReporitory.findByFirstNameJPQL(firstName);
    }

    @GetMapping(path="/getByFirstNameHQL")
    public @ResponseBody Customer getByFirstNameHQL( @RequestParam(value = "name") String firstName){
        return customerReporitory.findByFirstNameHQL(firstName);
    }





    @GetMapping(path="/getByNip")
    public @ResponseBody Customer getByNip( @RequestParam(value = "nip") String nip){
        return customerReporitory.findByNip(nip);
    }


    @GetMapping(path="/add")
    public @ResponseBody String add(
            @RequestParam(value = "firstName") String firstName,
            @RequestParam(value = "lastName") String lastName,
            @RequestParam(value = "nip") String nip){

        Customer cus = new Customer();
        cus.setFirstName(firstName);
        cus.setLastName(lastName);
        cus.setNip(nip);

        customerReporitory.save(cus);

        return "Customer added";
    }

}
