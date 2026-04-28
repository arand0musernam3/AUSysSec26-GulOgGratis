package com.google.android.gms.internal.measurement;

import android.text.TextUtils;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class cf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k30.x f11319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k30.x f11320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UUID f11321c;

    public cf(k30.x xVar, k30.x xVar2, UUID uuid) {
        this.f11319a = xVar;
        this.f11320b = xVar2;
        this.f11321c = uuid;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cf)) {
            return false;
        }
        cf cfVar = (cf) obj;
        return this.f11319a.equals(cfVar.f11319a) && this.f11320b.equals(cfVar.f11320b) && this.f11321c.equals(cfVar.f11321c);
    }

    public final int hashCode() {
        return ((((((this.f11319a.hashCode() ^ 1000003) * 1000003) ^ this.f11320b.hashCode()) * 1000003) ^ this.f11321c.hashCode()) * 1000003) ^ ((int) (-4294967296L));
    }

    public final String toString() {
        return TextUtils.join(" -> ", this.f11319a);
    }
}
