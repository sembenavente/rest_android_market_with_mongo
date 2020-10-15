package com.devon.market.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;
import java.util.Map;


@Getter
@Setter
@ToString

@Document(collection = "ventas")
public class Producto {

    @Id
    String _id;

    private List<Map<String,String>> products;

    private String client;

    private Double total;

    @DateTimeFormat(style = "dd/MM/yyyy")
    private Date date;
}
