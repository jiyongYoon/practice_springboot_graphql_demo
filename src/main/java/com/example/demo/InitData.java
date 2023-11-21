package com.example.demo;

import com.example.demo.domain.Country;
import com.example.demo.domain.Sport;
import com.example.demo.domain.Team;
import com.example.demo.repository.CountryRepository;
import com.example.demo.repository.SportRepository;
import com.example.demo.repository.TeamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@RequiredArgsConstructor
public class InitData implements ApplicationRunner {

    private final TeamRepository teamRepository;
    private final SportRepository sportRepository;
    private final CountryRepository countryRepository;


    @Override
    public void run(ApplicationArguments args) throws Exception {
        Country korea = Country.builder().name("한국").build();
        Country uk = Country.builder().name("영국").build();
        Country us = Country.builder().name("미국").build();
        countryRepository.saveAll(Arrays.asList(korea, uk, us));

        Sport football = Sport.builder().name("축구").build();
        Sport basketball = Sport.builder().name("농구").build();
        sportRepository.saveAll(Arrays.asList(football, basketball));

        Team tot = Team.builder().name("토트넘").sport(football).country(uk).build();
        Team manu = Team.builder().name("맨유").sport(football).country(uk).build();
        Team chel = Team.builder().name("첼시").sport(football).country(uk).build();
        Team gs = Team.builder().name("골든스테이츠").sport(basketball).country(us).build();
        Team sk = Team.builder().name("sk나이츠").sport(basketball).country(korea).build();
        teamRepository.saveAll(Arrays.asList(tot, manu, chel, gs, sk));
    }
}
