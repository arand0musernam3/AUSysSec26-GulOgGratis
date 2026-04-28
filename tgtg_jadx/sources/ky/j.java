package ky;

import kotlin.jvm.internal.Intrinsics;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f26709b;

    public j(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f26708a = str;
        this.f26709b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.areEqual(this.f26708a, jVar.f26708a) && Intrinsics.areEqual(this.f26709b, jVar.f26709b);
    }

    public final int hashCode() {
        return this.f26709b.hashCode() + (this.f26708a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InputDeviceData(name=");
        sb2.append(this.f26708a);
        sb2.append(", vendor=");
        return l1.f(sb2, this.f26709b, ')');
    }
}
