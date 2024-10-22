package jpabook.jpashop.practice01.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jpabook.jpashop.domain.DeliveryStatus;
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
    private DeliveryStatus deliveryStatus;
    @OneToOne(mappedBy ="delivery")
    private Order order;
}