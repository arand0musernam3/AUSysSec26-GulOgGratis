package a3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f340d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f341e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m5.q0 f342f;

    public f0(long j9, int i11, int i12, int i13, int i14, m5.q0 q0Var) {
        this.f337a = j9;
        this.f338b = i11;
        this.f339c = i12;
        this.f340d = i13;
        this.f341e = i14;
        this.f342f = q0Var;
    }

    public final h0 a(int i11) {
        return new h0(jb.u.F(this.f342f, i11), i11, this.f337a);
    }

    public final k b() {
        int i11 = this.f339c;
        int i12 = this.f340d;
        return i11 < i12 ? k.NOT_CROSSED : i11 > i12 ? k.CROSSED : k.COLLAPSED;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectionInfo(id=");
        sb2.append(this.f337a);
        sb2.append(", range=(");
        int i11 = this.f339c;
        sb2.append(i11);
        sb2.append('-');
        m5.q0 q0Var = this.f342f;
        sb2.append(jb.u.F(q0Var, i11));
        sb2.append(',');
        int i12 = this.f340d;
        sb2.append(i12);
        sb2.append('-');
        sb2.append(jb.u.F(q0Var, i12));
        sb2.append("), prevOffset=");
        return r8.k.o(sb2, this.f341e, ')');
    }
}
