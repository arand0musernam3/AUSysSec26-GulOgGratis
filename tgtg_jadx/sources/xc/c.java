package xc;

import android.graphics.Bitmap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bitmap f44223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f44224b;

    public c(Bitmap bitmap, Map map) {
        this.f44223a = bitmap;
        this.f44224b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.f44223a, cVar.f44223a) && Intrinsics.areEqual(this.f44224b, cVar.f44224b);
    }

    public final int hashCode() {
        return this.f44224b.hashCode() + (this.f44223a.hashCode() * 31);
    }

    public final String toString() {
        return "Value(bitmap=" + this.f44223a + ", extras=" + this.f44224b + ')';
    }
}
