package com.appsflyer.internal;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class AFc1sSDK {

    @NotNull
    final List<AFc1uSDK> getRevenue;

    public AFc1sSDK(@NotNull List<AFc1uSDK> list) {
        list.getClass();
        this.getRevenue = list;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AFc1sSDK) && Intrinsics.areEqual(this.getRevenue, ((AFc1sSDK) obj).getRevenue);
    }

    public final int hashCode() {
        return this.getRevenue.hashCode();
    }

    @NotNull
    public final String toString() {
        return e0.f.m("StorageConfig(typeEntries=", ")", this.getRevenue);
    }
}
