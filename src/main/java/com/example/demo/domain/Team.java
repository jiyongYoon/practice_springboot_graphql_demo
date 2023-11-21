package com.example.demo.domain;

import io.leangen.graphql.annotations.GraphQLQuery;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @GraphQLQuery(name = "id")
    private Long id;

    @GraphQLQuery(name = "name")
    private String name;

    @ManyToOne(fetch = FetchType.EAGER)
    @GraphQLQuery(name = "sport")
    private Sport sport;

    @OneToOne(fetch = FetchType.EAGER)
    @GraphQLQuery(name = "country")
    private Country country;
}
