package com.food.ordering.system.domain.valueobject;

import java.util.Objects;

public abstract class BaseId<T> {

    private final T value;

    public BaseId(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        BaseId<?> baseId = (BaseId<?>) object;
        return Objects.equals(value, baseId.value);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }
}
