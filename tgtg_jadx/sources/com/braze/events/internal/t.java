package com.braze.events.internal;

import com.braze.managers.d1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d1 f9822a;

    public t(d1 d1Var) {
        d1Var.getClass();
        this.f9822a = d1Var;
    }

    public final d1 a() {
        return this.f9822a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && Intrinsics.areEqual(this.f9822a, ((t) obj).f9822a);
    }

    public final int hashCode() {
        return this.f9822a.hashCode();
    }

    public final String toString() {
        return "SdkDebuggerConfigUpdateEvent(debugConfig=" + this.f9822a + ")";
    }
}
