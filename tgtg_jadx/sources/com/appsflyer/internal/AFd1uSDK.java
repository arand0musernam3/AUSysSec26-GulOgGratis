package com.appsflyer.internal;

import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class AFd1uSDK implements AFd1vSDK {

    @NotNull
    private final AFc1aSDK getMonetizationNetwork;

    public AFd1uSDK(@NotNull AFc1aSDK aFc1aSDK) {
        aFc1aSDK.getClass();
        this.getMonetizationNetwork = aFc1aSDK;
    }

    @Override // com.appsflyer.internal.AFd1vSDK
    public final void getMediationNetwork(@NotNull byte[] bArr, @Nullable Map<String, String> map, int i11) {
        bArr.getClass();
        if (new AFd1qSDK(bArr, map, 2000).getMediationNetwork()) {
            this.getMonetizationNetwork.getMediationNetwork();
        }
    }
}
