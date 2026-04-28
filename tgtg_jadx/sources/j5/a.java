package j5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u70.f f24610b;

    public a(String str, u70.f fVar) {
        this.f24609a = str;
        this.f24610b = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f24609a, aVar.f24609a) && Intrinsics.areEqual(this.f24610b, aVar.f24610b);
    }

    public final int hashCode() {
        String str = this.f24609a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        u70.f fVar = this.f24610b;
        return iHashCode + (fVar != null ? fVar.hashCode() : 0);
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.f24609a + ", action=" + this.f24610b + ')';
    }
}
