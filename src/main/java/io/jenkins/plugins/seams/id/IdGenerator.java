package io.jenkins.plugins.seams.id;

import org.jspecify.annotations.NonNull;

public interface IdGenerator<T> {
    @NonNull
    T generate();
}
