package w4;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputResetException;
import b5.i2;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import q1.h1;
import v80.b2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 extends b4.s implements y, z5.c, i2 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f43155o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Object f43156p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public PointerInputEventHandler f43157q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public b2 f43158r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public n f43159s = h0.f43125a;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final o3.e f43160t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final o3.e f43161u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final o3.e f43162v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public n f43163w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f43164x;

    public m0(Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler) {
        this.f43155o = obj;
        this.f43156p = obj2;
        this.f43157q = pointerInputEventHandler;
        o3.e eVar = new o3.e(new k0[16], 0);
        this.f43160t = eVar;
        this.f43161u = eVar;
        this.f43162v = new o3.e(new k0[16], 0);
        this.f43164x = 0L;
    }

    @Override // b5.i2
    public final void F() {
        n nVar = this.f43163w;
        if (nVar == null) {
            return;
        }
        List list = nVar.f43165a;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (((v) list.get(i11)).f43181d) {
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    v vVar = (v) list.get(i12);
                    long j9 = vVar.f43178a;
                    long j11 = vVar.f43180c;
                    long j12 = vVar.f43179b;
                    float f11 = vVar.f43182e;
                    boolean z11 = vVar.f43181d;
                    arrayList.add(new v(j9, j12, j11, false, f11, j12, j11, z11, z11, vVar.f43186i, 0L));
                }
                n nVar2 = new n(arrayList, null);
                this.f43159s = nVar2;
                M0(nVar2, o.Initial);
                M0(nVar2, o.Main);
                M0(nVar2, o.Final);
                this.f43163w = null;
                return;
            }
        }
    }

    public final Object L0(Function2 function2, x70.c cVar) {
        v80.l lVar = new v80.l(1, y70.f.b(cVar));
        lVar.t();
        k0 k0Var = new k0(this, lVar);
        synchronized (this.f43161u) {
            this.f43160t.b(k0Var);
            x70.f fVar = new x70.f(y70.f.b(y70.f.a(function2, k0Var, k0Var)), y70.a.COROUTINE_SUSPENDED);
            u70.o oVar = u70.q.f40850b;
            fVar.resumeWith(Unit.f26487a);
        }
        lVar.v(new h1(k0Var, 9));
        return lVar.s();
    }

    public final void M0(n nVar, o oVar) {
        v80.l lVar;
        v80.l lVar2;
        synchronized (this.f43161u) {
            o3.e eVar = this.f43162v;
            eVar.d(eVar.f31832c, this.f43160t);
        }
        try {
            int i11 = l0.$EnumSwitchMapping$0[oVar.ordinal()];
            if (i11 == 1 || i11 == 2) {
                o3.e eVar2 = this.f43162v;
                Object[] objArr = eVar2.f31830a;
                int i12 = eVar2.f31832c;
                for (int i13 = 0; i13 < i12; i13++) {
                    k0 k0Var = (k0) objArr[i13];
                    if (oVar == k0Var.f43142d && (lVar = k0Var.f43141c) != null) {
                        k0Var.f43141c = null;
                        u70.o oVar2 = u70.q.f40850b;
                        lVar.resumeWith(nVar);
                    }
                }
            } else {
                if (i11 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                o3.e eVar3 = this.f43162v;
                int i14 = eVar3.f31832c - 1;
                Object[] objArr2 = eVar3.f31830a;
                if (i14 < objArr2.length) {
                    while (i14 >= 0) {
                        k0 k0Var2 = (k0) objArr2[i14];
                        if (oVar == k0Var2.f43142d && (lVar2 = k0Var2.f43141c) != null) {
                            k0Var2.f43141c = null;
                            u70.o oVar3 = u70.q.f40850b;
                            lVar2.resumeWith(nVar);
                        }
                        i14--;
                    }
                }
            }
            this.f43162v.g();
        } catch (Throwable th2) {
            this.f43162v.g();
            throw th2;
        }
    }

    public final void N0() {
        b2 b2Var = this.f43158r;
        if (b2Var != null) {
            b2Var.r(new PointerInputResetException("Pointer input was reset"));
            this.f43158r = null;
        }
    }

    @Override // z5.c
    public final float X() {
        return b5.m.g(this).f5889z.X();
    }

    @Override // z5.c
    public final float a() {
        return b5.m.g(this).f5889z.a();
    }

    @Override // b5.l, b5.i2
    public final void onDensityChange() {
        N0();
    }

    @Override // b4.s
    public final void onDetach() {
        N0();
        super.onDetach();
    }

    @Override // b5.i2
    public final void p0(n nVar, o oVar, long j9) {
        this.f43164x = j9;
        if (oVar == o.Initial) {
            this.f43159s = nVar;
        }
        x70.c cVar = null;
        if (this.f43158r == null) {
            this.f43158r = v80.f0.B(getCoroutineScope(), null, v80.d0.UNDISPATCHED, new sf.a(this, cVar, 14), 1);
        }
        M0(nVar, oVar);
        List list = nVar.f43165a;
        int size = list.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                nVar = null;
                break;
            } else if (!u.d((v) list.get(i11))) {
                break;
            } else {
                i11++;
            }
        }
        this.f43163w = nVar;
    }

    @Override // b5.i2
    public final void y0() {
        N0();
    }
}
