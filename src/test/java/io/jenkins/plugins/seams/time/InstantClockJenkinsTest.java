package io.jenkins.plugins.seams.time;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.google.inject.Injector;
import jakarta.inject.Inject;
import java.time.Instant;
import org.junit.jupiter.api.Test;
import org.jvnet.hudson.test.JenkinsRule;
import org.jvnet.hudson.test.junit.jupiter.WithJenkins;

@WithJenkins
class InstantClockJenkinsTest {
    @Inject
    private Clock<Instant> clock;

    @Test
    void shouldResolveClockFromInjector(JenkinsRule j) {
        Injector injector = j.jenkins.getInjector();
        injector.injectMembers(this);
        assertNotNull(injector);

        Instant one = clock.now();
        Instant two = clock.now();

        assertNotEquals(one, two);
    }
}
