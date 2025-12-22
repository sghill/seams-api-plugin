package io.jenkins.plugins.seams.id;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.UUID;
import org.junit.jupiter.api.Test;

class RandomUuidGeneratorTest {
    @Test
    void shouldReturnDifferentUuids() {
        RandomUuidGenerator generator = new RandomUuidGenerator();

        UUID one = generator.generate();
        UUID two = generator.generate();

        assertNotEquals(one.toString(), two.toString());
    }
}
