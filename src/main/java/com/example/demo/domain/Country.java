package com.example.demo.domain;

import io.leangen.graphql.annotations.GraphQLQuery;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @GraphQLQuery(name = "id")
    private Long id;

    @GraphQLQuery(name = "name")
    private String name;
}
