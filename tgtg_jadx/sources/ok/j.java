package ok;

import com.app.tgtg.model.remote.ItemId;
import kotlin.jvm.internal.Intrinsics;
import nk.v0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v0 f32602b;

    public j(String str, v0 v0Var) {
        this.f32601a = str;
        this.f32602b = v0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return ItemId.m201equalsimpl0(this.f32601a, jVar.f32601a) && Intrinsics.areEqual(this.f32602b, jVar.f32602b);
    }

    public final int hashCode() {
        return this.f32602b.hashCode() + (ItemId.m202hashCodeimpl(this.f32601a) * 31);
    }

    public final String toString() {
        return "InitialSetup(itemId=" + ItemId.m203toStringimpl(this.f32601a) + ", trackingParams=" + this.f32602b + ")";
    }
}
