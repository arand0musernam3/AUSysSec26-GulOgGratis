package com.adyen.checkout.core.internal.ui;

import android.graphics.Bitmap;
import android.util.LruCache;
import com.adyen.checkout.core.internal.ui.InMemoryCache;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000-\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0086\u0002J\u0019\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\tH\u0086\u0002R\u0010\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/adyen/checkout/core/internal/ui/InMemoryCache;", "", "maxSize", "", "(I)V", "cache", "com/adyen/checkout/core/internal/ui/InMemoryCache$cache$1", "Lcom/adyen/checkout/core/internal/ui/InMemoryCache$cache$1;", "get", "Landroid/graphics/Bitmap;", "key", "", "set", "", "bitmap", "Value", "checkout-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class InMemoryCache {

    @NotNull
    private final InMemoryCache$cache$1 cache;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/adyen/checkout/core/internal/ui/InMemoryCache$Value;", "", "bitmap", "Landroid/graphics/Bitmap;", "size", "", "(Landroid/graphics/Bitmap;I)V", "getBitmap", "()Landroid/graphics/Bitmap;", "getSize", "()I", "checkout-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Value {

        @NotNull
        private final Bitmap bitmap;
        private final int size;

        public Value(@NotNull Bitmap bitmap, int i11) {
            bitmap.getClass();
            this.bitmap = bitmap;
            this.size = i11;
        }

        @NotNull
        public final Bitmap getBitmap() {
            return this.bitmap;
        }

        public final int getSize() {
            return this.size;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.adyen.checkout.core.internal.ui.InMemoryCache$cache$1] */
    public InMemoryCache(final int i11) {
        this.cache = new LruCache<String, Value>(i11) { // from class: com.adyen.checkout.core.internal.ui.InMemoryCache$cache$1
            @Override // android.util.LruCache
            public int sizeOf(@NotNull String key, @NotNull InMemoryCache.Value value) {
                key.getClass();
                value.getClass();
                return value.getSize();
            }
        };
    }

    @Nullable
    public final Bitmap get(@NotNull String key) {
        key.getClass();
        Value value = get(key);
        if (value != null) {
            return value.getBitmap();
        }
        return null;
    }

    public final void set(@NotNull String key, @NotNull Bitmap bitmap) {
        int height;
        key.getClass();
        bitmap.getClass();
        try {
            height = bitmap.getAllocationByteCount();
        } catch (Exception unused) {
            height = (bitmap.getConfig() == Bitmap.Config.ALPHA_8 ? 1 : (bitmap.getConfig() == Bitmap.Config.RGB_565 || bitmap.getConfig() == Bitmap.Config.ARGB_4444) ? 2 : bitmap.getConfig() == Bitmap.Config.RGBA_F16 ? 8 : 4) * bitmap.getHeight() * bitmap.getWidth();
        }
        put(key, new Value(bitmap, height));
    }
}
