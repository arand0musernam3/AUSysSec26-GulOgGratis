package v2;

import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;
import m3.k1;
import m5.k0;
import m5.t0;
import z3.v;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ub.a f41935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f41936b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k1 f41938d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k1 f41937c = m3.i.w(Boolean.FALSE);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t10.c f41939e = new t10.c(this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o3.e f41940f = new o3.e(new w2.f[16], 0);

    public h(String str, long j9, ub.a aVar) {
        this.f41935a = aVar;
        this.f41936b = new a(new b(str, k0.d(str.length(), j9), null, null, null, null, 60), null, null, 14);
        this.f41938d = m3.i.w(new b(str, j9, null, null, null, null, 60));
    }

    public static final void a(h hVar, boolean z11, y2.c cVar) {
        b bVarB = hVar.b();
        if (((o3.e) hVar.f41936b.a().f40981b).f31832c == 0 && t0.c(bVarB.f41929d, hVar.f41936b.f41922d)) {
            if (Intrinsics.areEqual(bVarB.f41930e, hVar.f41936b.f41923e) && Intrinsics.areEqual(bVarB.f41931f, hVar.f41936b.f41925g) && Intrinsics.areEqual(bVarB.f41926a, hVar.f41936b.f41924f)) {
                return;
            }
            b bVarB2 = hVar.b();
            String string = hVar.f41936b.f41920b.toString();
            a aVar = hVar.f41936b;
            long j9 = aVar.f41922d;
            t0 t0Var = aVar.f41923e;
            hVar.f(bVarB2, new b(string, j9, t0Var, aVar.f41925g, k.a(t0Var, aVar.f41924f), null, 32), z11);
            return;
        }
        boolean z12 = false;
        boolean z13 = ((o3.e) hVar.f41936b.a().f40981b).f31832c != 0;
        String string2 = hVar.f41936b.f41920b.toString();
        a aVar2 = hVar.f41936b;
        long j11 = aVar2.f41922d;
        t0 t0Var2 = aVar2.f41923e;
        b bVar = new b(string2, j11, t0Var2, aVar2.f41925g, k.a(t0Var2, aVar2.f41924f), null, 32);
        if (z13 && z11) {
            z12 = true;
        }
        hVar.f(bVarB, bVar, z12);
        hVar.c(bVarB, bVar, hVar.f41936b.a(), cVar);
    }

    public final b b() {
        return (b) this.f41938d.getValue();
    }

    public final void c(b bVar, b bVar2, ub.a aVar, y2.c cVar) {
        int i11 = g.$EnumSwitchMapping$0[cVar.ordinal()];
        ub.a aVar2 = this.f41935a;
        if (i11 == 1) {
            ((k1) aVar2.f40982c).setValue(null);
            y2.e eVar = (y2.e) aVar2.f40981b;
            eVar.f45385b.clear();
            eVar.f45386c.clear();
            return;
        }
        if (i11 == 2) {
            k.d(aVar2, bVar, bVar2, aVar, true);
        } else if (i11 == 3) {
            k.d(aVar2, bVar, bVar2, aVar, false);
        } else {
            e40.a.f();
        }
    }

    public final void d(boolean z11) {
        this.f41937c.setValue(Boolean.valueOf(z11));
    }

    public final void e(a aVar, boolean z11, boolean z12) {
        b bVarG = a.g(this.f41936b, 0L, null, 15);
        if (z11) {
            this.f41936b = new a(new b(aVar.f41920b.toString(), aVar.f41922d, null, null, null, null, 60), null, null, 14);
        } else if (z12) {
            a aVar2 = this.f41936b;
            long j9 = aVar.f41922d;
            int i11 = t0.f29649c;
            aVar2.f(k0.b((int) (j9 >> 32), (int) (j9 & 4294967295L)));
        }
        if (z11 || z12 || !Intrinsics.areEqual(bVarG.f41930e, aVar.f41923e)) {
            this.f41936b.e(null);
        }
        f(bVarG, a.g(this.f41936b, 0L, null, 15), true);
    }

    public final void f(b bVar, b bVar2, boolean z11) {
        this.f41938d.setValue(bVar2);
        d(false);
        o3.e eVar = this.f41940f;
        Object[] objArr = eVar.f31830a;
        int i11 = eVar.f31832c;
        for (int i12 = 0; i12 < i11; i12++) {
            w2.f fVar = (w2.f) objArr[i12];
            boolean z12 = (!z11 || y.i(bVar.f41928c, bVar2) || bVar.f41930e == null) ? false : true;
            ub.a aVar = fVar.f42888a;
            long j9 = bVar.f41929d;
            t0 t0Var = bVar.f41930e;
            long j11 = bVar2.f41929d;
            t0 t0Var2 = bVar2.f41930e;
            if (z12) {
                aVar.H().restartInput((View) aVar.f40981b);
            } else if (!t0.c(j9, j11) || !Intrinsics.areEqual(t0Var, t0Var2)) {
                aVar.H().updateSelection((View) aVar.f40981b, t0.g(j11), t0.f(j11), t0Var2 != null ? t0.g(t0Var2.f29650a) : -1, t0Var2 != null ? t0.f(t0Var2.f29650a) : -1);
            }
        }
    }

    public final String toString() {
        z3.g gVarC = v.c();
        Function1 function1E = gVarC != null ? gVarC.e() : null;
        z3.g gVarD = v.d(gVarC);
        try {
            return "TextFieldState(selection=" + ((Object) t0.i(b().f41929d)) + ", text=\"" + ((Object) b().f41928c) + "\")";
        } finally {
            v.f(gVarC, gVarD, function1E);
        }
    }
}
