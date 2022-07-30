package com.tienda.service;

import com.tienda.dao.ArticuloDao;
import com.tienda.domain.Articulo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public abstract class ArticuloServiceImpl implements ArticuloService {

    @Autowired
    private ArticuloDao clienteDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Articulo> getArticulos(boolean activos) {
        var lista = (List<Articulo>) clienteDao.findAll();
        
        if (activos) { lista.removeIf(e -> e.isActivo());}
        
        return lista;
    }

    @Override
    @Transactional
    public void save(Articulo cliente) {
        clienteDao.save(cliente);
    }

    @Override
     @Transactional
    public void delete(Articulo cliente) {
        clienteDao.delete(cliente);
    }


}