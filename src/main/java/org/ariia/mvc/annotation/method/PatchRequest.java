package org.ariia.mvc.annotation.method;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@Target({METHOD, ANNOTATION_TYPE})
@Documented

@HttpMethod(method = RequestMethod.PATCH)
public @interface PatchRequest {
    /**
     * value of the context
     * value = "/context/a/b/c"
     *
     * @return String path
     */
    String path();

    String[] headers() default {};

    String[] produces() default {};
}
