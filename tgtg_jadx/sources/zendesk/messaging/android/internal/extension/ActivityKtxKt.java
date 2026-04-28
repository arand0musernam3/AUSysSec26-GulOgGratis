package zendesk.messaging.android.internal.extension;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.o0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/fragment/app/o0;", "", "hideKeyboard", "(Landroidx/fragment/app/o0;)V", "zendesk.messaging_messaging-android"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ActivityKtxKt {
    public static final void hideKeyboard(@NotNull o0 o0Var) {
        View currentFocus;
        o0Var.getClass();
        Object systemService = o0Var.getSystemService("input_method");
        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        if (inputMethodManager == null || (currentFocus = o0Var.getCurrentFocus()) == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
    }
}
