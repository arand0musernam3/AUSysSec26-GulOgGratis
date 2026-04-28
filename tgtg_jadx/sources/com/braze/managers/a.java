package com.braze.managers;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f9947a;

    public a(Class cls) {
        cls.getClass();
        this.f9947a = cls;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.areEqual(this.f9947a, ((a) obj).f9947a);
    }

    public final int hashCode() {
        return this.f9947a.hashCode();
    }

    public final String toString() {
        return w.a0.n("ActivitySessionWrapper(javaClass=", this.f9947a, ")");
    }
}
