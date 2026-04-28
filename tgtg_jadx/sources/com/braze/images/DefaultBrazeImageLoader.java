package com.braze.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.util.LruCache;
import android.widget.ImageView;
import com.braze.R;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.enums.BrazeViewBounds;
import com.braze.models.FeatureFlag;
import com.braze.models.cards.Card;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.o0;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeImageUtils;
import com.braze.support.BrazeLogger;
import java.io.File;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.y;
import us.j;
import v80.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 Q2\u00020\u0001:\u0001RB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J1\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0013\u001a\n \u0012*\u0004\u0018\u00010\u00100\u00102\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0005J9\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J9\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ5\u0010 \u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b \u0010!J3\u0010\"\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\f2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\fH\u0016¢\u0006\u0004\b(\u0010)J3\u0010/\u001a\u00020$2\u0006\u0010+\u001a\u00020*2\u001a\u0010.\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060-\u0018\u00010,H\u0007¢\u0006\u0004\b/\u00100J+\u00101\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b1\u00102J+\u00104\u001a\u0002032\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010+\u001a\u00020*2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b4\u00105J\u0019\u00106\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b6\u00107J\u0019\u00108\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b8\u00107J\u0019\u00109\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b9\u00107J'\u0010;\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010:\u001a\u00020$H\u0007¢\u0006\u0004\b;\u0010<J1\u0010?\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b=\u0010>R\u0014\u0010A\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR#\u0010D\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00100C8G¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u0016\u0010I\u001a\u00020H8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bI\u0010JR$\u0010L\u001a\u00020$2\u0006\u0010K\u001a\u00020$8G@BX\u0086\u000e¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bL\u0010NR\u0014\u0010%\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010P¨\u0006S"}, d2 = {"Lcom/braze/images/DefaultBrazeImageLoader;", "Lcom/braze/images/IBrazeImageLoader;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "imageUrl", "Landroid/widget/ImageView;", "imageView", "Lcom/braze/enums/BrazeViewBounds;", "viewBounds", "", "renderUrlIntoView", "(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;Lcom/braze/enums/BrazeViewBounds;)V", "key", "Landroid/graphics/Bitmap;", "bitmap", "kotlin.jvm.PlatformType", "putBitmapIntoMemCache", "(Ljava/lang/String;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "initDiskCacheTask", "Lcom/braze/models/cards/Card;", "card", "renderUrlIntoCardView", "(Landroid/content/Context;Lcom/braze/models/cards/Card;Ljava/lang/String;Landroid/widget/ImageView;Lcom/braze/enums/BrazeViewBounds;)V", "Lcom/braze/models/inappmessage/IInAppMessage;", "inAppMessage", "renderUrlIntoInAppMessageView", "(Landroid/content/Context;Lcom/braze/models/inappmessage/IInAppMessage;Ljava/lang/String;Landroid/widget/ImageView;Lcom/braze/enums/BrazeViewBounds;)V", "Landroid/os/Bundle;", InAppMessageBase.EXTRAS, "getPushBitmapFromUrl", "(Landroid/content/Context;Landroid/os/Bundle;Ljava/lang/String;Lcom/braze/enums/BrazeViewBounds;)Landroid/graphics/Bitmap;", "getInAppMessageBitmapFromUrl", "(Landroid/content/Context;Lcom/braze/models/inappmessage/IInAppMessage;Ljava/lang/String;Lcom/braze/enums/BrazeViewBounds;)Landroid/graphics/Bitmap;", "", "isOffline", "setOffline", "(Z)V", "shutdown", "()V", "Landroid/net/Uri;", "imageUri", "", "", "headers", "shouldSkipCaching", "(Landroid/net/Uri;Ljava/util/Map;)Z", "getBitmapFromUrl", "(Landroid/content/Context;Ljava/lang/String;Lcom/braze/enums/BrazeViewBounds;)Landroid/graphics/Bitmap;", "Lcom/braze/support/a;", "downloadBitmapFromUrl", "(Landroid/content/Context;Landroid/net/Uri;Lcom/braze/enums/BrazeViewBounds;)Lcom/braze/support/a;", "getBitmapFromCache", "(Ljava/lang/String;)Landroid/graphics/Bitmap;", "getBitmapFromMemCache", "getBitmapFromDiskCache", "skipDiskCache", "putBitmapIntoCache", "(Ljava/lang/String;Landroid/graphics/Bitmap;Z)V", "renderUrlIntoViewTask$android_sdk_base_release", "(Landroid/content/Context;Landroid/widget/ImageView;Lcom/braze/enums/BrazeViewBounds;Ljava/lang/String;)V", "renderUrlIntoViewTask", "Ljava/util/concurrent/locks/ReentrantLock;", "diskCacheLock", "Ljava/util/concurrent/locks/ReentrantLock;", "Landroid/util/LruCache;", "memoryCache", "Landroid/util/LruCache;", "getMemoryCache", "()Landroid/util/LruCache;", "Lcom/braze/images/a;", "diskLruCache", "Lcom/braze/images/a;", "value", "isDiskCacheStarting", "Z", "()Z", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Companion", "com/braze/images/c", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DefaultBrazeImageLoader implements IBrazeImageLoader {
    public static final String BRAZE_LRU_CACHE_FOLDER = "appboy.imageloader.lru.cache";
    private static final String CACHE_PARAMETER_KEY = "cache";
    private static final int DISK_CACHE_SIZE = 52428800;
    private final ReentrantLock diskCacheLock;
    private a diskLruCache;
    private boolean isDiskCacheStarting;
    private final AtomicBoolean isOffline;
    private final LruCache<String, Bitmap> memoryCache;
    public static final c Companion = new c();
    private static final String TAG = BrazeLogger.getBrazeLogTag((Class<?>) DefaultBrazeImageLoader.class);

    public DefaultBrazeImageLoader(Context context) {
        context.getClass();
        this.diskCacheLock = new ReentrantLock();
        this.isDiskCacheStarting = true;
        this.isOffline = new AtomicBoolean(false);
        this.memoryCache = new b(BrazeImageUtils.getImageLoaderCacheSize());
        initDiskCacheTask(context);
    }

    public static final void deleteStoredData(Context context) {
        Companion.a(context);
    }

    public static /* synthetic */ com.braze.support.a downloadBitmapFromUrl$default(DefaultBrazeImageLoader defaultBrazeImageLoader, Context context, Uri uri, BrazeViewBounds brazeViewBounds, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            brazeViewBounds = BrazeViewBounds.NO_BOUNDS;
        }
        return defaultBrazeImageLoader.downloadBitmapFromUrl(context, uri, brazeViewBounds);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getBitmapFromCache$lambda$13$lambda$12(String str, DefaultBrazeImageLoader defaultBrazeImageLoader) {
        return "Got bitmap from mem cache for key " + str + "\nMemory cache stats: " + defaultBrazeImageLoader.memoryCache;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getBitmapFromCache$lambda$15$lambda$14(String str) {
        return e0.f.k("Got bitmap from disk cache for key ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getBitmapFromCache$lambda$16(String str) {
        return e0.f.k("No cache hit for bitmap: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getBitmapFromDiskCache$lambda$19$lambda$17(String str) {
        return e0.f.k("Disk cache still starting. Cannot retrieve key from disk cache: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getBitmapFromDiskCache$lambda$19$lambda$18(String str) {
        return e0.f.k("Getting bitmap from disk cache for key: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getBitmapFromUrl$lambda$10() {
        return "Cache is currently in offline mode. Not downloading bitmap.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getBitmapFromUrl$lambda$11(String str) {
        return e0.f.k("Failed to get bitmap from url. Url: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getBitmapFromUrl$lambda$8() {
        return "Cannot retrieve bitmap with blank image url";
    }

    public static final File getDiskCacheDir(Context context, String str) {
        Companion.getClass();
        return c.a(context, str);
    }

    private final void initDiskCacheTask(Context context) {
        f0.B(BrazeCoroutineScope.INSTANCE, null, null, new d(context, this, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String putBitmapIntoCache$lambda$20(String str) {
        return e0.f.k("Adding bitmap to mem cache for key ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String putBitmapIntoCache$lambda$21(String str) {
        return e0.f.k("Skipping disk cache for key: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String putBitmapIntoCache$lambda$23$lambda$22(String str) {
        return e0.f.k("Adding bitmap to disk cache for key ", str);
    }

    private final Bitmap putBitmapIntoMemCache(String key, Bitmap bitmap) {
        return this.memoryCache.put(key, bitmap);
    }

    private final void renderUrlIntoView(Context context, String imageUrl, ImageView imageView, BrazeViewBounds viewBounds) {
        if (StringsKt.H(imageUrl)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new xh.d(21), 7, (Object) null);
            return;
        }
        try {
            renderUrlIntoViewTask$android_sdk_base_release(context, imageView, viewBounds, imageUrl);
        } catch (Throwable th2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, th2, false, (Function0) new qw.e(imageUrl, 24), 4, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String renderUrlIntoView$lambda$1() {
        return "Cannot retrieve bitmap with a blank image url";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String renderUrlIntoView$lambda$2(String str) {
        return e0.f.k("Failed to render url into view. Url: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setOffline$lambda$0(boolean z11) {
        return "DefaultBrazeImageLoader outbound network requests are now ".concat(z11 ? "disabled" : FeatureFlag.ENABLED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String shouldSkipCaching$lambda$3(Uri uri) {
        return org.bouncycastle.jcajce.provider.asymmetric.a.b(uri, "Image url specifies that it should not be cached. Not caching ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String shouldSkipCaching$lambda$7$lambda$6(Map.Entry entry, Uri uri) {
        return "Headers specify that this image should not be cached (" + entry + "). Not caching " + uri;
    }

    public final com.braze.support.a downloadBitmapFromUrl(Context context, Uri imageUri, BrazeViewBounds viewBounds) {
        context.getClass();
        imageUri.getClass();
        if (viewBounds == null) {
            viewBounds = BrazeViewBounds.NO_BOUNDS;
        }
        return BrazeImageUtils.getBitmap(context, imageUri, viewBounds);
    }

    public final Bitmap getBitmapFromCache(String key) {
        key.getClass();
        Bitmap bitmap = this.memoryCache.get(key);
        if (bitmap != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new j(24, key, this), 6, (Object) null);
            return bitmap;
        }
        Bitmap bitmapFromDiskCache = getBitmapFromDiskCache(key);
        if (bitmapFromDiskCache == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new qw.e(key, 28), 7, (Object) null);
            return null;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new qw.e(key, 27), 6, (Object) null);
        putBitmapIntoMemCache(key, bitmapFromDiskCache);
        return bitmapFromDiskCache;
    }

    public final Bitmap getBitmapFromDiskCache(String key) {
        key.getClass();
        ReentrantLock reentrantLock = this.diskCacheLock;
        reentrantLock.lock();
        try {
            a aVar = null;
            if (this.isDiskCacheStarting) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new qw.e(key, 23), 6, (Object) null);
            } else {
                a aVar2 = this.diskLruCache;
                if (aVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("diskLruCache");
                    aVar2 = null;
                }
                if (aVar2.a(key)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new qw.e(key, 26), 6, (Object) null);
                    a aVar3 = this.diskLruCache;
                    if (aVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("diskLruCache");
                    } else {
                        aVar = aVar3;
                    }
                    Bitmap bitmapB = aVar.b(key);
                    reentrantLock.unlock();
                    return bitmapB;
                }
            }
            reentrantLock.unlock();
            return null;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final Bitmap getBitmapFromMemCache(String key) {
        key.getClass();
        return this.memoryCache.get(key);
    }

    public final Bitmap getBitmapFromUrl(Context context, String imageUrl, BrazeViewBounds viewBounds) {
        context.getClass();
        imageUrl.getClass();
        if (StringsKt.H(imageUrl)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new xh.d(22), 7, (Object) null);
            return null;
        }
        try {
            Bitmap bitmapFromCache = getBitmapFromCache(imageUrl);
            if (bitmapFromCache != null) {
                return bitmapFromCache;
            }
            if (this.isOffline.get()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new xh.d(23), 7, (Object) null);
                return null;
            }
            Uri uri = Uri.parse(imageUrl);
            com.braze.support.a aVarDownloadBitmapFromUrl = downloadBitmapFromUrl(context, uri, viewBounds);
            if (aVarDownloadBitmapFromUrl.f10750a == null) {
                return null;
            }
            if (!shouldSkipCaching(uri, aVarDownloadBitmapFromUrl.f10751b)) {
                putBitmapIntoCache(imageUrl, aVarDownloadBitmapFromUrl.f10750a, BrazeFileUtils.isLocalUri(uri));
            }
            return aVarDownloadBitmapFromUrl.f10750a;
        } catch (Throwable th2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, th2, false, (Function0) new qw.e(imageUrl, 25), 4, (Object) null);
            return null;
        }
    }

    @Override // com.braze.images.IBrazeImageLoader
    public Bitmap getInAppMessageBitmapFromUrl(Context context, IInAppMessage inAppMessage, String imageUrl, BrazeViewBounds viewBounds) {
        context.getClass();
        inAppMessage.getClass();
        imageUrl.getClass();
        return getBitmapFromUrl(context, imageUrl, viewBounds);
    }

    public final LruCache<String, Bitmap> getMemoryCache() {
        return this.memoryCache;
    }

    @Override // com.braze.images.IBrazeImageLoader
    public Bitmap getPushBitmapFromUrl(Context context, Bundle extras, String imageUrl, BrazeViewBounds viewBounds) {
        context.getClass();
        imageUrl.getClass();
        return getBitmapFromUrl(context, imageUrl, viewBounds);
    }

    /* JADX INFO: renamed from: isDiskCacheStarting, reason: from getter */
    public final boolean getIsDiskCacheStarting() {
        return this.isDiskCacheStarting;
    }

    public final void putBitmapIntoCache(String key, Bitmap bitmap, boolean skipDiskCache) {
        key.getClass();
        bitmap.getClass();
        if (getBitmapFromMemCache(key) == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new qw.e(key, 29), 7, (Object) null);
            this.memoryCache.put(key, bitmap);
        }
        if (skipDiskCache) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new xv.a(key, 0), 7, (Object) null);
            return;
        }
        ReentrantLock reentrantLock = this.diskCacheLock;
        reentrantLock.lock();
        try {
            if (!this.isDiskCacheStarting) {
                a aVar = this.diskLruCache;
                a aVar2 = null;
                if (aVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("diskLruCache");
                    aVar = null;
                }
                if (!aVar.a(key)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new xv.a(key, 1), 7, (Object) null);
                    a aVar3 = this.diskLruCache;
                    if (aVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("diskLruCache");
                    } else {
                        aVar2 = aVar3;
                    }
                    aVar2.a(key, bitmap);
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // com.braze.images.IBrazeImageLoader
    public void renderUrlIntoCardView(Context context, Card card, String imageUrl, ImageView imageView, BrazeViewBounds viewBounds) {
        context.getClass();
        card.getClass();
        imageUrl.getClass();
        imageView.getClass();
        renderUrlIntoView(context, imageUrl, imageView, viewBounds);
    }

    @Override // com.braze.images.IBrazeImageLoader
    public void renderUrlIntoInAppMessageView(Context context, IInAppMessage inAppMessage, String imageUrl, ImageView imageView, BrazeViewBounds viewBounds) {
        context.getClass();
        inAppMessage.getClass();
        imageUrl.getClass();
        imageView.getClass();
        renderUrlIntoView(context, imageUrl, imageView, viewBounds);
    }

    public final void renderUrlIntoViewTask$android_sdk_base_release(Context context, ImageView imageView, BrazeViewBounds viewBounds, String imageUrl) {
        context.getClass();
        imageView.getClass();
        imageUrl.getClass();
        imageView.setTag(R.string.com_braze_image_lru_cache_image_url_key, imageUrl);
        f0.B(BrazeCoroutineScope.INSTANCE, null, null, new g(this, context, imageUrl, viewBounds, imageView, null), 3);
    }

    @Override // com.braze.images.IBrazeImageLoader
    public void setOffline(boolean isOffline) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new o0(isOffline, 9), 6, (Object) null);
        this.isOffline.set(isOffline);
    }

    public final boolean shouldSkipCaching(Uri imageUri, Map<String, ? extends List<String>> headers) {
        imageUri.getClass();
        if (!imageUri.getBooleanQueryParameter(CACHE_PARAMETER_KEY, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new com.braze.ui.b(imageUri, 9), 7, (Object) null);
            return true;
        }
        if (headers == null) {
            return false;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ? extends List<String>> entry : headers.entrySet()) {
            if (y.k(entry.getKey(), "cache-control", true)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Iterable<String> iterable = (Iterable) entry2.getValue();
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                for (String str : iterable) {
                    if (StringsKt.z(str, "no-cache", true) || StringsKt.z(str, "max-age=0", true)) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new j(25, entry2, imageUri), 7, (Object) null);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.braze.images.IBrazeImageLoader
    public void shutdown() {
        super.shutdown();
        setOffline(true);
        a aVar = this.diskLruCache;
        if (aVar != null) {
            aVar.a();
        }
    }
}
