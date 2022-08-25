package br.com.glandata.dataTable.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
import org.springframework.stereotype.Service;

import br.com.glandata.dataTable.model.Cliente;
import br.com.glandata.dataTable.repository.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private  ClienteRepository clienteRepository;
	
	public DataTablesOutput<Cliente> listToDataTable(DataTablesInput dataTablesInput) {
		return clienteRepository.findAll(dataTablesInput);
	}
	
	

}
