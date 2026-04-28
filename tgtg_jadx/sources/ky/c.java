package ky;

import kotlin.jvm.internal.Intrinsics;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f26686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f26687c;

    public c(String str, String str2, String str3) {
        str.getClass();
        str3.getClass();
        this.f26685a = str;
        this.f26686b = str2;
        this.f26687c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.f26685a, cVar.f26685a) && Intrinsics.areEqual(this.f26686b, cVar.f26686b) && Intrinsics.areEqual(this.f26687c, cVar.f26687c);
    }

    public final int hashCode() {
        return this.f26687c.hashCode() + l1.b(this.f26685a.hashCode() * 31, 31, this.f26686b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CameraInfo(cameraName=");
        sb2.append(this.f26685a);
        sb2.append(", cameraType=");
        sb2.append(this.f26686b);
        sb2.append(", cameraOrientation=");
        return l1.f(sb2, this.f26687c, ')');
    }
}
