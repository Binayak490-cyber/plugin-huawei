package io.kestra.plugin.huawei.dms.kafka;

import io.kestra.core.models.property.Property;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class ConsumeTest {

    @Test
    void stopAndKillDoNotThrowWhenNotRunning() {
        var task = Consume.builder()
            .topic(Property.ofValue("topic"))
            .groupId(Property.ofValue("group"))
            .maxRecords(Property.ofValue(10))
            .build();

        assertDoesNotThrow(task::stop);
        assertDoesNotThrow(task::kill);
    }
}
