package gy;

import android.util.Log;
import ao.p2;
import kotlin.Unit;
import u70.l;
import u70.o;
import u70.p;
import u70.q;
import u70.t;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f20919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f20920b = l.b(new defpackage.a(this, 21));

    public d(e eVar) {
        this.f20919a = eVar;
    }

    public final void a(c cVar, p2 p2Var) {
        Object pVar;
        cVar.getClass();
        d6.c cVar2 = new d6.c(this, p2Var, p2Var, cVar, 1);
        try {
            o oVar = q.f40850b;
            oy.a.f33798a.submit(new m0.l(cVar2, 7));
            pVar = Unit.f26487a;
        } catch (Throwable th2) {
            o oVar2 = q.f40850b;
            pVar = new p(th2);
        }
        Throwable thA = q.a(pVar);
        if (thA != null) {
            p2Var.invoke(my.a.f30260a);
            Log.e("FingerprintJS", "Unexpected error occurred. Feel free to create an issue on Github repository of the fingerprintjs-android library.", thA);
        }
    }
}
