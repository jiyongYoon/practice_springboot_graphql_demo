package com.example.demo.service;

import com.example.demo.domain.Sport;
import com.example.demo.domain.Team;
import com.example.demo.repository.CountryRepository;
import com.example.demo.repository.SportRepository;
import com.example.demo.repository.TeamRepository;
import io.leangen.graphql.annotations.GraphQLQuery;
import io.leangen.graphql.spqr.spring.annotations.GraphQLApi;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@GraphQLApi
@RequiredArgsConstructor
public class AllService {

    private final CountryRepository countryRepository;
    private final SportRepository sportRepository;
    private final TeamRepository teamRepository;

    @GraphQLQuery(name = "getSports")
    public List<Sport> getSports() {
        return sportRepository.findAll();
    }

    @GraphQLQuery(name = "getSportDetails")
    public Sport getSportDetails(Long id) {
        return sportRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    @GraphQLQuery(name = "getTeams")
    public List<Team> getTeams() {
        return teamRepository.findAll();
    }

    @GraphQLQuery(name = "getTeamDetails")
    public Team getTeamDetails(Long id) {
        return teamRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    @GraphQLQuery(name = "getTeamByCountryName")
    public List<Team> getTeamByCountryName(String name) {
        return teamRepository.findAllByCountry_Name(name);
    }

}
