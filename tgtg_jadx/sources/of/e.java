package of;

import kotlin.jvm.internal.Intrinsics;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f32488b;

    public e(String str, String str2) {
        str2.getClass();
        this.f32487a = str;
        this.f32488b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.areEqual(this.f32487a, eVar.f32487a) && Intrinsics.areEqual(this.f32488b, eVar.f32488b);
    }

    public final int hashCode() {
        return this.f32488b.hashCode() + (this.f32487a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SetTag(key=");
        sb2.append(this.f32487a);
        sb2.append(", value=");
        return l1.f(sb2, this.f32488b, ')');
    }
}
