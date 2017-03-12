package uriolus.com.mqttclient.dagger;

import dagger.Component;
import javax.inject.Singleton;

/**
 * Created by oriolfernandez on 12/3/17.
 */
@Singleton
@Component(modules={ApplicationModule.class})
public interface ApplicationComponent {

  //Sub components
   ActivityComponent activityComponent();
}
