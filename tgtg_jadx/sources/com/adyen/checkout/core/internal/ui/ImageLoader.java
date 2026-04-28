package com.adyen.checkout.core.internal.ui;

import android.graphics.Bitmap;
import com.braze.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x70.c;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J`\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00042\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004H¦@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/adyen/checkout/core/internal/ui/ImageLoader;", "", "", Constants.BRAZE_WEBVIEW_URL_EXTRA, "Lkotlin/Function2;", "Landroid/graphics/Bitmap;", "Lx70/c;", "", "onSuccess", "", "onError", "load", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lx70/c;)Ljava/lang/Object;", "checkout-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface ImageLoader {
    @Nullable
    Object load(@NotNull String str, @NotNull Function2<? super Bitmap, ? super c<? super Unit>, ? extends Object> function2, @NotNull Function2<? super Throwable, ? super c<? super Unit>, ? extends Object> function22, @NotNull c<? super Unit> cVar);
}
