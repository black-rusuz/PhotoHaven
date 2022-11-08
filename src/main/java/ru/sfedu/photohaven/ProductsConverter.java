package ru.sfedu.photohaven;

import com.opencsv.bean.AbstractBeanField;
import ru.sfedu.photohaven.model.Product;

import java.util.List;

public class ProductsConverter extends AbstractBeanField<List<Product>, String> {
    public static final String fieldsDelimiter = "::";

    @Override
    public List<Product> convert(String s) {
        return List.of();
    }

    @Override
    public String convertToWrite(Object object) {
        return "";
    }
}
