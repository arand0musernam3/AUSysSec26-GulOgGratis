package com.braze.events.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.braze.requests.o f9800a;

    public f(com.braze.requests.o oVar) {
        oVar.getClass();
        this.f9800a = oVar;
        oVar.b();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Intrinsics.areEqual(this.f9800a, ((f) obj).f9800a);
    }

    public final int hashCode() {
        return this.f9800a.hashCode();
    }

    public final String toString() {
        return "DispatchFailedEvent(request=" + this.f9800a + ")";
    }
}
