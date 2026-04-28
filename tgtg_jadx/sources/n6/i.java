package n6;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f30624a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d f30627d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d f30628e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d f30629f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public d f30630g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f30631h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f30632i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f30633j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f30634k;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f30639q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ j f30640r;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g f30625b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f30626c = 0;
    public int l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f30635m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f30636n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f30637o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f30638p = 0;

    public i(j jVar, int i11, d dVar, d dVar2, d dVar3, d dVar4, int i12) {
        this.f30640r = jVar;
        this.f30624a = i11;
        this.f30627d = dVar;
        this.f30628e = dVar2;
        this.f30629f = dVar3;
        this.f30630g = dVar4;
        this.f30631h = jVar.B0;
        this.f30632i = jVar.f30657x0;
        this.f30633j = jVar.C0;
        this.f30634k = jVar.f30658y0;
        this.f30639q = i12;
    }

    public final void a(g gVar) {
        int i11 = this.f30624a;
        int i12 = this.f30639q;
        j jVar = this.f30640r;
        if (i11 == 0) {
            int iC0 = jVar.c0(gVar, i12);
            if (gVar.V[0] == f.MATCH_CONSTRAINT) {
                this.f30638p++;
                iC0 = 0;
            }
            this.l = iC0 + (gVar.f30593j0 != 8 ? jVar.U0 : 0) + this.l;
            int iB0 = jVar.b0(gVar, this.f30639q);
            if (this.f30625b == null || this.f30626c < iB0) {
                this.f30625b = gVar;
                this.f30626c = iB0;
                this.f30635m = iB0;
            }
        } else {
            int iC02 = jVar.c0(gVar, i12);
            int iB02 = jVar.b0(gVar, this.f30639q);
            if (gVar.V[1] == f.MATCH_CONSTRAINT) {
                this.f30638p++;
                iB02 = 0;
            }
            this.f30635m = iB02 + (gVar.f30593j0 != 8 ? jVar.V0 : 0) + this.f30635m;
            if (this.f30625b == null || this.f30626c < iC02) {
                this.f30625b = gVar;
                this.f30626c = iC02;
                this.l = iC02;
            }
        }
        this.f30637o++;
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x0105 A[PHI: r5 r9
      0x0105: PHI (r5v25 int) = (r5v23 int), (r5v26 int) binds: [B:95:0x0115, B:88:0x0103] A[DONT_GENERATE, DONT_INLINE]
      0x0105: PHI (r9v24 float) = (r9v22 float), (r9v27 float) binds: [B:95:0x0115, B:88:0x0103] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(int r23, boolean r24, boolean r25) {
        /*
            Method dump skipped, instruction units count: 724
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n6.i.b(int, boolean, boolean):void");
    }

    public final int c() {
        int i11 = this.f30624a;
        int i12 = this.f30635m;
        return i11 == 1 ? i12 - this.f30640r.V0 : i12;
    }

    public final int d() {
        int i11 = this.f30624a;
        int i12 = this.l;
        return i11 == 0 ? i12 - this.f30640r.U0 : i12;
    }

    public final void e(int i11) {
        j jVar;
        int i12;
        int i13 = this.f30638p;
        if (i13 == 0) {
            return;
        }
        int i14 = this.f30637o;
        int i15 = i11 / i13;
        int i16 = 0;
        while (true) {
            jVar = this.f30640r;
            if (i16 >= i14 || (i12 = this.f30636n + i16) >= jVar.f30647g1) {
                break;
            }
            g gVar = jVar.f30646f1[i12];
            if (this.f30624a == 0) {
                if (gVar != null) {
                    f[] fVarArr = gVar.V;
                    if (fVarArr[0] == f.MATCH_CONSTRAINT && gVar.f30609s == 0) {
                        jVar.a0(gVar, f.FIXED, i15, fVarArr[1], gVar.m());
                    }
                }
            } else if (gVar != null) {
                f[] fVarArr2 = gVar.V;
                if (fVarArr2[1] == f.MATCH_CONSTRAINT && gVar.f30611t == 0) {
                    int i17 = i15;
                    jVar.a0(gVar, fVarArr2[0], gVar.s(), f.FIXED, i17);
                    i15 = i17;
                }
            }
            i16++;
        }
        this.l = 0;
        this.f30635m = 0;
        this.f30625b = null;
        this.f30626c = 0;
        int i18 = this.f30637o;
        for (int i19 = 0; i19 < i18; i19++) {
            int i21 = this.f30636n + i19;
            if (i21 >= jVar.f30647g1) {
                return;
            }
            g gVar2 = jVar.f30646f1[i21];
            if (this.f30624a == 0) {
                int iS = gVar2.s();
                int i22 = jVar.U0;
                if (gVar2.f30593j0 == 8) {
                    i22 = 0;
                }
                this.l = iS + i22 + this.l;
                int iB0 = jVar.b0(gVar2, this.f30639q);
                if (this.f30625b == null || this.f30626c < iB0) {
                    this.f30625b = gVar2;
                    this.f30626c = iB0;
                    this.f30635m = iB0;
                }
            } else {
                int iC0 = jVar.c0(gVar2, this.f30639q);
                int iB02 = jVar.b0(gVar2, this.f30639q);
                int i23 = jVar.V0;
                if (gVar2.f30593j0 == 8) {
                    i23 = 0;
                }
                this.f30635m = iB02 + i23 + this.f30635m;
                if (this.f30625b == null || this.f30626c < iC0) {
                    this.f30625b = gVar2;
                    this.f30626c = iC0;
                    this.l = iC0;
                }
            }
        }
    }

    public final void f(int i11, d dVar, d dVar2, d dVar3, d dVar4, int i12, int i13, int i14, int i15, int i16) {
        this.f30624a = i11;
        this.f30627d = dVar;
        this.f30628e = dVar2;
        this.f30629f = dVar3;
        this.f30630g = dVar4;
        this.f30631h = i12;
        this.f30632i = i13;
        this.f30633j = i14;
        this.f30634k = i15;
        this.f30639q = i16;
    }
}
