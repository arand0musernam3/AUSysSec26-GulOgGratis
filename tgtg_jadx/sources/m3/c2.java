package m3;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c2 implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q1.f0 f29255a = new q1.f0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q1.o0 f29256b = new q1.o0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f29257c;

    public c2(Object obj) {
        this.f29257c = obj;
    }

    public final void a(b5.r2 r2Var, g0.c cVar) {
        Exception exc;
        q1.f0 f0Var = this.f29255a;
        int i11 = f0Var.f35790b;
        q1.o0 o0Var = new q1.o0();
        int i12 = 0;
        int i13 = 0;
        while (true) {
            q1.o0 o0Var2 = this.f29256b;
            if (i12 >= i11) {
                if (i13 != o0Var2.f35722b) {
                    v.a("Applier operation size mismatch");
                }
                o0Var2.j();
                f0Var.f35790b = 0;
                r2Var.o();
                return;
            }
            int i14 = i12 + 1;
            try {
                try {
                    switch (f0Var.a(i12)) {
                        case 0:
                            r2Var.j();
                            i12 = i14;
                            break;
                        case 1:
                            int i15 = i13 + 1;
                            r2Var.d(o0Var2.b(i13));
                            i13 = i15;
                            i12 = i14;
                            break;
                        case 2:
                            int i16 = i12 + 2;
                            i12 += 3;
                            r2Var.h(f0Var.a(i14), f0Var.a(i16));
                            break;
                        case 3:
                            int i17 = i12 + 2;
                            try {
                                int i18 = i12 + 3;
                                try {
                                    i12 += 4;
                                    r2Var.g(f0Var.a(i14), f0Var.a(i17), f0Var.a(i18));
                                } catch (Exception e5) {
                                    exc = e5;
                                    i12 = i18;
                                }
                            } catch (Exception e11) {
                                exc = e11;
                                i12 = i17;
                            }
                            break;
                        case 4:
                            r2Var.a();
                            i12 = i14;
                            break;
                        case 5:
                            i12 += 2;
                            int i19 = i13 + 1;
                            r2Var.c(f0Var.a(i14), o0Var2.b(i13));
                            i13 = i19;
                            break;
                        case 6:
                            i12 += 2;
                            try {
                                f0Var.a(i14);
                                int i21 = i13 + 1;
                                i13 = i21;
                            } catch (Exception e12) {
                                exc = e12;
                            }
                            break;
                        case 7:
                            int i22 = i13 + 1;
                            Object objB = o0Var2.b(i13);
                            objB.getClass();
                            i13 += 2;
                            r2Var.l(o0Var2.b(i22), (Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(objB, 2));
                            i12 = i14;
                            break;
                        case 8:
                            Object obj = r2Var.f5961c;
                            if (obj instanceof j) {
                                j jVar = (j) obj;
                                if (((o3.e) cVar.f18003f).j(jVar)) {
                                    jVar.b();
                                }
                            }
                            o0Var.g(obj);
                            r2Var.f();
                            i12 = i14;
                            break;
                        default:
                            i12 = i14;
                            break;
                    }
                } catch (Exception e13) {
                    exc = e13;
                    i12 = i14;
                }
            } catch (Throwable th2) {
                r2Var.o();
                throw th2;
            }
            exc = e12;
            throw new l(o0Var2, o0Var, f0Var, i12 - 1, exc);
        }
    }

    @Override // m3.c
    public final void c(int i11, Object obj) {
        q1.f0 f0Var = this.f29255a;
        f0Var.c(5);
        f0Var.c(i11);
        this.f29256b.g(obj);
    }

    @Override // m3.c
    public final void d(Object obj) {
        this.f29255a.c(1);
        this.f29256b.g(obj);
    }

    @Override // m3.c
    public final void f() {
        this.f29255a.c(8);
    }

    @Override // m3.c
    public final void g(int i11, int i12, int i13) {
        q1.f0 f0Var = this.f29255a;
        f0Var.c(3);
        f0Var.c(i11);
        f0Var.c(i12);
        f0Var.c(i13);
    }

    @Override // m3.c
    public final void h(int i11, int i12) {
        q1.f0 f0Var = this.f29255a;
        f0Var.c(2);
        f0Var.c(i11);
        f0Var.c(i12);
    }

    @Override // m3.c
    public final void j() {
        this.f29255a.c(0);
    }

    @Override // m3.c
    public final void l(Object obj, Function2 function2) {
        this.f29255a.c(7);
        q1.o0 o0Var = this.f29256b;
        o0Var.g(function2);
        o0Var.g(obj);
    }

    @Override // m3.c
    public final void n(int i11, Object obj) {
        q1.f0 f0Var = this.f29255a;
        f0Var.c(6);
        f0Var.c(i11);
        this.f29256b.g(obj);
    }

    @Override // m3.c
    public final Object p() {
        return this.f29257c;
    }
}
