package com.adyen.checkout.ui.core.internal.util;

import android.content.ContentValues;
import android.content.Context;
import android.graphics.Bitmap;
import com.adyen.checkout.core.internal.ui.PermissionHandler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.q;
import v80.b0;
import x70.c;
import z70.e;
import z70.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@e(c = "com.adyen.checkout.ui.core.internal.util.ImageSaver$saveImageApi28AndBelow$2", f = "ImageSaver.kt", l = {162, 163}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lv80/b0;", "Lu70/q;", "", "<anonymous>", "(Lv80/b0;)Lu70/q;"}, k = 3, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nImageSaver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageSaver.kt\ncom/adyen/checkout/ui/core/internal/util/ImageSaver$saveImageApi28AndBelow$2\n+ 2 AdyenLog.kt\ncom/adyen/checkout/core/internal/util/AdyenLogKt\n*L\n1#1,216:1\n16#2,17:217\n*S KotlinDebug\n*F\n+ 1 ImageSaver.kt\ncom/adyen/checkout/ui/core/internal/util/ImageSaver$saveImageApi28AndBelow$2\n*L\n165#1:217,17\n*E\n"})
public final class ImageSaver$saveImageApi28AndBelow$2 extends i implements Function2<b0, c<? super q<? extends Unit>>, Object> {
    final /* synthetic */ Bitmap $bitmap;
    final /* synthetic */ ContentValues $contentValues;
    final /* synthetic */ Context $context;
    final /* synthetic */ PermissionHandler $permissionHandler;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ImageSaver this$0;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PermissionHandlerResult.values().length];
            try {
                iArr[PermissionHandlerResult.PERMISSION_GRANTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PermissionHandlerResult.PERMISSION_REQUEST_NOT_HANDLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageSaver$saveImageApi28AndBelow$2(PermissionHandler permissionHandler, Context context, ImageSaver imageSaver, Bitmap bitmap, ContentValues contentValues, c<? super ImageSaver$saveImageApi28AndBelow$2> cVar) {
        super(2, cVar);
        this.$permissionHandler = permissionHandler;
        this.$context = context;
        this.this$0 = imageSaver;
        this.$bitmap = bitmap;
        this.$contentValues = contentValues;
    }

    @Override // z70.a
    @NotNull
    public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
        ImageSaver$saveImageApi28AndBelow$2 imageSaver$saveImageApi28AndBelow$2 = new ImageSaver$saveImageApi28AndBelow$2(this.$permissionHandler, this.$context, this.this$0, this.$bitmap, this.$contentValues, cVar);
        imageSaver$saveImageApi28AndBelow$2.L$0 = obj;
        return imageSaver$saveImageApi28AndBelow$2;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull b0 b0Var, @Nullable c<? super q<Unit>> cVar) {
        return ((ImageSaver$saveImageApi28AndBelow$2) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b4, code lost:
    
        if (r8 == r0) goto L27;
     */
    @Override // z70.a
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            y70.a r0 = y70.a.COROUTINE_SUSPENDED
            int r1 = r7.label
            r2 = 1
            r3 = 2
            r4 = 0
            if (r1 == 0) goto L24
            if (r1 == r2) goto L1c
            if (r1 != r3) goto L16
            ba0.g.M(r8)
            u70.q r8 = (u70.q) r8
            java.lang.Object r8 = r8.f40851a
            goto Lb7
        L16:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r8)
            return r4
        L1c:
            java.lang.Object r1 = r7.L$0
            v80.b0 r1 = (v80.b0) r1
            ba0.g.M(r8)
            goto L3e
        L24:
            ba0.g.M(r8)
            java.lang.Object r8 = r7.L$0
            r1 = r8
            v80.b0 r1 = (v80.b0) r1
            com.adyen.checkout.core.internal.ui.PermissionHandler r8 = r7.$permissionHandler
            android.content.Context r5 = r7.$context
            r7.L$0 = r1
            r7.label = r2
            java.lang.String r6 = "android.permission.WRITE_EXTERNAL_STORAGE"
            java.lang.Object r8 = com.adyen.checkout.ui.core.internal.util.PermissionHandlerExtensionKt.checkPermission(r8, r5, r6, r7)
            if (r8 != r0) goto L3e
            goto Lb6
        L3e:
            com.adyen.checkout.ui.core.internal.util.PermissionHandlerResult r8 = (com.adyen.checkout.ui.core.internal.util.PermissionHandlerResult) r8
            int[] r5 = com.adyen.checkout.ui.core.internal.util.ImageSaver$saveImageApi28AndBelow$2.WhenMappings.$EnumSwitchMapping$0
            int r8 = r8.ordinal()
            r8 = r5[r8]
            if (r8 == r2) goto La6
            if (r8 == r3) goto L5b
            u70.o r8 = u70.q.f40850b
            com.adyen.checkout.ui.core.internal.exception.PermissionRequestException r8 = new com.adyen.checkout.ui.core.internal.exception.PermissionRequestException
            java.lang.String r0 = "The android.permission.WRITE_EXTERNAL_STORAGE permission is denied"
            r8.<init>(r0)
            u70.p r0 = new u70.p
            r0.<init>(r8)
            goto Lb8
        L5b:
            com.adyen.checkout.core.AdyenLogLevel r8 = com.adyen.checkout.core.AdyenLogLevel.ERROR
            com.adyen.checkout.core.AdyenLogger$Companion r0 = com.adyen.checkout.core.AdyenLogger.INSTANCE
            com.adyen.checkout.core.AdyenLogger r2 = r0.getLogger()
            boolean r2 = r2.shouldLog(r8)
            java.lang.String r3 = "Permission request not handled"
            if (r2 == 0) goto L99
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r2 = 36
            java.lang.String r2 = kotlin.text.StringsKt.Y(r1, r2)
            r5 = 46
            java.lang.String r2 = kotlin.text.StringsKt.W(r5, r2, r2)
            int r5 = r2.length()
            if (r5 != 0) goto L86
            goto L8c
        L86:
            java.lang.String r1 = "Kt"
            java.lang.String r1 = kotlin.text.StringsKt.O(r2, r1)
        L8c:
            java.lang.String r2 = "CO."
            java.lang.String r1 = r2.concat(r1)
            com.adyen.checkout.core.AdyenLogger r0 = r0.getLogger()
            r0.log(r8, r1, r3, r4)
        L99:
            u70.o r8 = u70.q.f40850b
            com.adyen.checkout.ui.core.internal.exception.PermissionRequestException r8 = new com.adyen.checkout.ui.core.internal.exception.PermissionRequestException
            r8.<init>(r3)
            u70.p r0 = new u70.p
            r0.<init>(r8)
            goto Lb8
        La6:
            com.adyen.checkout.ui.core.internal.util.ImageSaver r8 = r7.this$0
            android.graphics.Bitmap r1 = r7.$bitmap
            android.content.ContentValues r2 = r7.$contentValues
            r7.L$0 = r4
            r7.label = r3
            java.lang.Object r8 = com.adyen.checkout.ui.core.internal.util.ImageSaver.m117access$saveImageApi28AndBelowWhenPermissionGranted0E7RQCE(r8, r1, r2, r7)
            if (r8 != r0) goto Lb7
        Lb6:
            return r0
        Lb7:
            r0 = r8
        Lb8:
            u70.q r8 = new u70.q
            r8.<init>(r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adyen.checkout.ui.core.internal.util.ImageSaver$saveImageApi28AndBelow$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
