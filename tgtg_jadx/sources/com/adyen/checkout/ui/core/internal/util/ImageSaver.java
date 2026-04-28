package com.adyen.checkout.ui.core.internal.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.adyen.checkout.core.AdyenLogLevel;
import com.adyen.checkout.core.AdyenLogger;
import com.adyen.checkout.core.DispatcherProvider;
import com.adyen.checkout.core.internal.ui.PermissionHandler;
import java.net.MalformedURLException;
import java.net.URL;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import v80.x;
import x70.c;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u0000 .2\u00020\u0001:\u0001.B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JL\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0082@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J4\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0083@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J<\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0083@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ,\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0083@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u0004\u0018\u00010\u001f*\u00020\fH\u0002¢\u0006\u0004\b \u0010!JX\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010#\u001a\u00020\"2\n\b\u0003\u0010%\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0086@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010'JL\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010)\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0086@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b*\u0010+R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010-\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006/"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/util/ImageSaver;", "", "Lv80/x;", "dispatcher", "<init>", "(Lv80/x;)V", "Landroid/content/Context;", "context", "Lcom/adyen/checkout/core/internal/ui/PermissionHandler;", "permissionHandler", "Landroid/graphics/Bitmap;", "bitmap", "", "fileName", "fileRelativePath", "Lu70/q;", "", "saveImageFromBitmap-hUnOzRk", "(Landroid/content/Context;Lcom/adyen/checkout/core/internal/ui/PermissionHandler;Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "saveImageFromBitmap", "Landroid/content/ContentValues;", "contentValues", "saveImageApi29AndAbove-BWLJW6A", "(Landroid/content/Context;Landroid/graphics/Bitmap;Landroid/content/ContentValues;Lx70/c;)Ljava/lang/Object;", "saveImageApi29AndAbove", "saveImageApi28AndBelow-yxL6bBk", "(Landroid/content/Context;Lcom/adyen/checkout/core/internal/ui/PermissionHandler;Landroid/graphics/Bitmap;Landroid/content/ContentValues;Lx70/c;)Ljava/lang/Object;", "saveImageApi28AndBelow", "saveImageApi28AndBelowWhenPermissionGranted-0E7RQCE", "(Landroid/graphics/Bitmap;Landroid/content/ContentValues;Lx70/c;)Ljava/lang/Object;", "saveImageApi28AndBelowWhenPermissionGranted", "Ljava/net/URL;", "toURL", "(Ljava/lang/String;)Ljava/net/URL;", "Landroid/view/View;", "view", "", "backgroundColor", "saveImageFromView-bMdYcbs", "(Landroid/content/Context;Lcom/adyen/checkout/core/internal/ui/PermissionHandler;Landroid/view/View;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "saveImageFromView", "imageUrl", "saveImageFromUrl-hUnOzRk", "(Landroid/content/Context;Lcom/adyen/checkout/core/internal/ui/PermissionHandler;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "saveImageFromUrl", "Lv80/x;", "Companion", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nImageSaver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageSaver.kt\ncom/adyen/checkout/ui/core/internal/util/ImageSaver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AdyenLog.kt\ncom/adyen/checkout/core/internal/util/AdyenLogKt\n*L\n1#1,216:1\n1#2:217\n16#3,17:218\n*S KotlinDebug\n*F\n+ 1 ImageSaver.kt\ncom/adyen/checkout/ui/core/internal/util/ImageSaver\n*L\n206#1:218,17\n*E\n"})
public final class ImageSaver {
    private static final int PNG_QUALITY = 100;

    @NotNull
    private static final String REQUIRED_PERMISSION = "android.permission.WRITE_EXTERNAL_STORAGE";

    @NotNull
    private final x dispatcher;

