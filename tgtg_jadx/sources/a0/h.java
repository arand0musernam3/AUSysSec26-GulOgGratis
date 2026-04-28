package a0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import w.e0;
import w.l0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f68a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e0 f69b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l0 f70c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u70.j f71d;

    public h(Function1 function1, e0 e0Var, l0 l0Var, u70.j jVar) {
        function1.getClass();
        this.f68a = function1;
        this.f69b = e0Var;
        this.f70c = l0Var;
        this.f71d = jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(h.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        h hVar = (h) obj;
        return Intrinsics.areEqual(this.f70c, hVar.f70c) && Intrinsics.areEqual(this.f69b, hVar.f69b) && Intrinsics.areEqual((Object) null, (Object) null);
    }

    public final int hashCode() {
        return (this.f69b.hashCode() + (this.f70c.hashCode() * 31)) * 31;
    }

    public final String toString() {
        return "UseCaseCameraConfig(cameraGraphFactory=" + this.f68a + ", graphStateToCameraStateAdapter=" + this.f69b + ", sessionConfigAdapter=" + this.f70c + ", sessionProcessor=null, lazyCreationResult=" + this.f71d + ')';
    }
}
