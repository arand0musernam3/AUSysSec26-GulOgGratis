package com.braze.events.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.braze.models.p f9827a;

    public z(com.braze.models.p pVar) {
        pVar.getClass();
        this.f9827a = pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && Intrinsics.areEqual(this.f9827a, ((z) obj).f9827a);
    }

    public final int hashCode() {
        return this.f9827a.hashCode();
    }

    public final String toString() {
        return "SessionSealedEvent(sealedSession=" + this.f9827a + ")";
    }
}
