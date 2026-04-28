package com.google.android.gms.internal.measurement;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b7 implements o30.a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f11282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f11283c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f11284d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f11285e;

    public b7() {
        this.f11281a = 0;
        i5 i5Var = new i5(0);
        this.f11283c = i5Var;
        b7 b7Var = new b7(null, i5Var);
        this.f11284d = b7Var;
        this.f11282b = b7Var.d();
        s5 s5Var = new s5(5);
        this.f11285e = s5Var;
        b7Var.f("require", new kf(s5Var));
        ((HashMap) s5Var.f11844b).put("internal.platform", u6.f11922b);
        b7Var.f("runtime.counter", new i3(Double.valueOf(0.0d)));
    }

    public c5 a(c5 c5Var) {
        return ((i5) this.f11283c).e(this, c5Var);
    }

    public c5 b(b7 b7Var, p9... p9VarArr) {
        c5 c5VarH = c5.U;
        for (p9 p9Var : p9VarArr) {
            c5VarH = la.h(p9Var);
            fa.y((b7) this.f11284d);
            if ((c5VarH instanceof d5) || (c5VarH instanceof b5)) {
                c5VarH = ((i5) this.f11283c).e(b7Var, c5VarH);
            }
        }
        return c5VarH;
    }

    public c5 c(n1 n1Var) {
        c5 c5VarE = c5.U;
        Iterator itO = n1Var.o();
        while (itO.hasNext()) {
            c5VarE = ((i5) this.f11283c).e(this, n1Var.q(((Integer) itO.next()).intValue()));
            if (c5VarE instanceof q2) {
                break;
            }
        }
        return c5VarE;
    }

    @Override // o30.a0
    public ListenableFuture call() {
        int i11 = this.f11281a;
        Object obj = this.f11282b;
        int i12 = 3;
        Object obj2 = this.f11285e;
        Object obj3 = this.f11284d;
        Object obj4 = this.f11283c;
        switch (i11) {
            case 2:
                te teVar = (te) obj4;
                int i13 = 0;
                qe qeVar = new qe(teVar, i13);
                o30.g0 g0Var = o30.g0.INSTANCE;
                o30.t tVarF = o30.o0.f((ListenableFuture) obj, qeVar, g0Var);
                o30.t tVarF2 = o30.o0.f(tVarF, (zc) obj3, (Executor) obj2);
                se seVar = new se(teVar, tVarF, tVarF2, i13);
                int i14 = ag.f11261a;
                return o30.o0.f(tVarF2, new zc(i12, hf.a(), seVar), g0Var);
            default:
                se seVar2 = new se((oe) obj4, (zc) obj3, (Executor) obj2, 1);
                int i15 = ag.f11261a;
                return o30.o0.f((o30.j) obj, new zc(i12, hf.a(), seVar2), o30.g0.INSTANCE);
        }
    }

    public b7 d() {
        return new b7(this, (i5) this.f11283c);
    }

    public boolean e(String str) {
        if (((HashMap) this.f11284d).containsKey(str)) {
            return true;
        }
        b7 b7Var = (b7) this.f11282b;
        if (b7Var != null) {
            return b7Var.e(str);
        }
        return false;
    }

    public void f(String str, c5 c5Var) {
        b7 b7Var;
        HashMap map = (HashMap) this.f11284d;
        if (!map.containsKey(str) && (b7Var = (b7) this.f11282b) != null && b7Var.e(str)) {
            b7Var.f(str, c5Var);
        } else {
            if (((HashMap) this.f11285e).containsKey(str)) {
                return;
            }
            if (c5Var == null) {
                map.remove(str);
            } else {
                map.put(str, c5Var);
            }
        }
    }

    public void g(String str, c5 c5Var) {
        if (((HashMap) this.f11285e).containsKey(str)) {
            return;
        }
        HashMap map = (HashMap) this.f11284d;
        if (c5Var == null) {
            map.remove(str);
        } else {
            map.put(str, c5Var);
        }
    }

    public c5 h(String str) {
        HashMap map = (HashMap) this.f11284d;
        if (map.containsKey(str)) {
            return (c5) map.get(str);
        }
        b7 b7Var = (b7) this.f11282b;
        if (b7Var != null) {
            return b7Var.h(str);
        }
        i4.a.f(r8.k.l(str, " is not defined"));
        return null;
    }

    public /* synthetic */ b7(Object obj, ListenableFuture listenableFuture, zc zcVar, Executor executor, int i11) {
        this.f11281a = i11;
        this.f11283c = obj;
        this.f11282b = listenableFuture;
        this.f11284d = zcVar;
        this.f11285e = executor;
    }

    public b7(b7 b7Var, i5 i5Var) {
        this.f11281a = 1;
        this.f11284d = new HashMap();
        this.f11285e = new HashMap();
        this.f11282b = b7Var;
        this.f11283c = i5Var;
    }
}
