package qz;

import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w0.d f37367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile k f37368b;

    public m(Looper looper, Object obj, String str) {
        this.f37367a = new w0.d(looper);
        com.google.android.gms.common.internal.i0.i(obj, "Listener must not be null");
        com.google.android.gms.common.internal.i0.e(str);
        this.f37368b = new k(obj, str);
    }

    public final void a(l lVar) {
        this.f37367a.execute(new x0.f(15, this, lVar));
    }
}
