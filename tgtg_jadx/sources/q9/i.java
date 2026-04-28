package q9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.c0;
import kotlin.collections.i0;
import kotlin.collections.t;
import kotlin.jvm.internal.Intrinsics;
import y80.a2;
import y80.h1;
import y80.r;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a2 f36380a = r.c(j.f36393a);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a2 f36381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h1 f36382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f36383d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f36384e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e f36385f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f36386g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public h f36387h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LinkedHashSet f36388i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LinkedHashSet f36389j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LinkedHashSet f36390k;
    public boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f36391m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f36392n;

    public i() {
        a2 a2VarC = r.c(new f());
        this.f36381b = a2VarC;
        this.f36382c = new h1(a2VarC);
        this.f36383d = new t();
        this.f36384e = new t();
        this.f36388i = new LinkedHashSet();
        this.f36389j = new LinkedHashSet();
        this.f36390k = new LinkedHashSet();
    }

    public final void a(c cVar, h hVar, int i11) {
        cVar.getClass();
        if (hVar.f36378a == null) {
            (i11 != 0 ? i11 != 1 ? this.f36388i : this.f36389j : this.f36390k).add(hVar);
            hVar.f36378a = cVar;
            ((f) this.f36382c.f45488a.getValue()).getClass();
            hVar.b(i11 != 0 ? i11 != 1 ? this.f36392n : this.l : this.f36391m);
            return;
        }
        StringBuilder sb2 = new StringBuilder("Input '");
        sb2.append(hVar);
        c cVar2 = hVar.f36378a;
        sb2.append("' is already added to dispatcher ");
        sb2.append(cVar2);
        sb2.append('.');
        throw new IllegalArgumentException(sb2.toString().toString());
    }

    public final void b() {
        boolean z11;
        boolean z12;
        t<e> tVar = this.f36383d;
        if (tVar == null || !tVar.isEmpty()) {
            for (e eVar : tVar) {
                if (eVar.f36373e || eVar.f36374f) {
                    z11 = true;
                    break;
                }
            }
            z11 = false;
        } else {
            z11 = false;
        }
        t<e> tVar2 = this.f36384e;
        if (tVar2 == null || !tVar2.isEmpty()) {
            for (e eVar2 : tVar2) {
                if (eVar2.f36373e || eVar2.f36374f) {
                    z12 = true;
                    break;
                }
            }
            z12 = false;
        } else {
            z12 = false;
        }
        boolean z13 = z11 || z12;
        boolean z14 = this.f36391m != z11;
        boolean z15 = this.l != z12;
        boolean z16 = this.f36392n != z13;
        if (z14) {
            Iterator it = this.f36390k.iterator();
            while (it.hasNext()) {
                ((h) it.next()).b(z11);
            }
        }
        if (z15) {
            Iterator it2 = this.f36389j.iterator();
            while (it2.hasNext()) {
                ((h) it2.next()).b(z12);
            }
        }
        if (z16) {
            Iterator it3 = this.f36388i.iterator();
            while (it3.hasNext()) {
                ((h) it3.next()).b(z13);
            }
        }
        this.f36391m = z11;
        this.l = z12;
        this.f36392n = z13;
        e eVarC = this.f36385f;
        if (eVarC == null) {
            eVarC = c(0);
        }
        d(eVarC);
    }

    public final e c(int i11) {
        Object next;
        Object next2;
        Object next3;
        t tVar = this.f36384e;
        t tVar2 = this.f36383d;
        Object obj = null;
        if (i11 == -1) {
            Iterator it = tVar2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((e) next).f36373e) {
                    break;
                }
            }
            e eVar = (e) next;
            if (eVar != null) {
                return eVar;
            }
            Iterator it2 = tVar.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next4 = it2.next();
                if (((e) next4).f36373e) {
                    obj = next4;
                    break;
                }
            }
            return (e) obj;
        }
        if (i11 == 0) {
            Iterator it3 = tVar2.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it3.next();
                e eVar2 = (e) next2;
                if (eVar2.f36373e || eVar2.f36374f) {
                    break;
                }
            }
            e eVar3 = (e) next2;
            if (eVar3 != null) {
                return eVar3;
            }
            for (Object obj2 : tVar) {
                e eVar4 = (e) obj2;
                if (eVar4.f36373e || eVar4.f36374f) {
                    obj = obj2;
                    break;
                }
            }
            return (e) obj;
        }
        if (i11 != 1) {
            throw new IllegalStateException(("Unsupported direction: '" + i11 + "'.").toString());
        }
        Iterator it4 = tVar2.iterator();
        while (true) {
            if (!it4.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it4.next();
            if (((e) next3).f36374f) {
                break;
            }
        }
        e eVar5 = (e) next3;
        if (eVar5 != null) {
            return eVar5;
        }
        Iterator it5 = tVar.iterator();
        while (true) {
            if (!it5.hasNext()) {
                break;
            }
            Object next5 = it5.next();
            if (((e) next5).f36374f) {
                obj = next5;
                break;
            }
        }
        return (e) obj;
    }

    public final void d(e eVar) {
        f fVar;
        e eVarC = this.f36385f;
        if (eVarC == null) {
            eVarC = c(0);
        }
        if (Intrinsics.areEqual(eVarC, eVar)) {
            if (eVarC == null) {
                fVar = new f();
            } else {
                ArrayList arrayList = new ArrayList();
                for (e eVar2 : this.f36383d) {
                    if (eVar2.f36373e && !eVar2.f36370b.isEmpty()) {
                        arrayList.addAll(eVar2.f36370b);
                    }
                }
                for (e eVar3 : this.f36384e) {
                    if (eVar3.f36373e && !eVar3.f36370b.isEmpty()) {
                        arrayList.addAll(eVar3.f36370b);
                    }
                }
                g gVar = eVarC.f36369a;
                List list = eVarC.f36371c;
                gVar.getClass();
                list.getClass();
                v70.e eVarB = c0.b();
                i0.s(arrayList, eVarB);
                eVarB.add(gVar);
                i0.s(list, eVarB);
                fVar = new f(c0.a(eVarB), arrayList.size());
            }
            a2 a2Var = this.f36381b;
            if (Intrinsics.areEqual((f) a2Var.getValue(), fVar)) {
                return;
            }
            a2Var.getClass();
            a2Var.k(null, fVar);
            Iterator it = this.f36390k.iterator();
            while (it.hasNext()) {
                ((h) it.next()).getClass();
            }
            Iterator it2 = this.f36389j.iterator();
            while (it2.hasNext()) {
                ((h) it2.next()).getClass();
            }
            Iterator it3 = this.f36388i.iterator();
            while (it3.hasNext()) {
                ((h) it3.next()).getClass();
            }
        }
    }
}
