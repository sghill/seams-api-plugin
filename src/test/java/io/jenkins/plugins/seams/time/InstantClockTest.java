package io.jenkins.plugins.seams.time;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.time.Instant;
import org.junit.jupiter.api.Test;

class InstantClockTest {
    @Test
    void shouldReturnDifferentInstants() throws InterruptedException {
        InstantClock clock = new InstantClock();

        Instant one = clock.now();
        Thread.sleep(50);
        Instant two = clock.now();

        assertNotEquals(one, two);
    }
}
