package com.ll.domain.wisesaying.service;

import com.ll.domain.wisesaying.entity.WiseSaying;
import com.ll.domain.wisesaying.repository.WiseSayingRepository;

import java.util.List;

public class WiseSayingService {

    private WiseSayingRepository wiseSayingRepository;

    public WiseSayingService() {
        this.wiseSayingRepository = new WiseSayingRepository();
    }

    public WiseSaying add(String content, String author) {
        WiseSaying wiseSaying = new WiseSaying(0, content, author);
        return wiseSayingRepository.save(wiseSaying);
    }

    public List<WiseSaying> findAll() {
        return wiseSayingRepository.findAll();
    }

}
