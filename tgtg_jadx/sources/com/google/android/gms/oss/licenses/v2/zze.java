package com.google.android.gms.oss.licenses.v2;

import n9.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zze implements g {
    private final int zza;

    public zze(int i11) {
        this.zza = i11;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zze) && this.zza == ((zze) obj).zza;
    }

    public final int hashCode() {
        return Integer.hashCode(this.zza);
    }

    @NotNull
    public final String toString() {
        int i11 = this.zza;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 24);
        sb2.append("LicenseDetailKey(index=");
        sb2.append(i11);
        sb2.append(")");
        return sb2.toString();
    }

    public final int zza() {
        return this.zza;
    }
}
