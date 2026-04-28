package com.braze.events.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.braze.requests.g f9787a;

    public d0(com.braze.requests.g gVar) {
        gVar.getClass();
        this.f9787a = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d0) && Intrinsics.areEqual(this.f9787a, ((d0) obj).f9787a);
    }

    public final int hashCode() {
        return this.f9787a.hashCode();
    }

    public final String toString() {
        return "TriggerDispatchStartedEvent(request=" + this.f9787a + ")";
    }
}
