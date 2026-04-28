package a40;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.n0;
import kotlin.collections.o0;
import kotlin.collections.x0;
import w2.g0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f805c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f806d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f807e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f808f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f809g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f810h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f811i;

    public x(y9.b bVar, l8.g gVar, c6.y yVar) {
        int i11;
        aa.h hVar;
        Object wVar;
        this.f803a = 3;
        this.f806d = bVar;
        this.f807e = gVar;
        Object obj = bVar.f45639e;
        y9.u uVar = bVar.f45641g;
        ia.a aVar = bVar.f45637c;
        ha.b bVar2 = bVar.f45649p;
        String str = bVar.f45636b;
        this.f808f = obj == null ? n0.f26529a : obj;
        if (bVar2 != null) {
            this.f810h = null;
            if (bVar2.o()) {
                wVar = new aa.w(new ub.a(this, bVar2), str == null ? ":memory:" : str, yVar);
            } else {
                if (str == null) {
                    hVar = new aa.h(new ub.a(this, bVar2));
                } else {
                    ub.a aVar2 = new ub.a(this, bVar2);
                    uVar.getClass();
                    int[] iArr = y9.a.$EnumSwitchMapping$0;
                    int i12 = iArr[uVar.ordinal()];
                    if (i12 == 1) {
                        i11 = 1;
                    } else {
                        if (i12 != 2) {
                            wy.o.m(uVar, "Can't get max number of reader for journal mode '");
                            throw null;
                        }
                        i11 = 4;
                    }
                    int i13 = iArr[uVar.ordinal()];
                    if (i13 != 1 && i13 != 2) {
                        wy.o.m(uVar, "Can't get max number of writers for journal mode '");
                        throw null;
                    }
                    hVar = new aa.h(aVar2, str, i11);
                }
                wVar = hVar;
            }
            this.f809g = wVar;
        } else {
            if (aVar == null) {
                i4.a.f("SQLiteManager was constructed with both null driver and open helper factory!");
                throw null;
            }
            Context context = bVar.f45635a;
            context.getClass();
            ia.b bVarA = aVar.a(new e20.a(context, str, new androidx.constraintlayout.widget.z(this, gVar.f27452a), false, false));
            this.f810h = bVarA;
            bVarA.getClass();
            jb.b bVar3 = new jb.b();
            bVar3.f24851a = bVarA;
            this.f809g = new aa.w(bVar3, str == null ? ":memory:" : str, yVar);
        }
        boolean z11 = uVar == y9.u.WRITE_AHEAD_LOGGING;
        ia.b bVar4 = (ia.b) this.f810h;
        if (bVar4 != null) {
            bVar4.setWriteAheadLoggingEnabled(z11);
        }
    }

    public static final void a(x xVar, ha.a aVar) throws Throwable {
        Object pVar;
        l8.g gVar = (l8.g) xVar.f807e;
        f(aVar);
        y9.b bVar = (y9.b) xVar.f806d;
        y9.u uVar = bVar.f45641g;
        y9.u uVar2 = y9.u.WRITE_AHEAD_LOGGING;
        if (uVar == uVar2) {
            z20.b.m(aVar, "PRAGMA journal_mode = WAL");
        } else {
            z20.b.m(aVar, "PRAGMA journal_mode = TRUNCATE");
        }
        if (bVar.f45641g == uVar2) {
            z20.b.m(aVar, "PRAGMA synchronous = NORMAL");
        } else {
            z20.b.m(aVar, "PRAGMA synchronous = FULL");
        }
        ha.c cVarV0 = aVar.v0("PRAGMA user_version");
        try {
            cVarV0.q0();
            int i11 = (int) cVarV0.getLong(0);
            w.b.y(cVarV0, null);
            int i12 = gVar.f27452a;
            if (i11 != i12) {
                z20.b.m(aVar, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    u70.o oVar = u70.q.f40850b;
                    if (i11 == 0) {
                        xVar.l(aVar);
                    } else {
                        xVar.m(aVar, i11, i12);
                    }
                    z20.b.m(aVar, "PRAGMA user_version = " + i12);
                    pVar = Unit.f26487a;
                } catch (Throwable th2) {
                    u70.o oVar2 = u70.q.f40850b;
                    pVar = new u70.p(th2);
                }
                if (!(pVar instanceof u70.p)) {
                    z20.b.m(aVar, "END TRANSACTION");
                }
                Throwable thA = u70.q.a(pVar);
                if (thA != null) {
                    z20.b.m(aVar, "ROLLBACK TRANSACTION");
                    throw thA;
                }
            }
            xVar.n(aVar);
        } finally {
        }
    }

    public static void f(ha.a aVar) {
        ha.c cVarV0 = aVar.v0("PRAGMA busy_timeout");
        try {
            cVarV0.q0();
            long j9 = cVarV0.getLong(0);
            w.b.y(cVarV0, null);
            if (j9 < 3000) {
                z20.b.m(aVar, "PRAGMA busy_timeout = 3000");
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                w.b.y(cVarV0, th2);
                throw th3;
            }
        }
    }

    public void b(o6.g gVar, int i11, ArrayList arrayList, o6.n nVar) {
        o6.t tVar = gVar.f32006d;
        o6.n nVar2 = tVar.f32031c;
        o6.g gVar2 = tVar.f32037i;
        o6.g gVar3 = tVar.f32036h;
        if (nVar2 == null) {
            n6.h hVar = (n6.h) this.f806d;
            if (tVar == hVar.f30580d || tVar == hVar.f30582e) {
                return;
            }
            if (nVar == null) {
                nVar = new o6.n();
                nVar.f32018a = null;
                nVar.f32019b = new ArrayList();
                nVar.f32018a = tVar;
                arrayList.add(nVar);
            }
            tVar.f32031c = nVar;
            nVar.f32019b.add(tVar);
            for (o6.e eVar : gVar3.f32013k) {
                if (eVar instanceof o6.g) {
                    b((o6.g) eVar, i11, arrayList, nVar);
                }
            }
            for (o6.e eVar2 : gVar2.f32013k) {
                if (eVar2 instanceof o6.g) {
                    b((o6.g) eVar2, i11, arrayList, nVar);
                }
            }
            if (i11 == 1 && (tVar instanceof o6.p)) {
                for (o6.e eVar3 : ((o6.p) tVar).f32021k.f32013k) {
                    if (eVar3 instanceof o6.g) {
                        b((o6.g) eVar3, i11, arrayList, nVar);
                    }
                }
            }
            Iterator it = gVar3.l.iterator();
            while (it.hasNext()) {
                b((o6.g) it.next(), i11, arrayList, nVar);
            }
            Iterator it2 = gVar2.l.iterator();
            while (it2.hasNext()) {
                b((o6.g) it2.next(), i11, arrayList, nVar);
            }
            if (i11 == 1 && (tVar instanceof o6.p)) {
                Iterator it3 = ((o6.p) tVar).f32021k.l.iterator();
                while (it3.hasNext()) {
                    b((o6.g) it3.next(), i11, arrayList, nVar);
                }
            }
        }
    }

    public void c(n6.h hVar) {
        char c3;
        n6.f fVar;
        n6.f fVar2;
        n6.f fVar3;
        n6.f fVar4;
        Iterator it = hVar.f30619v0.iterator();
        while (it.hasNext()) {
            n6.g gVar = (n6.g) it.next();
            n6.f[] fVarArr = gVar.V;
            n6.d[] dVarArr = gVar.S;
            n6.d dVar = gVar.N;
            n6.d dVar2 = gVar.L;
            n6.d dVar3 = gVar.M;
            n6.d dVar4 = gVar.K;
            n6.f fVar5 = fVarArr[0];
            n6.f fVar6 = fVarArr[1];
            if (gVar.f30593j0 == 8) {
                gVar.f30574a = true;
            } else {
                float f11 = gVar.f30616x;
                if (f11 < 1.0f && fVar5 == n6.f.MATCH_CONSTRAINT) {
                    gVar.f30609s = 2;
                }
                float f12 = gVar.A;
                if (f12 < 1.0f) {
                    c3 = 0;
                    if (fVar6 == n6.f.MATCH_CONSTRAINT) {
                        gVar.f30611t = 2;
                    }
                } else {
                    c3 = 0;
                }
                if (gVar.Z > 0.0f) {
                    n6.f fVar7 = n6.f.MATCH_CONSTRAINT;
                    if (fVar5 == fVar7 && (fVar6 == n6.f.WRAP_CONTENT || fVar6 == n6.f.FIXED)) {
                        gVar.f30609s = 3;
                    } else if (fVar6 == fVar7 && (fVar5 == n6.f.WRAP_CONTENT || fVar5 == n6.f.FIXED)) {
                        gVar.f30611t = 3;
                    } else if (fVar5 == fVar7 && fVar6 == fVar7) {
                        if (gVar.f30609s == 0) {
                            gVar.f30609s = 3;
                        }
                        if (gVar.f30611t == 0) {
                            gVar.f30611t = 3;
                        }
                    }
                }
                n6.f fVar8 = n6.f.MATCH_CONSTRAINT;
                if (fVar5 == fVar8 && gVar.f30609s == 1 && (dVar4.f30569f == null || dVar3.f30569f == null)) {
                    fVar5 = n6.f.WRAP_CONTENT;
                }
                if (fVar6 == fVar8 && gVar.f30611t == 1 && (dVar2.f30569f == null || dVar.f30569f == null)) {
                    fVar6 = n6.f.WRAP_CONTENT;
                }
                o6.m mVar = gVar.f30580d;
                mVar.f32032d = fVar5;
                int i11 = gVar.f30609s;
                mVar.f32029a = i11;
                o6.p pVar = gVar.f30582e;
                pVar.f32032d = fVar6;
                int i12 = gVar.f30611t;
                pVar.f32029a = i12;
                n6.f fVar9 = n6.f.MATCH_PARENT;
                Iterator it2 = it;
                if ((fVar5 == fVar9 || fVar5 == n6.f.FIXED || fVar5 == n6.f.WRAP_CONTENT) && (fVar6 == fVar9 || fVar6 == n6.f.FIXED || fVar6 == n6.f.WRAP_CONTENT)) {
                    n6.f fVar10 = fVar6;
                    int iS = gVar.s();
                    if (fVar5 == fVar9) {
                        iS = (hVar.s() - dVar4.f30570g) - dVar3.f30570g;
                        fVar5 = n6.f.FIXED;
                    }
                    int iM = gVar.m();
                    if (fVar10 == fVar9) {
                        iM = (hVar.m() - dVar2.f30570g) - dVar.f30570g;
                        fVar10 = n6.f.FIXED;
                    }
                    j(gVar, fVar5, iS, fVar10, iM);
                    gVar.f30580d.f32033e.d(gVar.s());
                    gVar.f30582e.f32033e.d(gVar.m());
                    gVar.f30574a = true;
                } else {
                    if (fVar5 != fVar8 || (fVar6 != (fVar4 = n6.f.WRAP_CONTENT) && fVar6 != n6.f.FIXED)) {
                        fVar = fVar6;
                    } else if (i11 == 3) {
                        if (fVar6 == fVar4) {
                            j(gVar, fVar4, 0, fVar4, 0);
                        }
                        int iM2 = gVar.m();
                        int i13 = (int) ((iM2 * gVar.Z) + 0.5f);
                        n6.f fVar11 = n6.f.FIXED;
                        j(gVar, fVar11, i13, fVar11, iM2);
                        gVar.f30580d.f32033e.d(gVar.s());
                        gVar.f30582e.f32033e.d(gVar.m());
                        gVar.f30574a = true;
                    } else if (i11 == 1) {
                        j(gVar, fVar4, 0, fVar6, 0);
                        gVar.f30580d.f32033e.f32014m = gVar.s();
                    } else {
                        fVar = fVar6;
                        if (i11 == 2) {
                            n6.f fVar12 = hVar.V[c3];
                            n6.f fVar13 = n6.f.FIXED;
                            if (fVar12 == fVar13 || fVar12 == fVar9) {
                                j(gVar, fVar13, (int) ((f11 * hVar.s()) + 0.5f), fVar, gVar.m());
                                gVar.f30580d.f32033e.d(gVar.s());
                                gVar.f30582e.f32033e.d(gVar.m());
                                gVar.f30574a = true;
                            }
                        } else if (dVarArr[c3].f30569f == null || dVarArr[1].f30569f == null) {
                            j(gVar, fVar4, 0, fVar, 0);
                            gVar.f30580d.f32033e.d(gVar.s());
                            gVar.f30582e.f32033e.d(gVar.m());
                            gVar.f30574a = true;
                        }
                    }
                    if (fVar != fVar8 || (fVar5 != (fVar3 = n6.f.WRAP_CONTENT) && fVar5 != n6.f.FIXED)) {
                        fVar2 = fVar;
                    } else if (i12 == 3) {
                        if (fVar5 == fVar3) {
                            j(gVar, fVar3, 0, fVar3, 0);
                        }
                        int iS2 = gVar.s();
                        float f13 = gVar.Z;
                        if (gVar.f30575a0 == -1) {
                            f13 = 1.0f / f13;
                        }
                        n6.f fVar14 = n6.f.FIXED;
                        j(gVar, fVar14, iS2, fVar14, (int) ((iS2 * f13) + 0.5f));
                        gVar.f30580d.f32033e.d(gVar.s());
                        gVar.f30582e.f32033e.d(gVar.m());
                        gVar.f30574a = true;
                    } else if (i12 == 1) {
                        j(gVar, fVar5, 0, fVar3, 0);
                        gVar.f30582e.f32033e.f32014m = gVar.m();
                    } else {
                        n6.f fVar15 = fVar5;
                        if (i12 == 2) {
                            n6.f fVar16 = hVar.V[1];
                            n6.f fVar17 = fVar;
                            n6.f fVar18 = n6.f.FIXED;
                            if (fVar16 == fVar18 || fVar16 == fVar9) {
                                j(gVar, fVar15, gVar.s(), fVar18, (int) ((f12 * hVar.m()) + 0.5f));
                                gVar.f30580d.f32033e.d(gVar.s());
                                gVar.f30582e.f32033e.d(gVar.m());
                                gVar.f30574a = true;
                            } else {
                                fVar2 = fVar17;
                                fVar5 = fVar15;
                            }
                        } else {
                            fVar5 = fVar15;
                            n6.f fVar19 = fVar;
                            if (dVarArr[2].f30569f == null || dVarArr[3].f30569f == null) {
                                j(gVar, fVar3, 0, fVar19, 0);
                                gVar.f30580d.f32033e.d(gVar.s());
                                gVar.f30582e.f32033e.d(gVar.m());
                                gVar.f30574a = true;
                            } else {
                                fVar2 = fVar19;
                            }
                        }
                    }
                    if (fVar5 == fVar8 && fVar2 == fVar8) {
                        if (i11 == 1 || i12 == 1) {
                            n6.f fVar20 = n6.f.WRAP_CONTENT;
                            j(gVar, fVar20, 0, fVar20, 0);
                            gVar.f30580d.f32033e.f32014m = gVar.s();
                            gVar.f30582e.f32033e.f32014m = gVar.m();
                        } else if (i12 == 2 && i11 == 2) {
                            n6.f[] fVarArr2 = hVar.V;
                            n6.f fVar21 = fVarArr2[c3];
                            n6.f fVar22 = n6.f.FIXED;
                            if (fVar21 == fVar22 && fVarArr2[1] == fVar22) {
                                j(gVar, fVar22, (int) ((f11 * hVar.s()) + 0.5f), fVar22, (int) ((f12 * hVar.m()) + 0.5f));
                                gVar.f30580d.f32033e.d(gVar.s());
                                gVar.f30582e.f32033e.d(gVar.m());
                                gVar.f30574a = true;
                            }
                        }
                    }
                }
                it = it2;
            }
        }
    }

    public void d() {
        n6.h hVar = (n6.h) this.f806d;
        ArrayList arrayList = (ArrayList) this.f811i;
        ArrayList<o6.t> arrayList2 = (ArrayList) this.f808f;
        arrayList2.clear();
        n6.h hVar2 = (n6.h) this.f807e;
        hVar2.f30580d.f();
        hVar2.f30582e.f();
        arrayList2.add(hVar2.f30580d);
        arrayList2.add(hVar2.f30582e);
        HashSet hashSet = null;
        for (n6.g gVar : hVar2.f30619v0) {
            if (gVar instanceof n6.l) {
                o6.j jVar = new o6.j(gVar);
                gVar.f30580d.f();
                gVar.f30582e.f();
                jVar.f32034f = ((n6.l) gVar).f30653z0;
                arrayList2.add(jVar);
            } else {
                if (gVar.z()) {
                    if (gVar.f30576b == null) {
                        gVar.f30576b = new o6.d(gVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(gVar.f30576b);
                } else {
                    arrayList2.add(gVar.f30580d);
                }
                if (gVar.A()) {
                    if (gVar.f30578c == null) {
                        gVar.f30578c = new o6.d(gVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(gVar.f30578c);
                } else {
                    arrayList2.add(gVar.f30582e);
                }
                if (gVar instanceof n6.m) {
                    arrayList2.add(new o6.k(gVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList2.addAll(hashSet);
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((o6.t) it.next()).f();
        }
        for (o6.t tVar : arrayList2) {
            if (tVar.f32030b != hVar2) {
                tVar.d();
            }
        }
        arrayList.clear();
        g(hVar.f30580d, 0, arrayList);
        g(hVar.f30582e, 1, arrayList);
        this.f804b = false;
    }

    public int e(n6.h hVar, int i11) {
        ArrayList arrayList;
        int i12;
        long jMax;
        float f11;
        n6.h hVar2 = hVar;
        ArrayList arrayList2 = (ArrayList) this.f811i;
        int size = arrayList2.size();
        long j9 = 0;
        int i13 = 0;
        long jMax2 = 0;
        while (i13 < size) {
            o6.t tVar = ((o6.n) arrayList2.get(i13)).f32018a;
            if (!(tVar instanceof o6.d) ? !(i11 != 0 ? (tVar instanceof o6.p) : (tVar instanceof o6.m)) : ((o6.d) tVar).f32034f != i11) {
                o6.g gVar = (i11 == 0 ? hVar2.f30580d : hVar2.f30582e).f32036h;
                o6.g gVar2 = (i11 == 0 ? hVar2.f30580d : hVar2.f30582e).f32037i;
                o6.g gVar3 = tVar.f32036h;
                o6.g gVar4 = tVar.f32037i;
                boolean zContains = gVar3.l.contains(gVar);
                boolean zContains2 = gVar4.l.contains(gVar2);
                long j11 = tVar.j();
                if (zContains && zContains2) {
                    long jB = o6.n.b(gVar3, j9);
                    long jA = o6.n.a(gVar4, j9);
                    long j12 = jB - j11;
                    int i14 = gVar4.f32008f;
                    arrayList = arrayList2;
                    i12 = size;
                    if (j12 >= (-i14)) {
                        j12 += (long) i14;
                    }
                    long j13 = gVar3.f32008f;
                    long j14 = ((-jA) - j11) - j13;
                    if (j14 >= j13) {
                        j14 -= j13;
                    }
                    n6.g gVar5 = tVar.f32030b;
                    if (i11 == 0) {
                        f11 = gVar5.f30587g0;
                    } else if (i11 == 1) {
                        f11 = gVar5.f30589h0;
                    } else {
                        gVar5.getClass();
                        f11 = -1.0f;
                    }
                    float f12 = f11 > 0.0f ? (long) ((j12 / (1.0f - f11)) + (j14 / f11)) : 0L;
                    jMax = (((long) gVar3.f32008f) + ((((long) ((f12 * f11) + 0.5f)) + j11) + ((long) j4.s.a(1.0f, f11, f12, 0.5f)))) - ((long) gVar4.f32008f);
                } else {
                    arrayList = arrayList2;
                    i12 = size;
                    jMax = zContains ? Math.max(o6.n.b(gVar3, gVar3.f32008f), ((long) gVar3.f32008f) + j11) : zContains2 ? Math.max(-o6.n.a(gVar4, gVar4.f32008f), ((long) (-gVar4.f32008f)) + j11) : (tVar.j() + ((long) gVar3.f32008f)) - ((long) gVar4.f32008f);
                }
            } else {
                arrayList = arrayList2;
                i12 = size;
                jMax = j9;
            }
            jMax2 = Math.max(jMax2, jMax);
            i13++;
            hVar2 = hVar;
            arrayList2 = arrayList;
            size = i12;
            j9 = 0;
        }
        return (int) jMax2;
    }

    public void g(o6.t tVar, int i11, ArrayList arrayList) {
        o6.g gVar = tVar.f32036h;
        o6.g gVar2 = tVar.f32037i;
        for (o6.e eVar : gVar.f32013k) {
            if (eVar instanceof o6.g) {
                b((o6.g) eVar, i11, arrayList, null);
            } else if (eVar instanceof o6.t) {
                b(((o6.t) eVar).f32036h, i11, arrayList, null);
            }
        }
        for (o6.e eVar2 : gVar2.f32013k) {
            if (eVar2 instanceof o6.g) {
                b((o6.g) eVar2, i11, arrayList, null);
            } else if (eVar2 instanceof o6.t) {
                b(((o6.t) eVar2).f32037i, i11, arrayList, null);
            }
        }
        if (i11 == 1) {
            for (o6.e eVar3 : ((o6.p) tVar).f32021k.f32013k) {
                if (eVar3 instanceof o6.g) {
                    b((o6.g) eVar3, i11, arrayList, null);
                }
            }
        }
    }

    public synchronized boolean h() {
        boolean zH;
        Boolean bool = (Boolean) this.f811i;
        if (bool != null) {
            zH = bool.booleanValue();
        } else {
            try {
                zH = ((p30.g) this.f807e).h();
            } catch (IllegalStateException unused) {
                zH = false;
            }
        }
        i(zH);
        return zH;
    }

    public void i(boolean z11) {
        String strD = org.bouncycastle.jcajce.provider.asymmetric.a.d("Crashlytics automatic data collection ", z11 ? "ENABLED" : "DISABLED", " by ", ((Boolean) this.f811i) == null ? "global Firebase setting" : this.f805c ? "firebase_crashlytics_collection_enabled manifest flag" : "API", ".");
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", strD, null);
        }
    }

    public void j(n6.g gVar, n6.f fVar, int i11, n6.f fVar2, int i12) {
        o6.b bVar = (o6.b) this.f810h;
        bVar.f31992a = fVar;
        bVar.f31993b = fVar2;
        bVar.f31994c = i11;
        bVar.f31995d = i12;
        ((o6.c) this.f809g).b(gVar, bVar);
        gVar.T(bVar.f31996e);
        gVar.O(bVar.f31997f);
        gVar.F = bVar.f31999h;
        gVar.K(bVar.f31998g);
    }

    public void k() {
        o6.a aVar;
        for (n6.g gVar : ((n6.h) this.f806d).f30619v0) {
            if (!gVar.f30574a) {
                n6.f[] fVarArr = gVar.V;
                boolean z11 = false;
                n6.f fVar = fVarArr[0];
                n6.f fVar2 = fVarArr[1];
                int i11 = gVar.f30609s;
                int i12 = gVar.f30611t;
                n6.f fVar3 = n6.f.WRAP_CONTENT;
                boolean z12 = fVar == fVar3 || (fVar == n6.f.MATCH_CONSTRAINT && i11 == 1);
                if (fVar2 == fVar3 || (fVar2 == n6.f.MATCH_CONSTRAINT && i12 == 1)) {
                    z11 = true;
                }
                o6.h hVar = gVar.f30580d.f32033e;
                boolean z13 = hVar.f32012j;
                o6.h hVar2 = gVar.f30582e.f32033e;
                boolean z14 = hVar2.f32012j;
                if (z13 && z14) {
                    n6.f fVar4 = n6.f.FIXED;
                    j(gVar, fVar4, hVar.f32009g, fVar4, hVar2.f32009g);
                    gVar.f30574a = true;
                } else if (z13 && z11) {
                    j(gVar, n6.f.FIXED, hVar.f32009g, fVar3, hVar2.f32009g);
                    n6.f fVar5 = n6.f.MATCH_CONSTRAINT;
                    o6.p pVar = gVar.f30582e;
                    if (fVar2 == fVar5) {
                        pVar.f32033e.f32014m = gVar.m();
                    } else {
                        pVar.f32033e.d(gVar.m());
                        gVar.f30574a = true;
                    }
                } else if (z14 && z12) {
                    j(gVar, fVar3, hVar.f32009g, n6.f.FIXED, hVar2.f32009g);
                    n6.f fVar6 = n6.f.MATCH_CONSTRAINT;
                    o6.m mVar = gVar.f30580d;
                    if (fVar == fVar6) {
                        mVar.f32033e.f32014m = gVar.s();
                    } else {
                        mVar.f32033e.d(gVar.s());
                        gVar.f30574a = true;
                    }
                }
                if (gVar.f30574a && (aVar = gVar.f30582e.l) != null) {
                    aVar.d(gVar.f30581d0);
                }
            }
        }
    }

    public void l(ha.a aVar) {
        l8.g gVar = (l8.g) this.f807e;
        aVar.getClass();
        ha.c cVarV0 = aVar.v0("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z11 = false;
            if (cVarV0.q0()) {
                if (cVarV0.getLong(0) == 0) {
                    z11 = true;
                }
            }
            w.b.y(cVarV0, null);
            gVar.a(aVar);
            if (!z11) {
                nx.n nVarG = gVar.g(aVar);
                if (!nVarG.f31448b) {
                    wy.o.h(nVarG.f31449c, "Pre-packaged database has an invalid schema: ");
                    return;
                }
            }
            o(aVar);
            gVar.c(aVar);
            Iterator it = ((List) this.f808f).iterator();
            while (it.hasNext()) {
                ((jb.a) it.next()).getClass();
                if (aVar instanceof ka.a) {
                    ((ka.a) aVar).f26243a.getClass();
                }
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x00a6 A[EDGE_INSN: B:128:0x00a6->B:40:0x00a6 BREAK  A[LOOP:4: B:10:0x002a->B:132:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m(ha.a r17, int r18, int r19) {
        /*
            Method dump skipped, instruction units count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a40.x.m(ha.a, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void n(ha.a r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a40.x.n(ha.a):void");
    }

    public void o(ha.a aVar) {
        z20.b.m(aVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        z20.b.m(aVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + ((String) ((l8.g) this.f807e).f27453b) + "')");
    }

    public String toString() {
        switch (this.f803a) {
            case 1:
                Map map = (Map) this.f811i;
                Long l = (Long) this.f810h;
                Long l7 = (Long) this.f809g;
                Long l11 = (Long) this.f808f;
                Long l12 = (Long) this.f807e;
                ArrayList arrayList = new ArrayList();
                if (this.f804b) {
                    arrayList.add("isRegularFile");
                }
                if (this.f805c) {
                    arrayList.add("isDirectory");
                }
                if (l12 != null) {
                    arrayList.add("byteCount=" + l12.longValue());
                }
                if (l11 != null) {
                    arrayList.add("createdAt=" + l11.longValue());
                }
                if (l7 != null) {
                    arrayList.add("lastModifiedAt=" + l7.longValue());
                }
                if (l != null) {
                    arrayList.add("lastAccessedAt=" + l.longValue());
                }
                if (!map.isEmpty()) {
                    arrayList.add("extras=" + map);
                }
                return CollectionsKt.U(arrayList, ", ", "FileMetadata(", ")", null, 56);
            default:
                return super.toString();
        }
    }

    public x(y9.b bVar, g0 g0Var, c6.y yVar) {
        this.f803a = 3;
        this.f806d = bVar;
        this.f807e = new y9.s(-1, "", "");
        Collection collection = bVar.f45639e;
        this.f808f = collection == null ? n0.f26529a : collection;
        CollectionsKt.e0(collection == null ? n0.f26529a : collection, new jb.a(new sg.c(this, 24)));
        Context context = bVar.f45635a;
        u6.f fVar = bVar.f45638d;
        y9.u uVar = bVar.f45641g;
        Executor executor = bVar.f45642h;
        Executor executor2 = bVar.f45643i;
        List list = bVar.f45646m;
        List list2 = bVar.f45647n;
        context.getClass();
        fVar.getClass();
        uVar.getClass();
        executor.getClass();
        executor2.getClass();
        list.getClass();
        list2.getClass();
        throw new u70.n(null, 1, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public x(boolean z11, boolean z12, ia0.a0 a0Var, Long l, Long l7, Long l11, Long l12) {
        this.f803a = 1;
        o0 o0Var = o0.f26530a;
        o0Var.getClass();
        this(z11, z12, a0Var, l, l7, l11, l12, o0Var);
    }

    public x(n6.h hVar) {
        this.f803a = 2;
        this.f804b = true;
        this.f805c = true;
        this.f808f = new ArrayList();
        new ArrayList();
        this.f809g = null;
        this.f810h = new o6.b();
        this.f811i = new ArrayList();
        this.f806d = hVar;
        this.f807e = hVar;
    }

    public x(p30.g gVar) {
        Boolean boolValueOf;
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        this.f803a = 0;
        Object obj = new Object();
        this.f808f = obj;
        this.f809g = new d10.g();
        this.f804b = false;
        this.f805c = false;
        this.f810h = new d10.g();
        gVar.a();
        Context context = gVar.f34222a;
        this.f807e = gVar;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.crashlytics", 0);
        this.f806d = sharedPreferences;
        if (sharedPreferences.contains("firebase_crashlytics_collection_enabled")) {
            this.f805c = false;
            boolValueOf = Boolean.valueOf(sharedPreferences.getBoolean("firebase_crashlytics_collection_enabled", true));
        } else {
            boolValueOf = null;
        }
        if (boolValueOf == null) {
            try {
                packageManager = context.getPackageManager();
            } catch (PackageManager.NameNotFoundException e5) {
                Log.e("FirebaseCrashlytics", "Could not read data collection permission from manifest", e5);
            }
            Boolean boolValueOf2 = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled")) ? null : Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
            if (boolValueOf2 == null) {
                this.f805c = false;
                boolValueOf = null;
            } else {
                this.f805c = true;
                boolValueOf = Boolean.valueOf(Boolean.TRUE.equals(boolValueOf2));
            }
        }
        this.f811i = boolValueOf;
        synchronized (obj) {
            try {
                if (h()) {
                    ((d10.g) this.f809g).d(null);
                    this.f804b = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public x(boolean z11, boolean z12, ia0.a0 a0Var, Long l, Long l7, Long l11, Long l12, Map map) {
        this.f803a = 1;
        map.getClass();
        this.f804b = z11;
        this.f805c = z12;
        this.f806d = a0Var;
        this.f807e = l;
        this.f808f = l7;
        this.f809g = l11;
        this.f810h = l12;
        this.f811i = x0.k(map);
    }
}
