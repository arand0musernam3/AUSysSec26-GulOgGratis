package ga0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f20308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f20309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f20310c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f20311d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f20312e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f20313f;

    public h(boolean z11, Integer num, boolean z12, Integer num2, boolean z13, boolean z14) {
        this.f20308a = z11;
        this.f20309b = num;
        this.f20310c = z12;
        this.f20311d = num2;
        this.f20312e = z13;
        this.f20313f = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f20308a == hVar.f20308a && Intrinsics.areEqual(this.f20309b, hVar.f20309b) && this.f20310c == hVar.f20310c && Intrinsics.areEqual(this.f20311d, hVar.f20311d) && this.f20312e == hVar.f20312e && this.f20313f == hVar.f20313f;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f20308a) * 31;
        Integer num = this.f20309b;
        int iE = r8.k.e((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.f20310c);
        Integer num2 = this.f20311d;
        return Boolean.hashCode(this.f20313f) + r8.k.e((iE + (num2 != null ? num2.hashCode() : 0)) * 31, 31, this.f20312e);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WebSocketExtensions(perMessageDeflate=");
        sb2.append(this.f20308a);
        sb2.append(", clientMaxWindowBits=");
        sb2.append(this.f20309b);
        sb2.append(", clientNoContextTakeover=");
        sb2.append(this.f20310c);
        sb2.append(", serverMaxWindowBits=");
        sb2.append(this.f20311d);
        sb2.append(", serverNoContextTakeover=");
        sb2.append(this.f20312e);
        sb2.append(", unknownValues=");
        return r8.k.q(sb2, this.f20313f, ')');
    }
}
