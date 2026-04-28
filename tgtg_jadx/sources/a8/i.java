package a8;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.o0;
import androidx.lifecycle.p0;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference f977b = null;

    public i(k kVar, ReferenceQueue referenceQueue) {
        this.f976a = new l(kVar, this, referenceQueue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.p0
    public final void a(Object obj) {
        l lVar = this.f976a;
        k kVar = (k) lVar.get();
        if (kVar == null) {
            lVar.a();
        }
        if (kVar != null) {
            o0 o0Var = lVar.f995b;
            if (kVar.f993n || !kVar.c0(0, o0Var)) {
                return;
            }
            kVar.e0();
        }
    }

    public final void b(LifecycleOwner lifecycleOwner) {
        WeakReference weakReference = this.f977b;
        LifecycleOwner lifecycleOwner2 = weakReference == null ? null : (LifecycleOwner) weakReference.get();
        o0 o0Var = this.f976a.f995b;
        if (o0Var != null) {
            if (lifecycleOwner2 != null) {
                o0Var.j(this);
            }
            if (lifecycleOwner != null) {
                o0Var.e(lifecycleOwner, this);
            }
        }
        if (lifecycleOwner != null) {
            this.f977b = new WeakReference(lifecycleOwner);
        }
    }
}