    public /* synthetic */ ImageSaver(x xVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? DispatcherProvider.INSTANCE.getIO() : xVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    @android.annotation.SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: saveImageApi28AndBelow-yxL6bBk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m120saveImageApi28AndBelowyxL6bBk(android.content.Context r12, com.adyen.checkout.core.internal.ui.PermissionHandler r13, android.graphics.Bitmap r14, android.content.ContentValues r15, x70.c<? super u70.q<kotlin.Unit>> r16) throws java.lang.Throwable {
        /*
            r11 = this;
            r0 = r16
            boolean r1 = r0 instanceof com.adyen.checkout.ui.core.internal.util.ImageSaver$saveImageApi28AndBelow$1
            if (r1 == 0) goto L16
            r1 = r0
            com.adyen.checkout.ui.core.internal.util.ImageSaver$saveImageApi28AndBelow$1 r1 = (com.adyen.checkout.ui.core.internal.util.ImageSaver$saveImageApi28AndBelow$1) r1
            int r2 = r1.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r2 & r4
            if (r5 == 0) goto L16
            int r2 = r2 - r4
            r1.label = r2
        L14:
            r7 = r1
            goto L1c
        L16:
            com.adyen.checkout.ui.core.internal.util.ImageSaver$saveImageApi28AndBelow$1 r1 = new com.adyen.checkout.ui.core.internal.util.ImageSaver$saveImageApi28AndBelow$1
            r1.<init>(r11, r0)
            goto L14
        L1c:
            java.lang.Object r0 = r7.result
            y70.a r8 = y70.a.COROUTINE_SUSPENDED
            int r1 = r7.label
            r9 = 1
            if (r1 == 0) goto L32
            if (r1 != r9) goto L2b
            ba0.g.M(r0)
            goto L4b
        L2b:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r0)
            r0 = 0
            return r0
        L32:
            ba0.g.M(r0)
            v80.x r10 = r11.dispatcher
            com.adyen.checkout.ui.core.internal.util.ImageSaver$saveImageApi28AndBelow$2 r0 = new com.adyen.checkout.ui.core.internal.util.ImageSaver$saveImageApi28AndBelow$2
            r6 = 0
            r3 = r11
            r2 = r12
            r1 = r13
            r4 = r14
            r5 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.label = r9
            java.lang.Object r0 = v80.f0.K(r10, r0, r7)
            if (r0 != r8) goto L4b
            return r8
        L4b:
            u70.q r0 = (u70.q) r0
            java.lang.Object r0 = r0.f40851a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adyen.checkout.ui.core.internal.util.ImageSaver.m120saveImageApi28AndBelowyxL6bBk(android.content.Context, com.adyen.checkout.core.internal.ui.PermissionHandler, android.graphics.Bitmap, android.content.ContentValues, x70.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: saveImageApi28AndBelowWhenPermissionGranted-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m121saveImageApi28AndBelowWhenPermissionGranted0E7RQCE(android.graphics.Bitmap r6, android.content.ContentValues r7, x70.c<? super u70.q<kotlin.Unit>> r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.adyen.checkout.ui.core.internal.util.ImageSaver$saveImageApi28AndBelowWhenPermissionGranted$1
            if (r0 == 0) goto L13
            r0 = r8
            com.adyen.checkout.ui.core.internal.util.ImageSaver$saveImageApi28AndBelowWhenPermissionGranted$1 r0 = (com.adyen.checkout.ui.core.internal.util.ImageSaver$saveImageApi28AndBelowWhenPermissionGranted$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.adyen.checkout.ui.core.internal.util.ImageSaver$saveImageApi28AndBelowWhenPermissionGranted$1 r0 = new com.adyen.checkout.ui.core.internal.util.ImageSaver$saveImageApi28AndBelowWhenPermissionGranted$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            ba0.g.M(r8)
            goto L42
        L27:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r6)
            r6 = 0
            return r6
        L2e:
            ba0.g.M(r8)
            v80.x r8 = r5.dispatcher
            com.adyen.checkout.ui.core.internal.util.ImageSaver$saveImageApi28AndBelowWhenPermissionGranted$2 r2 = new com.adyen.checkout.ui.core.internal.util.ImageSaver$saveImageApi28AndBelowWhenPermissionGranted$2
            r4 = 0
            r2.<init>(r7, r6, r4)
            r0.label = r3
            java.lang.Object r8 = v80.f0.K(r8, r2, r0)
            if (r8 != r1) goto L42
            return r1
        L42:
            u70.q r8 = (u70.q) r8
            java.lang.Object r6 = r8.f40851a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adyen.checkout.ui.core.internal.util.ImageSaver.m121saveImageApi28AndBelowWhenPermissionGranted0E7RQCE(android.graphics.Bitmap, android.content.ContentValues, x70.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: saveImageApi29AndAbove-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m122saveImageApi29AndAboveBWLJW6A(android.content.Context r6, android.graphics.Bitmap r7, android.content.ContentValues r8, x70.c<? super u70.q<kotlin.Unit>> r9) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.adyen.checkout.ui.core.internal.util.ImageSaver$saveImageApi29AndAbove$1
            if (r0 == 0) goto L13
            r0 = r9
            com.adyen.checkout.ui.core.internal.util.ImageSaver$saveImageApi29AndAbove$1 r0 = (com.adyen.checkout.ui.core.internal.util.ImageSaver$saveImageApi29AndAbove$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.adyen.checkout.ui.core.internal.util.ImageSaver$saveImageApi29AndAbove$1 r0 = new com.adyen.checkout.ui.core.internal.util.ImageSaver$saveImageApi29AndAbove$1
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            ba0.g.M(r9)
            goto L42
        L27:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r6)
            r6 = 0
            return r6
        L2e:
            ba0.g.M(r9)
            v80.x r9 = r5.dispatcher
            com.adyen.checkout.ui.core.internal.util.ImageSaver$saveImageApi29AndAbove$2 r2 = new com.adyen.checkout.ui.core.internal.util.ImageSaver$saveImageApi29AndAbove$2
            r4 = 0
            r2.<init>(r8, r6, r7, r4)
            r0.label = r3
            java.lang.Object r9 = v80.f0.K(r9, r2, r0)
            if (r9 != r1) goto L42
            return r1
        L42:
            u70.q r9 = (u70.q) r9
            java.lang.Object r6 = r9.f40851a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adyen.checkout.ui.core.internal.util.ImageSaver.m122saveImageApi29AndAboveBWLJW6A(android.content.Context, android.graphics.Bitmap, android.content.ContentValues, x70.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0085, code lost:
    
        if (r9 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* JADX INFO: renamed from: saveImageFromBitmap-hUnOzRk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m123saveImageFromBitmaphUnOzRk(android.content.Context r9, com.adyen.checkout.core.internal.ui.PermissionHandler r10, android.graphics.Bitmap r11, java.lang.String r12, java.lang.String r13, x70.c<? super u70.q<kotlin.Unit>> r14) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r14 instanceof com.adyen.checkout.ui.core.internal.util.ImageSaver$saveImageFromBitmap$1
            if (r0 == 0) goto L14
            r0 = r14
            com.adyen.checkout.ui.core.internal.util.ImageSaver$saveImageFromBitmap$1 r0 = (com.adyen.checkout.ui.core.internal.util.ImageSaver$saveImageFromBitmap$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r14 = r0
            goto L1a
        L14:
            com.adyen.checkout.ui.core.internal.util.ImageSaver$saveImageFromBitmap$1 r0 = new com.adyen.checkout.ui.core.internal.util.ImageSaver$saveImageFromBitmap$1
            r0.<init>(r8, r14)
            goto L12
        L1a:
            java.lang.Object r0 = r14.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r14.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L28
            if (r2 != r3) goto L35
        L28:
            java.lang.Object r9 = r14.L$0
            r11 = r9
            android.graphics.Bitmap r11 = (android.graphics.Bitmap) r11
            ba0.g.M(r0)
            u70.q r0 = (u70.q) r0
            java.lang.Object r9 = r0.f40851a
            goto L9a
        L35:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r9)
            r9 = 0
            return r9
        L3c:
            ba0.g.M(r0)
            long r5 = java.lang.System.currentTimeMillis()
            if (r12 != 0) goto L49
            java.lang.String r12 = java.lang.String.valueOf(r5)
        L49:
            if (r13 != 0) goto L4d
            java.lang.String r13 = android.os.Environment.DIRECTORY_DOWNLOADS
        L4d:
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            java.lang.String r2 = "mime_type"
            java.lang.String r7 = "image/png"
            r0.put(r2, r7)
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r5)
            java.lang.String r7 = "date_added"
            r0.put(r7, r2)
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r5)
            java.lang.String r5 = "datetaken"
            r0.put(r5, r2)
            java.lang.String r2 = "_display_name"
            r0.put(r2, r12)
            java.lang.String r12 = "relative_path"
            r0.put(r12, r13)
            int r12 = android.os.Build.VERSION.SDK_INT
            r13 = 29
            if (r12 < r13) goto L88
            r14.L$0 = r11
            r14.label = r4
            java.lang.Object r9 = r8.m122saveImageApi29AndAboveBWLJW6A(r9, r11, r0, r14)
            if (r9 != r1) goto L9a
            goto L97
        L88:
            r14.L$0 = r11
            r14.label = r3
            r12 = r11
            r13 = r0
            r11 = r10
            r10 = r9
            r9 = r8
            java.lang.Object r10 = r9.m120saveImageApi28AndBelowyxL6bBk(r10, r11, r12, r13, r14)
            if (r10 != r1) goto L98
        L97:
            return r1
        L98:
            r9 = r10
            r11 = r12
        L9a:
            r11.recycle()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adyen.checkout.ui.core.internal.util.ImageSaver.m123saveImageFromBitmaphUnOzRk(android.content.Context, com.adyen.checkout.core.internal.ui.PermissionHandler, android.graphics.Bitmap, java.lang.String, java.lang.String, x70.c):java.lang.Object");
    }

    /* JADX INFO: renamed from: saveImageFromBitmap-hUnOzRk$default, reason: not valid java name */
    public static /* synthetic */ Object m124saveImageFromBitmaphUnOzRk$default(ImageSaver imageSaver, Context context, PermissionHandler permissionHandler, Bitmap bitmap, String str, String str2, c cVar, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            str = null;
        }
        if ((i11 & 16) != 0) {
            str2 = null;
        }
        return imageSaver.m123saveImageFromBitmaphUnOzRk(context, permissionHandler, bitmap, str, str2, cVar);
    }

    /* JADX INFO: renamed from: saveImageFromUrl-hUnOzRk$default, reason: not valid java name */
    public static /* synthetic */ Object m125saveImageFromUrlhUnOzRk$default(ImageSaver imageSaver, Context context, PermissionHandler permissionHandler, String str, String str2, String str3, c cVar, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            str2 = null;
        }
        if ((i11 & 16) != 0) {
            str3 = null;
        }
        return imageSaver.m127saveImageFromUrlhUnOzRk(context, permissionHandler, str, str2, str3, cVar);
    }

