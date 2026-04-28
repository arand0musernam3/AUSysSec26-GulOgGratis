package com.braze.images;

import android.graphics.Bitmap;
import android.widget.ImageView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import z70.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ImageView f9867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bitmap f9868b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ImageView imageView, Bitmap bitmap, x70.c cVar) {
        super(2, cVar);
        this.f9867a = imageView;
        this.f9868b = bitmap;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new e(this.f9867a, this.f9868b, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new e(this.f9867a, this.f9868b, (x70.c) obj2).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        ba0.g.M(obj);
        this.f9867a.setImageBitmap(this.f9868b);
        return Unit.f26487a;
    }
}
