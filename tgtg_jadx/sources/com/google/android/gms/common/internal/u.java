package com.google.android.gms.common.internal;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class u implements com.google.android.gms.common.api.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u f11203b = new u(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11204a;

    public /* synthetic */ u(String str) {
        this.f11204a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u) {
            return i0.k(this.f11204a, ((u) obj).f11204a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11204a});
    }
}
