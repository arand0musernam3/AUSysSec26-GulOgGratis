package com.adyen.checkout.ui.core.internal.util;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.q;
import y70.a;
import z70.c;
import z70.e;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@e(c = "com.adyen.checkout.ui.core.internal.util.ImageSaver", f = "ImageSaver.kt", l = {161}, m = "saveImageApi28AndBelow-yxL6bBk")
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
public final class ImageSaver$saveImageApi28AndBelow$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ImageSaver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageSaver$saveImageApi28AndBelow$1(ImageSaver imageSaver, x70.c<? super ImageSaver$saveImageApi28AndBelow$1> cVar) {
        super(cVar);
        this.this$0 = imageSaver;
    }

    @Override // z70.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM120saveImageApi28AndBelowyxL6bBk = this.this$0.m120saveImageApi28AndBelowyxL6bBk(null, null, null, null, this);
        return objM120saveImageApi28AndBelowyxL6bBk == a.COROUTINE_SUSPENDED ? objM120saveImageApi28AndBelowyxL6bBk : new q(objM120saveImageApi28AndBelowyxL6bBk);
    }
}
