package org.politics.laws;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Protects a field from being return a null value
 *
 * @author Luis Enco
 */
@Documented
@Retention(value=RUNTIME)
@Target(value={FIELD})
public @interface NonNull {
}
