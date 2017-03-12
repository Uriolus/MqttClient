package uriolus.com.mqttclient.core.dagger;

import java.lang.annotation.Retention;
import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Activity scope
 */
@Scope
@Retention(RUNTIME)
public @interface  ActivityScope {
}
