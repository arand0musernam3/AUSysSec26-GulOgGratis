package l6;

import f6.t;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements e, k6.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f27423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public n6.l f27425c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f27426d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f27427e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f27428f = 0.0f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f27429g;

    public h(t tVar) {
        this.f27423a = tVar;
    }

    @Override // k6.h
    public final void a(n6.g gVar) {
        if (gVar instanceof n6.l) {
            this.f27425c = (n6.l) gVar;
        } else {
            this.f27425c = null;
        }
    }

    @Override // l6.e, k6.h
    public final void apply() {
        this.f27425c.X(this.f27424b);
        int i11 = this.f27426d;
        if (i11 != -1) {
            n6.l lVar = this.f27425c;
            if (i11 <= -1) {
                lVar.getClass();
                return;
            }
            lVar.f30649v0 = -1.0f;
            lVar.f30650w0 = i11;
            lVar.f30651x0 = -1;
            return;
        }
        int i12 = this.f27427e;
        n6.l lVar2 = this.f27425c;
        if (i12 != -1) {
            if (i12 <= -1) {
                lVar2.getClass();
                return;
            }
            lVar2.f30649v0 = -1.0f;
            lVar2.f30650w0 = -1;
            lVar2.f30651x0 = i12;
            return;
        }
        float f11 = this.f27428f;
        if (f11 <= -1.0f) {
            lVar2.getClass();
            return;
        }
        lVar2.f30649v0 = f11;
        lVar2.f30650w0 = -1;
        lVar2.f30651x0 = -1;
    }

    @Override // k6.h
    public final n6.g b() {
        if (this.f27425c == null) {
            this.f27425c = new n6.l();
        }
        return this.f27425c;
    }

    @Override // k6.h
    public final e c() {
        return null;
    }

    @Override // k6.h
    public final Object getKey() {
        return this.f27429g;
    }
}
