package jv;

import kotlin.jvm.internal.Intrinsics;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25430a;

    public h(String str) {
        str.getClass();
        this.f25430a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && Intrinsics.areEqual(this.f25430a, ((h) obj).f25430a);
    }

    public final int hashCode() {
        return this.f25430a.hashCode();
    }

    public final String toString() {
        return a0.p("Success(idToken=", this.f25430a, ")");
    }
}
