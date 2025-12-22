package io.jenkins.plugins.seams.id;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.google.inject.Injector;
import jakarta.inject.Inject;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.jvnet.hudson.test.JenkinsRule;
import org.jvnet.hudson.test.junit.jupiter.WithJenkins;

@WithJenkins
class RandomUuidGeneratorJenkinsTest {
    @Inject
    private IdGenerator<UUID> idGenerator;

    @Test
    void shouldResolveIdGeneratorFromInjector(JenkinsRule j) {
        Injector injector = j.jenkins.getInjector();
        injector.injectMembers(this);
        assertNotNull(injector);

        UUID one = idGenerator.generate();
        UUID two = idGenerator.generate();

        assertNotEquals(one.toString(), two.toString());
    }
}
