package br.com.glandata.dataTable.repository;

import org.springframework.data.jpa.datatables.repository.DataTablesRepository;

import br.com.glandata.dataTable.model.Cliente;

public interface  ClienteRepository extends DataTablesRepository<Cliente, Long>{

}
