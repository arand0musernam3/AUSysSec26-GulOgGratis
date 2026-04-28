package w2;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h1 extends z3.f0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CharSequence f42923c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f42924d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public m5.t0 f42925e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public m5.u0 f42926f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f42927g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f42928h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f42929i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f42930j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public z5.m f42931k;
    public q5.h l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f42932m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public m5.q0 f42933n;

    public h1() {
        super(z3.l.j().g());
        this.f42929i = Float.NaN;
        this.f42930j = Float.NaN;
        this.f42932m = z5.b.b(0, 0, 15);
    }

    @Override // z3.f0
    public final void a(z3.f0 f0Var) {
        f0Var.getClass();
        h1 h1Var = (h1) f0Var;
        this.f42923c = h1Var.f42923c;
        this.f42924d = h1Var.f42924d;
        this.f42925e = h1Var.f42925e;
        this.f42926f = h1Var.f42926f;
        this.f42927g = h1Var.f42927g;
        this.f42928h = h1Var.f42928h;
        this.f42929i = h1Var.f42929i;
        this.f42930j = h1Var.f42930j;
        this.f42931k = h1Var.f42931k;
        this.l = h1Var.l;
        this.f42932m = h1Var.f42932m;
        this.f42933n = h1Var.f42933n;
    }

    @Override // z3.f0
    public final z3.f0 b() {
        return new h1();
    }

    public final String toString() {
        return "CacheRecord(visualText=" + ((Object) this.f42923c) + ", annotations=" + this.f42924d + ", composition=" + this.f42925e + ", textStyle=" + this.f42926f + ", singleLine=" + this.f42927g + ", softWrap=" + this.f42928h + ", densityValue=" + this.f42929i + ", fontScale=" + this.f42930j + ", layoutDirection=" + this.f42931k + ", fontFamilyResolver=" + this.l + ", constraints=" + ((Object) z5.a.m(this.f42932m)) + ", layoutResult=" + this.f42933n + ')';
    }
}
