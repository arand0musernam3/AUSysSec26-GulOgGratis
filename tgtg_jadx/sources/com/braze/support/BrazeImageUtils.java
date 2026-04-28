package com.braze.support;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.braze.enums.BrazeViewBounds;
import com.braze.g2;
import com.braze.support.BrazeImageUtils;
import com.braze.support.BrazeLogger;
import g3.n6;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u001d\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\u000f\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001b\u0010\u0011\u001a\u00020\u000e*\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0011\u0010\u0012\u001a\r\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001a'\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u001d\u0010\u001e\u001a'\u0010$\u001a\u00020#2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\"\u001a\u00020!¢\u0006\u0004\b$\u0010%\u001a'\u0010&\u001a\u0004\u0018\u00010\n2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0002¢\u0006\u0004\b&\u0010'\u001a'\u0010(\u001a\u00020#2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0002H\u0002¢\u0006\u0004\b(\u0010)\u001a3\u0010+\u001a\u0004\u0018\u00010\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010*\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0002H\u0002¢\u0006\u0004\b+\u0010,\u001a+\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020-2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b.\u0010/\u001a#\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020-2\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b0\u00101\"\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104\"\u0014\u00105\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b5\u00106\"\u0014\u00107\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b7\u00106\"\u0014\u00108\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b8\u00106\"\u001a\u00109\u001a\u00020\u00028\u0006X\u0087T¢\u0006\f\n\u0004\b9\u00106\u0012\u0004\b:\u0010;¨\u0006<"}, d2 = {"Landroid/content/Context;", "context", "", "getDisplayWidthPixels", "(Landroid/content/Context;)I", "getDensityDpi", "dpi", "dp", "getPixelsFromDensityAndDp", "(II)I", "Landroid/graphics/Bitmap;", "bitmap", "Landroid/widget/ImageView;", "imageView", "", "resizeImageViewToBitmapDimensions", "(Landroid/graphics/Bitmap;Landroid/widget/ImageView;)V", "resizeToBitmapDimensions", "(Landroid/widget/ImageView;Landroid/graphics/Bitmap;)V", "getImageLoaderCacheSize", "()I", "Ljava/io/InputStream;", "inputStream", "Landroid/graphics/BitmapFactory$Options;", "getBitmapMetadataFromStream", "(Ljava/io/InputStream;)Landroid/graphics/BitmapFactory$Options;", "options", "destinationWidth", "destinationHeight", "calculateInSampleSize", "(Landroid/graphics/BitmapFactory$Options;II)I", "Landroid/net/Uri;", "uri", "Lcom/braze/enums/BrazeViewBounds;", "viewBounds", "Lcom/braze/support/a;", "getBitmap", "(Landroid/content/Context;Landroid/net/Uri;Lcom/braze/enums/BrazeViewBounds;)Lcom/braze/support/a;", "getLocalBitmap", "(Landroid/net/Uri;II)Landroid/graphics/Bitmap;", "getRemoteBitmap", "(Landroid/net/Uri;II)Lcom/braze/support/a;", "imageMetadata", "decodeSampledBitmapFromStream", "(Ljava/io/InputStream;Landroid/graphics/BitmapFactory$Options;II)Landroid/graphics/Bitmap;", "Lkotlin/Pair;", "getDestinationHeightAndWidthPixels", "(Landroid/content/Context;Lcom/braze/enums/BrazeViewBounds;)Lkotlin/Pair;", "getDisplayHeightAndWidthPixels", "(Landroid/content/Context;)Lkotlin/Pair;", "", "TAG", "Ljava/lang/String;", "MIN_IMAGE_CACHE_SIZE_BYTES", "I", "MAX_IMAGE_CACHE_SIZE_BYTES", "QUARTER_MAX_SAMPLED_IMAGE_BYTES", "RUNTIME_MEMORY_IMAGE_LOADER_USAGE_QUOTIENT", "getRUNTIME_MEMORY_IMAGE_LOADER_USAGE_QUOTIENT$annotations", "()V", "android-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class BrazeImageUtils {
    private static final int MAX_IMAGE_CACHE_SIZE_BYTES = 33554432;
    private static final int MIN_IMAGE_CACHE_SIZE_BYTES = 1024;
    private static final int QUARTER_MAX_SAMPLED_IMAGE_BYTES = 4194304;
    public static final int RUNTIME_MEMORY_IMAGE_LOADER_USAGE_QUOTIENT = 8;
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("BrazeImageUtils");

    public static final int calculateInSampleSize(BitmapFactory.Options options, int i11, int i12) {
        int i13;
        int i14 = i11;
        options.getClass();
        if (i12 == 0 || i14 == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new m60.a(8), 14, (Object) null);
            return 1;
        }
        final long j9 = options.outHeight;
        final long j11 = options.outWidth;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new g2(options, i14, i12, 3), 14, (Object) null);
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = 1;
        long j12 = i12;
        if (j9 > j12 || j11 > i14) {
            long j13 = 2;
            long j14 = j9 / j13;
            long j15 = j11 / j13;
            while (true) {
                int i15 = intRef.element;
                long j16 = i15;
                if (j14 / j16 < j12 && j15 / j16 < i14) {
                    i13 = i15;
                    if ((j11 * j9) / ((long) (i15 * i15)) <= 4194304) {
                        break;
                    }
                } else {
                    i13 = i15;
                }
                intRef.element = i13 * 2;
                i14 = i11;
            }
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: mw.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BrazeImageUtils.calculateInSampleSize$lambda$6(intRef, j11, j9);
            }
        }, 14, (Object) null);
        return intRef.element;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String calculateInSampleSize$lambda$4() {
        return "Not sampling on 0 destination width or height";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String calculateInSampleSize$lambda$5(BitmapFactory.Options options, int i11, int i12) {
        StringBuilder sbR = r8.k.r(options.outWidth, options.outHeight, "Calculating sample size for source image bounds: (width ", " height ", ") and destination image bounds: (width ");
        sbR.append(i11);
        sbR.append(" height ");
        sbR.append(i12);
        sbR.append(")");
        return sbR.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String calculateInSampleSize$lambda$6(Ref.IntRef intRef, long j9, long j11) {
        int i11 = intRef.element;
        long j12 = i11;
        return "Using image sample size of " + i11 + ". Image will be scaled to width: " + (j9 / j12) + " and height: " + (j11 / j12);
    }

    private static final Bitmap decodeSampledBitmapFromStream(InputStream inputStream, BitmapFactory.Options options, int i11, int i12) {
        options.inSampleSize = calculateInSampleSize(options, i11, i12);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeStream(inputStream, null, options);
    }

    public static final a getBitmap(Context context, Uri uri, BrazeViewBounds brazeViewBounds) {
        context.getClass();
        uri.getClass();
        brazeViewBounds.getClass();
        Pair<Integer, Integer> destinationHeightAndWidthPixels = getDestinationHeightAndWidthPixels(context, brazeViewBounds);
        int iIntValue = ((Number) destinationHeightAndWidthPixels.f26485a).intValue();
        int iIntValue2 = ((Number) destinationHeightAndWidthPixels.f26486b).intValue();
        if (BrazeFileUtils.isLocalUri(uri)) {
            return new a(getLocalBitmap(uri, iIntValue2, iIntValue), null);
        }
        if (BrazeFileUtils.isRemoteUri(uri)) {
            return getRemoteBitmap(uri, iIntValue2, iIntValue);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new com.braze.ui.b(uri, 3), 12, (Object) null);
        return new a();
    }

    public static /* synthetic */ a getBitmap$default(Context context, Uri uri, BrazeViewBounds brazeViewBounds, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            brazeViewBounds = BrazeViewBounds.NO_BOUNDS;
        }
        return getBitmap(context, uri, brazeViewBounds);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getBitmap$lambda$7(Uri uri) {
        return org.bouncycastle.jcajce.provider.asymmetric.a.b(uri, "Uri with unknown scheme received. Not getting image. Uri: ");
    }

    public static final BitmapFactory.Options getBitmapMetadataFromStream(InputStream inputStream) {
        inputStream.getClass();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(inputStream, null, options);
        return options;
    }

    public static final int getDensityDpi(Context context) {
        context.getClass();
        return context.getResources().getConfiguration().densityDpi;
    }

    private static final Pair<Integer, Integer> getDestinationHeightAndWidthPixels(Context context, BrazeViewBounds brazeViewBounds) {
        Pair<Integer, Integer> displayHeightAndWidthPixels = getDisplayHeightAndWidthPixels(context);
        int iIntValue = ((Number) displayHeightAndWidthPixels.f26485a).intValue();
        int iIntValue2 = ((Number) displayHeightAndWidthPixels.f26486b).intValue();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new com.braze.ui.contentcards.adapters.b(iIntValue2, iIntValue, 4), 12, (Object) null);
        if (BrazeViewBounds.NO_BOUNDS == brazeViewBounds) {
            return new Pair<>(Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2));
        }
        int densityDpi = getDensityDpi(context);
        return new Pair<>(Integer.valueOf(Math.min(iIntValue, getPixelsFromDensityAndDp(densityDpi, brazeViewBounds.getHeightDp()))), Integer.valueOf(Math.min(iIntValue2, getPixelsFromDensityAndDp(densityDpi, brazeViewBounds.getWidthDp()))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getDestinationHeightAndWidthPixels$lambda$23(int i11, int i12) {
        return r8.k.k("Display width: ", i11, i12, " and height ");
    }

    public static final Pair<Integer, Integer> getDisplayHeightAndWidthPixels(Context context) {
        context.getClass();
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return new Pair<>(Integer.valueOf(displayMetrics.heightPixels), Integer.valueOf(displayMetrics.widthPixels));
    }

    public static final int getDisplayWidthPixels(Context context) {
        context.getClass();
        return ((Number) getDisplayHeightAndWidthPixels(context).f26486b).intValue();
    }

    public static final int getImageLoaderCacheSize() {
        return Math.max(1024, Math.min((int) Math.min(Runtime.getRuntime().maxMemory() / ((long) 8), 2147483647L), MAX_IMAGE_CACHE_SIZE_BYTES));
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x014a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.graphics.Bitmap getLocalBitmap(android.net.Uri r23, int r24, int r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.support.BrazeImageUtils.getLocalBitmap(android.net.Uri, int, int):android.graphics.Bitmap");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalBitmap$lambda$10(File file) {
        return e0.f.k("Retrieving image from local path: ", file.getAbsolutePath());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalBitmap$lambda$11() {
        return "Destination bounds unset. Loading entire bitmap into memory.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalBitmap$lambda$12(int i11, int i12) {
        return r8.k.g(i11, i12, "Sampling bitmap with destination image bounds: (width ", " height ", ")");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalBitmap$lambda$13(Uri uri, BitmapFactory.Options options) {
        int i11 = options.outHeight;
        int i12 = options.outWidth;
        StringBuilder sb2 = new StringBuilder("The bitmap metadata with image uri ");
        sb2.append(uri);
        sb2.append(" had bounds: (height ");
        sb2.append(i11);
        sb2.append(" width ");
        return r8.k.i(i12, "). Returning a bitmap with no sampling.", sb2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalBitmap$lambda$14() {
        return "Decoding sampled bitmap";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalBitmap$lambda$15(Exception exc) {
        return e0.f.k("Exception occurred when attempting to retrieve local bitmap. ", exc.getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalBitmap$lambda$16() {
        return "IOException during closing of bitmap metadata image stream.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalBitmap$lambda$8(Uri uri) {
        return org.bouncycastle.jcajce.provider.asymmetric.a.b(uri, "Local bitmap path is null. URI: ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalBitmap$lambda$9(Uri uri) {
        return org.bouncycastle.jcajce.provider.asymmetric.a.b(uri, "Local bitmap file does not exist. URI: ");
    }

    public static final int getPixelsFromDensityAndDp(int i11, int i12) {
        return Math.abs((i11 * i12) / 160);
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final com.braze.support.a getRemoteBitmap(android.net.Uri r21, int r22, int r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.support.BrazeImageUtils.getRemoteBitmap(android.net.Uri, int, int):com.braze.support.a");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getRemoteBitmap$lambda$17(String str) {
        return e0.f.k("SDK is in offline mode, not downloading remote bitmap with uri: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getRemoteBitmap$lambda$18(int i11, URL url) {
        return "HTTP response code was " + i11 + ". Bitmap with url " + url + " could not be downloaded.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getRemoteBitmap$lambda$19(int i11, int i12) {
        return r8.k.g(i11, i12, "Sampling bitmap with destination image bounds: (height ", " width ", ")");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getRemoteBitmap$lambda$20(URL url, BitmapFactory.Options options) {
        int i11 = options.outHeight;
        int i12 = options.outWidth;
        StringBuilder sb2 = new StringBuilder("The bitmap metadata with image url ");
        sb2.append(url);
        sb2.append(" had bounds: (height ");
        sb2.append(i11);
        sb2.append(" width ");
        return r8.k.i(i12, "). Returning a bitmap with no sampling.", sb2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getRemoteBitmap$lambda$21(String str, Exception exc) {
        return j4.s.k("Exception in image bitmap download for Uri: ", str, " ", exc.getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getRemoteBitmap$lambda$22() {
        return "IOException during closing of bitmap metadata download stream.";
    }

    public static final void resizeImageViewToBitmapDimensions(Bitmap bitmap, ImageView imageView) {
        imageView.getClass();
        resizeToBitmapDimensions(imageView, bitmap);
    }

    public static final void resizeToBitmapDimensions(final ImageView imageView, Bitmap bitmap) {
        imageView.getClass();
        if (bitmap == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new m60.a(9), 12, (Object) null);
            return;
        }
        if (bitmap.getWidth() == 0 || bitmap.getHeight() == 0) {
            final int i11 = 1;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: mw.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i11) {
                        case 0:
                            return BrazeImageUtils.resizeToBitmapDimensions$lambda$2(imageView);
                        default:
                            return BrazeImageUtils.resizeToBitmapDimensions$lambda$1(imageView);
                    }
                }
            }, 12, (Object) null);
        } else {
            if (imageView.getWidth() == 0 || imageView.getHeight() == 0) {
                final int i12 = 0;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: mw.b
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i12) {
                            case 0:
                                return BrazeImageUtils.resizeToBitmapDimensions$lambda$2(imageView);
                            default:
                                return BrazeImageUtils.resizeToBitmapDimensions$lambda$1(imageView);
                        }
                    }
                }, 12, (Object) null);
                return;
            }
            float width = bitmap.getWidth() / bitmap.getHeight();
            imageView.getLayoutParams().height = (int) (imageView.getWidth() / width);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new n6(width, imageView), 12, (Object) null);
            imageView.setLayoutParams(imageView.getLayoutParams());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String resizeToBitmapDimensions$lambda$0() {
        return "Neither source bitmap nor ImageView may be null. Not resizing ImageView";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String resizeToBitmapDimensions$lambda$1(ImageView imageView) {
        return "Bitmap dimensions cannot be 0. Not resizing ImageView " + imageView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String resizeToBitmapDimensions$lambda$2(ImageView imageView) {
        return "ImageView dimensions cannot be 0. Not resizing ImageView " + imageView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String resizeToBitmapDimensions$lambda$3(float f11, ImageView imageView) {
        int width = imageView.getWidth();
        int i11 = imageView.getLayoutParams().width;
        int i12 = imageView.getLayoutParams().height;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        StringBuilder sb2 = new StringBuilder("Resizing ImageView to aspect ratio ");
        sb2.append(f11);
        sb2.append(" based on width: ");
        sb2.append(width);
        sb2.append(" trueWidth: ");
        e0.f.C(sb2, i11, " height: ", i12, " layoutParams: ");
        sb2.append(layoutParams);
        sb2.append(" ");
        sb2.append(imageView);
        return sb2.toString();
    }

    public static /* synthetic */ void getRUNTIME_MEMORY_IMAGE_LOADER_USAGE_QUOTIENT$annotations() {
    }
}
