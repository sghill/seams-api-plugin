package io.jenkins.plugins.seams.id;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import hudson.Extension;
import jakarta.inject.Singleton;
import java.util.UUID;

@Extension
public class IdModule extends AbstractModule {

    @Provides
    @Singleton
    public IdGenerator<UUID> randomUuidGenerator() {
        return new RandomUuidGenerator();
    }
}
