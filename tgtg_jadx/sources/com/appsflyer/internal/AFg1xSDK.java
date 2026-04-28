package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class AFg1xSDK {

    @NotNull
    public final String AFAdRevenueData;
    public final boolean getMediationNetwork;
    public final long getMonetizationNetwork;

    public AFg1xSDK(@NotNull String str, long j9, boolean z11) {
        str.getClass();
        this.AFAdRevenueData = str;
        this.getMonetizationNetwork = j9;
        this.getMediationNetwork = z11;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFg1xSDK)) {
            return false;
        }
        AFg1xSDK aFg1xSDK = (AFg1xSDK) obj;
        return Intrinsics.areEqual(this.AFAdRevenueData, aFg1xSDK.AFAdRevenueData) && this.getMonetizationNetwork == aFg1xSDK.getMonetizationNetwork && this.getMediationNetwork == aFg1xSDK.getMediationNetwork;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public final int hashCode() {
        int iB = e0.f.b(this.AFAdRevenueData.hashCode() * 31, 31, this.getMonetizationNetwork);
        boolean z11 = this.getMediationNetwork;
        ?? r12 = z11;
        if (z11) {
            r12 = 1;
        }
        return iB + r12;
    }

    @NotNull
    public final String toString() {
        String str = this.AFAdRevenueData;
        long j9 = this.getMonetizationNetwork;
        boolean z11 = this.getMediationNetwork;
        StringBuilder sbN = b3.i.n(j9, "AFUninstallToken(token=", str, ", receivedTime=");
        sbN.append(", isQueued=");
        sbN.append(z11);
        sbN.append(")");
        return sbN.toString();
    }
}
