package pl.asseco.workshop.asseco.market.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.asseco.workshop.asseco.market.model.Customer;
import pl.asseco.workshop.asseco.market.model.CustomerAddress;
import pl.asseco.workshop.asseco.market.repository.CustomerAddressRepository;
import pl.asseco.workshop.asseco.market.repository.CustomerRepository;
import sun.net.www.content.text.Generic;


import javax.xml.ws.ResponseWrapper;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Created by krzysztof.bogucki on 11 wrz 2017.
 */
@Controller
@RequestMapping(path="/customer")
public class CustomerController {

    @Autowired
    private CustomerRepository customerReporitory;

    @Autowired
    private CustomerAddressRepository customerAddressRepository;

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

    @GetMapping(path="/runProcesDocumentCustomerByNIP")
    public @ResponseBody String runProcesDocumentCustomerByNIP() {
        return "Wartość  pojedyńczego pola zwracana z procedury składowanej => " + customerReporitory.procesDocumentCustomerByNIP();
    }














    @GetMapping(path="/getByNip")
    public @ResponseBody Customer getByNip( @RequestParam(value = "nip") String nip){
        return customerReporitory.findByNip(nip);
    }



    @GetMapping(path="/add")
    public @ResponseBody String add(
            @RequestParam(value = "firstName") String firstName,
            @RequestParam(value = "lastName") String lastName,
            @RequestParam(value = "nip") String nip,

            @RequestParam(value = "city") String city,
            @RequestParam(value = "street") String street,
            @RequestParam(value = "nr") String nr,
            @RequestParam(value = "code") String code
            ){


        CustomerAddress ca = new CustomerAddress();
        ca.setCity(city);
        ca.setStreet(street);
        ca.setNumber(nr);
        ca.setCode(code);


        Customer cus = new Customer();
        cus.setFirstName(firstName);
        cus.setLastName(lastName);
        cus.setNip(nip);
        cus.setCustomerAddress(ca);


        customerReporitory.save(cus);

        return "Customer added";
    }


    @GetMapping(path="/getAllAddress")
    public @ResponseBody List<CustomerAddress> getAllAddress(){
        return customerAddressRepository.findAll();
    }



}
