/*
 * Copyright (C) 2015 Pau Picas Sans <pau.picas@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package uriolus.com.mqttclient.core.vista;

import android.support.annotation.Nullable;
import android.view.View;
import uriolus.com.mqttclient.core.CoreException;

public interface Vista {
    /**
     * This is a general method used for showing some kind of progress during a background task. For example, this
     * method should show a progress bar and/or disable buttons before some background work starts.
     */
    void showProgress();

    /**
     * This is a general method used for hiding progress information after a background task finishes.
     */
    void hideProgress();

    /**
     *
     * @param stringId
     * @param actionStringId
     * @param onClickListener
     */
    void showMessage(int stringId, @Nullable Integer actionStringId, @Nullable String message,
        @Nullable View.OnClickListener onClickListener);
    void showExceptionError(CoreException e);
    void setTitle(String title);

}
