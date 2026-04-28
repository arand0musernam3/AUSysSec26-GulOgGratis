package l9;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.s;
import bg.a1;
import com.braze.h2;
import g3.w2;
import g9.b0;
import g9.i0;
import g9.j;
import g9.k;
import g9.l;
import g9.m;
import g9.n;
import g9.o;
import g9.p;
import g9.q;
import g9.t0;
import g9.u0;
import g9.x;
import g9.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import jb.u;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.d0;
import kotlin.collections.n0;
import kotlin.collections.o0;
import kotlin.collections.t;
import kotlin.collections.w0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.sequences.Sequence;
import q1.l1;
import qc.y;
import y80.a2;
import y80.h1;
import y80.m1;
import y80.r;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f27532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f27533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b0 f27534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Bundle f27535d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Bundle[] f27536e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f27537f = new t();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a2 f27538g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a2 f27539h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final h1 f27540i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LinkedHashMap f27541j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f27542k;
    public final LinkedHashMap l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final LinkedHashMap f27543m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public LifecycleOwner f27544n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public q f27545o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f27546p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Lifecycle.State f27547q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final s f27548r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final u0 f27549s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final LinkedHashMap f27550t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Function1 f27551u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public w2 f27552v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final LinkedHashMap f27553w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f27554x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ArrayList f27555y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final m1 f27556z;

    public f(p pVar, n nVar) {
        this.f27532a = pVar;
        this.f27533b = nVar;
        n0 n0Var = n0.f26529a;
        this.f27538g = r.c(n0Var);
        a2 a2VarC = r.c(n0Var);
        this.f27539h = a2VarC;
        this.f27540i = new h1(a2VarC);
        this.f27541j = new LinkedHashMap();
        this.f27542k = new LinkedHashMap();
        this.l = new LinkedHashMap();
        this.f27543m = new LinkedHashMap();
        this.f27546p = new ArrayList();
        this.f27547q = Lifecycle.State.INITIALIZED;
        this.f27548r = new s(this, 6);
        this.f27549s = new u0();
        this.f27550t = new LinkedHashMap();
        this.f27553w = new LinkedHashMap();
        this.f27555y = new ArrayList();
        this.f27556z = r.b(1, 0, x80.a.DROP_OLDEST, 2);
    }

    public static z e(int i11, z zVar, z zVar2, boolean z11) {
        zVar.getClass();
        if (zVar.f20258b.f27563e == i11 && (zVar2 == null || (Intrinsics.areEqual(zVar, zVar2) && Intrinsics.areEqual(zVar.f20259c, zVar2.f20259c)))) {
            return zVar;
        }
        b0 b0Var = zVar instanceof b0 ? (b0) zVar : null;
        if (b0Var == null) {
            b0Var = zVar.f20259c;
            b0Var.getClass();
        }
        return b0Var.f20106g.w(i11, b0Var, zVar2, z11);
    }

    public static /* synthetic */ void s(f fVar, l lVar) {
        fVar.r(lVar, false, new t());
    }

    public final void a(z zVar, Bundle bundle, l lVar, List list) {
        Object objPrevious;
        Object objPrevious2;
        ky.b bVar = this.f27532a.f20187c;
        z zVar2 = lVar.f20163b;
        boolean z11 = zVar2 instanceof g9.f;
        t tVar = this.f27537f;
        if (!z11) {
            while (!tVar.isEmpty() && (((l) tVar.last()).f20163b instanceof g9.f) && p(((l) tVar.last()).f20163b.f20258b.f27563e, true, false)) {
            }
        }
        t<l> tVar2 = new t();
        Object obj = null;
        if (zVar instanceof b0) {
            z zVar3 = zVar2;
            do {
                zVar3.getClass();
                zVar3 = zVar3.f20259c;
                if (zVar3 != null) {
                    ListIterator listIterator = list.listIterator(list.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            objPrevious2 = listIterator.previous();
                            if (Intrinsics.areEqual(((l) objPrevious2).f20163b, zVar3)) {
                                break;
                            }
                        } else {
                            objPrevious2 = null;
                            break;
                        }
                    }
                    l lVarA = (l) objPrevious2;
                    if (lVarA == null) {
                        lVarA = k.a(bVar, zVar3, bundle, k(), this.f27545o);
                    }
                    tVar2.addFirst(lVarA);
                    if (!tVar.isEmpty() && ((l) tVar.last()).f20163b == zVar3) {
                        s(this, (l) tVar.last());
                    }
                }
                if (zVar3 == null) {
                    break;
                }
            } while (zVar3 != zVar);
        }
        z zVar4 = tVar2.isEmpty() ? zVar2 : ((l) tVar2.first()).f20163b;
        while (zVar4 != null && d(zVar4.f20258b.f27563e, zVar4) != zVar4) {
            zVar4 = zVar4.f20259c;
            if (zVar4 != null) {
                Bundle bundle2 = (bundle == null || !bundle.isEmpty()) ? bundle : null;
                ListIterator listIterator2 = list.listIterator(list.size());
                while (true) {
                    if (listIterator2.hasPrevious()) {
                        objPrevious = listIterator2.previous();
                        if (Intrinsics.areEqual(((l) objPrevious).f20163b, zVar4)) {
                            break;
                        }
                    } else {
                        objPrevious = null;
                        break;
                    }
                }
                l lVarA2 = (l) objPrevious;
                if (lVarA2 == null) {
                    lVarA2 = k.a(bVar, zVar4, zVar4.d(bundle2), k(), this.f27545o);
                }
                tVar2.addFirst(lVarA2);
            }
        }
        if (!tVar2.isEmpty()) {
            zVar2 = ((l) tVar2.first()).f20163b;
        }
        while (!tVar.isEmpty() && (((l) tVar.last()).f20163b instanceof b0)) {
            z zVar5 = ((l) tVar.last()).f20163b;
            zVar5.getClass();
            if (((l1) ((b0) zVar5).f20106g.f22747d).b(zVar2.f20258b.f27563e) != null) {
                break;
            } else {
                s(this, (l) tVar.last());
            }
        }
        l lVar2 = (l) tVar.h();
        if (lVar2 == null) {
            lVar2 = (l) tVar2.h();
        }
        if (!Intrinsics.areEqual(lVar2 != null ? lVar2.f20163b : null, this.f27534c)) {
            ListIterator listIterator3 = list.listIterator(list.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    break;
                }
                Object objPrevious3 = listIterator3.previous();
                z zVar6 = ((l) objPrevious3).f20163b;
                b0 b0Var = this.f27534c;
                b0Var.getClass();
                if (Intrinsics.areEqual(zVar6, b0Var)) {
                    obj = objPrevious3;
                    break;
                }
            }
            l lVarA3 = (l) obj;
            if (lVarA3 == null) {
                b0 b0Var2 = this.f27534c;
                b0Var2.getClass();
                b0 b0Var3 = this.f27534c;
                b0Var3.getClass();
                lVarA3 = k.a(bVar, b0Var2, b0Var3.d(bundle), k(), this.f27545o);
            }
            tVar2.addFirst(lVarA3);
        }
        for (l lVar3 : tVar2) {
            Object obj2 = this.f27550t.get(this.f27549s.b(lVar3.f20163b.f20257a));
            if (obj2 == null) {
                e40.a.g(r8.k.p(new StringBuilder("NavigatorBackStack for "), zVar.f20257a, " should already be created"));
                return;
            }
            ((o) obj2).a(lVar3);
        }
        tVar.addAll(tVar2);
        tVar.addLast(lVar);
        for (l lVar4 : CollectionsKt.e0(tVar2, lVar)) {
            b0 b0Var4 = lVar4.f20163b.f20259c;
            if (b0Var4 != null) {
                m(lVar4, g(b0Var4.f20258b.f27563e));
            }
        }
    }

    public final boolean b() {
        t tVar;
        while (true) {
            tVar = this.f27537f;
            if (tVar.isEmpty() || !(((l) tVar.last()).f20163b instanceof b0)) {
                break;
            }
            s(this, (l) tVar.last());
        }
        l lVar = (l) tVar.j();
        ArrayList arrayList = this.f27555y;
        if (lVar != null) {
            arrayList.add(lVar);
        }
        this.f27554x++;
        x();
        int i11 = this.f27554x - 1;
        this.f27554x = i11;
        if (i11 == 0) {
            ArrayList<l> arrayListT0 = CollectionsKt.t0(arrayList);
            arrayList.clear();
            for (l lVar2 : arrayListT0) {
                Iterator it = CollectionsKt.r0(this.f27546p).iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        org.bouncycastle.jce.provider.a.c();
                        return false;
                    }
                    z zVar = lVar2.f20163b;
                    lVar2.f20169h.a();
                    throw null;
                }
                this.f27556z.i(lVar2);
            }
            ArrayList arrayList2 = new ArrayList(tVar);
            a2 a2Var = this.f27538g;
            a2Var.getClass();
            a2Var.k(null, arrayList2);
            ArrayList arrayListT = t();
            a2 a2Var2 = this.f27539h;
            a2Var2.getClass();
            a2Var2.k(null, arrayListT);
        }
        return lVar != null;
    }

    public final boolean c(ArrayList arrayList, z zVar, boolean z11, boolean z12) {
        f fVar;
        boolean z13;
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        t tVar = new t();
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                fVar = this;
                z13 = z12;
                break;
            }
            t0 t0Var = (t0) it.next();
            Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
            l lVar = (l) this.f27537f.last();
            fVar = this;
            z13 = z12;
            w2 w2Var = new w2(booleanRef2, booleanRef, fVar, z13, tVar, 3);
            t0Var.getClass();
            lVar.getClass();
            fVar.f27552v = w2Var;
            t0Var.i(lVar, z13);
            fVar.f27552v = null;
            if (!booleanRef2.element) {
                break;
            }
            z12 = z13;
        }
        if (z13) {
            LinkedHashMap linkedHashMap = fVar.l;
            if (!z11) {
                Sequence sequenceD = o80.o.d(zVar, new k9.f(8));
                final int i11 = 0;
                Function1 function1 = new Function1(this) { // from class: l9.e

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ f f27531b;

                    {
                        this.f27531b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        boolean zContainsKey;
                        z zVar2 = (z) obj;
                        switch (i11) {
                            case 0:
                                zVar2.getClass();
                                zContainsKey = this.f27531b.l.containsKey(Integer.valueOf(zVar2.f20258b.f27563e));
                                break;
                            default:
                                zVar2.getClass();
                                zContainsKey = this.f27531b.l.containsKey(Integer.valueOf(zVar2.f20258b.f27563e));
                                break;
                        }
                        return Boolean.valueOf(!zContainsKey);
                    }
                };
                sequenceD.getClass();
                o80.e eVar = new o80.e(new o80.i(sequenceD, function1));
                while (eVar.hasNext()) {
                    Integer numValueOf = Integer.valueOf(((z) eVar.next()).f20258b.f27563e);
                    m mVar = (m) tVar.h();
                    linkedHashMap.put(numValueOf, mVar != null ? mVar.f20171a.f27526a : null);
                }
            }
            if (!tVar.isEmpty()) {
                d dVar = ((m) tVar.first()).f20171a;
                Sequence sequenceD2 = o80.o.d(d(dVar.f27527b, null), new k9.f(9));
                final int i12 = 1;
                Function1 function12 = new Function1(this) { // from class: l9.e

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ f f27531b;

                    {
                        this.f27531b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        boolean zContainsKey;
                        z zVar2 = (z) obj;
                        switch (i12) {
                            case 0:
                                zVar2.getClass();
                                zContainsKey = this.f27531b.l.containsKey(Integer.valueOf(zVar2.f20258b.f27563e));
                                break;
                            default:
                                zVar2.getClass();
                                zContainsKey = this.f27531b.l.containsKey(Integer.valueOf(zVar2.f20258b.f27563e));
                                break;
                        }
                        return Boolean.valueOf(!zContainsKey);
                    }
                };
                sequenceD2.getClass();
                o80.e eVar2 = new o80.e(new o80.i(sequenceD2, function12));
                while (eVar2.hasNext()) {
                    linkedHashMap.put(Integer.valueOf(((z) eVar2.next()).f20258b.f27563e), dVar.f27526a);
                }
                if (linkedHashMap.values().contains(dVar.f27526a)) {
                    fVar.f27543m.put(dVar.f27526a, tVar);
                }
            }
        }
        fVar.f27533b.invoke();
        return booleanRef.element;
    }

    public final z d(int i11, z zVar) {
        z zVar2;
        b0 b0Var = this.f27534c;
        if (b0Var == null) {
            return null;
        }
        if (b0Var.f20258b.f27563e == i11) {
            if (zVar == null) {
                return b0Var;
            }
            if (Intrinsics.areEqual(b0Var, zVar) && zVar.f20259c == null) {
                return this.f27534c;
            }
        }
        l lVar = (l) this.f27537f.j();
        if (lVar == null || (zVar2 = lVar.f20163b) == null) {
            zVar2 = this.f27534c;
            zVar2.getClass();
        }
        return e(i11, zVar2, zVar, false);
    }

    public final String f(Object obj) {
        obj.getClass();
        z zVarE = e(m9.d.b(ba0.g.I(Reflection.getOrCreateKotlinClass(obj.getClass()))), j(), null, true);
        if (zVarE == null) {
            i4.a.g("Destination with route ", Reflection.getOrCreateKotlinClass(obj.getClass()).getSimpleName(), " cannot be found in navigation graph ", this.f27534c);
            return null;
        }
        Map mapH = zVarE.h();
        LinkedHashMap linkedHashMap = new LinkedHashMap(w0.a(mapH.size()));
        for (Map.Entry entry : mapH.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((j) entry.getValue()).f20149a);
        }
        return m9.d.d(obj, linkedHashMap);
    }

    public final l g(int i11) {
        Object objPrevious;
        t tVar = this.f27537f;
        ListIterator<E> listIterator = tVar.listIterator(tVar.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            if (((l) objPrevious).f20163b.f20258b.f27563e == i11) {
                break;
            }
        }
        l lVar = (l) objPrevious;
        if (lVar != null) {
            return lVar;
        }
        y.k(org.bouncycastle.jcajce.provider.asymmetric.a.k(i11, "No destination with ID ", " is on the NavController's back stack. The current destination is "), i());
        return null;
    }

    public final l h() {
        return (l) this.f27537f.j();
    }

    public final z i() {
        l lVarH = h();
        if (lVarH != null) {
            return lVarH.f20163b;
        }
        return null;
    }

    public final b0 j() {
        b0 b0Var = this.f27534c;
        if (b0Var != null) {
            b0Var.getClass();
            return b0Var;
        }
        h2.b("You must call setGraph() before calling getGraph()");
        return null;
    }

    public final Lifecycle.State k() {
        return this.f27544n == null ? Lifecycle.State.CREATED : this.f27547q;
    }

    public final b0 l() {
        z zVar;
        l lVar = (l) this.f27537f.j();
        if (lVar == null || (zVar = lVar.f20163b) == null) {
            zVar = this.f27534c;
            zVar.getClass();
        }
        b0 b0Var = zVar instanceof b0 ? (b0) zVar : null;
        if (b0Var != null) {
            return b0Var;
        }
        b0 b0Var2 = zVar.f20259c;
        b0Var2.getClass();
        return b0Var2;
    }

    public final void m(l lVar, l lVar2) {
        this.f27541j.put(lVar, lVar2);
        LinkedHashMap linkedHashMap = this.f27542k;
        if (linkedHashMap.get(lVar2) == null) {
            linkedHashMap.put(lVar2, new a());
        }
        Object obj = linkedHashMap.get(lVar2);
        obj.getClass();
        ((a) obj).f27512a.incrementAndGet();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(g9.z r26, android.os.Bundle r27, g9.i0 r28) {
        /*
            Method dump skipped, instruction units count: 552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l9.f.n(g9.z, android.os.Bundle, g9.i0):void");
    }

    public final void o(String str, i0 i0Var) {
        str.getClass();
        if (this.f27534c == null) {
            org.bouncycastle.jce.provider.a.j("Cannot navigate to ", str, ". Navigation graph has not been set for NavController ", this, 46);
            return;
        }
        b0 b0VarL = l();
        g9.y yVarO = b0VarL.o(str, true, b0VarL);
        if (yVarO == null) {
            j4.d.p(e0.f.s("Navigation destination that matches route ", str, " cannot be found in the navigation graph "), this.f27534c);
            return;
        }
        z zVar = yVarO.f20250a;
        Bundle bundleD = zVar.d(yVarO.f20251b);
        if (bundleD == null) {
            o0.f26530a.getClass();
            bundleD = u.x((Pair[]) Arrays.copyOf(new Pair[0], 0));
        }
        int i11 = z.f20256f;
        String str2 = zVar.f20258b.f27564f;
        Uri uri = Uri.parse(str2 != null ? "android-app://androidx.navigation/".concat(str2) : "");
        uri.getClass();
        Intent intent = new Intent();
        intent.setDataAndType(uri, null);
        intent.setAction(null);
        bundleD.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
        n(zVar, bundleD, i0Var);
    }

    public final boolean p(int i11, boolean z11, boolean z12) {
        z zVar;
        t tVar = this.f27537f;
        if (tVar.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = CollectionsKt.f0(tVar).iterator();
        while (true) {
            if (!it.hasNext()) {
                zVar = null;
                break;
            }
            zVar = ((l) it.next()).f20163b;
            String str = zVar.f20257a;
            h hVar = zVar.f20258b;
            t0 t0VarB = this.f27549s.b(str);
            if (z11 || hVar.f27563e != i11) {
                arrayList.add(t0VarB);
            }
            if (hVar.f27563e == i11) {
                break;
            }
        }
        if (zVar != null) {
            return c(arrayList, zVar, z11, z12);
        }
        int i12 = z.f20256f;
        Log.i("NavController", "Ignoring popBackStack to destination " + x.a(this.f27532a.f20187c, i11) + " as it was not found on the current back stack");
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00b5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c8 A[EDGE_INSN: B:59:0x00c8->B:50:0x00c8 BREAK  A[LOOP:0: B:6:0x0020->B:62:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[LOOP:0: B:6:0x0020->B:62:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean q(java.lang.String r17, boolean r18, boolean r19) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l9.f.q(java.lang.String, boolean, boolean):boolean");
    }

    public final void r(l lVar, boolean z11, t tVar) {
        q qVar;
        h1 h1Var;
        Set set;
        lVar.getClass();
        t tVar2 = this.f27537f;
        l lVar2 = (l) tVar2.last();
        if (!Intrinsics.areEqual(lVar2, lVar)) {
            StringBuilder sb2 = new StringBuilder("Attempted to pop ");
            sb2.append(lVar.f20163b);
            z zVar = lVar2.f20163b;
            sb2.append(", which is not the top of the back stack (");
            sb2.append(zVar);
            sb2.append(')');
            throw new IllegalStateException(sb2.toString().toString());
        }
        kotlin.collections.i0.x(tVar2);
        o oVar = (o) this.f27550t.get(this.f27549s.b(lVar2.f20163b.f20257a));
        boolean z12 = true;
        if ((oVar == null || (h1Var = oVar.f20181f) == null || (set = (Set) h1Var.f45488a.getValue()) == null || !set.contains(lVar2)) && !this.f27542k.containsKey(lVar2)) {
            z12 = false;
        }
        Lifecycle.State state = lVar2.f20169h.f27523j.f3435d;
        Lifecycle.State state2 = Lifecycle.State.CREATED;
        if (state.a(state2)) {
            if (z11) {
                lVar2.a(state2);
                tVar.addFirst(new m(lVar2));
            }
            if (z12) {
                lVar2.a(state2);
            } else {
                lVar2.a(Lifecycle.State.DESTROYED);
                w(lVar2);
            }
        }
        if (z11 || z12 || (qVar = this.f27545o) == null) {
            return;
        }
        String str = lVar2.f20167f;
        str.getClass();
        ViewModelStore viewModelStore = (ViewModelStore) qVar.f20195a.remove(str);
        if (viewModelStore != null) {
            viewModelStore.a();
        }
    }

    public final ArrayList t() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f27550t.values().iterator();
        while (it.hasNext()) {
            Iterable iterable = (Iterable) ((o) it.next()).f20181f.f45488a.getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                l lVar = (l) obj;
                if (!arrayList.contains(lVar) && !lVar.f20169h.f27524k.a(Lifecycle.State.STARTED)) {
                    arrayList2.add(obj);
                }
            }
            kotlin.collections.i0.s(arrayList2, arrayList);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : this.f27537f) {
            l lVar2 = (l) obj2;
            if (!arrayList.contains(lVar2) && lVar2.f20169h.f27524k.a(Lifecycle.State.STARTED)) {
                arrayList3.add(obj2);
            }
        }
        kotlin.collections.i0.s(arrayList3, arrayList);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (!(((l) obj3).f20163b instanceof b0)) {
                arrayList4.add(obj3);
            }
        }
        return arrayList4;
    }

    public final boolean u(int i11, Bundle bundle, i0 i0Var) {
        z zVarJ;
        l lVar;
        z zVar;
        Bundle bundle2;
        Integer numValueOf = Integer.valueOf(i11);
        LinkedHashMap linkedHashMap = this.l;
        if (!linkedHashMap.containsKey(numValueOf)) {
            return false;
        }
        String str = (String) linkedHashMap.get(Integer.valueOf(i11));
        Collection collectionValues = linkedHashMap.values();
        collectionValues.getClass();
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual((String) it.next(), str)) {
                it.remove();
            }
        }
        t<m> tVar = (t) TypeIntrinsics.asMutableMap(this.f27543m).remove(str);
        ky.b bVar = this.f27532a.f20187c;
        ArrayList arrayList = new ArrayList();
        l lVar2 = (l) this.f27537f.j();
        if (lVar2 == null || (zVarJ = lVar2.f20163b) == null) {
            zVarJ = j();
        }
        if (tVar != null) {
            for (m mVar : tVar) {
                d dVar = mVar.f20171a;
                d dVar2 = mVar.f20171a;
                z zVarE = e(dVar.f27527b, zVarJ, null, true);
                if (zVarE == null) {
                    int i12 = z.f20256f;
                    e40.a.i("Restore State failed: destination ", x.a(bVar, dVar2.f27527b), " cannot be found from the current destination ", zVarJ);
                    return false;
                }
                Lifecycle.State stateK = k();
                q qVar = this.f27545o;
                bVar.getClass();
                stateK.getClass();
                Bundle bundle3 = dVar2.f27528c;
                if (bundle3 != null) {
                    Context context = bVar.f26684a;
                    bundle3.setClassLoader(context != null ? context.getClassLoader() : null);
                    bundle2 = bundle3;
                } else {
                    bundle2 = null;
                }
                String str2 = dVar2.f27526a;
                Bundle bundle4 = dVar2.f27529d;
                str2.getClass();
                arrayList.add(new l(bVar, zVarE, bundle2, stateK, qVar, str2, bundle4));
                zVarJ = zVarE;
            }
        }
        ArrayList<List> arrayList2 = new ArrayList();
        ArrayList<l> arrayList3 = new ArrayList();
        for (Object obj : arrayList) {
            if (!(((l) obj).f20163b instanceof b0)) {
                arrayList3.add(obj);
            }
        }
        for (l lVar3 : arrayList3) {
            List list = (List) CollectionsKt.X(arrayList2);
            if (Intrinsics.areEqual((list == null || (lVar = (l) CollectionsKt.W(list)) == null || (zVar = lVar.f20163b) == null) ? null : zVar.f20257a, lVar3.f20163b.f20257a)) {
                list.add(lVar3);
            } else {
                arrayList2.add(d0.j(lVar3));
            }
        }
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        for (List list2 : arrayList2) {
            t0 t0VarB = this.f27549s.b(((l) CollectionsKt.O(list2)).f20163b.f20257a);
            ArrayList arrayList4 = arrayList;
            this.f27551u = new a1(booleanRef, arrayList4, new Ref.IntRef(), this, bundle, 4);
            t0VarB.d(list2, i0Var);
            this.f27551u = null;
            arrayList = arrayList4;
        }
        return booleanRef.element;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x031f A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v13, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r20v1, types: [android.os.Bundle[]] */
    /* JADX WARN: Type inference failed for: r20v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r20v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v11, types: [g9.b0, g9.z] */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v31, types: [java.lang.ClassLoader] */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v(g9.b0 r30, android.os.Bundle r31) {
        /*
            Method dump skipped, instruction units count: 1350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l9.f.v(g9.b0, android.os.Bundle):void");
    }

    public final void w(l lVar) {
        lVar.getClass();
        l lVar2 = (l) this.f27541j.remove(lVar);
        if (lVar2 == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.f27542k;
        a aVar = (a) linkedHashMap.get(lVar2);
        Integer numValueOf = aVar != null ? Integer.valueOf(aVar.f27512a.decrementAndGet()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            o oVar = (o) this.f27550t.get(this.f27549s.b(lVar2.f20163b.f20257a));
            if (oVar != null) {
                oVar.c(lVar2);
            }
            linkedHashMap.remove(lVar2);
        }
    }

    public final void x() {
        a aVar;
        h1 h1Var;
        Set set;
        ArrayList<l> arrayListT0 = CollectionsKt.t0(this.f27537f);
        if (arrayListT0.isEmpty()) {
            return;
        }
        ArrayList arrayListJ = d0.j(((l) CollectionsKt.W(arrayListT0)).f20163b);
        ArrayList arrayList = new ArrayList();
        if (CollectionsKt.W(arrayListJ) instanceof g9.f) {
            Iterator it = CollectionsKt.f0(arrayListT0).iterator();
            while (it.hasNext()) {
                z zVar = ((l) it.next()).f20163b;
                arrayList.add(zVar);
                if (!(zVar instanceof g9.f) && !(zVar instanceof b0)) {
                    break;
                }
            }
        }
        HashMap map = new HashMap();
        for (l lVar : CollectionsKt.f0(arrayListT0)) {
            Lifecycle.State state = lVar.f20169h.f27524k;
            z zVar2 = lVar.f20163b;
            z zVar3 = (z) CollectionsKt.firstOrNull(arrayListJ);
            if (zVar3 != null && zVar3.f20258b.f27563e == zVar2.f20258b.f27563e) {
                Lifecycle.State state2 = Lifecycle.State.RESUMED;
                if (state != state2) {
                    o oVar = (o) this.f27550t.get(this.f27549s.b(lVar.f20163b.f20257a));
                    if (Intrinsics.areEqual((oVar == null || (h1Var = oVar.f20181f) == null || (set = (Set) h1Var.f45488a.getValue()) == null) ? null : Boolean.valueOf(set.contains(lVar)), Boolean.TRUE) || ((aVar = (a) this.f27542k.get(lVar)) != null && aVar.f27512a.get() == 0)) {
                        map.put(lVar, Lifecycle.State.STARTED);
                    } else {
                        map.put(lVar, state2);
                    }
                }
                z zVar4 = (z) CollectionsKt.firstOrNull(arrayList);
                if (zVar4 != null && zVar4.f20258b.f27563e == zVar2.f20258b.f27563e) {
                    kotlin.collections.i0.w(arrayList);
                }
                kotlin.collections.i0.w(arrayListJ);
                b0 b0Var = zVar2.f20259c;
                if (b0Var != null) {
                    arrayListJ.add(b0Var);
                }
            } else if (arrayList.isEmpty() || zVar2.f20258b.f27563e != ((z) CollectionsKt.O(arrayList)).f20258b.f27563e) {
                lVar.a(Lifecycle.State.CREATED);
            } else {
                z zVar5 = (z) kotlin.collections.i0.w(arrayList);
                if (state == Lifecycle.State.RESUMED) {
                    lVar.a(Lifecycle.State.STARTED);
                } else {
                    Lifecycle.State state3 = Lifecycle.State.STARTED;
                    if (state != state3) {
                        map.put(lVar, state3);
                    }
                }
                b0 b0Var2 = zVar5.f20259c;
                if (b0Var2 != null && !arrayList.contains(b0Var2)) {
                    arrayList.add(b0Var2);
                }
            }
        }
        for (l lVar2 : arrayListT0) {
            Lifecycle.State state4 = (Lifecycle.State) map.get(lVar2);
            if (state4 != null) {
                lVar2.getClass();
                c cVar = lVar2.f20169h;
                cVar.getClass();
                cVar.f27524k = state4;
                cVar.b();
            } else {
                lVar2.f20169h.b();
            }
        }
    }
}
