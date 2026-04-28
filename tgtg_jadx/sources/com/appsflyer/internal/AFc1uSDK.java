package com.appsflyer.internal;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class AFc1uSDK {

    @NotNull
    final String getCurrencyIso4217Code;
    final int getMediationNetwork;

    @NotNull
    final List<AFe1lSDK> getMonetizationNetwork;

    /* JADX WARN: Multi-variable type inference failed */
    public AFc1uSDK(@NotNull String str, @NotNull List<? extends AFe1lSDK> list, int i11) {
        str.getClass();
        list.getClass();
        this.getCurrencyIso4217Code = str;
        this.getMonetizationNetwork = list;
        this.getMediationNetwork = i11;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFc1uSDK)) {
            return false;
        }
        AFc1uSDK aFc1uSDK = (AFc1uSDK) obj;
        return Intrinsics.areEqual(this.getCurrencyIso4217Code, aFc1uSDK.getCurrencyIso4217Code) && Intrinsics.areEqual(this.getMonetizationNetwork, aFc1uSDK.getMonetizationNetwork) && this.getMediationNetwork == aFc1uSDK.getMediationNetwork;
    }

    public final int hashCode() {
        return Integer.hashCode(this.getMediationNetwork) + e0.f.c(this.getMonetizationNetwork, this.getCurrencyIso4217Code.hashCode() * 31, 31);
    }

    @NotNull
    public final String toString() {
        String str = this.getCurrencyIso4217Code;
        List<AFe1lSDK> list = this.getMonetizationNetwork;
        int i11 = this.getMediationNetwork;
        StringBuilder sb2 = new StringBuilder("StorageConfigTypeEntry(cacheDirName=");
        sb2.append(str);
        sb2.append(", eventTypes=");
        sb2.append(list);
        sb2.append(", maxCapacity=");
        return r8.k.i(i11, ")", sb2);
    }
}
