package w;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f42674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i0.b f42675b;

    public e0(o oVar) {
        oVar.getClass();
        this.f42674a = oVar;
    }

    public final i0.b a() {
        i0.b bVar = this.f42675b;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("cameraGraph");
        return null;
    }
}
