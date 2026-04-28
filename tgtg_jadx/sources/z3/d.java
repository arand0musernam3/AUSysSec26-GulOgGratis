package z3;

import java.util.Arrays;
import java.util.HashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import q1.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final c f46992o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f46993p;

    public d(long j9, k kVar, Function1 function1, Function1 function12, c cVar) {
        super(j9, kVar, function1, function12);
        this.f46992o = cVar;
        cVar.k();
    }

    @Override // z3.c, z3.g
    public final void c() {
        if (this.f47003c) {
            return;
        }
        super.c();
        if (this.f46993p) {
            return;
        }
        this.f46993p = true;
        this.f46992o.l();
    }

    @Override // z3.c
    public final v w() throws Throwable {
        d dVar;
        c cVar = this.f46992o;
        if (cVar.f46985m || cVar.f47003c) {
            return new h(this);
        }
        u0 u0Var = this.f46981h;
        long j9 = this.f47002b;
        HashMap mapB = u0Var != null ? l.b(cVar.g(), this, this.f46992o.d()) : null;
        Object obj = l.f47038c;
        synchronized (obj) {
            try {
                l.c(this);
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                if (u0Var == null || u0Var.f35771d == 0) {
                    dVar = this;
                    a();
                } else {
                    dVar = this;
                    v vVarZ = dVar.z(this.f46992o.g(), u0Var, mapB, this.f46992o.d());
                    if (!Intrinsics.areEqual(vVarZ, i.f47013b)) {
                        return vVarZ;
                    }
                    u0 u0VarX = dVar.f46992o.x();
                    if (u0VarX != null) {
                        u0VarX.k(u0Var);
                    } else {
                        dVar.f46992o.B(u0Var);
                        dVar.f46981h = null;
                    }
                }
                if (Intrinsics.compare(dVar.f46992o.g(), j9) < 0) {
                    dVar.f46992o.v();
                }
                c cVar2 = dVar.f46992o;
                cVar2.r(cVar2.d().d(j9).b(dVar.f46983j));
                dVar.f46992o.A(j9);
                c cVar3 = dVar.f46992o;
                int i11 = dVar.f47004d;
                dVar.f47004d = -1;
                if (i11 >= 0) {
                    int[] iArr = cVar3.f46984k;
                    iArr.getClass();
                    int length = iArr.length;
                    int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
                    iArrCopyOf[length] = i11;
                    cVar3.f46984k = iArrCopyOf;
                } else {
                    cVar3.getClass();
                }
                c cVar4 = dVar.f46992o;
                k kVar = dVar.f46983j;
                cVar4.getClass();
                synchronized (obj) {
                    cVar4.f46983j = cVar4.f46983j.g(kVar);
                    c cVar5 = dVar.f46992o;
                    int[] iArr2 = dVar.f46984k;
                    cVar5.getClass();
                    if (iArr2.length != 0) {
                        int[] iArr3 = cVar5.f46984k;
                        if (iArr3.length != 0) {
                            int length2 = iArr3.length;
                            int length3 = iArr2.length;
                            int[] iArrCopyOf2 = Arrays.copyOf(iArr3, length2 + length3);
                            System.arraycopy(iArr2, 0, iArrCopyOf2, length2, length3);
                            iArr2 = iArrCopyOf2;
                        }
                        cVar5.f46984k = iArr2;
                    }
                }
                dVar.f46985m = true;
                if (!dVar.f46993p) {
                    dVar.f46993p = true;
                    dVar.f46992o.l();
                }
                return i.f47013b;
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        }
    }
}
