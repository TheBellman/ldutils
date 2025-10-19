package net.parttimepolymath.utils;

import net.jcip.annotations.ThreadSafe;
import tools.jackson.databind.ObjectMapper;

import java.util.concurrent.atomic.AtomicReference;

/**
 * it's usually safest when using Jackson to build a single instance of the object mapper, and
 * it's definitely convenient to have a convenient way of getting it for tests.
 *
 * @author Robert Hook
 * @since 2025-10-19
 */
@ThreadSafe
public final class ObjectMapperFactory {
    private static AtomicReference<ObjectMapper> instance = new AtomicReference<>();

    /**
     * Default constructor, used to ensure there's an explicit constructor.
     * @throws UnsupportedOperationException when called
     */
    public ObjectMapperFactory() {
        throw new UnsupportedOperationException("ObjectMapperFactory cannot be instantiated");
    }

    /**
     * get the existing object mapper or make a new one. This is thread safe, but does
     * have the side effect that in a race condition more than one mapper might get created
     * and then discarded.
     *
     * @return a non-null object mapper.
     */
    public static ObjectMapper getObjectMapper() {
        ObjectMapper mapper = instance.get();
        if (mapper == null) {
            mapper = new ObjectMapper();
            instance.compareAndSet(null, mapper);
        }
        return instance.get();
    }
}
