package ag;

import a3.b2;
import androidx.lifecycle.LifecycleOwner;
import ao.l0;
import ao.m0;
import java.util.Timer;
import v80.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements androidx.lifecycle.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ao.h f1286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m0 f1287b;

    public a(ao.h hVar, m0 m0Var) {
        hVar.getClass();
        m0Var.getClass();
        this.f1286a = hVar;
        this.f1287b = m0Var;
    }

    @Override // androidx.lifecycle.h
    public final void onStart(LifecycleOwner lifecycleOwner) {
        lifecycleOwner.getClass();
        ao.h hVar = this.f1286a;
        if (!hVar.f4292n) {
            f0.B(hVar.f4281b, null, null, new b2(hVar, null, 3), 3);
        }
        hVar.f4292n = false;
        m0 m0Var = this.f1287b;
        m0Var.getClass();
        Timer timer = new Timer("postImpressions", false);
        timer.scheduleAtFixedRate(new l0(m0Var, 0), 5000L, 20000L);
        m0Var.f4359j = timer;
    }

    @Override // androidx.lifecycle.h
    public final void onStop(LifecycleOwner lifecycleOwner) {
        m0 m0Var = this.f1287b;
        Timer timer = m0Var.f4359j;
        if (timer != null) {
            timer.cancel();
        }
        m0Var.e();
    }
}
