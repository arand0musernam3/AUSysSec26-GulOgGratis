package b0;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0.n f5259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f5260b;

    public k(e0.n nVar, Map map) {
        map.getClass();
        this.f5259a = nVar;
        this.f5260b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Intrinsics.areEqual(this.f5259a, kVar.f5259a) && Intrinsics.areEqual(this.f5260b, kVar.f5260b);
    }

    public final int hashCode() {
        return this.f5260b.hashCode() + (this.f5259a.hashCode() * 31);
    }

    public final String toString() {
        return "CameraGraphCreationResult(config=" + this.f5259a + ", streamConfigMap=" + this.f5260b + ')';
    }
}
