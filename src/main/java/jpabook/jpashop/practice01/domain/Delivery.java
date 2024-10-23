package jpabook.jpashop.practice01.domain;

import jakarta.persistence.*;
import jpabook.jpashop.domain.Order;

@Entity
public class Delivery extends BaseEntity{

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String city;
    private String street;
    private String zipcode;
    @OneToOne(mappedBy ="delivery", fetch = FetchType.LAZY)
    private Order order;
}
