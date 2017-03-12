package uriolus.com.mqttclient.view;

import uriolus.com.mqttclient.core.vista.Vista;

/**
 * Created by oriolfernandez on 5/3/17.
 */

public interface MainView extends Vista {


   void subscribe(String topic);
  void sendMessage(String message);
  void receiveMessage(String message);
}
