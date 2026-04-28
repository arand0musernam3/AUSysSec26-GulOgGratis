package com.google.android.gms.oss.licenses.v2;

import e0.f;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzay implements zzbb {

    @NotNull
    private final String zza;

    public zzay(@NotNull String str) {
        str.getClass();
        this.zza = str;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zzay) && Intrinsics.areEqual(this.zza, ((zzay) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    @NotNull
    public final String toString() {
        String str = this.zza;
        return f.n(new StringBuilder(String.valueOf(str).length() + 15), "Error(message=", str, ")");
    }

    @NotNull
    public final String zza() {
        return this.zza;
    }
}
