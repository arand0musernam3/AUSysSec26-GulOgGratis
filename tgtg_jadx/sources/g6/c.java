package g6;

import dn.k;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static boolean f20022q = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f20026d;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final a8.h f20034m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public b f20037p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f20023a = 1000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f20024b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f20025c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f20027e = 32;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f20028f = 32;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f20030h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean[] f20031i = new boolean[32];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f20032j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f20033k = 0;
    public int l = 32;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public h[] f20035n = new h[1000];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f20036o = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b[] f20029g = new b[32];

    public c() {
        s();
        a8.h hVar = new a8.h(27, false);
        hVar.f973b = new e();
        hVar.f974c = new e();
        hVar.f975d = new h[32];
        this.f20034m = hVar;
        f fVar = new f(hVar);
        fVar.f20040f = new h[128];
        fVar.f20041g = new h[128];
        fVar.f20042h = 0;
        fVar.f20043i = new k(fVar);
        this.f20026d = fVar;
        this.f20037p = new b(hVar);
    }

    public static int n(Object obj) {
        h hVar = ((n6.d) obj).f30572i;
        if (hVar != null) {
            return (int) (hVar.f20048e + 0.5f);
        }
        return 0;
    }

    public final h a(g gVar) {
        e eVar = (e) this.f20034m.f974c;
        int i11 = eVar.f20039b;
        Object obj = null;
        if (i11 > 0) {
            int i12 = i11 - 1;
            Object[] objArr = eVar.f20038a;
            Object obj2 = objArr[i12];
            objArr[i12] = null;
            eVar.f20039b = i12;
            obj = obj2;
        }
        h hVar = (h) obj;
        if (hVar == null) {
            hVar = new h(gVar);
            hVar.f20052i = gVar;
        } else {
            hVar.d();
            hVar.f20052i = gVar;
        }
        int i13 = this.f20036o;
        int i14 = this.f20023a;
        if (i13 >= i14) {
            int i15 = i14 * 2;
            this.f20023a = i15;
            this.f20035n = (h[]) Arrays.copyOf(this.f20035n, i15);
        }
        h[] hVarArr = this.f20035n;
        int i16 = this.f20036o;
        this.f20036o = i16 + 1;
        hVarArr[i16] = hVar;
        return hVar;
    }

    public final void b(h hVar, h hVar2, int i11, float f11, h hVar3, h hVar4, int i12, int i13) {
        b bVarL = l();
        if (hVar2 == hVar3) {
            bVarL.f20020d.g(hVar, 1.0f);
            bVarL.f20020d.g(hVar4, 1.0f);
            bVarL.f20020d.g(hVar2, -2.0f);
        } else {
            a aVar = bVarL.f20020d;
            if (f11 == 0.5f) {
                aVar.g(hVar, 1.0f);
                bVarL.f20020d.g(hVar2, -1.0f);
                bVarL.f20020d.g(hVar3, -1.0f);
                bVarL.f20020d.g(hVar4, 1.0f);
                if (i11 > 0 || i12 > 0) {
                    bVarL.f20018b = (-i11) + i12;
                }
            } else if (f11 <= 0.0f) {
                aVar.g(hVar, -1.0f);
                bVarL.f20020d.g(hVar2, 1.0f);
                bVarL.f20018b = i11;
            } else if (f11 >= 1.0f) {
                aVar.g(hVar4, -1.0f);
                bVarL.f20020d.g(hVar3, 1.0f);
                bVarL.f20018b = -i12;
            } else {
                float f12 = 1.0f - f11;
                aVar.g(hVar, f12 * 1.0f);
                bVarL.f20020d.g(hVar2, f12 * (-1.0f));
                bVarL.f20020d.g(hVar3, (-1.0f) * f11);
                bVarL.f20020d.g(hVar4, 1.0f * f11);
                if (i11 > 0 || i12 > 0) {
                    bVarL.f20018b = (i12 * f11) + ((-i11) * f12);
                }
            }
        }
        if (i13 != 8) {
            bVarL.a(this, i13);
        }
        c(bVarL);
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(g6.b r18) {
        /*
            Method dump skipped, instruction units count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g6.c.c(g6.b):void");
    }

    public final void d(h hVar, int i11) {
        int i12 = hVar.f20046c;
        if (i12 == -1) {
            hVar.e(this, i11);
            for (int i13 = 0; i13 < this.f20025c + 1; i13++) {
                h hVar2 = ((h[]) this.f20034m.f975d)[i13];
            }
            return;
        }
        if (i12 == -1) {
            b bVarL = l();
            bVarL.f20017a = hVar;
            float f11 = i11;
            hVar.f20048e = f11;
            bVarL.f20018b = f11;
            bVarL.f20021e = true;
            c(bVarL);
            return;
        }
        b bVar = this.f20029g[i12];
        if (bVar.f20021e) {
            bVar.f20018b = i11;
            return;
        }
        if (bVar.f20020d.d() == 0) {
            bVar.f20021e = true;
            bVar.f20018b = i11;
            return;
        }
        b bVarL2 = l();
        if (i11 < 0) {
            bVarL2.f20018b = i11 * (-1);
            bVarL2.f20020d.g(hVar, 1.0f);
        } else {
            bVarL2.f20018b = i11;
            bVarL2.f20020d.g(hVar, -1.0f);
        }
        c(bVarL2);
    }

    public final void e(h hVar, h hVar2, int i11, int i12) {
        if (i12 == 8 && hVar2.f20049f && hVar.f20046c == -1) {
            hVar.e(this, hVar2.f20048e + i11);
            return;
        }
        b bVarL = l();
        boolean z11 = false;
        if (i11 != 0) {
            if (i11 < 0) {
                i11 *= -1;
                z11 = true;
            }
            bVarL.f20018b = i11;
        }
        a aVar = bVarL.f20020d;
        if (z11) {
            aVar.g(hVar, 1.0f);
            bVarL.f20020d.g(hVar2, -1.0f);
        } else {
            aVar.g(hVar, -1.0f);
            bVarL.f20020d.g(hVar2, 1.0f);
        }
        if (i12 != 8) {
            bVarL.a(this, i12);
        }
        c(bVarL);
    }

    public final void f(h hVar, h hVar2, int i11, int i12) {
        b bVarL = l();
        h hVarM = m();
        hVarM.f20047d = 0;
        bVarL.b(hVar, hVar2, hVarM, i11);
        if (i12 != 8) {
            bVarL.f20020d.g(j(i12), (int) (bVarL.f20020d.c(hVarM) * (-1.0f)));
        }
        c(bVarL);
    }

    public final void g(h hVar, h hVar2, int i11, int i12) {
        b bVarL = l();
        h hVarM = m();
        hVarM.f20047d = 0;
        bVarL.c(hVar, hVar2, hVarM, i11);
        if (i12 != 8) {
            bVarL.f20020d.g(j(i12), (int) (bVarL.f20020d.c(hVarM) * (-1.0f)));
        }
        c(bVarL);
    }

    public final void h(b bVar) {
        int i11;
        if (bVar.f20021e) {
            bVar.f20017a.e(this, bVar.f20018b);
        } else {
            b[] bVarArr = this.f20029g;
            int i12 = this.f20033k;
            bVarArr[i12] = bVar;
            h hVar = bVar.f20017a;
            hVar.f20046c = i12;
            this.f20033k = i12 + 1;
            hVar.f(this, bVar);
        }
        if (this.f20024b) {
            int i13 = 0;
            while (i13 < this.f20033k) {
                if (this.f20029g[i13] == null) {
                    System.out.println("WTF");
                }
                b bVar2 = this.f20029g[i13];
                if (bVar2 != null && bVar2.f20021e) {
                    bVar2.f20017a.e(this, bVar2.f20018b);
                    ((e) this.f20034m.f973b).b(bVar2);
                    this.f20029g[i13] = null;
                    int i14 = i13 + 1;
                    int i15 = i14;
                    while (true) {
                        i11 = this.f20033k;
                        if (i14 >= i11) {
                            break;
                        }
                        b[] bVarArr2 = this.f20029g;
                        int i16 = i14 - 1;
                        b bVar3 = bVarArr2[i14];
                        bVarArr2[i16] = bVar3;
                        h hVar2 = bVar3.f20017a;
                        if (hVar2.f20046c == i14) {
                            hVar2.f20046c = i16;
                        }
                        i15 = i14;
                        i14++;
                    }
                    if (i15 < i11) {
                        this.f20029g[i15] = null;
                    }
                    this.f20033k = i11 - 1;
                    i13--;
                }
                i13++;
            }
            this.f20024b = false;
        }
    }

    public final void i() {
        for (int i11 = 0; i11 < this.f20033k; i11++) {
            b bVar = this.f20029g[i11];
            bVar.f20017a.f20048e = bVar.f20018b;
        }
    }

    public final h j(int i11) {
        if (this.f20032j + 1 >= this.f20028f) {
            o();
        }
        h hVarA = a(g.ERROR);
        float[] fArr = hVarA.f20051h;
        int i12 = this.f20025c + 1;
        this.f20025c = i12;
        this.f20032j++;
        hVarA.f20045b = i12;
        hVarA.f20047d = i11;
        ((h[]) this.f20034m.f975d)[i12] = hVarA;
        f fVar = this.f20026d;
        fVar.f20043i.f15018b = hVarA;
        Arrays.fill(fArr, 0.0f);
        fArr[hVarA.f20047d] = 1.0f;
        fVar.j(hVarA);
        return hVarA;
    }

    public final h k(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.f20032j + 1 >= this.f20028f) {
            o();
        }
        if (!(obj instanceof n6.d)) {
            return null;
        }
        n6.d dVar = (n6.d) obj;
        h hVar = dVar.f30572i;
        if (hVar == null) {
            dVar.k();
            hVar = dVar.f30572i;
        }
        int i11 = hVar.f20045b;
        a8.h hVar2 = this.f20034m;
        if (i11 != -1 && i11 <= this.f20025c && ((h[]) hVar2.f975d)[i11] != null) {
            return hVar;
        }
        if (i11 != -1) {
            hVar.d();
        }
        int i12 = this.f20025c + 1;
        this.f20025c = i12;
        this.f20032j++;
        hVar.f20045b = i12;
        hVar.f20052i = g.UNRESTRICTED;
        ((h[]) hVar2.f975d)[i12] = hVar;
        return hVar;
    }

    public final b l() {
        Object obj;
        a8.h hVar = this.f20034m;
        e eVar = (e) hVar.f973b;
        int i11 = eVar.f20039b;
        if (i11 > 0) {
            int i12 = i11 - 1;
            Object[] objArr = eVar.f20038a;
            obj = objArr[i12];
            objArr[i12] = null;
            eVar.f20039b = i12;
        } else {
            obj = null;
        }
        b bVar = (b) obj;
        if (bVar == null) {
            return new b(hVar);
        }
        bVar.f20017a = null;
        bVar.f20020d.b();
        bVar.f20018b = 0.0f;
        bVar.f20021e = false;
        return bVar;
    }

    public final h m() {
        if (this.f20032j + 1 >= this.f20028f) {
            o();
        }
        h hVarA = a(g.SLACK);
        int i11 = this.f20025c + 1;
        this.f20025c = i11;
        this.f20032j++;
        hVarA.f20045b = i11;
        ((h[]) this.f20034m.f975d)[i11] = hVarA;
        return hVarA;
    }

    public final void o() {
        int i11 = this.f20027e * 2;
        this.f20027e = i11;
        this.f20029g = (b[]) Arrays.copyOf(this.f20029g, i11);
        a8.h hVar = this.f20034m;
        hVar.f975d = (h[]) Arrays.copyOf((h[]) hVar.f975d, this.f20027e);
        int i12 = this.f20027e;
        this.f20031i = new boolean[i12];
        this.f20028f = i12;
        this.l = i12;
    }

    public final void p() {
        f fVar = this.f20026d;
        if (fVar.e()) {
            i();
            return;
        }
        if (!this.f20030h) {
            q(fVar);
            return;
        }
        for (int i11 = 0; i11 < this.f20033k; i11++) {
            if (!this.f20029g[i11].f20021e) {
                q(fVar);
                return;
            }
        }
        i();
    }

    public final void q(f fVar) {
        int i11 = 0;
        while (true) {
            if (i11 >= this.f20033k) {
                break;
            }
            b bVar = this.f20029g[i11];
            if (bVar.f20017a.f20052i != g.UNRESTRICTED) {
                float f11 = 0.0f;
                if (bVar.f20018b < 0.0f) {
                    boolean z11 = false;
                    int i12 = 0;
                    while (!z11) {
                        i12++;
                        float f12 = Float.MAX_VALUE;
                        int i13 = -1;
                        int i14 = -1;
                        int i15 = 0;
                        int i16 = 0;
                        while (i15 < this.f20033k) {
                            b bVar2 = this.f20029g[i15];
                            if (bVar2.f20017a.f20052i != g.UNRESTRICTED && !bVar2.f20021e && bVar2.f20018b < f11) {
                                int iD = bVar2.f20020d.d();
                                int i17 = 0;
                                while (i17 < iD) {
                                    h hVarE = bVar2.f20020d.e(i17);
                                    float fC = bVar2.f20020d.c(hVarE);
                                    if (fC > f11) {
                                        for (int i18 = 0; i18 < 9; i18++) {
                                            float f13 = hVarE.f20050g[i18] / fC;
                                            if ((f13 < f12 && i18 == i16) || i18 > i16) {
                                                i16 = i18;
                                                i14 = hVarE.f20045b;
                                                i13 = i15;
                                                f12 = f13;
                                            }
                                        }
                                    }
                                    i17++;
                                    f11 = 0.0f;
                                }
                            }
                            i15++;
                            f11 = 0.0f;
                        }
                        if (i13 != -1) {
                            b bVar3 = this.f20029g[i13];
                            bVar3.f20017a.f20046c = -1;
                            bVar3.g(((h[]) this.f20034m.f975d)[i14]);
                            h hVar = bVar3.f20017a;
                            hVar.f20046c = i13;
                            hVar.f(this, bVar3);
                        } else {
                            z11 = true;
                        }
                        if (i12 > this.f20032j / 2) {
                            z11 = true;
                        }
                        f11 = 0.0f;
                    }
                }
            }
            i11++;
        }
        r(fVar);
        i();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0094 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(g6.b r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = 0
            r3 = r2
        L6:
            int r4 = r0.f20032j
            if (r3 >= r4) goto L11
            boolean[] r4 = r0.f20031i
            r4[r3] = r2
            int r3 = r3 + 1
            goto L6
        L11:
            r3 = r2
            r4 = r3
        L13:
            if (r3 != 0) goto Lb1
            r5 = 1
            int r4 = r4 + r5
            int r6 = r0.f20032j
            int r6 = r6 * 2
            if (r4 < r6) goto L1f
            goto Lb1
        L1f:
            g6.h r6 = r1.f20017a
            if (r6 == 0) goto L29
            boolean[] r7 = r0.f20031i
            int r6 = r6.f20045b
            r7[r6] = r5
        L29:
            boolean[] r6 = r0.f20031i
            g6.h r6 = r1.d(r6)
            if (r6 == 0) goto L3d
            boolean[] r7 = r0.f20031i
            int r8 = r6.f20045b
            boolean r9 = r7[r8]
            if (r9 == 0) goto L3b
            goto Lb1
        L3b:
            r7[r8] = r5
        L3d:
            if (r6 == 0) goto Lad
            r5 = -1
            r7 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r8 = r2
            r9 = r5
        L45:
            int r10 = r0.f20033k
            if (r8 >= r10) goto L98
            g6.b[] r10 = r0.f20029g
            r10 = r10[r8]
            g6.h r11 = r10.f20017a
            g6.g r11 = r11.f20052i
            g6.g r12 = g6.g.UNRESTRICTED
            if (r11 != r12) goto L56
            goto L94
        L56:
            boolean r11 = r10.f20021e
            if (r11 == 0) goto L5b
            goto L94
        L5b:
            g6.a r11 = r10.f20020d
            int r12 = r11.f20014h
            r14 = -1
            if (r12 != r14) goto L63
            goto L7c
        L63:
            r15 = 0
        L64:
            if (r12 == r14) goto L7c
            int r2 = r11.f20007a
            if (r15 >= r2) goto L7c
            int[] r2 = r11.f20011e
            r2 = r2[r12]
            int r13 = r6.f20045b
            if (r2 != r13) goto L74
            r13 = 1
            goto L7d
        L74:
            int[] r2 = r11.f20012f
            r12 = r2[r12]
            int r15 = r15 + 1
            r2 = 0
            goto L64
        L7c:
            r13 = 0
        L7d:
            if (r13 == 0) goto L94
            g6.a r2 = r10.f20020d
            float r2 = r2.c(r6)
            r11 = 0
            int r11 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r11 >= 0) goto L94
            float r10 = r10.f20018b
            float r10 = -r10
            float r10 = r10 / r2
            int r2 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r2 >= 0) goto L94
            r9 = r8
            r7 = r10
        L94:
            int r8 = r8 + 1
            r2 = 0
            goto L45
        L98:
            if (r9 <= r5) goto Lae
            g6.b[] r2 = r0.f20029g
            r2 = r2[r9]
            g6.h r7 = r2.f20017a
            r7.f20046c = r5
            r2.g(r6)
            g6.h r5 = r2.f20017a
            r5.f20046c = r9
            r5.f(r0, r2)
            goto Lae
        Lad:
            r3 = r5
        Lae:
            r2 = 0
            goto L13
        Lb1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g6.c.r(g6.b):void");
    }

    public final void s() {
        for (int i11 = 0; i11 < this.f20033k; i11++) {
            b bVar = this.f20029g[i11];
            if (bVar != null) {
                ((e) this.f20034m.f973b).b(bVar);
            }
            this.f20029g[i11] = null;
        }
    }

    public final void t() {
        a8.h hVar;
        int i11 = 0;
        while (true) {
            hVar = this.f20034m;
            h[] hVarArr = (h[]) hVar.f975d;
            if (i11 >= hVarArr.length) {
                break;
            }
            h hVar2 = hVarArr[i11];
            if (hVar2 != null) {
                hVar2.d();
            }
            i11++;
        }
        e eVar = (e) hVar.f974c;
        h[] hVarArr2 = this.f20035n;
        int length = this.f20036o;
        eVar.getClass();
        if (length > hVarArr2.length) {
            length = hVarArr2.length;
        }
        for (int i12 = 0; i12 < length; i12++) {
            h hVar3 = hVarArr2[i12];
            int i13 = eVar.f20039b;
            Object[] objArr = eVar.f20038a;
            if (i13 < objArr.length) {
                objArr[i13] = hVar3;
                eVar.f20039b = i13 + 1;
            }
        }
        this.f20036o = 0;
        Arrays.fill((h[]) hVar.f975d, (Object) null);
        this.f20025c = 0;
        f fVar = this.f20026d;
        fVar.f20042h = 0;
        fVar.f20018b = 0.0f;
        this.f20032j = 1;
        for (int i14 = 0; i14 < this.f20033k; i14++) {
            b bVar = this.f20029g[i14];
        }
        s();
        this.f20033k = 0;
        this.f20037p = new b(hVar);
    }
}
