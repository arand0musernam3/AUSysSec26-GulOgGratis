package com.braze.support;

import android.graphics.Bitmap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bitmap f10750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f10751b;

    public a() {
        this.f10750a = null;
        this.f10751b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f10750a, aVar.f10750a) && Intrinsics.areEqual(this.f10751b, aVar.f10751b);
    }

    public final int hashCode() {
        Bitmap bitmap = this.f10750a;
        int iHashCode = (bitmap == null ? 0 : bitmap.hashCode()) * 31;
        Map map = this.f10751b;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "BitmapAndHeaders(bitmap=" + this.f10750a + ", headers=" + this.f10751b + ")";
    }

    public a(Bitmap bitmap, Map map) {
        this.f10750a = bitmap;
        this.f10751b = map;
    }
}
