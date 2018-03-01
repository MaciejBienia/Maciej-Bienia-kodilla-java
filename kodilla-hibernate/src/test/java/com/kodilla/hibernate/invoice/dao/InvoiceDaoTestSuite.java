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
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;
    @Autowired
    ItemDao itemDao;
    @Autowired
    ProductDao productDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product firstProduct = new Product("First product");
        Product secondProduct = new Product("Second product");
        Product thirdProduct = new Product("Third Product");

        Item firstItem = new Item(firstProduct, new BigDecimal(25), 2, new BigDecimal(50));
        Item secondItem = new Item(secondProduct, new BigDecimal(30), 3, new BigDecimal(90));
        Item thirdItem = new Item(thirdProduct, new BigDecimal(4), 8, new BigDecimal(32));
        Item fourthItem = new Item(firstProduct, new BigDecimal(25), 5, new BigDecimal(125));
        Item fifthItem = new Item(thirdProduct, new BigDecimal(140), 1, new BigDecimal(140));

        firstProduct.getItems().add(firstItem);
        firstProduct.getItems().add(fourthItem);
        secondProduct.getItems().add(secondItem);
        thirdProduct.getItems().add(thirdItem);
        thirdProduct.getItems().add(fifthItem);

        firstItem.setProduct(firstProduct);
        secondItem.setProduct(secondProduct);
        thirdItem.setProduct(thirdProduct);
        fourthItem.setProduct(firstProduct);
        fifthItem.setProduct(thirdProduct);

        List<Item> items = new ArrayList<>();

        Invoice invoice = new Invoice("1/2018", items);
        invoice.getItems().add(firstItem);
        invoice.getItems().add(secondItem);
        invoice.getItems().add(thirdItem);
        invoice.getItems().add(fourthItem);
        invoice.getItems().add(fifthItem);

        firstItem.setInvoice(invoice);
        secondItem.setInvoice(invoice);
        thirdItem.setInvoice(invoice);
        fourthItem.setInvoice(invoice);
        fifthItem.setInvoice(invoice);
        //When
        productDao.save(firstProduct);
        productDao.save(secondProduct);
        productDao.save(thirdProduct);

        itemDao.save(firstItem);
        itemDao.save(secondItem);
        itemDao.save(thirdItem);
        itemDao.save(fourthItem);
        itemDao.save(fifthItem);

        invoiceDao.save(invoice);
        int id = invoice.getId();
        //Then
        Assert.assertNotEquals(0, id);
        //CleanUp
        invoiceDao.delete(id);
    }
}
