package g3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c5 implements v4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d5 f18415a;

    public c5(d5 d5Var) {
        this.f18415a = d5Var;
    }

    @Override // v4.a
    public final Object V(long j9, long j11, x70.c cVar) {
        if (z5.q.c(j11) > 0.0f) {
            this.f18415a.f18454a.f18984b.i(0.0f);
        }
        return super.V(j9, j11, cVar);
    }

    @Override // v4.a
    public final long o0(int i11, long j9, long j11) {
        d5 d5Var = this.f18415a;
        if (!((Boolean) d5Var.f18455b.invoke()).booleanValue()) {
            return 0L;
        }
        ka kaVar = d5Var.f18454a;
        kaVar.f18984b.i(Float.intBitsToFloat((int) (j9 & 4294967295L)) + kaVar.f18984b.h());
        return 0L;
    }
}
