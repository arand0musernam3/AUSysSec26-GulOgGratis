package od;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f32431b;

    public a(String str, Map map) {
        this.f32430a = str;
        this.f32431b = android.support.v4.media.session.a.M(map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f32430a, aVar.f32430a) && Intrinsics.areEqual(this.f32431b, aVar.f32431b);
    }

    public final int hashCode() {
        return this.f32431b.hashCode() + (this.f32430a.hashCode() * 31);
    }

    public final String toString() {
        return "Key(key=" + this.f32430a + ", extras=" + this.f32431b + ")";
    }
}
