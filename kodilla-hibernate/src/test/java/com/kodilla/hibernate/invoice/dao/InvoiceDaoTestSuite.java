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
import java.util.Optional;
import java.util.stream.Collectors;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;

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
        invoiceDao.save(invoice);
        int id = invoice.getId();
        Optional<Invoice> readInvoice = invoiceDao.findById(id);

        //Then
        Assert.assertNotEquals(0, id);
        Assert.assertTrue(readInvoice.isPresent());

        //CleanUp
        invoiceDao.deleteById(id);
    }
}
