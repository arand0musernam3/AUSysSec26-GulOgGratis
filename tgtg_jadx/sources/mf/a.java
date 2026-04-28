package mf;

import kf.b;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f29926b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public kf.a f29927a;

    static {
        a aVar = new a();
        aVar.f29927a = kf.a.INFO;
        f29926b = aVar;
    }

    @Override // kf.b
    public final void a(String str) {
        e(kf.a.ERROR, str);
    }

    @Override // kf.b
    public final void b(String str) {
        e(kf.a.DEBUG, str);
    }

    @Override // kf.b
    public final void c(kf.a aVar) {
        aVar.getClass();
        this.f29927a = aVar;
    }

    @Override // kf.b
    public final void d(String str) {
        str.getClass();
        e(kf.a.WARN, str);
    }

    public final void e(kf.a aVar, String str) {
        if (this.f29927a.compareTo(aVar) <= 0) {
            System.out.println((Object) str);
        }
    }
}
