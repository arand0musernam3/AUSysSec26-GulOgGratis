package ok;

import com.app.tgtg.model.remote.item.StoreInformation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f0 implements o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StoreInformation f32589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f32590b;

    public f0(StoreInformation storeInformation, a aVar) {
        aVar.getClass();
        this.f32589a = storeInformation;
        this.f32590b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return Intrinsics.areEqual(this.f32589a, f0Var.f32589a) && this.f32590b == f0Var.f32590b;
    }

    public final int hashCode() {
        return this.f32590b.hashCode() + (this.f32589a.hashCode() * 31);
    }

    public final String toString() {
        return "GoToStore(storeInfo=" + this.f32589a + ", source=" + this.f32590b + ")";
    }
}
