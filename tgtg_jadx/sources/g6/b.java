package g6;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f20020d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h f20017a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f20018b = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f20019c = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f20021e = false;

    public b(a8.h hVar) {
        this.f20020d = new a(this, hVar);
    }

    public final void a(c cVar, int i11) {
        this.f20020d.g(cVar.j(i11), 1.0f);
        this.f20020d.g(cVar.j(i11), -1.0f);
    }

    public final void b(h hVar, h hVar2, h hVar3, int i11) {
        boolean z11 = false;
        if (i11 != 0) {
            if (i11 < 0) {
                i11 *= -1;
                z11 = true;
            }
            this.f20018b = i11;
        }
        a aVar = this.f20020d;
        if (z11) {
            aVar.g(hVar, 1.0f);
            this.f20020d.g(hVar2, -1.0f);
            this.f20020d.g(hVar3, -1.0f);
        } else {
            aVar.g(hVar, -1.0f);
            this.f20020d.g(hVar2, 1.0f);
            this.f20020d.g(hVar3, 1.0f);
        }
    }

    public final void c(h hVar, h hVar2, h hVar3, int i11) {
        boolean z11 = false;
        if (i11 != 0) {
            if (i11 < 0) {
                i11 *= -1;
                z11 = true;
            }
            this.f20018b = i11;
        }
        a aVar = this.f20020d;
        if (z11) {
            aVar.g(hVar, 1.0f);
            this.f20020d.g(hVar2, -1.0f);
            this.f20020d.g(hVar3, 1.0f);
        } else {
            aVar.g(hVar, -1.0f);
            this.f20020d.g(hVar2, 1.0f);
            this.f20020d.g(hVar3, -1.0f);
        }
    }

    public h d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        return this.f20017a == null && this.f20018b == 0.0f && this.f20020d.d() == 0;
    }

    public final h f(boolean[] zArr, h hVar) {
        g gVar;
        int iD = this.f20020d.d();
        h hVar2 = null;
        float f11 = 0.0f;
        for (int i11 = 0; i11 < iD; i11++) {
            float f12 = this.f20020d.f(i11);
            if (f12 < 0.0f) {
                h hVarE = this.f20020d.e(i11);
                if ((zArr == null || !zArr[hVarE.f20045b]) && hVarE != hVar && (((gVar = hVarE.f20052i) == g.SLACK || gVar == g.ERROR) && f12 < f11)) {
                    f11 = f12;
                    hVar2 = hVarE;
                }
            }
        }
        return hVar2;
    }

    public final void g(h hVar) {
        h hVar2 = this.f20017a;
        if (hVar2 != null) {
            this.f20020d.g(hVar2, -1.0f);
            this.f20017a.f20046c = -1;
            this.f20017a = null;
        }
        float fH = this.f20020d.h(hVar, true) * (-1.0f);
        this.f20017a = hVar;
        if (fH == 1.0f) {
            return;
        }
        this.f20018b /= fH;
        a aVar = this.f20020d;
        int i11 = aVar.f20014h;
        for (int i12 = 0; i11 != -1 && i12 < aVar.f20007a; i12++) {
            float[] fArr = aVar.f20013g;
            fArr[i11] = fArr[i11] / fH;
            i11 = aVar.f20012f[i11];
        }
    }

    public final void h(c cVar, h hVar, boolean z11) {
        if (hVar.f20049f) {
            float fC = this.f20020d.c(hVar);
            this.f20018b = (hVar.f20048e * fC) + this.f20018b;
            this.f20020d.h(hVar, z11);
            if (z11) {
                hVar.c(this);
            }
            if (this.f20020d.d() == 0) {
                this.f20021e = true;
                cVar.f20024b = true;
            }
        }
    }

    public void i(c cVar, b bVar, boolean z11) {
        a aVar = this.f20020d;
        aVar.getClass();
        float fC = aVar.c(bVar.f20017a);
        aVar.h(bVar.f20017a, z11);
        a aVar2 = bVar.f20020d;
        int iD = aVar2.d();
        for (int i11 = 0; i11 < iD; i11++) {
            h hVarE = aVar2.e(i11);
            aVar.a(hVarE, aVar2.c(hVarE) * fC, z11);
        }
        this.f20018b = (bVar.f20018b * fC) + this.f20018b;
        if (z11) {
            bVar.f20017a.c(this);
        }
        if (this.f20017a == null || this.f20020d.d() != 0) {
            return;
        }
        this.f20021e = true;
        cVar.f20024b = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            r10 = this;
            g6.h r0 = r10.f20017a
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L17
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            g6.h r1 = r10.f20017a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L17:
            java.lang.String r1 = " = "
            java.lang.String r0 = r0.concat(r1)
            float r1 = r10.f20018b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L35
            java.lang.StringBuilder r0 = b3.i.o(r0)
            float r1 = r10.f20018b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r4
            goto L36
        L35:
            r1 = r3
        L36:
            g6.a r5 = r10.f20020d
            int r5 = r5.d()
        L3c:
            if (r3 >= r5) goto L9c
            g6.a r6 = r10.f20020d
            g6.h r6 = r6.e(r3)
            if (r6 != 0) goto L47
            goto L99
        L47:
            g6.a r7 = r10.f20020d
            float r7 = r7.f(r3)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L52
            goto L99
        L52:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L66
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L76
            java.lang.String r1 = "- "
            java.lang.String r0 = r8.k.l(r0, r1)
        L64:
            float r7 = r7 * r9
            goto L76
        L66:
            if (r8 <= 0) goto L6f
            java.lang.String r1 = " + "
            java.lang.String r0 = r8.k.l(r0, r1)
            goto L76
        L6f:
            java.lang.String r1 = " - "
            java.lang.String r0 = r8.k.l(r0, r1)
            goto L64
        L76:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L81
            java.lang.String r0 = r8.k.l(r0, r6)
            goto L98
        L81:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L98:
            r1 = r4
        L99:
            int r3 = r3 + 1
            goto L3c
        L9c:
            if (r1 != 0) goto La4
            java.lang.String r1 = "0.0"
            java.lang.String r0 = r8.k.l(r0, r1)
        La4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g6.b.toString():java.lang.String");
    }
}
