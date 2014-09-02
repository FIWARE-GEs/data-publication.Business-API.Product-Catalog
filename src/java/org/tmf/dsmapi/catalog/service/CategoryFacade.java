package org.tmf.dsmapi.catalog.service;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.tmf.dsmapi.catalog.Category;

/**
 *
 * @author bahman.barzideh
 *
 */
@Stateless
public class CategoryFacade extends AbstractFacade<Category> {

    @PersistenceContext(unitName = "DSProductCatalogPU")
    private EntityManager entityManager;

    public CategoryFacade() {
        super(Category.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return entityManager;
    }

}