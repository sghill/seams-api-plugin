package io.jenkins.plugins.seams.time;

import java.time.Instant;
import org.jspecify.annotations.NonNull;

class InstantClock implements Clock<Instant> {
    public @NonNull Instant now() {
        return Instant.now();
    }
}
