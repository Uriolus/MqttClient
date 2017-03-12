package uriolus.com.mqttclient.view;

import android.app.Application;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import javax.inject.Inject;
import uriolus.com.mqttclient.R;
import uriolus.com.mqttclient.application.MqttApplication;
import uriolus.com.mqttclient.core.CoreException;
import uriolus.com.mqttclient.presenter.MainViewPresenter;

public class MainActivity extends AppCompatActivity implements MainView {
  @Inject MainViewPresenter presenter;
  @Inject Application application;
  private Toolbar toolbar;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    findViews();
    // assign singleton instances to fields
    // We need to cast to `My Application class` in order to get the right method
    ((MqttApplication) getApplication()).getApplicationComponent().activityComponent().inject(this);
    checkInjection();
  }

  private void checkInjection() {
    Log.d("INJECTIONT", "Presenter:" + presenter.toString());
    Log.d("INJECTIONT", "Mqttclient:" + presenter.getMqttClient().toString());
  }

  private void findViews() {
    toolbar = (Toolbar) findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);

    FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
    fab.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View view) {
        Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
            .setAction("Action", null)
            .show();
      }
    });
  }

  @Override public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.menu_main, menu);
    return true;
  }

  @Override public boolean onOptionsItemSelected(MenuItem item) {
    // Handle action bar item clicks here. The action bar will
    // automatically handle clicks on the Home/Up button, so long
    // as you specify a parent activity in AndroidManifest.xml.
    int id = item.getItemId();

    //noinspection SimplifiableIfStatement
    if (id == R.id.action_settings) {
      return true;
    }

    return super.onOptionsItemSelected(item);
  }

  @Override public void subscribe(String topic) {

  }

  @Override public void sendMessage(String message) {

  }

  @Override public void receiveMessage(String message) {

  }

  @Override public void showProgress() {

  }

  @Override public void hideProgress() {

  }

  @Override
  public void showMessage(int stringId, @Nullable Integer actionStringId, @Nullable String message,
      @Nullable View.OnClickListener onClickListener) {

  }

  @Override public void showExceptionError(CoreException e) {

  }

  @Override public void setTitle(String title) {
    toolbar.setTitle(title);
  }
}
