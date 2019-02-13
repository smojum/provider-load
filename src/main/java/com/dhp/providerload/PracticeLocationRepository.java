package com.dhp.providerload;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;

@Component
interface PracticeLocationRepository extends ElasticsearchRepository<PracticeLocation, String> {
}
