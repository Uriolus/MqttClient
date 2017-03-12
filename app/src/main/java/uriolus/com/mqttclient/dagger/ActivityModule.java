package uriolus.com.mqttclient.dagger;

import dagger.Module;
import dagger.Provides;
import uriolus.com.mqttclient.core.dagger.ActivityScope;
import uriolus.com.mqttclient.mqttclient.MqttClient;
import uriolus.com.mqttclient.presenter.MainViewPresenter;

/**
 * Created by oriolfernandez on 12/3/17.
 * Providers for activity scope
 */
@Module
public class ActivityModule {

  @Provides
  @ActivityScope
  MainViewPresenter providesMainViewPresenter(MqttClient mqttClient){
    return new MainViewPresenter(mqttClient);
  }

}
