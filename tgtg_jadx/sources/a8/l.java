package a8;

import androidx.lifecycle.o0;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends WeakReference {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o0 f995b;

    public l(k kVar, i iVar, ReferenceQueue referenceQueue) {
        super(kVar, referenceQueue);
        this.f994a = iVar;
    }

    public final boolean a() {
        boolean z11;
        o0 o0Var = this.f995b;
        if (o0Var != null) {
            i iVar = this.f994a;
            iVar.getClass();
            o0Var.j(iVar);
            z11 = true;
        } else {
            z11 = false;
        }
        this.f995b = null;
        return z11;
    }
}
