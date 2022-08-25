package br.com.glandata.dataTable.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.glandata.dataTable.model.Cliente;
import br.com.glandata.dataTable.service.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;
	
	@CrossOrigin
	@GetMapping("/dataTable")
    public DataTablesOutput<Cliente> list(@Valid DataTablesInput input) {
        return clienteService.listToDataTable(input);
    }

}
