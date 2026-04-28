package qe;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f37015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pe.a f37016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f37017d;

    public t(String str, int i11, pe.a aVar, boolean z11) {
        this.f37014a = str;
        this.f37015b = i11;
        this.f37016c = aVar;
        this.f37017d = z11;
    }

    @Override // qe.b
    public final je.c a(he.z zVar, he.k kVar, re.b bVar) {
        return new je.t(zVar, bVar, this);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ShapePath{name=");
        sb2.append(this.f37014a);
        sb2.append(", index=");
        return r8.k.o(sb2, this.f37015b, '}');
    }
}
