package oq;

import com.app.tgtg.model.remote.user.response.C2CReferralResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class r extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2CReferralResponse f32951a;

    public r(C2CReferralResponse c2CReferralResponse) {
        this.f32951a = c2CReferralResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && Intrinsics.areEqual(this.f32951a, ((r) obj).f32951a);
    }

    public final int hashCode() {
        return this.f32951a.hashCode();
    }

    public final String toString() {
        return "Incentivized(referralDetails=" + this.f32951a + ")";
    }
}
