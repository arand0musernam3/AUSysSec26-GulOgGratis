package fd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17606c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f17607d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f17608e;

    public z(String str, String str2, String str3, String str4, String str5) {
        this.f17604a = str;
        this.f17605b = str2;
        this.f17606c = str3;
        this.f17607d = str4;
        this.f17608e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && Intrinsics.areEqual(((z) obj).f17604a, this.f17604a);
    }

    public final int hashCode() {
        return this.f17604a.hashCode();
    }

    public final String toString() {
        return this.f17604a;
    }
}
