package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class AFe1xSDK {

    @NotNull
    final String getCurrencyIso4217Code;

    @NotNull
    final String getMonetizationNetwork;

    public AFe1xSDK(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.getMonetizationNetwork = str;
        this.getCurrencyIso4217Code = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFe1xSDK)) {
            return false;
        }
        AFe1xSDK aFe1xSDK = (AFe1xSDK) obj;
        return Intrinsics.areEqual(this.getMonetizationNetwork, aFe1xSDK.getMonetizationNetwork) && Intrinsics.areEqual(this.getCurrencyIso4217Code, aFe1xSDK.getCurrencyIso4217Code);
    }

    public final int hashCode() {
        return this.getCurrencyIso4217Code.hashCode() + (this.getMonetizationNetwork.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return org.bouncycastle.jcajce.provider.asymmetric.a.d("HostConfig(prefix=", this.getMonetizationNetwork, ", host=", this.getCurrencyIso4217Code, ")");
    }
}
