package r5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f37665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f37666b;

    public d0(z zVar, t tVar) {
        this.f37665a = zVar;
        this.f37666b = tVar;
    }

    public final void a(y yVar, y yVar2) {
        if (Intrinsics.areEqual((d0) this.f37665a.f37718b.get(), this)) {
            this.f37666b.f(yVar, yVar2);
        }
    }
}
