package com.braze.events.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.braze.models.n f9826a;

    public y(com.braze.models.n nVar) {
        nVar.getClass();
        this.f9826a = nVar;
        if (nVar.f10214d) {
            i4.a.f("Session created events cannot be created with already sealed sessions.");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && Intrinsics.areEqual(this.f9826a, ((y) obj).f9826a);
    }

    public final int hashCode() {
        return this.f9826a.hashCode();
    }

    public final String toString() {
        return "SessionCreatedEvent(session=" + this.f9826a + ")";
    }
}
