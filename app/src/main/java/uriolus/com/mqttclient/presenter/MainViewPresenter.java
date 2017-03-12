package uriolus.com.mqttclient.presenter;

import uriolus.com.mqttclient.core.vista.Presenter;
import javax.inject.Inject;
import uriolus.com.mqttclient.mqttclient.MqttClient;
import uriolus.com.mqttclient.view.MainView;

/**
 * Created by oriolfernandez on 5/3/17.
 */

public class MainViewPresenter extends Presenter<MainView> {

  MqttClient mqttClient;
  @Inject
  public MainViewPresenter(MqttClient mqttClient) {
    this.mqttClient=mqttClient;
  }

  public MqttClient getMqttClient() {
    return mqttClient;
  }

  @Override public void onStart(MainView vista) {

  }
}
