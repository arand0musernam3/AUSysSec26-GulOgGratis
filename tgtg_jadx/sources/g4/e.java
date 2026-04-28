package g4;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends b4.s implements g {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Function1 f19934o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public z f19935p;

    @Override // g4.g
    public final void e0(z zVar) {
        if (Intrinsics.areEqual(this.f19935p, zVar)) {
            return;
        }
        this.f19935p = zVar;
        this.f19934o.invoke(zVar);
    }
}
