package ok;

import com.app.tgtg.model.remote.ItemId;
import kotlin.jvm.internal.Intrinsics;
import nk.v0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v0 f32605b;

    public k(String str, v0 v0Var) {
        this.f32604a = str;
        this.f32605b = v0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return ItemId.m201equalsimpl0(this.f32604a, kVar.f32604a) && Intrinsics.areEqual(this.f32605b, kVar.f32605b);
    }

    public final int hashCode() {
        return this.f32605b.hashCode() + (ItemId.m202hashCodeimpl(this.f32604a) * 31);
    }

    public final String toString() {
        return "LoadItem(itemId=" + ItemId.m203toStringimpl(this.f32604a) + ", trackingParams=" + this.f32605b + ")";
    }
}
