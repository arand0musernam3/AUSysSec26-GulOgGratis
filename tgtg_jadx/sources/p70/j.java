package p70;

import android.app.Application;
import o00.x0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class j implements r70.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gv.a f34550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ag.f f34551b;

    public j(gv.a aVar) {
        this.f34550a = aVar;
    }

    @Override // r70.b
    public final Object a() {
        if (this.f34551b == null) {
            Application application = this.f34550a.getApplication();
            ox.h.q(application instanceof r70.b, "Hilt service must be attached to an @HiltAndroidApp Application. Found: %s", application.getClass());
            this.f34551b = new ag.f(((ag.i) ((i) x0.q(i.class, application))).f1322g);
        }
        return this.f34551b;
    }
}
