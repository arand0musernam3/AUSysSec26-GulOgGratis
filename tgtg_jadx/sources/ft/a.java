package ft;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f17899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17900b;

    public a(boolean z11, String str) {
        this.f17899a = z11;
        this.f17900b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f17899a == aVar.f17899a && Intrinsics.areEqual(this.f17900b, aVar.f17900b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f17899a) * 31;
        String str = this.f17900b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "AppBlockInfo(blockVersion=" + this.f17899a + ", messageUrl=" + this.f17900b + ")";
    }
}