    /* JADX INFO: renamed from: saveImageFromView-bMdYcbs$default, reason: not valid java name */
    public static /* synthetic */ Object m126saveImageFromViewbMdYcbs$default(ImageSaver imageSaver, Context context, PermissionHandler permissionHandler, View view, Integer num, String str, String str2, c cVar, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            num = null;
        }
        if ((i11 & 16) != 0) {
            str = null;
        }
        if ((i11 & 32) != 0) {
            str2 = null;
        }
        return imageSaver.m128saveImageFromViewbMdYcbs(context, permissionHandler, view, num, str, str2, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final URL toURL(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e5) {
            AdyenLogLevel adyenLogLevel = AdyenLogLevel.ERROR;
            AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
            if (companion.getLogger().shouldLog(adyenLogLevel)) {
                String name = str.getClass().getName();
                String strY = StringsKt.Y(name, '$');
                String strW = StringsKt.W('.', strY, strY);
                if (strW.length() != 0) {
                    name = StringsKt.O(strW, "Kt");
                }
                String strConcat = "CO.".concat(name);
                companion.getLogger().log(adyenLogLevel, strConcat, "Failed to convert String to URL: " + e5, null);
            }
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: saveImageFromUrl-hUnOzRk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m127saveImageFromUrlhUnOzRk(@org.jetbrains.annotations.NotNull android.content.Context r13, @org.jetbrains.annotations.NotNull com.adyen.checkout.core.internal.ui.PermissionHandler r14, @org.jetbrains.annotations.NotNull java.lang.String r15, @org.jetbrains.annotations.Nullable java.lang.String r16, @org.jetbrains.annotations.Nullable java.lang.String r17, @org.jetbrains.annotations.NotNull x70.c<? super u70.q<kotlin.Unit>> r18) throws java.lang.Throwable {
        /*
            r12 = this;
            r0 = r18
            boolean r2 = r0 instanceof com.adyen.checkout.ui.core.internal.util.ImageSaver$saveImageFromUrl$1
            if (r2 == 0) goto L16
            r2 = r0
            com.adyen.checkout.ui.core.internal.util.ImageSaver$saveImageFromUrl$1 r2 = (com.adyen.checkout.ui.core.internal.util.ImageSaver$saveImageFromUrl$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.label = r3
        L14:
            r8 = r2
            goto L1c
        L16:
            com.adyen.checkout.ui.core.internal.util.ImageSaver$saveImageFromUrl$1 r2 = new com.adyen.checkout.ui.core.internal.util.ImageSaver$saveImageFromUrl$1
            r2.<init>(r12, r0)
            goto L14
        L1c:
            java.lang.Object r0 = r8.result
            y70.a r9 = y70.a.COROUTINE_SUSPENDED
            int r2 = r8.label
            r10 = 1
            if (r2 == 0) goto L32
            if (r2 != r10) goto L2b
            ba0.g.M(r0)
            goto L4e
        L2b:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r0)
            r0 = 0
            return r0
        L32:
            ba0.g.M(r0)
            v80.x r11 = r12.dispatcher
            com.adyen.checkout.ui.core.internal.util.ImageSaver$saveImageFromUrl$2 r0 = new com.adyen.checkout.ui.core.internal.util.ImageSaver$saveImageFromUrl$2
            r7 = 0
            r1 = r12
            r3 = r13
            r4 = r14
            r2 = r15
            r5 = r16
            r6 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.label = r10
            java.lang.Object r0 = v80.f0.K(r11, r0, r8)
            if (r0 != r9) goto L4e
            return r9
        L4e:
            u70.q r0 = (u70.q) r0
            java.lang.Object r0 = r0.f40851a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adyen.checkout.ui.core.internal.util.ImageSaver.m127saveImageFromUrlhUnOzRk(android.content.Context, com.adyen.checkout.core.internal.ui.PermissionHandler, java.lang.String, java.lang.String, java.lang.String, x70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: saveImageFromView-bMdYcbs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m128saveImageFromViewbMdYcbs(@org.jetbrains.annotations.NotNull android.content.Context r7, @org.jetbrains.annotations.NotNull com.adyen.checkout.core.internal.ui.PermissionHandler r8, @org.jetbrains.annotations.NotNull android.view.View r9, @org.jetbrains.annotations.Nullable java.lang.Integer r10, @org.jetbrains.annotations.Nullable java.lang.String r11, @org.jetbrains.annotations.Nullable java.lang.String r12, @org.jetbrains.annotations.NotNull x70.c<? super u70.q<kotlin.Unit>> r13) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r13 instanceof com.adyen.checkout.ui.core.internal.util.ImageSaver$saveImageFromView$1
            if (r0 == 0) goto L14
            r0 = r13
            com.adyen.checkout.ui.core.internal.util.ImageSaver$saveImageFromView$1 r0 = (com.adyen.checkout.ui.core.internal.util.ImageSaver$saveImageFromView$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r13 = r0
            goto L1a
        L14:
            com.adyen.checkout.ui.core.internal.util.ImageSaver$saveImageFromView$1 r0 = new com.adyen.checkout.ui.core.internal.util.ImageSaver$saveImageFromView$1
            r0.<init>(r6, r13)
            goto L12
        L1a:
            java.lang.Object r0 = r13.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r13.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2e
            ba0.g.M(r0)
            u70.q r0 = (u70.q) r0
            java.lang.Object r7 = r0.f40851a
            return r7
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r7)
            return r3
        L34:
            ba0.g.M(r0)
            int r0 = r9.getWidth()
            int r2 = r9.getHeight()
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r2, r5)
            r0.getClass()
            android.graphics.Canvas r2 = new android.graphics.Canvas
            r2.<init>(r0)
            if (r10 == 0) goto L59
            int r10 = r10.intValue()
            r2.drawColor(r10)
            kotlin.Unit r3 = kotlin.Unit.f26487a
            goto L64
        L59:
            android.graphics.drawable.Drawable r10 = r9.getBackground()
            if (r10 == 0) goto L64
            r10.draw(r2)
            kotlin.Unit r3 = kotlin.Unit.f26487a
        L64:
            if (r3 != 0) goto L76
            int r10 = com.adyen.checkout.ui.core.R.color.white
            int r10 = r7.getColor(r10)
            r3 = 2130968935(0x7f040167, float:1.7546538E38)
            int r10 = w0.e.z(r7, r3, r10)
            r2.drawColor(r10)
        L76:
            r9.draw(r2)
            r13.label = r4
            r9 = r8
            r10 = r0
            r8 = r7
            r7 = r6
            java.lang.Object r8 = r7.m123saveImageFromBitmaphUnOzRk(r8, r9, r10, r11, r12, r13)
            if (r8 != r1) goto L86
            return r1
        L86:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adyen.checkout.ui.core.internal.util.ImageSaver.m128saveImageFromViewbMdYcbs(android.content.Context, com.adyen.checkout.core.internal.ui.PermissionHandler, android.view.View, java.lang.Integer, java.lang.String, java.lang.String, x70.c):java.lang.Object");
    }

    public ImageSaver(@NotNull x xVar) {
        xVar.getClass();
        this.dispatcher = xVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ImageSaver() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
