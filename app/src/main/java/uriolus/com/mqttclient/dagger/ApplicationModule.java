package uriolus.com.mqttclient.dagger;

import android.app.Application;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/**
 * Created by oriolfernandez on 5/3/17.
 */

@Module public class ApplicationModule {
  Application application;

  public ApplicationModule(Application application) {
    this.application = application;
  }

  @Provides @Singleton Application providesApplication() {
    return application;
  }
}
