package lf;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements kf.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f27770c = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public kf.a f27771a = kf.a.INFO;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f27772b = "Amplitude";

    @Override // kf.b
    public final void a(String str) {
        if (this.f27771a.compareTo(kf.a.ERROR) <= 0) {
            Log.e(this.f27772b, str);
        }
    }

    @Override // kf.b
    public final void b(String str) {
        if (this.f27771a.compareTo(kf.a.DEBUG) <= 0) {
            Log.d(this.f27772b, str);
        }
    }

    @Override // kf.b
    public final void c(kf.a aVar) {
        aVar.getClass();
        this.f27771a = aVar;
    }

    @Override // kf.b
    public final void d(String str) {
        str.getClass();
        if (this.f27771a.compareTo(kf.a.WARN) <= 0) {
            Log.w(this.f27772b, str);
        }
    }
}
