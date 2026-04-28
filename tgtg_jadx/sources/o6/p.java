package o6;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends t {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public g f32021k;
    public a l;

    @Override // o6.e
    public final void a(e eVar) {
        float f11;
        float f12;
        float f13;
        int i11;
        if (o.f32020a[this.f32038j.ordinal()] == 3) {
            n6.g gVar = this.f32030b;
            l(gVar.L, gVar.N, 1);
            return;
        }
        h hVar = this.f32033e;
        if (hVar.f32005c && !hVar.f32012j && this.f32032d == n6.f.MATCH_CONSTRAINT) {
            n6.g gVar2 = this.f32030b;
            int i12 = gVar2.f30611t;
            if (i12 == 2) {
                n6.g gVar3 = gVar2.W;
                if (gVar3 != null) {
                    if (gVar3.f30582e.f32033e.f32012j) {
                        hVar.d((int) ((r1.f32009g * gVar2.A) + 0.5f));
                    }
                }
            } else if (i12 == 3) {
                h hVar2 = gVar2.f30580d.f32033e;
                if (hVar2.f32012j) {
                    int i13 = gVar2.f30575a0;
                    if (i13 == -1) {
                        f11 = hVar2.f32009g;
                        f12 = gVar2.Z;
                    } else if (i13 == 0) {
                        f13 = hVar2.f32009g * gVar2.Z;
                        i11 = (int) (f13 + 0.5f);
                        hVar.d(i11);
                    } else if (i13 != 1) {
                        i11 = 0;
                        hVar.d(i11);
                    } else {
                        f11 = hVar2.f32009g;
                        f12 = gVar2.Z;
                    }
                    f13 = f11 / f12;
                    i11 = (int) (f13 + 0.5f);
                    hVar.d(i11);
                }
            }
        }
        g gVar4 = this.f32036h;
        boolean z11 = gVar4.f32005c;
        ArrayList arrayList = gVar4.l;
        if (z11) {
            g gVar5 = this.f32037i;
            boolean z12 = gVar5.f32005c;
            ArrayList arrayList2 = gVar5.l;
            if (z12) {
                if (gVar4.f32012j && gVar5.f32012j && hVar.f32012j) {
                    return;
                }
                if (!hVar.f32012j && this.f32032d == n6.f.MATCH_CONSTRAINT) {
                    n6.g gVar6 = this.f32030b;
                    if (gVar6.f30609s == 0 && !gVar6.A()) {
                        g gVar7 = (g) arrayList.get(0);
                        g gVar8 = (g) arrayList2.get(0);
                        int i14 = gVar7.f32009g + gVar4.f32008f;
                        int i15 = gVar8.f32009g + gVar5.f32008f;
                        gVar4.d(i14);
                        gVar5.d(i15);
                        hVar.d(i15 - i14);
                        return;
                    }
                }
                if (!hVar.f32012j && this.f32032d == n6.f.MATCH_CONSTRAINT && this.f32029a == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    g gVar9 = (g) arrayList.get(0);
                    int i16 = (((g) arrayList2.get(0)).f32009g + gVar5.f32008f) - (gVar9.f32009g + gVar4.f32008f);
                    int i17 = hVar.f32014m;
                    if (i16 < i17) {
                        hVar.d(i16);
                    } else {
                        hVar.d(i17);
                    }
                }
                if (hVar.f32012j && arrayList.size() > 0 && arrayList2.size() > 0) {
                    g gVar10 = (g) arrayList.get(0);
                    g gVar11 = (g) arrayList2.get(0);
                    int i18 = gVar10.f32009g;
                    int i19 = gVar4.f32008f + i18;
                    int i21 = gVar11.f32009g;
                    int i22 = gVar5.f32008f + i21;
                    float f14 = this.f32030b.f30589h0;
                    if (gVar10 == gVar11) {
                        f14 = 0.5f;
                    } else {
                        i18 = i19;
                        i21 = i22;
                    }
                    gVar4.d((int) ((((i21 - i18) - hVar.f32009g) * f14) + i18 + 0.5f));
                    gVar5.d(gVar4.f32009g + hVar.f32009g);
                }
            }
        }
    }

    @Override // o6.t
    public final void d() {
        n6.g gVar;
        n6.g gVar2;
        n6.g gVar3;
        n6.g gVar4;
        g gVar5 = this.f32021k;
        n6.g gVar6 = this.f32030b;
        boolean z11 = gVar6.f30574a;
        h hVar = this.f32033e;
        if (z11) {
            hVar.d(gVar6.m());
        }
        boolean z12 = hVar.f32012j;
        ArrayList arrayList = hVar.f32013k;
        ArrayList arrayList2 = hVar.l;
        g gVar7 = this.f32037i;
        g gVar8 = this.f32036h;
        if (!z12) {
            n6.g gVar9 = this.f32030b;
            this.f32032d = gVar9.V[1];
            if (gVar9.F) {
                this.l = new a(this);
            }
            n6.f fVar = this.f32032d;
            if (fVar != n6.f.MATCH_CONSTRAINT) {
                if (fVar == n6.f.MATCH_PARENT && (gVar4 = this.f32030b.W) != null && gVar4.V[1] == n6.f.FIXED) {
                    int iM = (gVar4.m() - this.f32030b.L.e()) - this.f32030b.N.e();
                    t.b(gVar8, gVar4.f30582e.f32036h, this.f32030b.L.e());
                    t.b(gVar7, gVar4.f30582e.f32037i, -this.f32030b.N.e());
                    hVar.d(iM);
                    return;
                }
                if (fVar == n6.f.FIXED) {
                    hVar.d(this.f32030b.m());
                }
            }
        } else if (this.f32032d == n6.f.MATCH_PARENT && (gVar2 = (gVar = this.f32030b).W) != null && gVar2.V[1] == n6.f.FIXED) {
            t.b(gVar8, gVar2.f30582e.f32036h, gVar.L.e());
            t.b(gVar7, gVar2.f30582e.f32037i, -this.f32030b.N.e());
            return;
        }
        boolean z13 = hVar.f32012j;
        if (z13) {
            n6.g gVar10 = this.f32030b;
            if (gVar10.f30574a) {
                n6.d[] dVarArr = gVar10.S;
                n6.d dVar = dVarArr[2];
                n6.d dVar2 = dVar.f30569f;
                if (dVar2 != null && dVarArr[3].f30569f != null) {
                    boolean zA = gVar10.A();
                    n6.g gVar11 = this.f32030b;
                    if (zA) {
                        gVar8.f32008f = gVar11.S[2].e();
                        gVar7.f32008f = -this.f32030b.S[3].e();
                    } else {
                        g gVarH = t.h(gVar11.S[2]);
                        if (gVarH != null) {
                            t.b(gVar8, gVarH, this.f32030b.S[2].e());
                        }
                        g gVarH2 = t.h(this.f32030b.S[3]);
                        if (gVarH2 != null) {
                            t.b(gVar7, gVarH2, -this.f32030b.S[3].e());
                        }
                        gVar8.f32004b = true;
                        gVar7.f32004b = true;
                    }
                    n6.g gVar12 = this.f32030b;
                    if (gVar12.F) {
                        t.b(gVar5, gVar8, gVar12.f30581d0);
                        return;
                    }
                    return;
                }
                if (dVar2 != null) {
                    g gVarH3 = t.h(dVar);
                    if (gVarH3 != null) {
                        t.b(gVar8, gVarH3, this.f32030b.S[2].e());
                        t.b(gVar7, gVar8, hVar.f32009g);
                        n6.g gVar13 = this.f32030b;
                        if (gVar13.F) {
                            t.b(gVar5, gVar8, gVar13.f30581d0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                n6.d dVar3 = dVarArr[3];
                if (dVar3.f30569f != null) {
                    g gVarH4 = t.h(dVar3);
                    if (gVarH4 != null) {
                        t.b(gVar7, gVarH4, -this.f32030b.S[3].e());
                        t.b(gVar8, gVar7, -hVar.f32009g);
                    }
                    n6.g gVar14 = this.f32030b;
                    if (gVar14.F) {
                        t.b(gVar5, gVar8, gVar14.f30581d0);
                        return;
                    }
                    return;
                }
                n6.d dVar4 = dVarArr[4];
                if (dVar4.f30569f != null) {
                    g gVarH5 = t.h(dVar4);
                    if (gVarH5 != null) {
                        t.b(gVar5, gVarH5, 0);
                        t.b(gVar8, gVar5, -this.f32030b.f30581d0);
                        t.b(gVar7, gVar8, hVar.f32009g);
                        return;
                    }
                    return;
                }
                if ((gVar10 instanceof n6.m) || gVar10.W == null || gVar10.k(n6.c.CENTER).f30569f != null) {
                    return;
                }
                n6.g gVar15 = this.f32030b;
                t.b(gVar8, gVar15.W.f30582e.f32036h, gVar15.u());
                t.b(gVar7, gVar8, hVar.f32009g);
                n6.g gVar16 = this.f32030b;
                if (gVar16.F) {
                    t.b(gVar5, gVar8, gVar16.f30581d0);
                    return;
                }
                return;
            }
        }
        if (z13 || this.f32032d != n6.f.MATCH_CONSTRAINT) {
            hVar.b(this);
        } else {
            n6.g gVar17 = this.f32030b;
            int i11 = gVar17.f30611t;
            if (i11 == 2) {
                n6.g gVar18 = gVar17.W;
                if (gVar18 != null) {
                    h hVar2 = gVar18.f30582e.f32033e;
                    arrayList2.add(hVar2);
                    hVar2.f32013k.add(hVar);
                    hVar.f32004b = true;
                    arrayList.add(gVar8);
                    arrayList.add(gVar7);
                }
            } else if (i11 == 3 && !gVar17.A()) {
                n6.g gVar19 = this.f32030b;
                if (gVar19.f30609s != 3) {
                    h hVar3 = gVar19.f30580d.f32033e;
                    arrayList2.add(hVar3);
                    hVar3.f32013k.add(hVar);
                    hVar.f32004b = true;
                    arrayList.add(gVar8);
                    arrayList.add(gVar7);
                }
            }
        }
        n6.g gVar20 = this.f32030b;
        n6.d[] dVarArr2 = gVar20.S;
        n6.d dVar5 = dVarArr2[2];
        n6.d dVar6 = dVar5.f30569f;
        if (dVar6 != null && dVarArr2[3].f30569f != null) {
            boolean zA2 = gVar20.A();
            n6.g gVar21 = this.f32030b;
            if (zA2) {
                gVar8.f32008f = gVar21.S[2].e();
                gVar7.f32008f = -this.f32030b.S[3].e();
            } else {
                g gVarH6 = t.h(gVar21.S[2]);
                g gVarH7 = t.h(this.f32030b.S[3]);
                if (gVarH6 != null) {
                    gVarH6.b(this);
                }
                if (gVarH7 != null) {
                    gVarH7.b(this);
                }
                this.f32038j = s.CENTER;
            }
            if (this.f32030b.F) {
                c(gVar5, gVar8, 1, this.l);
            }
        } else if (dVar6 != null) {
            g gVarH8 = t.h(dVar5);
            if (gVarH8 != null) {
                t.b(gVar8, gVarH8, this.f32030b.S[2].e());
                c(gVar7, gVar8, 1, hVar);
                if (this.f32030b.F) {
                    c(gVar5, gVar8, 1, this.l);
                }
                n6.f fVar2 = this.f32032d;
                n6.f fVar3 = n6.f.MATCH_CONSTRAINT;
                if (fVar2 == fVar3) {
                    n6.g gVar22 = this.f32030b;
                    if (gVar22.Z > 0.0f) {
                        m mVar = gVar22.f30580d;
                        if (mVar.f32032d == fVar3) {
                            mVar.f32033e.f32013k.add(hVar);
                            arrayList2.add(this.f32030b.f30580d.f32033e);
                            hVar.f32003a = this;
                        }
                    }
                }
            }
        } else {
            n6.d dVar7 = dVarArr2[3];
            if (dVar7.f30569f != null) {
                g gVarH9 = t.h(dVar7);
                if (gVarH9 != null) {
                    t.b(gVar7, gVarH9, -this.f32030b.S[3].e());
                    c(gVar8, gVar7, -1, hVar);
                    if (this.f32030b.F) {
                        c(gVar5, gVar8, 1, this.l);
                    }
                }
            } else {
                n6.d dVar8 = dVarArr2[4];
                if (dVar8.f30569f != null) {
                    g gVarH10 = t.h(dVar8);
                    if (gVarH10 != null) {
                        t.b(gVar5, gVarH10, 0);
                        c(gVar8, gVar5, -1, this.l);
                        c(gVar7, gVar8, 1, hVar);
                    }
                } else if (!(gVar20 instanceof n6.m) && (gVar3 = gVar20.W) != null) {
                    t.b(gVar8, gVar3.f30582e.f32036h, gVar20.u());
                    c(gVar7, gVar8, 1, hVar);
                    if (this.f32030b.F) {
                        c(gVar5, gVar8, 1, this.l);
                    }
                    n6.f fVar4 = this.f32032d;
                    n6.f fVar5 = n6.f.MATCH_CONSTRAINT;
                    if (fVar4 == fVar5) {
                        n6.g gVar23 = this.f32030b;
                        if (gVar23.Z > 0.0f) {
                            m mVar2 = gVar23.f30580d;
                            if (mVar2.f32032d == fVar5) {
                                mVar2.f32033e.f32013k.add(hVar);
                                arrayList2.add(this.f32030b.f30580d.f32033e);
                                hVar.f32003a = this;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList2.size() == 0) {
            hVar.f32005c = true;
        }
    }

    @Override // o6.t
    public final void e() {
        g gVar = this.f32036h;
        if (gVar.f32012j) {
            this.f32030b.f30579c0 = gVar.f32009g;
        }
    }

    @Override // o6.t
    public final void f() {
        this.f32031c = null;
        this.f32036h.c();
        this.f32037i.c();
        this.f32021k.c();
        this.f32033e.c();
        this.f32035g = false;
    }

    @Override // o6.t
    public final boolean k() {
        return this.f32032d != n6.f.MATCH_CONSTRAINT || this.f32030b.f30611t == 0;
    }

    public final void m() {
        this.f32035g = false;
        g gVar = this.f32036h;
        gVar.c();
        gVar.f32012j = false;
        g gVar2 = this.f32037i;
        gVar2.c();
        gVar2.f32012j = false;
        g gVar3 = this.f32021k;
        gVar3.c();
        gVar3.f32012j = false;
        this.f32033e.f32012j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f32030b.f30596l0;
    }
}
