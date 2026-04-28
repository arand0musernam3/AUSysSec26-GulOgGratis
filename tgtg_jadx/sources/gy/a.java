package gy;

import kotlin.jvm.internal.Intrinsics;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f20917c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f20918d;

    public a(String str, String str2, String str3, String str4) {
        str.getClass();
        str3.getClass();
        this.f20915a = str;
        this.f20916b = str2;
        this.f20917c = str3;
        this.f20918d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f20915a, aVar.f20915a) && Intrinsics.areEqual(this.f20916b, aVar.f20916b) && Intrinsics.areEqual(this.f20917c, aVar.f20917c) && Intrinsics.areEqual(this.f20918d, aVar.f20918d);
    }

    public final int hashCode() {
        return this.f20918d.hashCode() + l1.b(l1.b(this.f20915a.hashCode() * 31, 31, this.f20916b), 31, this.f20917c);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeviceIdResult(deviceId=");
        sb2.append(this.f20915a);
        sb2.append(", gsfId=");
        sb2.append(this.f20916b);
        sb2.append(", androidId=");
        sb2.append(this.f20917c);
        sb2.append(", mediaDrmId=");
        return l1.f(sb2, this.f20918d, ')');
    }
}
