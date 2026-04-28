package c50;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 implements e50.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f7607b;

    public /* synthetic */ n0(Object obj, int i11) {
        this.f7606a = i11;
        this.f7607b = obj;
    }

    public static n0 a(Object obj) {
        if (obj != null) {
            return new n0(obj, 2);
        }
        w.l("instance cannot be null");
        return null;
    }

    @Override // t70.a
    public final Object get() {
        switch (this.f7606a) {
            case 0:
                return new m0((w0) ((t70.a) this.f7607b).get());
            case 1:
                return new z0((f1) ((e50.c) this.f7607b).get());
            default:
                return this.f7607b;
        }
    }
}
