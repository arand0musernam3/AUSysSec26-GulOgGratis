package g9;

import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.Lifecycle;
import com.braze.h2;
import g3.w2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.i1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import y80.a2;
import y80.h1;
import y80.y1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l50.a f20176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a2 f20177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a2 f20178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f20179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h1 f20180e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h1 f20181f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t0 f20182g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p f20183h;

    public o(p pVar, t0 t0Var) {
        t0Var.getClass();
        this.f20183h = pVar;
        this.f20176a = new l50.a(2);
        a2 a2VarC = y80.r.c(kotlin.collections.n0.f26529a);
        this.f20177b = a2VarC;
        a2 a2VarC2 = y80.r.c(kotlin.collections.p0.f26531a);
        this.f20178c = a2VarC2;
        this.f20180e = new h1(a2VarC);
        this.f20181f = new h1(a2VarC2);
        this.f20182g = t0Var;
    }

    public final void a(l lVar) {
        lVar.getClass();
        synchronized (this.f20176a) {
            a2 a2Var = this.f20177b;
            ArrayList arrayListE0 = CollectionsKt.e0((Collection) a2Var.getValue(), lVar);
            a2Var.getClass();
            a2Var.k(null, arrayListE0);
        }
    }

    public final l b(z zVar, Bundle bundle) {
        l9.f fVar = this.f20183h.f20186b;
        fVar.getClass();
        return k.a(fVar.f27532a.f20187c, zVar, bundle, fVar.k(), fVar.f27545o);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(g9.l r9) {
        /*
            r8 = this;
            r9.getClass()
            g9.p r0 = r8.f20183h
            l9.f r0 = r0.f20186b
            y80.a2 r1 = r0.f27539h
            java.util.LinkedHashMap r2 = r0.f27553w
            java.lang.Object r3 = r2.get(r9)
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            y80.a2 r4 = r8.f20178c
            java.lang.Object r5 = r4.getValue()
            java.util.Set r5 = (java.util.Set) r5
            java.util.LinkedHashSet r5 = kotlin.collections.i1.f(r5, r9)
            r6 = 0
            r4.k(r6, r5)
            r2.remove(r9)
            kotlin.collections.t r2 = r0.f27537f
            boolean r4 = r2.contains(r9)
            if (r4 != 0) goto L8c
            r0.w(r9)
            l9.c r4 = r9.f20169h
            java.lang.String r5 = r9.f20167f
            androidx.lifecycle.f0 r4 = r4.f27523j
            androidx.lifecycle.Lifecycle$State r4 = r4.f3435d
            androidx.lifecycle.Lifecycle$State r7 = androidx.lifecycle.Lifecycle.State.CREATED
            boolean r4 = r4.a(r7)
            if (r4 == 0) goto L48
            androidx.lifecycle.Lifecycle$State r4 = androidx.lifecycle.Lifecycle.State.DESTROYED
            r9.a(r4)
        L48:
            boolean r9 = r2.isEmpty()
            if (r9 == 0) goto L4f
            goto L68
        L4f:
            java.util.Iterator r9 = r2.iterator()
        L53:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L68
            java.lang.Object r2 = r9.next()
            g9.l r2 = (g9.l) r2
            java.lang.String r2 = r2.f20167f
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r5)
            if (r2 == 0) goto L53
            goto L7e
        L68:
            if (r3 != 0) goto L7e
            g9.q r9 = r0.f27545o
            if (r9 == 0) goto L7e
            r5.getClass()
            java.util.LinkedHashMap r9 = r9.f20195a
            java.lang.Object r9 = r9.remove(r5)
            androidx.lifecycle.ViewModelStore r9 = (androidx.lifecycle.ViewModelStore) r9
            if (r9 == 0) goto L7e
            r9.a()
        L7e:
            r0.x()
            java.util.ArrayList r9 = r0.t()
            r1.getClass()
            r1.k(r6, r9)
            return
        L8c:
            boolean r9 = r8.f20179d
            if (r9 != 0) goto Laa
            r0.x()
            y80.a2 r9 = r0.f27538g
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r2)
            r9.getClass()
            r9.k(r6, r3)
            java.util.ArrayList r9 = r0.t()
            r1.getClass()
            r1.k(r6, r9)
        Laa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g9.o.c(g9.l):void");
    }

    public final void d(l lVar) {
        int iNextIndex;
        synchronized (this.f20176a) {
            try {
                ArrayList arrayListT0 = CollectionsKt.t0((Collection) this.f20180e.f45488a.getValue());
                ListIterator listIterator = arrayListT0.listIterator(arrayListT0.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        iNextIndex = -1;
                        break;
                    } else if (Intrinsics.areEqual(((l) listIterator.previous()).f20167f, lVar.f20167f)) {
                        iNextIndex = listIterator.nextIndex();
                        break;
                    }
                }
                arrayListT0.set(iNextIndex, lVar);
                a2 a2Var = this.f20177b;
                a2Var.getClass();
                a2Var.k(null, arrayListT0);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e(l lVar, boolean z11) {
        lVar.getClass();
        l9.f fVar = this.f20183h.f20186b;
        ep.l lVar2 = new ep.l(this, lVar, z11);
        fVar.getClass();
        t0 t0VarB = fVar.f27549s.b(lVar.f20163b.f20257a);
        fVar.f27553w.put(lVar, Boolean.valueOf(z11));
        if (!Intrinsics.areEqual(t0VarB, this.f20182g)) {
            Object obj = fVar.f27550t.get(t0VarB);
            obj.getClass();
            ((o) obj).e(lVar, z11);
            return;
        }
        w2 w2Var = fVar.f27552v;
        if (w2Var != null) {
            w2Var.invoke(lVar);
            lVar2.invoke();
            return;
        }
        kotlin.collections.t tVar = fVar.f27537f;
        int iIndexOf = tVar.indexOf(lVar);
        if (iIndexOf < 0) {
            Log.i("NavController", "Ignoring pop of " + lVar + " as it was not found on the current back stack");
            return;
        }
        int i11 = iIndexOf + 1;
        if (i11 != tVar.f26542c) {
            fVar.p(((l) tVar.get(i11)).f20163b.f20258b.f27563e, true, false);
        }
        l9.f.s(fVar, lVar);
        lVar2.invoke();
        fVar.f27533b.invoke();
        fVar.b();
    }

    public final void f(l lVar, boolean z11) {
        Object objPrevious;
        lVar.getClass();
        a2 a2Var = this.f20178c;
        Iterable iterable = (Iterable) a2Var.getValue();
        boolean z12 = iterable instanceof Collection;
        h1 h1Var = this.f20180e;
        if (!z12 || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((l) it.next()) == lVar) {
                    Iterable iterable2 = (Iterable) h1Var.f45488a.getValue();
                    if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
                        return;
                    }
                    Iterator it2 = iterable2.iterator();
                    while (it2.hasNext()) {
                        if (((l) it2.next()) == lVar) {
                        }
                    }
                    return;
                }
            }
        }
        a2Var.k(null, i1.i((Set) a2Var.getValue(), lVar));
        y1 y1Var = h1Var.f45488a;
        y1 y1Var2 = h1Var.f45488a;
        List list = (List) y1Var.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            l lVar2 = (l) objPrevious;
            if (!Intrinsics.areEqual(lVar2, lVar) && ((List) y1Var2.getValue()).lastIndexOf(lVar2) < ((List) y1Var2.getValue()).lastIndexOf(lVar)) {
                break;
            }
        }
        l lVar3 = (l) objPrevious;
        if (lVar3 != null) {
            a2Var.k(null, i1.i((Set) a2Var.getValue(), lVar3));
        }
        e(lVar, z11);
    }

    public final void g(l lVar) {
        lVar.getClass();
        a2 a2Var = this.f20178c;
        a2Var.k(null, i1.i((Set) a2Var.getValue(), lVar));
        l9.f fVar = this.f20183h.f20186b;
        fVar.getClass();
        if (fVar.f27537f.contains(lVar)) {
            lVar.a(Lifecycle.State.STARTED);
        } else {
            h2.b("Cannot transition entry that is not in the back stack");
        }
    }

    public final void h(l lVar) {
        lVar.getClass();
        l9.f fVar = this.f20183h.f20186b;
        fVar.getClass();
        t0 t0VarB = fVar.f27549s.b(lVar.f20163b.f20257a);
        if (!Intrinsics.areEqual(t0VarB, this.f20182g)) {
            Object obj = fVar.f27550t.get(t0VarB);
            if (obj != null) {
                ((o) obj).h(lVar);
                return;
            } else {
                e40.a.g(r8.k.p(new StringBuilder("NavigatorBackStack for "), lVar.f20163b.f20257a, " should already be created"));
                return;
            }
        }
        Function1 function1 = fVar.f27551u;
        if (function1 != null) {
            function1.invoke(lVar);
            a(lVar);
        } else {
            Log.i("NavController", "Ignoring add of destination " + lVar.f20163b + " outside of the call to navigate(). ");
        }
    }

    public final void i(l lVar) {
        lVar.getClass();
        a2 a2Var = this.f20178c;
        Iterable iterable = (Iterable) a2Var.getValue();
        boolean z11 = iterable instanceof Collection;
        h1 h1Var = this.f20180e;
        if (!z11 || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((l) it.next()) == lVar) {
                    Iterable iterable2 = (Iterable) h1Var.f45488a.getValue();
                    if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                        Iterator it2 = iterable2.iterator();
                        while (it2.hasNext()) {
                            if (((l) it2.next()) == lVar) {
                                return;
                            }
                        }
                    }
                }
            }
        }
        l lVar2 = (l) CollectionsKt.X((List) h1Var.f45488a.getValue());
        if (lVar2 != null) {
            LinkedHashSet linkedHashSetI = i1.i((Set) a2Var.getValue(), lVar2);
            a2Var.getClass();
            a2Var.k(null, linkedHashSetI);
        }
        LinkedHashSet linkedHashSetI2 = i1.i((Set) a2Var.getValue(), lVar);
        a2Var.getClass();
        a2Var.k(null, linkedHashSetI2);
        h(lVar);
    }
}
