package c50;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class x0 implements e50.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t70.a f7652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e50.c f7653c;

    public /* synthetic */ x0(e50.c cVar, e50.c cVar2, int i11) {
        this.f7651a = i11;
        this.f7652b = cVar;
        this.f7653c = cVar2;
    }

    @Override // t70.a
    public final Object get() {
        switch (this.f7651a) {
            case 0:
                return new w0((k1) this.f7652b.get(), (l1) this.f7653c.get());
            default:
                return new f50.k((f50.p) this.f7652b.get(), (f50.p) this.f7653c.get());
        }
    }
}
