package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class w implements androidx.lifecycle.p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f3365a;

    public w(y yVar) {
        this.f3365a = yVar;
    }

    @Override // androidx.lifecycle.p0
    public final void a(Object obj) {
        if (((LifecycleOwner) obj) != null) {
            y yVar = this.f3365a;
            if (yVar.mShowsDialog) {
                View viewRequireView = yVar.requireView();
                if (viewRequireView.getParent() != null) {
                    com.braze.h2.b("DialogFragment can not be attached to a container view");
                    return;
                }
                if (yVar.mDialog != null) {
                    if (FragmentManager.L(3)) {
                        Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + yVar.mDialog);
                    }
                    yVar.mDialog.setContentView(viewRequireView);
                }
            }
        }
    }
}
