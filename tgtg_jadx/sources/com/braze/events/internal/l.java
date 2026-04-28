package com.braze.events.internal;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f9811a;

    public l(List list) {
        list.getClass();
        this.f9811a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && Intrinsics.areEqual(this.f9811a, ((l) obj).f9811a);
    }

    public final int hashCode() {
        return this.f9811a.hashCode();
    }

    public final String toString() {
        return e0.f.m("GeofencesReceivedEvent(geofencesList=", ")", this.f9811a);
    }
}
