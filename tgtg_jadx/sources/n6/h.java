package n6;

import a40.x;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import o6.t;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends g {
    public int C0;
    public int D0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public int f30622y0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public ArrayList f30619v0 = new ArrayList();

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public j30.g f30620w0 = new j30.g(this);

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public x f30621x0 = new x(this);

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public o6.c f30623z0 = null;
    public boolean A0 = false;
    public g6.c B0 = new g6.c();
    public int E0 = 0;
    public int F0 = 0;
    public b[] G0 = new b[4];
    public b[] H0 = new b[4];
    public int I0 = 257;
    public boolean J0 = false;
    public boolean K0 = false;
    public WeakReference L0 = null;
    public WeakReference M0 = null;
    public WeakReference N0 = null;
    public WeakReference O0 = null;
    public HashSet P0 = new HashSet();
    public o6.b Q0 = new o6.b();

    public static void c0(g gVar, o6.c cVar, o6.b bVar) {
        int i11;
        int i12;
        if (cVar == null) {
            return;
        }
        int i13 = gVar.f30593j0;
        int[] iArr = gVar.f30612u;
        if (i13 == 8 || (gVar instanceof l) || (gVar instanceof a)) {
            bVar.f31996e = 0;
            bVar.f31997f = 0;
            return;
        }
        f[] fVarArr = gVar.V;
        bVar.f31992a = fVarArr[0];
        bVar.f31993b = fVarArr[1];
        bVar.f31994c = gVar.s();
        bVar.f31995d = gVar.m();
        bVar.f32000i = false;
        bVar.f32001j = 0;
        f fVar = bVar.f31992a;
        f fVar2 = f.MATCH_CONSTRAINT;
        boolean z11 = fVar == fVar2;
        boolean z12 = bVar.f31993b == fVar2;
        boolean z13 = z11 && gVar.Z > 0.0f;
        boolean z14 = z12 && gVar.Z > 0.0f;
        if (z11 && gVar.v(0) && gVar.f30609s == 0 && !z13) {
            bVar.f31992a = f.WRAP_CONTENT;
            if (z12 && gVar.f30611t == 0) {
                bVar.f31992a = f.FIXED;
            }
            z11 = false;
        }
        if (z12 && gVar.v(1) && gVar.f30611t == 0 && !z14) {
            bVar.f31993b = f.WRAP_CONTENT;
            if (z11 && gVar.f30609s == 0) {
                bVar.f31993b = f.FIXED;
            }
            z12 = false;
        }
        if (gVar.C()) {
            bVar.f31992a = f.FIXED;
            z11 = false;
        }
        if (gVar.D()) {
            bVar.f31993b = f.FIXED;
            z12 = false;
        }
        if (z13) {
            if (iArr[0] == 4) {
                bVar.f31992a = f.FIXED;
            } else if (!z12) {
                f fVar3 = bVar.f31993b;
                f fVar4 = f.FIXED;
                if (fVar3 == fVar4) {
                    i12 = bVar.f31995d;
                } else {
                    bVar.f31992a = f.WRAP_CONTENT;
                    cVar.b(gVar, bVar);
                    i12 = bVar.f31997f;
                }
                bVar.f31992a = fVar4;
                bVar.f31994c = (int) (gVar.Z * i12);
            }
        }
        if (z14) {
            if (iArr[1] == 4) {
                bVar.f31993b = f.FIXED;
            } else if (!z11) {
                f fVar5 = bVar.f31992a;
                f fVar6 = f.FIXED;
                if (fVar5 == fVar6) {
                    i11 = bVar.f31994c;
                } else {
                    bVar.f31993b = f.WRAP_CONTENT;
                    cVar.b(gVar, bVar);
                    i11 = bVar.f31996e;
                }
                bVar.f31993b = fVar6;
                int i14 = gVar.f30575a0;
                float f11 = gVar.Z;
                if (i14 == -1) {
                    bVar.f31995d = (int) (i11 / f11);
                } else {
                    bVar.f31995d = (int) (f11 * i11);
                }
            }
        }
        cVar.b(gVar, bVar);
        gVar.T(bVar.f31996e);
        gVar.O(bVar.f31997f);
        gVar.F = bVar.f31999h;
        gVar.K(bVar.f31998g);
        bVar.f32001j = 0;
    }

    @Override // n6.g
    public final void E() {
        this.B0.t();
        this.C0 = 0;
        this.D0 = 0;
        this.f30619v0.clear();
        super.E();
    }

    @Override // n6.g
    public final void H(a8.h hVar) {
        super.H(hVar);
        int size = this.f30619v0.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((g) this.f30619v0.get(i11)).H(hVar);
        }
    }

    @Override // n6.g
    public final void U(boolean z11, boolean z12) {
        super.U(z11, z12);
        int size = this.f30619v0.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((g) this.f30619v0.get(i11)).U(z11, z12);
        }
    }

    public final void W(g gVar) {
        this.f30619v0.add(gVar);
        g gVar2 = gVar.W;
        if (gVar2 != null) {
            ((h) gVar2).f30619v0.remove(gVar);
            gVar.E();
        }
        gVar.W = this;
    }

    public final void X(g gVar, int i11) {
        if (i11 == 0) {
            int i12 = this.E0 + 1;
            b[] bVarArr = this.H0;
            if (i12 >= bVarArr.length) {
                this.H0 = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
            }
            b[] bVarArr2 = this.H0;
            int i13 = this.E0;
            bVarArr2[i13] = new b(gVar, 0, this.A0);
            this.E0 = i13 + 1;
            return;
        }
        if (i11 == 1) {
            int i14 = this.F0 + 1;
            b[] bVarArr3 = this.G0;
            if (i14 >= bVarArr3.length) {
                this.G0 = (b[]) Arrays.copyOf(bVarArr3, bVarArr3.length * 2);
            }
            b[] bVarArr4 = this.G0;
            int i15 = this.F0;
            bVarArr4[i15] = new b(gVar, 1, this.A0);
            this.F0 = i15 + 1;
        }
    }

    public final void Y(g6.c cVar) {
        h hVar;
        g6.c cVar2;
        HashSet hashSet = this.P0;
        boolean zD0 = d0(64);
        c(cVar, zD0);
        int size = this.f30619v0.size();
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = (g) this.f30619v0.get(i11);
            boolean[] zArr = gVar.U;
            zArr[0] = false;
            zArr[1] = false;
            if (gVar instanceof a) {
                z11 = true;
            }
        }
        if (z11) {
            for (int i12 = 0; i12 < size; i12++) {
                g gVar2 = (g) this.f30619v0.get(i12);
                if (gVar2 instanceof a) {
                    a aVar = (a) gVar2;
                    for (int i13 = 0; i13 < aVar.f30655w0; i13++) {
                        g gVar3 = aVar.f30654v0[i13];
                        if (aVar.f30546y0 || gVar3.d()) {
                            int i14 = aVar.f30545x0;
                            if (i14 == 0 || i14 == 1) {
                                gVar3.U[0] = true;
                            } else if (i14 == 2 || i14 == 3) {
                                gVar3.U[1] = true;
                            }
                        }
                    }
                }
            }
        }
        hashSet.clear();
        for (int i15 = 0; i15 < size; i15++) {
            g gVar4 = (g) this.f30619v0.get(i15);
            gVar4.getClass();
            boolean z12 = gVar4 instanceof p;
            if (z12 || (gVar4 instanceof l)) {
                if (z12) {
                    hashSet.add(gVar4);
                } else {
                    gVar4.c(cVar, zD0);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                p pVar = (p) ((g) it.next());
                for (int i16 = 0; i16 < pVar.f30655w0; i16++) {
                    if (hashSet.contains(pVar.f30654v0[i16])) {
                        pVar.c(cVar, zD0);
                        hashSet.remove(pVar);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((g) it2.next()).c(cVar, zD0);
                }
                hashSet.clear();
            }
        }
        if (g6.c.f20022q) {
            HashSet<g> hashSet2 = new HashSet();
            for (int i17 = 0; i17 < size; i17++) {
                g gVar5 = (g) this.f30619v0.get(i17);
                gVar5.getClass();
                if (!(gVar5 instanceof p) && !(gVar5 instanceof l)) {
                    hashSet2.add(gVar5);
                }
            }
            hVar = this;
            cVar2 = cVar;
            hVar.b(this, cVar2, hashSet2, this.V[0] == f.WRAP_CONTENT ? 0 : 1, false);
            for (g gVar6 : hashSet2) {
                n.b(this, cVar2, gVar6);
                gVar6.c(cVar2, zD0);
            }
        } else {
            hVar = this;
            cVar2 = cVar;
            for (int i18 = 0; i18 < size; i18++) {
                g gVar7 = (g) hVar.f30619v0.get(i18);
                if (gVar7 instanceof h) {
                    f[] fVarArr = gVar7.V;
                    f fVar = fVarArr[0];
                    f fVar2 = fVarArr[1];
                    f fVar3 = f.WRAP_CONTENT;
                    if (fVar == fVar3) {
                        gVar7.P(f.FIXED);
                    }
                    if (fVar2 == fVar3) {
                        gVar7.R(f.FIXED);
                    }
                    gVar7.c(cVar2, zD0);
                    if (fVar == fVar3) {
                        gVar7.P(fVar);
                    }
                    if (fVar2 == fVar3) {
                        gVar7.R(fVar2);
                    }
                } else {
                    n.b(this, cVar2, gVar7);
                    if (!(gVar7 instanceof p) && !(gVar7 instanceof l)) {
                        gVar7.c(cVar2, zD0);
                    }
                }
            }
        }
        if (hVar.E0 > 0) {
            n.a(this, cVar2, null, 0);
        }
        if (hVar.F0 > 0) {
            n.a(this, cVar2, null, 1);
        }
    }

    public final boolean Z(int i11, boolean z11) {
        boolean z12;
        f fVar;
        x xVar = this.f30621x0;
        ArrayList<t> arrayList = (ArrayList) xVar.f808f;
        h hVar = (h) xVar.f806d;
        boolean z13 = false;
        f fVarL = hVar.l(0);
        f fVarL2 = hVar.l(1);
        int iT = hVar.t();
        int iU = hVar.u();
        if (z11 && (fVarL == (fVar = f.WRAP_CONTENT) || fVarL2 == fVar)) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                t tVar = (t) it.next();
                if (tVar.f32034f == i11 && !tVar.k()) {
                    z11 = false;
                    break;
                }
            }
            if (i11 == 0) {
                if (z11 && fVarL == f.WRAP_CONTENT) {
                    hVar.P(f.FIXED);
                    hVar.T(xVar.e(hVar, 0));
                    hVar.f30580d.f32033e.d(hVar.s());
                }
            } else if (z11 && fVarL2 == f.WRAP_CONTENT) {
                hVar.R(f.FIXED);
                hVar.O(xVar.e(hVar, 1));
                hVar.f30582e.f32033e.d(hVar.m());
            }
        }
        f[] fVarArr = hVar.V;
        if (i11 == 0) {
            f fVar2 = fVarArr[0];
            if (fVar2 == f.FIXED || fVar2 == f.MATCH_PARENT) {
                int iS = hVar.s() + iT;
                hVar.f30580d.f32037i.d(iS);
                hVar.f30580d.f32033e.d(iS - iT);
                z12 = true;
            }
            z12 = false;
        } else {
            f fVar3 = fVarArr[1];
            if (fVar3 == f.FIXED || fVar3 == f.MATCH_PARENT) {
                int iM = hVar.m() + iU;
                hVar.f30582e.f32037i.d(iM);
                hVar.f30582e.f32033e.d(iM - iU);
                z12 = true;
            }
            z12 = false;
        }
        xVar.k();
        for (t tVar2 : arrayList) {
            if (tVar2.f32034f == i11 && (tVar2.f32030b != hVar || tVar2.f32035g)) {
                tVar2.e();
            }
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                z13 = true;
                break;
            }
            t tVar3 = (t) it2.next();
            if (tVar3.f32034f == i11 && (z12 || tVar3.f32030b != hVar)) {
                if (!tVar3.f32036h.f32012j || !tVar3.f32037i.f32012j || (!(tVar3 instanceof o6.d) && !tVar3.f32033e.f32012j)) {
                    break;
                }
            }
        }
        hVar.P(fVarL);
        hVar.R(fVarL2);
        return z13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0625  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x065c  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x07bb  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x07df  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x081e  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x083a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:502:0x08a9 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Removed duplicated region for block: B:505:0x08bd  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x08da  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x08e7  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x08ea  */
    /* JADX WARN: Removed duplicated region for block: B:523:0x0927 A[PHI: r13 r14
      0x0927: PHI (r13v6 ??) = (r13v5 ??), (r13v8 ??), (r13v8 ??), (r13v8 ??) binds: [B:510:0x08e8, B:518:0x090d, B:519:0x090f, B:521:0x0915] A[DONT_GENERATE, DONT_INLINE]
      0x0927: PHI (r14v9 boolean) = (r14v8 boolean), (r14v13 boolean), (r14v13 boolean), (r14v13 boolean) binds: [B:510:0x08e8, B:518:0x090d, B:519:0x090f, B:521:0x0915] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:525:0x092b  */
    /* JADX WARN: Removed duplicated region for block: B:636:0x092c A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v81 */
    /* JADX WARN: Type inference failed for: r13v82 */
    /* JADX WARN: Type inference failed for: r13v83 */
    /* JADX WARN: Type inference failed for: r13v84 */
    /* JADX WARN: Type inference failed for: r13v85 */
    /* JADX WARN: Type inference failed for: r13v86 */
    /* JADX WARN: Type inference failed for: r13v87 */
    /* JADX WARN: Type inference failed for: r13v88 */
    /* JADX WARN: Type inference failed for: r13v89 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r13v90 */
    /* JADX WARN: Type inference failed for: r30v0, types: [n6.g, n6.h] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a0() {
        /*
            Method dump skipped, instruction units count: 2379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n6.h.a0():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b0(int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        int i18;
        int i19;
        int i21;
        int i22;
        int i23;
        o6.c cVar;
        int i24;
        boolean Z;
        int i25;
        int i26;
        ArrayList arrayList;
        int i27;
        o6.c cVar2;
        int i28;
        int i29;
        o6.c cVar3;
        int i31;
        int i32;
        o6.m mVar;
        o6.p pVar;
        boolean z11;
        int i33;
        int i34;
        int i35;
        int i36;
        boolean z12;
        boolean z13;
        this.C0 = i16;
        this.D0 = i17;
        j30.g gVar = this.f30620w0;
        h hVar = (h) gVar.f24504d;
        ArrayList arrayList2 = (ArrayList) gVar.f24502b;
        o6.c cVar4 = this.f30623z0;
        x xVar = this.f30621x0;
        int size = this.f30619v0.size();
        int iS = s();
        int iM = m();
        boolean zC = n.c(i11, 128);
        int i37 = (zC || n.c(i11, 64)) ? 1 : 0;
        if (i37 != 0) {
            int i38 = 0;
            while (i38 < size) {
                i19 = 0;
                g gVar2 = (g) this.f30619v0.get(i38);
                i21 = 1;
                f[] fVarArr = gVar2.V;
                int i39 = i37;
                f fVar = fVarArr[0];
                i18 = size;
                f fVar2 = f.MATCH_CONSTRAINT;
                boolean z14 = (fVar == fVar2) && (fVarArr[1] == fVar2) && gVar2.Z > 0.0f;
                if ((gVar2.z() && z14) || ((gVar2.A() && z14) || (gVar2 instanceof p) || gVar2.z() || gVar2.A())) {
                    i22 = 0;
                    break;
                } else {
                    i38++;
                    i37 = i39;
                    size = i18;
                }
            }
            i18 = size;
            i19 = 0;
            i21 = 1;
            i22 = i37;
        } else {
            i18 = size;
            i19 = 0;
            i21 = 1;
            i22 = i37;
        }
        int i41 = i22 & (((i12 == 1073741824 && i14 == 1073741824) || zC) ? i21 : i19);
        if (i41 != 0) {
            int iMin = Math.min(this.D[i19], i13);
            int iMin2 = Math.min(this.D[i21], i15);
            if (i12 != 1073741824 || s() == iMin) {
                z11 = i21;
            } else {
                T(iMin);
                boolean z15 = i21;
                xVar.f804b = z15;
                z11 = z15;
            }
            if (i14 == 1073741824 && m() != iMin2) {
                O(iMin2);
                xVar.f804b = z11;
            }
            if (i12 == 1073741824 && i14 == 1073741824) {
                ArrayList<t> arrayList3 = (ArrayList) xVar.f808f;
                h hVar2 = (h) xVar.f806d;
                if (xVar.f804b || xVar.f805c) {
                    for (g gVar3 : hVar2.f30619v0) {
                        gVar3.j();
                        gVar3.f30574a = i19;
                        gVar3.f30580d.n();
                        gVar3.f30582e.m();
                        i41 = i41;
                        i19 = 0;
                    }
                    i23 = i41;
                    hVar2.j();
                    i35 = 0;
                    hVar2.f30574a = false;
                    hVar2.f30580d.n();
                    hVar2.f30582e.m();
                    xVar.f805c = false;
                } else {
                    i23 = i41;
                    i35 = i19;
                }
                xVar.c((h) xVar.f807e);
                hVar2.f30577b0 = i35;
                hVar2.f30579c0 = i35;
                f fVarL = hVar2.l(i35);
                f fVarL2 = hVar2.l(1);
                if (xVar.f804b) {
                    xVar.d();
                }
                int iT = hVar2.t();
                int iU = hVar2.u();
                cVar = cVar4;
                hVar2.f30580d.f32036h.d(iT);
                hVar2.f30582e.f32036h.d(iU);
                xVar.k();
                f fVar3 = f.WRAP_CONTENT;
                if (fVarL == fVar3 || fVarL2 == fVar3) {
                    if (zC) {
                        Iterator it = arrayList3.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (!((t) it.next()).k()) {
                                    zC = false;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    if (zC && fVarL == f.WRAP_CONTENT) {
                        hVar2.P(f.FIXED);
                        i36 = iT;
                        hVar2.T(xVar.e(hVar2, 0));
                        hVar2.f30580d.f32033e.d(hVar2.s());
                    } else {
                        i36 = iT;
                    }
                    if (zC && fVarL2 == f.WRAP_CONTENT) {
                        hVar2.R(f.FIXED);
                        hVar2.O(xVar.e(hVar2, 1));
                        hVar2.f30582e.f32033e.d(hVar2.m());
                    }
                } else {
                    i36 = iT;
                }
                f fVar4 = hVar2.V[0];
                f fVar5 = f.FIXED;
                if (fVar4 == fVar5 || fVar4 == f.MATCH_PARENT) {
                    int iS2 = hVar2.s() + i36;
                    hVar2.f30580d.f32037i.d(iS2);
                    hVar2.f30580d.f32033e.d(iS2 - i36);
                    xVar.k();
                    f fVar6 = hVar2.V[1];
                    if (fVar6 == fVar5 || fVar6 == f.MATCH_PARENT) {
                        int iM2 = hVar2.m() + iU;
                        hVar2.f30582e.f32037i.d(iM2);
                        hVar2.f30582e.f32033e.d(iM2 - iU);
                    }
                    xVar.k();
                    z12 = true;
                } else {
                    z12 = false;
                }
                for (t tVar : arrayList3) {
                    if (tVar.f32030b != hVar2 || tVar.f32035g) {
                        tVar.e();
                    }
                }
                for (t tVar2 : arrayList3) {
                    if (z12 || tVar2.f32030b != hVar2) {
                        if (!tVar2.f32036h.f32012j || ((!tVar2.f32037i.f32012j && !(tVar2 instanceof o6.j)) || (!tVar2.f32033e.f32012j && !(tVar2 instanceof o6.d) && !(tVar2 instanceof o6.j)))) {
                            z13 = false;
                            break;
                        }
                    }
                }
                z13 = true;
                hVar2.P(fVarL);
                hVar2.R(fVarL2);
                Z = z13;
                i34 = 1073741824;
                i24 = 2;
            } else {
                i23 = i41;
                cVar = cVar4;
                h hVar3 = (h) xVar.f806d;
                if (xVar.f804b) {
                    for (g gVar4 : hVar3.f30619v0) {
                        gVar4.j();
                        gVar4.f30574a = false;
                        o6.m mVar2 = gVar4.f30580d;
                        mVar2.f32033e.f32012j = false;
                        mVar2.f32035g = false;
                        mVar2.n();
                        o6.p pVar2 = gVar4.f30582e;
                        pVar2.f32033e.f32012j = false;
                        pVar2.f32035g = false;
                        pVar2.m();
                    }
                    i33 = 0;
                    hVar3.j();
                    hVar3.f30574a = false;
                    o6.m mVar3 = hVar3.f30580d;
                    mVar3.f32033e.f32012j = false;
                    mVar3.f32035g = false;
                    mVar3.n();
                    o6.p pVar3 = hVar3.f30582e;
                    pVar3.f32033e.f32012j = false;
                    pVar3.f32035g = false;
                    pVar3.m();
                    xVar.d();
                } else {
                    i33 = 0;
                }
                xVar.c((h) xVar.f807e);
                hVar3.f30577b0 = i33;
                hVar3.f30579c0 = i33;
                hVar3.f30580d.f32036h.d(i33);
                hVar3.f30582e.f32036h.d(i33);
                i34 = 1073741824;
                if (i12 == 1073741824) {
                    Z = Z(i33, zC);
                    i24 = 1;
                } else {
                    i24 = 0;
                    Z = true;
                }
                if (i14 == 1073741824) {
                    Z &= Z(1, zC);
                    i24++;
                }
            }
            if (Z) {
                U(i12 == i34, i14 == i34);
            }
        } else {
            i23 = i41;
            cVar = cVar4;
            i24 = 0;
            Z = false;
        }
        if (Z && i24 == 2) {
            return;
        }
        int i42 = this.I0;
        if (i18 > 0) {
            boolean zD0 = d0(64);
            o6.c cVar5 = this.f30623z0;
            int i43 = 0;
            for (int size2 = this.f30619v0.size(); i43 < size2; size2 = i32) {
                g gVar5 = (g) this.f30619v0.get(i43);
                if ((gVar5 instanceof l) || (gVar5 instanceof a) || gVar5.H || (zD0 && (mVar = gVar5.f30580d) != null && (pVar = gVar5.f30582e) != null && mVar.f32033e.f32012j && pVar.f32033e.f32012j)) {
                    i32 = size2;
                } else {
                    f fVarL3 = gVar5.l(0);
                    f fVarL4 = gVar5.l(1);
                    f fVar7 = f.MATCH_CONSTRAINT;
                    i32 = size2;
                    boolean z16 = fVarL3 == fVar7 && gVar5.f30609s != 1 && fVarL4 == fVar7 && gVar5.f30611t != 1;
                    if (!z16 && d0(1) && !(gVar5 instanceof p)) {
                        if (fVarL3 == fVar7 && gVar5.f30609s == 0 && fVarL4 != fVar7 && !gVar5.z()) {
                            z16 = true;
                        }
                        if (fVarL4 == fVar7 && gVar5.f30611t == 0 && fVarL3 != fVar7 && !gVar5.z()) {
                            z16 = true;
                        }
                        if ((fVarL3 == fVar7 || fVarL4 == fVar7) && gVar5.Z > 0.0f) {
                            z16 = true;
                        }
                    }
                    if (!z16) {
                        gVar.r(0, gVar5, cVar5);
                    }
                    i43++;
                }
                i43++;
            }
            i25 = 0;
            cVar5.a();
        } else {
            i25 = 0;
        }
        gVar.G(this);
        int size3 = arrayList2.size();
        if (i18 > 0) {
            gVar.E(this, i25, iS, iM);
        }
        if (size3 > 0) {
            f[] fVarArr2 = this.V;
            f fVar8 = fVarArr2[i25];
            f fVar9 = f.WRAP_CONTENT;
            int i44 = fVar8 == fVar9 ? 1 : i25;
            int i45 = fVarArr2[1] == fVar9 ? 1 : i25;
            int iMax = Math.max(s(), hVar.f30583e0);
            int iMax2 = Math.max(m(), hVar.f30585f0);
            int iMax3 = iMax;
            int i46 = i25;
            int i47 = i46;
            while (i46 < size3) {
                g gVar6 = (g) arrayList2.get(i46);
                if (gVar6 instanceof p) {
                    int iS3 = gVar6.s();
                    int iM3 = gVar6.m();
                    i28 = i45;
                    i29 = i46;
                    cVar3 = cVar;
                    int i48 = i47 | (gVar.r(1, gVar6, cVar3) ? 1 : 0);
                    int iS4 = gVar6.s();
                    int iM4 = gVar6.m();
                    if (iS4 != iS3) {
                        gVar6.T(iS4);
                        if (i44 != 0 && gVar6.t() + gVar6.X > iMax3) {
                            iMax3 = Math.max(iMax3, gVar6.k(c.RIGHT).e() + gVar6.t() + gVar6.X);
                        }
                        i31 = 1;
                    } else {
                        i31 = i48;
                    }
                    if (iM4 != iM3) {
                        gVar6.O(iM4);
                        if (i28 != 0 && gVar6.u() + gVar6.Y > iMax2) {
                            iMax2 = Math.max(iMax2, gVar6.k(c.BOTTOM).e() + gVar6.u() + gVar6.Y);
                        }
                        i31 = 1;
                    }
                    i47 = (((p) gVar6).D0 ? 1 : 0) | i31;
                } else {
                    i28 = i45;
                    i29 = i46;
                    cVar3 = cVar;
                }
                i46 = i29 + 1;
                cVar = cVar3;
                i45 = i28;
            }
            int i49 = i45;
            int i51 = 0;
            while (true) {
                o6.c cVar6 = cVar;
                if (i51 >= 2) {
                    break;
                }
                int i52 = i47;
                int i53 = 0;
                while (i53 < size3) {
                    g gVar7 = (g) arrayList2.get(i53);
                    if ((!(gVar7 instanceof m) || (gVar7 instanceof p)) && !(gVar7 instanceof l)) {
                        i26 = size3;
                        if (gVar7.f30593j0 != 8 && ((i23 == 0 || !gVar7.f30580d.f32033e.f32012j || !gVar7.f30582e.f32033e.f32012j) && !(gVar7 instanceof p))) {
                            int iS5 = gVar7.s();
                            int iM5 = gVar7.m();
                            arrayList = arrayList2;
                            int i54 = gVar7.f30581d0;
                            i27 = i53;
                            int i55 = (gVar.r(i51 == 1 ? 2 : 1, gVar7, cVar6) ? 1 : 0) | i52;
                            int iS6 = gVar7.s();
                            cVar2 = cVar6;
                            int iM6 = gVar7.m();
                            if (iS6 != iS5) {
                                gVar7.T(iS6);
                                if (i44 != 0 && gVar7.t() + gVar7.X > iMax3) {
                                    iMax3 = Math.max(iMax3, gVar7.k(c.RIGHT).e() + gVar7.t() + gVar7.X);
                                }
                                i55 = 1;
                            }
                            if (iM6 != iM5) {
                                gVar7.O(iM6);
                                if (i49 != 0 && gVar7.u() + gVar7.Y > iMax2) {
                                    iMax2 = Math.max(iMax2, gVar7.k(c.BOTTOM).e() + gVar7.u() + gVar7.Y);
                                }
                                i55 = 1;
                            }
                            i52 = (!gVar7.F || i54 == gVar7.f30581d0) ? i55 : 1;
                        }
                        i53 = i27 + 1;
                        size3 = i26;
                        arrayList2 = arrayList;
                        cVar6 = cVar2;
                    } else {
                        i26 = size3;
                    }
                    cVar2 = cVar6;
                    arrayList = arrayList2;
                    i27 = i53;
                    i53 = i27 + 1;
                    size3 = i26;
                    arrayList2 = arrayList;
                    cVar6 = cVar2;
                }
                int i56 = size3;
                cVar = cVar6;
                ArrayList arrayList4 = arrayList2;
                if (i52 == 0) {
                    break;
                }
                i51++;
                gVar.E(this, i51, iS, iM);
                size3 = i56;
                arrayList2 = arrayList4;
                i47 = 0;
            }
        }
        this.I0 = i42;
        g6.c.f20022q = d0(512);
    }

    public final boolean d0(int i11) {
        return (this.I0 & i11) == i11;
    }

    @Override // n6.g
    public final void p(StringBuilder sb2) {
        sb2.append(this.f30594k + ":{\n");
        StringBuilder sb3 = new StringBuilder("  actualWidth:");
        sb3.append(this.X);
        sb2.append(sb3.toString());
        sb2.append("\n");
        sb2.append("  actualHeight:" + this.Y);
        sb2.append("\n");
        Iterator it = this.f30619v0.iterator();
        while (it.hasNext()) {
            ((g) it.next()).p(sb2);
            sb2.append(",\n");
        }
        sb2.append("}");
    }
}
