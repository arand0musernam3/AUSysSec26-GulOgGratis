package h7;

import android.R;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class e0 implements zc.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f21533a;

    public /* synthetic */ e0(View view) {
        this.f21533a = view;
    }

    @Override // zc.e
    public void a() {
        boolean z11;
        zc.u uVarC = ed.k.c(this.f21533a);
        synchronized (uVarC) {
            z11 = this != uVarC.f47523b;
        }
        if (z11) {
            return;
        }
        ed.k.c(this.f21533a).a();
    }

    public void b() {
        View view = this.f21533a;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public void c() {
        View viewFindViewById;
        View view = this.f21533a;
        if (view == null) {
            return;
        }
        if (view.isInEditMode() || view.onCheckIsTextEditor()) {
            view.requestFocus();
            viewFindViewById = view;
        } else {
            viewFindViewById = view.getRootView().findFocus();
        }
        if (viewFindViewById == null) {
            viewFindViewById = view.getRootView().findViewById(R.id.content);
        }
        if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
            return;
        }
        viewFindViewById.post(new com.braze.ui.inappmessage.views.c(3, viewFindViewById));
    }
}
