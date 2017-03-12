package uriolus.com.mqttclient.dagger;

import dagger.Subcomponent;
import uriolus.com.mqttclient.core.dagger.ActivityScope;
import uriolus.com.mqttclient.view.MainActivity;

/**
 * Created by oriolfernandez on 5/3/17.
 */
@ActivityScope
@Subcomponent(modules = { ActivityModule.class})
public interface ActivityComponent {
  void inject(MainActivity mainActivity);

}
