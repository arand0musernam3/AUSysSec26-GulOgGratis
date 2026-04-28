package l20;

import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import com.google.android.material.search.SearchView;
import h7.h2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SearchView f26803b;

    public /* synthetic */ f(SearchView searchView, int i11) {
        this.f26802a = i11;
        this.f26803b = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WindowInsetsControllerCompat windowInsetsControllerCompatB;
        WindowInsetsControllerCompat windowInsetsControllerCompatB2;
        switch (this.f26802a) {
            case 0:
                SearchView searchView = this.f26803b;
                EditText editText = searchView.f12565k;
                if (editText.requestFocus()) {
                    editText.sendAccessibilityEvent(8);
                }
                if (searchView.A && (windowInsetsControllerCompatB = ViewCompat.B(editText)) != null) {
                    windowInsetsControllerCompatB.e(h2.c());
                } else {
                    ((InputMethodManager) editText.getContext().getSystemService(InputMethodManager.class)).showSoftInput(editText, 1);
                }
                break;
            case 1:
                this.f26803b.l();
                break;
            case 2:
                SearchView searchView2 = this.f26803b;
                EditText editText2 = searchView2.f12565k;
                editText2.clearFocus();
                if (searchView2.A && (windowInsetsControllerCompatB2 = ViewCompat.B(editText2)) != null) {
                    windowInsetsControllerCompatB2.a(h2.c());
                } else {
                    InputMethodManager inputMethodManager = (InputMethodManager) editText2.getContext().getSystemService(InputMethodManager.class);
                    if (inputMethodManager != null) {
                        inputMethodManager.hideSoftInputFromWindow(editText2.getWindowToken(), 0);
                    }
                }
                break;
            default:
                this.f26803b.j();
                break;
        }
    }
}
