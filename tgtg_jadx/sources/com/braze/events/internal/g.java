package com.braze.events.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.braze.requests.o f9802a;

    public g(com.braze.requests.o oVar) {
        oVar.getClass();
        this.f9802a = oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Intrinsics.areEqual(this.f9802a, ((g) obj).f9802a);
    }

    public final int hashCode() {
        return this.f9802a.hashCode();
    }

    public final String toString() {
        return "DispatchSucceededEvent(request=" + this.f9802a + ")";
    }
}
