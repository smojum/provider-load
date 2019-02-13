package com.dhp.providerload;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface PracticeLocationRepository extends ElasticsearchRepository<PracticeLocation, String> {
}
