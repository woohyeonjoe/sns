package com.project.sns.util;

import java.util.Objects;
import java.util.Optional;

public class ClassUtils {

    public static <T> Optional<T> getSafeCaseInstance(Object o, Class<T> clazz) {
        return clazz != null && clazz.isInstance(o) ? Optional.of(clazz.cast(o)) : Optional.empty();
    }

}
