package com.adyen.checkout.ui.core.internal.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import ba0.g;
import com.adyen.checkout.core.exception.CheckoutException;
import com.adyen.checkout.core.internal.ui.PermissionHandler;
import com.braze.h2;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.URL;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
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
@e(c = "com.adyen.checkout.ui.core.internal.util.ImageSaver$saveImageFromUrl$2", f = "ImageSaver.kt", l = {94}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lv80/b0;", "Lu70/q;", "", "<anonymous>", "(Lv80/b0;)Lu70/q;"}, k = 3, mv = {1, 9, 0})
public final class ImageSaver$saveImageFromUrl$2 extends i implements Function2<b0, c<? super q<? extends Unit>>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ String $fileName;
    final /* synthetic */ String $fileRelativePath;
    final /* synthetic */ String $imageUrl;
    final /* synthetic */ PermissionHandler $permissionHandler;
    int label;
    final /* synthetic */ ImageSaver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageSaver$saveImageFromUrl$2(ImageSaver imageSaver, String str, Context context, PermissionHandler permissionHandler, String str2, String str3, c<? super ImageSaver$saveImageFromUrl$2> cVar) {
        super(2, cVar);
        this.this$0 = imageSaver;
        this.$imageUrl = str;
        this.$context = context;
        this.$permissionHandler = permissionHandler;
        this.$fileName = str2;
        this.$fileRelativePath = str3;
    }

    @Override // z70.a
    @NotNull
    public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
        return new ImageSaver$saveImageFromUrl$2(this.this$0, this.$imageUrl, this.$context, this.$permissionHandler, this.$fileName, this.$fileRelativePath, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull b0 b0Var, @Nullable c<? super q<Unit>> cVar) {
        return ((ImageSaver$saveImageFromUrl$2) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object pVar;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            if (i11 == 0) {
                g.M(obj);
                URL url = this.this$0.toURL(this.$imageUrl);
                if (url == null) {
                    o oVar = q.f40850b;
                    return new q(new p(new CheckoutException("Malformed URL", null, 2, null)));
                }
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(new BufferedInputStream(url.openStream()));
                ImageSaver imageSaver = this.this$0;
                Context context = this.$context;
                PermissionHandler permissionHandler = this.$permissionHandler;
                bitmapDecodeStream.getClass();
                String str = this.$fileName;
                String str2 = this.$fileRelativePath;
                this.label = 1;
                pVar = imageSaver.m123saveImageFromBitmaphUnOzRk(context, permissionHandler, bitmapDecodeStream, str, str2, this);
                if (pVar == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g.M(obj);
                pVar = ((q) obj).f40851a;
            }
        } catch (IOException e5) {
            o oVar2 = q.f40850b;
            pVar = new p(new CheckoutException(b3.i.k("Malformed URL: ", e5), null, 2, null));
        }
        return new q(pVar);
    }
}
