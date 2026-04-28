package c50;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements m40.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f7507a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m40.b f7508b = m40.b.a("appId");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m40.b f7509c = m40.b.a("deviceModel");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m40.b f7510d = m40.b.a("sessionSdkVersion");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m40.b f7511e = m40.b.a("osVersion");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final m40.b f7512f = m40.b.a("logEnvironment");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final m40.b f7513g = m40.b.a("androidAppInfo");

    @Override // m40.a
    public final void a(Object obj, Object obj2) {
        b bVar = (b) obj;
        m40.d dVar = (m40.d) obj2;
        dVar.a(f7508b, bVar.f7496a);
        dVar.a(f7509c, Build.MODEL);
        dVar.a(f7510d, "3.0.4");
        dVar.a(f7511e, Build.VERSION.RELEASE);
        dVar.a(f7512f, bVar.f7497b);
        dVar.a(f7513g, bVar.f7498c);
    }
}
