package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t f12046b = new t(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final y f12047c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f12048a;

    static {
        List list = Collections.EMPTY_LIST;
        f12047c = new y(new w());
    }

    public y(w wVar) {
        this.f12048a = wVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof y) && ((y) obj).f12048a.equals(this.f12048a);
    }

    public final int hashCode() {
        return ~this.f12048a.hashCode();
    }

    public final String toString() {
        return this.f12048a.toString();
    }
}
