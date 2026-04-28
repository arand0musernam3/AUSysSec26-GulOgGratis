package com.google.android.gms.oss.licenses.v2;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaz implements zzbb {

    @NotNull
    private final List zza;

    public zzaz(@NotNull List list) {
        list.getClass();
        this.zza = list;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zzaz) && Intrinsics.areEqual(this.zza, ((zzaz) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    @NotNull
    public final String toString() {
        List list = this.zza;
        StringBuilder sb2 = new StringBuilder(String.valueOf(list).length() + 17);
        sb2.append("Loaded(licenses=");
        sb2.append(list);
        sb2.append(")");
        return sb2.toString();
    }

    @NotNull
    public final List zza() {
        return this.zza;
    }
}
