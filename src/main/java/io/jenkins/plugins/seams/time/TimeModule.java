package io.jenkins.plugins.seams.time;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import hudson.Extension;
import jakarta.inject.Singleton;
import java.time.Instant;

@Extension
public class TimeModule extends AbstractModule {

    @Provides
    @Singleton
    public Clock<Instant> instantClock() {
        return new InstantClock();
    }
}
