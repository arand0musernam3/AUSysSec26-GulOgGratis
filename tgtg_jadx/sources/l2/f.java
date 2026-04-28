package l2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends a {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.areEqual(this.f26783a, fVar.f26783a) && Intrinsics.areEqual(this.f26784b, fVar.f26784b) && Intrinsics.areEqual(this.f26785c, fVar.f26785c) && Intrinsics.areEqual(this.f26786d, fVar.f26786d);
    }

    public final int hashCode() {
        return this.f26786d.hashCode() + ((this.f26785c.hashCode() + ((this.f26784b.hashCode() + (this.f26783a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.f26783a + ", topEnd = " + this.f26784b + ", bottomEnd = " + this.f26785c + ", bottomStart = " + this.f26786d + ')';
    }
}
