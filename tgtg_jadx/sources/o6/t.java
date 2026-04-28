package o6;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f32029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n6.g f32030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public n f32031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public n6.f f32032d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h f32033e = new h(this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f32034f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f32035g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g f32036h = new g(this);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final g f32037i = new g(this);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public s f32038j = s.NONE;

    public t(n6.g gVar) {
        this.f32030b = gVar;
    }

    public static void b(g gVar, g gVar2, int i11) {
        gVar.l.add(gVar2);
        gVar.f32008f = i11;
        gVar2.f32013k.add(gVar);
    }

    public static g h(n6.d dVar) {
        n6.d dVar2 = dVar.f30569f;
        if (dVar2 == null) {
            return null;
        }
        n6.g gVar = dVar2.f30567d;
        int i11 = r.f32028a[dVar2.f30568e.ordinal()];
        if (i11 == 1) {
            return gVar.f30580d.f32036h;
        }
        if (i11 == 2) {
            return gVar.f30580d.f32037i;
        }
        if (i11 == 3) {
            return gVar.f30582e.f32036h;
        }
        if (i11 == 4) {
            return gVar.f30582e.f32021k;
        }
        if (i11 != 5) {
            return null;
        }
        return gVar.f30582e.f32037i;
    }

    public static g i(n6.d dVar, int i11) {
        n6.d dVar2 = dVar.f30569f;
        if (dVar2 == null) {
            return null;
        }
        n6.g gVar = dVar2.f30567d;
        t tVar = i11 == 0 ? gVar.f30580d : gVar.f30582e;
        int i12 = r.f32028a[dVar2.f30568e.ordinal()];
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 != 3) {
                    if (i12 != 5) {
                        return null;
                    }
                }
            }
            return tVar.f32037i;
        }
        return tVar.f32036h;
    }

    public final void c(g gVar, g gVar2, int i11, h hVar) {
        gVar.l.add(gVar2);
        gVar.l.add(this.f32033e);
        gVar.f32010h = i11;
        gVar.f32011i = hVar;
        gVar2.f32013k.add(gVar);
        hVar.f32013k.add(gVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i11, int i12) {
        n6.g gVar = this.f32030b;
        if (i12 == 0) {
            int i13 = gVar.f30615w;
            int iMax = Math.max(gVar.f30614v, i11);
            if (i13 > 0) {
                iMax = Math.min(i13, i11);
            }
            if (iMax != i11) {
                return iMax;
            }
        } else {
            int i14 = gVar.f30618z;
            int iMax2 = Math.max(gVar.f30617y, i11);
            if (i14 > 0) {
                iMax2 = Math.min(i14, i11);
            }
            if (iMax2 != i11) {
                return iMax2;
            }
        }
        return i11;
    }

    public long j() {
        if (this.f32033e.f32012j) {
            return r0.f32009g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Removed duplicated region for block: B:29:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(n6.d r13, n6.d r14, int r15) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.t.l(n6.d, n6.d, int):void");
    }
}
