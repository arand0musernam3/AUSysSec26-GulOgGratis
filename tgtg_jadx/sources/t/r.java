package t;

import androidx.lifecycle.LifecycleOwner;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements androidx.lifecycle.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f39309a;

    public r(v vVar) {
        this.f39309a = new WeakReference(vVar);
    }

    @Override // androidx.lifecycle.h
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        WeakReference weakReference = this.f39309a;
        if (weakReference.get() != null) {
            ((v) weakReference.get()).f39314b = null;
        }
    }
}
