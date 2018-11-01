package demo.custom.annotations;

import org.checkerframework.framework.qual.*;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@SubtypeOf(Unencrypted.class)
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
public @interface Encrypted {
}