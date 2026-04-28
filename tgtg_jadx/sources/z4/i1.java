package z4;

import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i1 extends b4.s implements b5.b0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Function1 f47146o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f47147p;

    @Override // b4.s
    public final boolean getShouldAutoInvalidate() {
        return true;
    }

    @Override // b5.b0
    public final void k(long j9) {
        if (z5.l.a(this.f47147p, j9)) {
            return;
        }
        this.f47146o.invoke(new z5.l(j9));
        this.f47147p = j9;
    }
}
