package com.braze.events.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.braze.requests.b f9820a;

    public q(com.braze.requests.b bVar) {
        bVar.getClass();
        this.f9820a = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && Intrinsics.areEqual(this.f9820a, ((q) obj).f9820a);
    }

    public final int hashCode() {
        return this.f9820a.hashCode();
    }

    public final String toString() {
        return "RequestDispatchCompletedEvent(request=" + this.f9820a + ")";
    }
}
