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
@e(c = "com.adyen.checkout.ui.core.internal.util.ImageSaver", f = "ImageSaver.kt", l = {119, 121}, m = "saveImageFromBitmap-hUnOzRk")
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
public final class ImageSaver$saveImageFromBitmap$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ImageSaver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageSaver$saveImageFromBitmap$1(ImageSaver imageSaver, x70.c<? super ImageSaver$saveImageFromBitmap$1> cVar) {
        super(cVar);
        this.this$0 = imageSaver;
    }

    @Override // z70.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM123saveImageFromBitmaphUnOzRk = this.this$0.m123saveImageFromBitmaphUnOzRk(null, null, null, null, null, this);
        return objM123saveImageFromBitmaphUnOzRk == a.COROUTINE_SUSPENDED ? objM123saveImageFromBitmaphUnOzRk : new q(objM123saveImageFromBitmaphUnOzRk);
    }
}
