package f6;

import a40.x;
import android.util.Log;
import b0.z;
import c5.n3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import z4.c0;
import z4.l1;
import z4.m1;
import z4.t0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements o6.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n6.h f17422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LinkedHashMap f17423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f17424c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f17425d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f17426e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f17427f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f17428g;

    public s(z5.c cVar) {
        n6.h hVar = new n6.h(0, 0);
        hVar.f30619v0 = new ArrayList();
        hVar.f30620w0 = new j30.g(hVar);
        x xVar = new x(hVar);
        hVar.f30621x0 = xVar;
        hVar.f30623z0 = null;
        hVar.A0 = false;
        hVar.B0 = new g6.c();
        hVar.E0 = 0;
        hVar.F0 = 0;
        hVar.G0 = new n6.b[4];
        hVar.H0 = new n6.b[4];
        hVar.I0 = 257;
        hVar.J0 = false;
        hVar.K0 = false;
        hVar.L0 = null;
        hVar.M0 = null;
        hVar.N0 = null;
        hVar.O0 = null;
        hVar.P0 = new HashSet();
        hVar.Q0 = new o6.b();
        hVar.f30623z0 = this;
        xVar.f809g = this;
        this.f17422a = hVar;
        this.f17423b = new LinkedHashMap();
        this.f17424c = new LinkedHashMap();
        this.f17425d = new LinkedHashMap();
        this.f17426e = new t(cVar);
        this.f17427f = new int[2];
        this.f17428g = new int[2];
    }

    public static void d(n6.f fVar, int i11, int i12, int i13, boolean z11, boolean z12, int i14, int[] iArr) {
        int i15 = r.$EnumSwitchMapping$0[fVar.ordinal()];
        if (i15 == 1) {
            iArr[0] = i11;
            iArr[1] = i11;
            return;
        }
        if (i15 == 2) {
            iArr[0] = 0;
            iArr[1] = i14;
            return;
        }
        if (i15 == 3) {
            boolean z13 = z12 || ((i13 == 1 || i13 == 2) && (i13 == 2 || i12 != 1 || z11));
            iArr[0] = z13 ? i11 : 0;
            if (!z13) {
                i11 = i14;
            }
            iArr[1] = i11;
            return;
        }
        if (i15 == 4) {
            iArr[0] = i14;
            iArr[1] = i14;
        } else {
            throw new IllegalStateException((fVar + " is not supported").toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x019a  */
    @Override // o6.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(n6.g r28, o6.b r29) {
        /*
            Method dump skipped, instruction units count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f6.s.b(n6.g, o6.b):void");
    }

    public final long c(n6.g gVar, long j9) {
        Object obj = gVar.f30591i0;
        String str = gVar.f30594k;
        int i11 = 0;
        if (gVar instanceof n6.p) {
            int i12 = z5.a.g(j9) ? 1073741824 : z5.a.e(j9) ? Integer.MIN_VALUE : 0;
            if (z5.a.f(j9)) {
                i11 = 1073741824;
            } else if (z5.a.d(j9)) {
                i11 = Integer.MIN_VALUE;
            }
            n6.p pVar = (n6.p) gVar;
            pVar.Z(i12, z5.a.i(j9), i11, z5.a.h(j9));
            return q1.l.a(pVar.E0, pVar.F0);
        }
        if (obj instanceof t0) {
            m1 m1VarD = ((t0) obj).D(j9);
            this.f17423b.put(obj, m1VarD);
            return q1.l.a(m1VarD.f47183a, m1VarD.f47184b);
        }
        Log.w("CCL", "Nothing to measure for widget: " + str);
        return q1.l.a(0, 0);
    }

    public final void e(l1 l1Var, List list, LinkedHashMap linkedHashMap) {
        n6.g gVar;
        m1 m1Var;
        l1 l1Var2;
        this.f17423b = linkedHashMap;
        LinkedHashMap linkedHashMap2 = this.f17425d;
        boolean zIsEmpty = linkedHashMap2.isEmpty();
        n6.h hVar = this.f17422a;
        if (zIsEmpty) {
            ArrayList arrayList = hVar.f30619v0;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                n6.g gVar2 = (n6.g) arrayList.get(i11);
                Object obj = gVar2.f30591i0;
                if (obj instanceof t0) {
                    k6.n nVar = gVar2.f30592j;
                    n6.g gVar3 = nVar.f26050a;
                    if (gVar3 != null) {
                        nVar.f26051b = gVar3.t();
                        nVar.f26052c = gVar3.u();
                        nVar.f26053d = gVar3.t() + gVar3.X;
                        nVar.f26054e = gVar3.u() + gVar3.Y;
                        nVar.c(gVar3.f30592j);
                    }
                    linkedHashMap2.put(w0.e.w((t0) obj), new k6.n(nVar));
                }
            }
        }
        int size2 = list.size();
        int i12 = 0;
        while (i12 < size2) {
            t0 t0Var = (t0) list.get(i12);
            k6.n nVar2 = (k6.n) linkedHashMap2.get(w0.e.w(t0Var));
            if (nVar2 == null || (m1Var = (m1) this.f17423b.get(t0Var)) == null || nVar2.f26065q == 8) {
                l1Var2 = l1Var;
            } else if (Float.isNaN(nVar2.f26057h) && Float.isNaN(nVar2.f26058i) && Float.isNaN(nVar2.f26059j) && Float.isNaN(nVar2.f26060k) && Float.isNaN(nVar2.l) && Float.isNaN(nVar2.f26061m) && Float.isNaN(nVar2.f26062n) && Float.isNaN(nVar2.f26063o) && Float.isNaN(nVar2.f26064p)) {
                int i13 = (int) 0;
                l1.n(l1Var, m1Var, (((long) (nVar2.f26052c - i13)) & 4294967295L) | (((long) (nVar2.f26051b - i13)) << 32));
                l1Var2 = l1Var;
            } else {
                androidx.fragment.app.r rVar = new androidx.fragment.app.r(nVar2, 17);
                int i14 = (int) 0;
                int i15 = nVar2.f26051b - i14;
                int i16 = nVar2.f26052c - i14;
                l1Var2 = l1Var;
                l1Var2.u(m1Var, i15, i16, Float.isNaN(nVar2.f26061m) ? 0.0f : nVar2.f26061m, rVar);
            }
            i12++;
            l1Var = l1Var2;
        }
        if (q.BOUNDS == null) {
            StringBuilder sb2 = new StringBuilder("{   root: {interpolated: { left:  0,  top:  0,");
            sb2.append("  right:   " + hVar.s() + " ,");
            sb2.append("  bottom:  " + hVar.m() + " ,");
            sb2.append(" } }");
            for (n6.g gVar4 : hVar.f30619v0) {
                Object obj2 = gVar4.f30591i0;
                if (obj2 instanceof t0) {
                    if (gVar4.f30594k == null) {
                        t0 t0Var2 = (t0) obj2;
                        Object objJ = c0.j(t0Var2);
                        if (objJ == null) {
                            t0Var2.G();
                            objJ = null;
                        }
                        gVar4.f30594k = objJ != null ? objJ.toString() : null;
                    }
                    k6.n nVar3 = (k6.n) linkedHashMap2.get(w0.e.w((t0) obj2));
                    k6.n nVar4 = (nVar3 == null || (gVar = nVar3.f26050a) == null) ? null : gVar.f30592j;
                    if (nVar4 != null) {
                        sb2.append(" " + gVar4.f30594k + ": {");
                        sb2.append(" interpolated : ");
                        HashMap map = nVar4.f26066r;
                        sb2.append("{\n");
                        k6.n.b(nVar4.f26051b, "left", sb2);
                        k6.n.b(nVar4.f26052c, "top", sb2);
                        k6.n.b(nVar4.f26053d, "right", sb2);
                        k6.n.b(nVar4.f26054e, "bottom", sb2);
                        k6.n.a(nVar4.f26055f, "pivotX", sb2);
                        k6.n.a(nVar4.f26056g, "pivotY", sb2);
                        k6.n.a(nVar4.f26057h, "rotationX", sb2);
                        k6.n.a(nVar4.f26058i, "rotationY", sb2);
                        k6.n.a(nVar4.f26059j, "rotationZ", sb2);
                        k6.n.a(nVar4.f26060k, "translationX", sb2);
                        k6.n.a(nVar4.l, "translationY", sb2);
                        k6.n.a(nVar4.f26061m, "translationZ", sb2);
                        k6.n.a(nVar4.f26062n, "scaleX", sb2);
                        k6.n.a(nVar4.f26063o, "scaleY", sb2);
                        k6.n.a(nVar4.f26064p, "alpha", sb2);
                        k6.n.b(nVar4.f26065q, "visibility", sb2);
                        k6.n.a(Float.NaN, "interpolatedPos", sb2);
                        n6.g gVar5 = nVar4.f26050a;
                        if (gVar5 != null) {
                            for (n6.c cVar : n6.c.values()) {
                                n6.d dVarK = gVar5.k(cVar);
                                if (dVarK != null && dVarK.f30569f != null) {
                                    sb2.append("Anchor");
                                    sb2.append(cVar.name());
                                    sb2.append(": ['");
                                    String str = dVarK.f30569f.f30567d.f30594k;
                                    if (str == null) {
                                        str = "#PARENT";
                                    }
                                    sb2.append(str);
                                    sb2.append("', '");
                                    sb2.append(dVarK.f30569f.f30568e.name());
                                    sb2.append("', '");
                                    sb2.append(dVarK.f30570g);
                                    sb2.append("'],\n");
                                }
                            }
                        }
                        k6.n.a(Float.NaN, "phone_orientation", sb2);
                        k6.n.a(Float.NaN, "phone_orientation", sb2);
                        if (map.size() != 0) {
                            sb2.append("custom : {\n");
                            for (String str2 : map.keySet()) {
                                h6.a aVar = (h6.a) map.get(str2);
                                sb2.append(str2);
                                sb2.append(": ");
                                switch (aVar.f21495b) {
                                    case 900:
                                        sb2.append(aVar.f21496c);
                                        sb2.append(",\n");
                                        break;
                                    case 901:
                                        sb2.append(aVar.f21497d);
                                        sb2.append(",\n");
                                        break;
                                    case 902:
                                        sb2.append("'");
                                        sb2.append(h6.a.a(aVar.f21496c));
                                        sb2.append("',\n");
                                        break;
                                    case 903:
                                        sb2.append("'");
                                        sb2.append((String) null);
                                        sb2.append("',\n");
                                        break;
                                }
                            }
                            sb2.append("}\n");
                        }
                        sb2.append("}\n");
                        sb2.append("}, ");
                    }
                } else if (gVar4 instanceof n6.l) {
                    sb2.append(" " + gVar4.f30594k + ": {");
                    n6.l lVar = (n6.l) gVar4;
                    if (lVar.f30653z0 == 0) {
                        sb2.append(" type: 'hGuideline', ");
                    } else {
                        sb2.append(" type: 'vGuideline', ");
                    }
                    sb2.append(" interpolated: ");
                    sb2.append(" { left: " + lVar.t() + ", top: " + lVar.u() + ", right: " + (lVar.s() + lVar.t()) + ", bottom: " + (lVar.m() + lVar.u()) + " }");
                    sb2.append("}, ");
                }
            }
            sb2.append(" }");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final long f(long j9, z5.m mVar, n nVar, List list, LinkedHashMap linkedHashMap) {
        k6.f fVar;
        k6.f fVar2;
        int i11;
        k6.g gVar;
        n6.m mVarS;
        n6.m mVarS2;
        this.f17423b = linkedHashMap;
        if (list.isEmpty()) {
            return z.c(z5.a.k(j9), z5.a.j(j9));
        }
        boolean zG = z5.a.g(j9);
        String str = k6.f.f26036i;
        if (zG) {
            fVar = k6.f.b(z5.a.i(j9));
        } else {
            fVar = new k6.f(str);
            int iK = z5.a.k(j9);
            if (iK >= 0) {
                fVar.f26040a = iK;
            }
        }
        t tVar = this.f17426e;
        k6.b bVar = tVar.f17434f;
        HashMap map = tVar.f17432d;
        HashMap map2 = tVar.f17431c;
        k6.b bVar2 = tVar.f17434f;
        bVar.f26002e0 = fVar;
        if (z5.a.f(j9)) {
            fVar2 = k6.f.b(z5.a.h(j9));
        } else {
            fVar2 = new k6.f(str);
            int iJ = z5.a.j(j9);
            if (iJ >= 0) {
                fVar2.f26040a = iJ;
            }
        }
        bVar2.f26004f0 = fVar2;
        k6.f fVar3 = bVar2.f26002e0;
        n6.h hVar = this.f17422a;
        int i12 = 0;
        fVar3.a(hVar, 0);
        bVar2.f26004f0.a(hVar, 1);
        tVar.l = j9;
        tVar.f17430b = !(mVar == z5.m.Rtl);
        this.f17423b.clear();
        this.f17424c.clear();
        this.f17425d.clear();
        ArrayList arrayList = nVar.f17415f;
        if (!nVar.f17413d && list.size() == arrayList.size()) {
            int size = list.size();
            int i13 = 0;
            while (i13 < size) {
                Object objG = ((t0) list.get(i13)).G();
                i11 = i12;
                if (Intrinsics.areEqual(objG instanceof j ? (j) objG : null, arrayList.get(i13))) {
                    i13++;
                    i12 = i11;
                }
            }
            w.b.s(tVar, list);
            hVar.T(z5.a.i(j9));
            hVar.O(z5.a.h(j9));
            hVar.f30620w0.G(hVar);
            hVar.I0 = 257;
            g6.c.f20022q = hVar.d0(512);
            hVar.b0(hVar.I0, 0, 0, 0, 0, 0, 0);
            return z.c(hVar.s(), hVar.m());
        }
        i11 = 0;
        Iterator it = map2.keySet().iterator();
        while (it.hasNext()) {
            ((k6.h) map2.get(it.next())).b().E();
        }
        map2.clear();
        map2.put(Integer.valueOf(i11), bVar2);
        map.clear();
        tVar.f17433e.clear();
        tVar.f17436h.clear();
        tVar.f17438j = true;
        nVar.f17415f.clear();
        nVar.f17412c.d(Unit.f26487a, nVar.f17414e, new n3(list, nVar, tVar, 1));
        boolean z11 = i11;
        nVar.f17413d = z11;
        w.b.s(tVar, list);
        hVar.f30619v0.clear();
        bVar2.f26002e0.a(hVar, z11 ? 1 : 0);
        bVar2.f26004f0.a(hVar, 1);
        for (Object obj : map.keySet()) {
            n6.m mVarS3 = ((k6.g) map.get(obj)).s();
            if (mVarS3 != null) {
                k6.h hVarB = (k6.h) map2.get(obj);
                if (hVarB == null) {
                    hVarB = tVar.b(obj);
                }
                hVarB.a(mVarS3);
            }
        }
        for (Object obj2 : map2.keySet()) {
            k6.h hVar2 = (k6.h) map2.get(obj2);
            if (hVar2 != bVar2 && (hVar2.c() instanceof k6.g) && (mVarS2 = ((k6.g) hVar2.c()).s()) != null) {
                k6.h hVarB2 = (k6.h) map2.get(obj2);
                if (hVarB2 == null) {
                    hVarB2 = tVar.b(obj2);
                }
                hVarB2.a(mVarS2);
            }
        }
        Iterator it2 = map2.keySet().iterator();
        while (it2.hasNext()) {
            k6.h hVar3 = (k6.h) map2.get(it2.next());
            if (hVar3 != bVar2) {
                n6.g gVarB = hVar3.b();
                gVarB.f30596l0 = hVar3.getKey().toString();
                gVarB.W = null;
                if (hVar3.c() instanceof l6.h) {
                    hVar3.apply();
                }
                hVar.W(gVarB);
            } else {
                hVar3.a(hVar);
            }
        }
        Iterator it3 = map.keySet().iterator();
        while (it3.hasNext()) {
            k6.g gVar2 = (k6.g) map.get(it3.next());
            if (gVar2.s() != null) {
                Iterator it4 = gVar2.f26049m0.iterator();
                while (it4.hasNext()) {
                    gVar2.s().W(((k6.h) map2.get(it4.next())).b());
                }
                gVar2.apply();
            } else {
                gVar2.apply();
            }
        }
        Iterator it5 = map2.keySet().iterator();
        while (it5.hasNext()) {
            k6.h hVar4 = (k6.h) map2.get(it5.next());
            if (hVar4 != bVar2 && (hVar4.c() instanceof k6.g) && (mVarS = (gVar = (k6.g) hVar4.c()).s()) != null) {
                for (Object obj3 : gVar.f26049m0) {
                    k6.h hVar5 = (k6.h) map2.get(obj3);
                    if (hVar5 != null) {
                        mVarS.W(hVar5.b());
                    } else if (obj3 instanceof k6.h) {
                        mVarS.W(((k6.h) obj3).b());
                    } else {
                        System.out.println("couldn't find reference for " + obj3);
                    }
                }
                hVar4.apply();
            }
        }
        for (Object obj4 : map2.keySet()) {
            k6.h hVar6 = (k6.h) map2.get(obj4);
            hVar6.apply();
            n6.g gVarB2 = hVar6.b();
            if (gVarB2 != null && obj4 != null) {
                gVarB2.f30594k = obj4.toString();
            }
        }
        hVar.T(z5.a.i(j9));
        hVar.O(z5.a.h(j9));
        hVar.f30620w0.G(hVar);
        hVar.I0 = 257;
        g6.c.f20022q = hVar.d0(512);
        hVar.b0(hVar.I0, 0, 0, 0, 0, 0, 0);
        return z.c(hVar.s(), hVar.m());
    }

    @Override // o6.c
    public final void a() {
    }
}
