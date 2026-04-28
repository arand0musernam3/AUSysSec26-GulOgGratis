package androidx.fragment.app;

import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u0 extends r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0 f3356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o0 f3357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f3358c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n1 f3359d;

    public u0(o0 o0Var) {
        Handler handler = new Handler();
        this.f3356a = o0Var;
        this.f3357b = o0Var;
        this.f3358c = handler;
        this.f3359d = new n1();
    }
}
