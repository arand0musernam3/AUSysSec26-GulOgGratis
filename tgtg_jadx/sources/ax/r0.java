package ax;

import z4.m1;
import z4.t0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f4992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f4994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f4995d;

    public r0(t0 t0Var, m1 m1Var, long j9) {
        this.f4994c = t0Var;
        this.f4995d = m1Var;
        this.f4992a = j9;
        this.f4993b = true;
    }

    public boolean a() {
        Boolean bool = (Boolean) this.f4995d;
        return bool != null ? bool.booleanValue() : this.f4993b;
    }

    public r0(boolean z11, String str) {
        this.f4993b = z11;
        this.f4994c = str;
    }
}
