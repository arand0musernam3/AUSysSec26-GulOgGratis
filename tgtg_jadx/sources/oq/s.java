package oq;

import com.app.tgtg.model.remote.user.response.C2CReferralResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class s extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2CReferralResponse f32952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f32953b;

    public s(C2CReferralResponse c2CReferralResponse, boolean z11) {
        this.f32952a = c2CReferralResponse;
        this.f32953b = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Intrinsics.areEqual(this.f32952a, sVar.f32952a) && this.f32953b == sVar.f32953b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f32953b) + (this.f32952a.hashCode() * 31);
    }

    public final String toString() {
        return "IncentivizedAlwaysOn(referralDetails=" + this.f32952a + ", showManufacturerItems=" + this.f32953b + ")";
    }
}
