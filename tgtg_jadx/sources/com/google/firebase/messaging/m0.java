package com.google.firebase.messaging;

import android.os.Binder;
import android.os.Process;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 extends Binder {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final se.d f12848g;

    public m0(se.d dVar) {
        this.f12848g = dVar;
    }

    public final void a(n0 n0Var) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        f.access$000((f) this.f12848g.f39013b, n0Var.f12852a).c(new l0.b(0), new w.z(n0Var, 22));
    }
}
