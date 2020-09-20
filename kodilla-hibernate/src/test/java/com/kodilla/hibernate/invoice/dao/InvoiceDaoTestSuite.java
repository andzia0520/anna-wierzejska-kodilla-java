package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;

    @Autowired
    ProductDao productDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product productSoap = new Product("soap");
        Product productShampoo = new Product("shampoo");
        Item item1 = new Item(new BigDecimal(3), 3, new BigDecimal(9));
        Item item2 = new Item(new BigDecimal(245), 4, new BigDecimal(980));
        Item item3 = new Item(new BigDecimal(45), 4, new BigDecimal(180));

        productShampoo.getItems().add(item1);
        productShampoo.getItems().add(item3);
        productSoap.getItems().add(item2);
        item1.setProduct(productShampoo);
        item2.setProduct(productSoap);
        item3.setProduct(productShampoo);

        Invoice invoice = new Invoice("One");
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);

        //When
        productDao.save(productShampoo);
        int productShampooId = productShampoo.getId();
        productDao.save(productSoap);
        int productSoapId = productSoap.getId();
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        Assert.assertNotEquals(0, productShampooId);
        Assert.assertNotEquals(0, productSoapId);
        Assert.assertNotEquals(0, id);


        //CleanUp
        productDao.deleteById(productShampooId);
        productDao.deleteById(productSoapId);
        invoiceDao.deleteById(id);
    }
}
