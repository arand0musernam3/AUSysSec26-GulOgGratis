package cc;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.h;
import androidx.lifecycle.t0;
import app.cash.paykit.core.utils.ThreadPurpose;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LifecycleOwner f7901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f7902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f7903c;

    public e() {
        t0 t0Var = t0.f3512i;
        t0Var.getClass();
        this.f7901a = t0Var;
        this.f7902b = new ArrayList();
        this.f7903c = new Handler(Looper.getMainLooper());
    }

    @Override // androidx.lifecycle.h
    public final void onStart(LifecycleOwner lifecycleOwner) {
        lifecycleOwner.getClass();
        Iterator it = this.f7902b.iterator();
        while (it.hasNext()) {
            c cVar = (c) ((WeakReference) it.next()).get();
            if (cVar != null) {
                jb.b bVar = cVar.f7894f;
                bVar.s("CashAppPay", "onApplicationForegrounded");
                if (cVar.f7898j instanceof yb.f) {
                    cVar.d(yb.h.f45820d);
                    zz.f.D(cVar.f7895g.t(ThreadPurpose.CHECK_APPROVAL_STATUS, new a(cVar, 0)), "Could not start checkForApprovalThread.", bVar, ac.a.f1220a);
                }
            }
        }
    }

    @Override // androidx.lifecycle.h
    public final void onStop(LifecycleOwner lifecycleOwner) {
        Iterator it = this.f7902b.iterator();
        while (it.hasNext()) {
            c cVar = (c) ((WeakReference) it.next()).get();
            if (cVar != null) {
                cVar.f7894f.s("CashAppPay", "onApplicationBackgrounded");
            }
        }
    }
}
