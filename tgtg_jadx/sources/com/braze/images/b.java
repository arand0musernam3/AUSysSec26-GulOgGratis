package com.braze.images;

import android.graphics.Bitmap;
import android.util.LruCache;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends LruCache {
    public b(int i11) {
        super(i11);
    }

    @Override // android.util.LruCache
    public final int sizeOf(Object obj, Object obj2) {
        Bitmap bitmap = (Bitmap) obj2;
        ((String) obj).getClass();
        bitmap.getClass();
        return bitmap.getByteCount();
    }
}
