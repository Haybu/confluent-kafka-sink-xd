package com.jupital.streams.sink.kafka;

import org.springframework.integration.x.kafka.KafkaProducerOptionsMixin;
import org.springframework.integration.x.kafka.KafkaSinkModuleOptionsMetadata;
import org.springframework.xd.module.options.spi.Mixin;
import org.springframework.xd.module.options.spi.ModuleOption;

/**
 * Created by hmohamed on 9/5/15.
 */
@Mixin({KafkaProducerOptionsMixin.class})
public class ConfluentKafkaSinkModuleOptionsMetadata extends KafkaSinkModuleOptionsMetadata {

    private String registryUrl = "http://localhost:8081";
    private boolean autoCommit = false;

    public boolean isAutoCommit() {
        return autoCommit;
    }

    @ModuleOption("is auto commit")
    public void setAutoCommit(boolean _autoCommit) {
        this.autoCommit = _autoCommit;
    }

    public String getRegistryUrl() {
        return registryUrl;
    }

    @ModuleOption(value = "avro schema registry url", defaultValue = "http://localhost:8081")
    public void setRegistryUrl(String _registryUrl) {
        this.registryUrl = _registryUrl;
    }
}
