package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class t5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b7 f11865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b7 f11866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a8.h f11867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i5 f11868d;

    public t5() {
        b7 b7Var = new b7();
        this.f11865a = b7Var;
        this.f11866b = ((b7) b7Var.f11282b).d();
        this.f11867c = new a8.h(8);
        this.f11868d = new i5(10);
        a aVar = new a(this, 1);
        s5 s5Var = (s5) b7Var.f11285e;
        ((HashMap) s5Var.f11844b).put("internal.registerCallback", aVar);
        ((HashMap) s5Var.f11844b).put("internal.eventLogger", new a(this, 0));
    }

    public final boolean a(b bVar) throws zzd {
        a8.h hVar = this.f11867c;
        try {
            hVar.f973b = bVar;
            hVar.f974c = bVar.clone();
            ((ArrayList) hVar.f975d).clear();
            ((b7) this.f11865a.f11284d).f("runtime.counter", new i3(Double.valueOf(0.0d)));
            this.f11868d.h(this.f11866b.d(), hVar);
            if (((b) hVar.f974c).equals((b) hVar.f973b)) {
                return !((ArrayList) hVar.f975d).isEmpty();
            }
            return true;
        } catch (Throwable th2) {
            throw new zzd(th2);
        }
    }

    public final void b(o9 o9Var) throws zzd {
        b4 b4Var;
        try {
            b7 b7Var = this.f11865a;
            this.f11866b = ((b7) b7Var.f11282b).d();
            if (b7Var.b(this.f11866b, (p9[]) o9Var.t().toArray(new p9[0])) instanceof q2) {
                throw new IllegalStateException("Program loading failed");
            }
            for (n9 n9Var : o9Var.u().t()) {
                List listU = n9Var.u();
                String strT = n9Var.t();
                Iterator it = listU.iterator();
                while (it.hasNext()) {
                    c5 c5VarB = b7Var.b(this.f11866b, (p9) it.next());
                    if (!(c5VarB instanceof z4)) {
                        throw new IllegalArgumentException("Invalid rule definition");
                    }
                    b7 b7Var2 = this.f11866b;
                    if (b7Var2.e(strT)) {
                        c5 c5VarH = b7Var2.h(strT);
                        if (!(c5VarH instanceof b4)) {
                            throw new IllegalStateException("Invalid function name: ".concat(String.valueOf(strT)));
                        }
                        b4Var = (b4) c5VarH;
                    } else {
                        b4Var = null;
                    }
                    if (b4Var == null) {
                        throw new IllegalStateException("Rule function is undefined: ".concat(String.valueOf(strT)));
                    }
                    b4Var.a(this.f11866b, Collections.singletonList(c5VarB));
                }
            }
        } catch (Throwable th2) {
            throw new zzd(th2);
        }
    }
}
