package com.adyen.checkout.ui.core.internal.util;

import android.content.ContentValues;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore;
import ba0.g;
import com.adyen.checkout.core.AdyenLogLevel;
import com.adyen.checkout.core.AdyenLogger;
import com.adyen.checkout.core.exception.CheckoutException;
import com.braze.h2;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.o;
import u70.p;
import u70.q;
import v80.b0;
import x70.c;
import y70.a;
import z70.e;
import z70.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@e(c = "com.adyen.checkout.ui.core.internal.util.ImageSaver$saveImageApi29AndAbove$2", f = "ImageSaver.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lv80/b0;", "Lu70/q;", "", "<anonymous>", "(Lv80/b0;)Lu70/q;"}, k = 3, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nImageSaver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageSaver.kt\ncom/adyen/checkout/ui/core/internal/util/ImageSaver$saveImageApi29AndAbove$2\n+ 2 AdyenLog.kt\ncom/adyen/checkout/core/internal/util/AdyenLogKt\n*L\n1#1,216:1\n16#2,17:217\n*S KotlinDebug\n*F\n+ 1 ImageSaver.kt\ncom/adyen/checkout/ui/core/internal/util/ImageSaver$saveImageApi29AndAbove$2\n*L\n148#1:217,17\n*E\n"})
public final class ImageSaver$saveImageApi29AndAbove$2 extends i implements Function2<b0, c<? super q<? extends Unit>>, Object> {
    final /* synthetic */ Bitmap $bitmap;
    final /* synthetic */ ContentValues $contentValues;
    final /* synthetic */ Context $context;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageSaver$saveImageApi29AndAbove$2(ContentValues contentValues, Context context, Bitmap bitmap, c<? super ImageSaver$saveImageApi29AndAbove$2> cVar) {
        super(2, cVar);
        this.$contentValues = contentValues;
        this.$context = context;
        this.$bitmap = bitmap;
    }

    @Override // z70.a
    @NotNull
    public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
        ImageSaver$saveImageApi29AndAbove$2 imageSaver$saveImageApi29AndAbove$2 = new ImageSaver$saveImageApi29AndAbove$2(this.$contentValues, this.$context, this.$bitmap, cVar);
        imageSaver$saveImageApi29AndAbove$2.L$0 = obj;
        return imageSaver$saveImageApi29AndAbove$2;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull b0 b0Var, @Nullable c<? super q<Unit>> cVar) {
        return ((ImageSaver$saveImageApi29AndAbove$2) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws IOException {
        Object pVar;
        OutputStream outputStreamOpenOutputStream;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            h2.b("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        g.M(obj);
        b0 b0Var = (b0) this.L$0;
        this.$contentValues.put("is_pending", Boolean.TRUE);
        Uri uriInsert = this.$context.getContentResolver().insert(MediaStore.Downloads.EXTERNAL_CONTENT_URI, this.$contentValues);
        if (uriInsert == null) {
            o oVar = q.f40850b;
            return new q(new p(new CheckoutException("Error when saving Bitmap as an image: URI is null", null, 2, null)));
        }
        try {
            outputStreamOpenOutputStream = this.$context.getContentResolver().openOutputStream(uriInsert);
        } catch (FileNotFoundException e5) {
            o oVar2 = q.f40850b;
            pVar = new p(new CheckoutException("File not found: ", e5));
        }
        if (outputStreamOpenOutputStream == null) {
            o oVar3 = q.f40850b;
            return new q(new p(new CheckoutException("Output stream is null", null, 2, null)));
        }
        this.$contentValues.put("is_pending", Boolean.FALSE);
        this.$context.getContentResolver().update(uriInsert, this.$contentValues, null, null);
        this.$bitmap.compress(Bitmap.CompressFormat.PNG, 100, outputStreamOpenOutputStream);
        outputStreamOpenOutputStream.close();
        AdyenLogLevel adyenLogLevel = AdyenLogLevel.DEBUG;
        AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
        if (companion.getLogger().shouldLog(adyenLogLevel)) {
            String name = b0Var.getClass().getName();
            String strY = StringsKt.Y(name, '$');
            String strW = StringsKt.W('.', strY, strY);
            if (strW.length() != 0) {
                name = StringsKt.O(strW, "Kt");
            }
            companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "Bitmap successfully saved as an image", null);
        }
        o oVar4 = q.f40850b;
        pVar = Unit.f26487a;
        return new q(pVar);
    }
}
