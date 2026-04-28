package yd;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public abstract String a();

    public abstract Bitmap b(Bitmap bitmap);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Intrinsics.areEqual(a(), ((b) obj).a());
    }

    public int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return Reflection.getOrCreateKotlinClass(getClass()).getSimpleName() + "(cacheKey=" + a() + ")";
    }
}
