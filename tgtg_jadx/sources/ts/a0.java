package ts;

import com.app.tgtg.model.remote.specialrewards.SpecialReward;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SpecialReward f40437a;

    public a0(SpecialReward specialReward) {
        specialReward.getClass();
        this.f40437a = specialReward;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0) && Intrinsics.areEqual(this.f40437a, ((a0) obj).f40437a);
    }

    public final int hashCode() {
        return this.f40437a.hashCode();
    }

    public final String toString() {
        return "SelectSpecialReward(reward=" + this.f40437a + ")";
    }
}
