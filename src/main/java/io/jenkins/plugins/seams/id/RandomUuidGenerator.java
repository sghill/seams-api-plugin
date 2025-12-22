package io.jenkins.plugins.seams.id;

import java.util.UUID;
import org.jspecify.annotations.NonNull;

class RandomUuidGenerator implements IdGenerator<UUID> {
    public @NonNull UUID generate() {
        return UUID.randomUUID();
    }
}
