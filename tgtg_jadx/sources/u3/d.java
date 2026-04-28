package u3;

import a3.t0;
import bn.a0;
import bn.x;
import i80.n;
import i80.o;
import i80.p;
import i80.q;
import i80.r;
import i80.s;
import i80.t;
import java.util.ArrayList;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import m3.w1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements Function2, n, o, p, q, r, s, t, i80.a, i80.b, i80.d, i80.e, i80.f, i80.g, i80.h, i80.i, i80.j, i80.k, i80.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f40647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f40648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public w1 f40649d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f40650e;

    public d(Object obj, boolean z11, int i11) {
        this.f40646a = i11;
        this.f40647b = z11;
        this.f40648c = obj;
    }

    public final Object a(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(this.f40646a);
        f(sVar);
        int iA = sVar.f(this) ? e.a(2, 6) : e.a(1, 6);
        Object obj5 = this.f40648c;
        obj5.getClass();
        Object objInvoke = ((s) TypeIntrinsics.beforeCheckcastToFunctionOfArity(obj5, 8)).invoke(b4.q.f5711a, obj, bool, obj2, obj3, obj4, sVar, Integer.valueOf(i11 | iA));
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new a0(this, obj, bool, obj2, obj3, obj4, i11);
        }
        return objInvoke;
    }

    public final Object b(Object obj, Object obj2, Object obj3, m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(this.f40646a);
        f(sVar);
        int iA = sVar.f(this) ? e.a(2, 3) : e.a(1, 3);
        Object obj4 = this.f40648c;
        obj4.getClass();
        Object objInvoke = ((p) TypeIntrinsics.beforeCheckcastToFunctionOfArity(obj4, 5)).invoke(obj, obj2, obj3, sVar, Integer.valueOf(iA | i11));
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new t0(this, obj, obj2, obj3, i11);
        }
        return objInvoke;
    }

    public final Object c(Object obj, Object obj2, m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(this.f40646a);
        f(sVar);
        int iA = sVar.f(this) ? e.a(2, 2) : e.a(1, 2);
        Object obj3 = this.f40648c;
        obj3.getClass();
        Object objInvoke = ((o) TypeIntrinsics.beforeCheckcastToFunctionOfArity(obj3, 4)).invoke(obj, obj2, sVar, Integer.valueOf(iA | i11));
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new a3.a(this, obj, obj2, i11);
        }
        return objInvoke;
    }

    public final Object d(Object obj, m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(this.f40646a);
        f(sVar);
        int iA = sVar.f(this) ? e.a(2, 1) : e.a(1, 1);
        Object obj2 = this.f40648c;
        obj2.getClass();
        Object objInvoke = ((n) TypeIntrinsics.beforeCheckcastToFunctionOfArity(obj2, 3)).invoke(obj, sVar, Integer.valueOf(iA | i11));
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new x(this, obj, i11, 29);
        }
        return objInvoke;
    }

    public final Object e(m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(this.f40646a);
        f(sVar);
        int iA = i11 | (sVar.f(this) ? e.a(2, 0) : e.a(1, 0));
        Object obj = this.f40648c;
        obj.getClass();
        Object objInvoke = ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(obj, 2)).invoke(sVar, Integer.valueOf(iA));
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new gf.h(2, this, d.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8, 2);
        }
        return objInvoke;
    }

    public final void f(m3.n nVar) {
        m3.s sVar;
        w1 w1VarY;
        if (!this.f40647b || (w1VarY = (sVar = (m3.s) nVar).y()) == null) {
            return;
        }
        sVar.getClass();
        w1VarY.f29474b |= 1;
        if (e.f(this.f40649d, w1VarY)) {
            this.f40649d = w1VarY;
            return;
        }
        ArrayList arrayList = this.f40650e;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.f40650e = arrayList2;
            arrayList2.add(w1VarY);
            return;
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (e.f((w1) arrayList.get(i11), w1VarY)) {
                arrayList.set(i11, w1VarY);
                return;
            }
        }
        arrayList.add(w1VarY);
    }

    public final void g(u70.f fVar) {
        if (Intrinsics.areEqual(this.f40648c, fVar)) {
            return;
        }
        boolean z11 = this.f40648c == null;
        this.f40648c = fVar;
        if (z11 || !this.f40647b) {
            return;
        }
        w1 w1Var = this.f40649d;
        if (w1Var != null) {
            w1Var.b();
            this.f40649d = null;
        }
        ArrayList arrayList = this.f40650e;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                ((w1) arrayList.get(i11)).b();
            }
            arrayList.clear();
        }
    }

    @Override // i80.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return b(obj, obj2, obj3, (m3.n) obj4, ((Number) obj5).intValue());
    }

    @Override // i80.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return d(obj, (m3.n) obj2, ((Number) obj3).intValue());
    }

    @Override // i80.o
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return c(obj, obj2, (m3.n) obj3, ((Number) obj4).intValue());
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return e((m3.n) obj, ((Number) obj2).intValue());
    }

    @Override // i80.s
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        return a(obj2, (Boolean) obj3, obj4, obj5, obj6, (m3.n) obj7, ((Number) obj8).intValue());
    }
}
