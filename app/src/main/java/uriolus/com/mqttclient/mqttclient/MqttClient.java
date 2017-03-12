package uriolus.com.mqttclient.mqttclient;

import javax.inject.Inject;
import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttMessage;

/**
 * Created by oriolfernandez on 5/3/17.
 */

public class MqttClient implements MqttCallback
{
  @Inject
  public MqttClient() {
  }

  @Override public void connectionLost(Throwable cause) {

  }

  @Override public void messageArrived(String topic, MqttMessage message) throws Exception {

  }

  @Override public void deliveryComplete(IMqttDeliveryToken token) {

  }
}
