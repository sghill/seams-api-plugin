package io.jenkins.plugins.seams.time;

import org.jspecify.annotations.NonNull;

public interface Clock<T> {
    @NonNull
    T now();
}
