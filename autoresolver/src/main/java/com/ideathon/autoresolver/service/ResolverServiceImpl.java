package com.ideathon.autoresolver.service;

import com.ideathon.autoresolver.entity.Resolver;
import com.ideathon.autoresolver.repository.ResolverRepository;

public class ResolverServiceImpl implements  ResolverService{

    ResolverRepository resolverRepository;
    @Override
    public Resolver addResolverEntry(Resolver resolver) {
        resolver.setId("1");
        return resolverRepository.save(resolver);
    }
}
