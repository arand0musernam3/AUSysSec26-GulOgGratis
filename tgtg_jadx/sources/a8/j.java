package a8;

import androidx.lifecycle.d0;
import androidx.lifecycle.q0;
import androidx.lifecycle.w;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f978a;

    public j(k kVar) {
        this.f978a = new WeakReference(kVar);
    }

    @q0(w.ON_START)
    public void onStart() {
        k kVar = (k) this.f978a.get();
        if (kVar != null) {
            kVar.X();
        }
    }
}
