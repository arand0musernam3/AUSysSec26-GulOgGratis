package c50;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements m40.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f7499a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m40.b f7500b = m40.b.a("packageName");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m40.b f7501c = m40.b.a("versionName");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m40.b f7502d = m40.b.a("appBuildVersion");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m40.b f7503e = m40.b.a("deviceManufacturer");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final m40.b f7504f = m40.b.a("currentProcessDetails");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final m40.b f7505g = m40.b.a("appProcessDetails");

    @Override // m40.a
    public final void a(Object obj, Object obj2) {
        a aVar = (a) obj;
        m40.d dVar = (m40.d) obj2;
        dVar.a(f7500b, aVar.f7486a);
        dVar.a(f7501c, aVar.f7487b);
        dVar.a(f7502d, aVar.f7488c);
        dVar.a(f7503e, Build.MANUFACTURER);
        dVar.a(f7504f, aVar.f7489d);
        dVar.a(f7505g, aVar.f7490e);
    }
}
