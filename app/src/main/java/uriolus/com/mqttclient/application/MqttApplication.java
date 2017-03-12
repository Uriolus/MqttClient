package uriolus.com.mqttclient.application;

import android.app.Application;
import uriolus.com.mqttclient.dagger.ApplicationComponent;
import uriolus.com.mqttclient.dagger.ApplicationModule;
import uriolus.com.mqttclient.dagger.DaggerApplicationComponent;

/**
 * Created by oriolfernandez on 5/3/17.
 */

public class MqttApplication extends Application {
  private ApplicationComponent applicationComponent;

  @Override public void onCreate() {
    super.onCreate();
     applicationComponent = DaggerApplicationComponent.builder().
         applicationModule(new ApplicationModule(this))
         .build();
  }

  public ApplicationComponent getApplicationComponent() {
    return applicationComponent;
  }
}
