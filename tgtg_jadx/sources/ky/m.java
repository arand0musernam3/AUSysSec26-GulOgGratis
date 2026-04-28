package ky;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26714a;

    public m(String str) {
        str.getClass();
        this.f26714a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && Intrinsics.areEqual(this.f26714a, ((m) obj).f26714a);
    }

    public final int hashCode() {
        return this.f26714a.hashCode();
    }

    public final String toString() {
        return this.f26714a;
    }
}
