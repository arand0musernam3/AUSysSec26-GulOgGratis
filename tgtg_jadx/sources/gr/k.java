package gr;

import a3.f3;
import androidx.lifecycle.c1;
import androidx.lifecycle.l1;
import androidx.lifecycle.m1;
import androidx.lifecycle.o0;
import ao.g3;
import ft.s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import v80.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgr/k;", "Landroidx/lifecycle/l1;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k extends l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c1 f20818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g3 f20819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cv.b f20820c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s f20821d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final er.a f20822e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f20823f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f20824g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o0 f20825h;

    public k(c1 c1Var, g3 g3Var, cv.b bVar, s sVar, er.a aVar, String str, String str2) {
        c1Var.getClass();
        g3Var.getClass();
        bVar.getClass();
        sVar.getClass();
        aVar.getClass();
        str2.getClass();
        this.f20818a = c1Var;
        this.f20819b = g3Var;
        this.f20820c = bVar;
        this.f20821d = sVar;
        this.f20822e = aVar;
        this.f20823f = str;
        this.f20824g = str2;
        o0 o0Var = new o0();
        this.f20825h = o0Var;
        o0Var.k(Boolean.valueOf(sVar.a()));
    }

    public final void a() {
        f0.B(m1.d(this), null, null, new j(this, null, 0), 3);
    }

    public final boolean b() {
        return Intrinsics.areEqual((Boolean) this.f20818a.a("IS_FROM_APP_START"), Boolean.TRUE);
    }

    public final void c(boolean z11) {
        s sVar = this.f20821d;
        sVar.getClass();
        f0.E(kotlin.coroutines.g.f26549a, new f3(sVar, z11, null, 4));
        this.f20825h.k(Boolean.valueOf(z11));
    }

    public final void d() {
        cv.b bVar = this.f20820c;
        bVar.g();
        if (Intrinsics.areEqual((Boolean) this.f20818a.a("IS_LOGGED_IN"), Boolean.TRUE)) {
            g3 g3Var = this.f20819b;
            bVar.a(g3Var.m(), g3Var.n());
        }
        f0.B(m1.d(this), null, null, new j(this, null, 2), 3);
    }
}
