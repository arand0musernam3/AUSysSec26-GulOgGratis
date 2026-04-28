package com.adyen.checkout.ui.core.internal.ui;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.widget.ImageView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.m1;
import ba0.g;
import com.adyen.checkout.core.AdyenLogLevel;
import com.adyen.checkout.core.AdyenLogger;
import com.adyen.checkout.core.Environment;
import com.adyen.checkout.core.internal.ui.DefaultImageLoader;
import com.adyen.checkout.core.internal.ui.ImageLoader;
import com.adyen.checkout.ui.core.R;
import com.adyen.checkout.ui.core.internal.ui.view.ExpiryDateInput;
import com.braze.Constants;
import com.braze.h2;
import e0.f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import v80.b0;
import v80.f0;
import x70.c;
import y70.a;
import z70.e;
import z70.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a(\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0002\u001a\f\u0010\r\u001a\u00020\u0007*\u00020\u000eH\u0002\u001a:\u0010\u000f\u001a\u00020\u0010*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0003\u0010\u0015\u001a\u00020\u000e2\b\b\u0003\u0010\u0016\u001a\u00020\u000eH\u0007\u001a2\u0010\u000f\u001a\u00020\u0010*\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00072\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0003\u0010\u0015\u001a\u00020\u000e2\b\b\u0003\u0010\u0016\u001a\u00020\u000eH\u0007\u001aN\u0010\u0018\u001a\u00020\u0010*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0003\u0010\u0015\u001a\u00020\u000e2\b\b\u0003\u0010\u0016\u001a\u00020\u000eH\u0007\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0018\u0010\u0002\u001a\u00020\u0001*\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0019"}, d2 = {"localImageLoader", "Lcom/adyen/checkout/core/internal/ui/ImageLoader;", "imageLoader", "Landroid/content/Context;", "getImageLoader", "(Landroid/content/Context;)Lcom/adyen/checkout/core/internal/ui/ImageLoader;", "buildLogoPath", "", "size", "Lcom/adyen/checkout/ui/core/internal/ui/LogoSize;", "txVariant", "txSubVariant", "densityExtension", "getDensityExtension", "", "load", "", "Landroid/widget/ImageView;", "environment", "Lcom/adyen/checkout/core/Environment;", "path", "placeholder", "errorFallback", Constants.BRAZE_WEBVIEW_URL_EXTRA, "loadLogo", "ui-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nImageLoadingExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageLoadingExtensions.kt\ncom/adyen/checkout/ui/core/internal/ui/ImageLoadingExtensionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,118:1\n1#2:119\n*E\n"})
public final class ImageLoadingExtensionsKt {

    @Nullable
    private static ImageLoader localImageLoader;

    /* JADX INFO: renamed from: com.adyen.checkout.ui.core.internal.ui.ImageLoadingExtensionsKt$load$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.ui.core.internal.ui.ImageLoadingExtensionsKt$load$1", f = "ImageLoadingExtensions.kt", l = {60}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {1, 9, 0})
    public static final class AnonymousClass1 extends i implements Function2<b0, c<? super Unit>, Object> {
        final /* synthetic */ int $errorFallback;
        final /* synthetic */ ImageLoader $imageLoader;
        final /* synthetic */ ImageView $this_load;
        final /* synthetic */ String $url;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: com.adyen.checkout.ui.core.internal.ui.ImageLoadingExtensionsKt$load$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @e(c = "com.adyen.checkout.ui.core.internal.ui.ImageLoadingExtensionsKt$load$1$1", f = "ImageLoadingExtensions.kt", l = {}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Landroid/graphics/Bitmap;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class C00221 extends i implements Function2<Bitmap, c<? super Unit>, Object> {
            final /* synthetic */ ImageView $this_load;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00221(ImageView imageView, c<? super C00221> cVar) {
                super(2, cVar);
                this.$this_load = imageView;
            }

            @Override // z70.a
            @NotNull
            public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
                C00221 c00221 = new C00221(this.$this_load, cVar);
                c00221.L$0 = obj;
                return c00221;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull Bitmap bitmap, @Nullable c<? super Unit> cVar) {
                return ((C00221) create(bitmap, cVar)).invokeSuspend(Unit.f26487a);
            }

            @Override // z70.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                a aVar = a.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g.M(obj);
                this.$this_load.setImageBitmap((Bitmap) this.L$0);
                return Unit.f26487a;
            }
        }

        /* JADX INFO: renamed from: com.adyen.checkout.ui.core.internal.ui.ImageLoadingExtensionsKt$load$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @e(c = "com.adyen.checkout.ui.core.internal.ui.ImageLoadingExtensionsKt$load$1$2", f = "ImageLoadingExtensions.kt", l = {}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "e", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
        @SourceDebugExtension({"SMAP\nImageLoadingExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageLoadingExtensions.kt\ncom/adyen/checkout/ui/core/internal/ui/ImageLoadingExtensionsKt$load$1$2\n+ 2 AdyenLog.kt\ncom/adyen/checkout/core/internal/util/AdyenLogKt\n*L\n1#1,118:1\n16#2,17:119\n*S KotlinDebug\n*F\n+ 1 ImageLoadingExtensions.kt\ncom/adyen/checkout/ui/core/internal/ui/ImageLoadingExtensionsKt$load$1$2\n*L\n64#1:119,17\n*E\n"})
        public static final class AnonymousClass2 extends i implements Function2<Throwable, c<? super Unit>, Object> {
            final /* synthetic */ b0 $$this$launch;
            final /* synthetic */ int $errorFallback;
            final /* synthetic */ ImageView $this_load;
            final /* synthetic */ String $url;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(b0 b0Var, ImageView imageView, int i11, String str, c<? super AnonymousClass2> cVar) {
                super(2, cVar);
                this.$$this$launch = b0Var;
                this.$this_load = imageView;
                this.$errorFallback = i11;
                this.$url = str;
            }

            @Override // z70.a
            @NotNull
            public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$$this$launch, this.$this_load, this.$errorFallback, this.$url, cVar);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull Throwable th2, @Nullable c<? super Unit> cVar) {
                return ((AnonymousClass2) create(th2, cVar)).invokeSuspend(Unit.f26487a);
            }

            @Override // z70.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                a aVar = a.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g.M(obj);
                Throwable th2 = (Throwable) this.L$0;
                b0 b0Var = this.$$this$launch;
                AdyenLogLevel adyenLogLevel = AdyenLogLevel.WARN;
                String str = this.$url;
                AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
                if (companion.getLogger().shouldLog(adyenLogLevel)) {
                    String name = b0Var.getClass().getName();
                    String strY = StringsKt.Y(name, '$');
                    String strW = StringsKt.W('.', strY, strY);
                    if (strW.length() != 0) {
                        name = StringsKt.O(strW, "Kt");
                    }
                    String strConcat = "CO.".concat(name);
                    AdyenLogger logger = companion.getLogger();
                    String simpleName = Reflection.getOrCreateKotlinClass(th2.getClass()).getSimpleName();
                    String message = th2.getMessage();
                    StringBuilder sbT = f.t("Failed loading image for ", str, " - ", simpleName, ": ");
                    sbT.append(message);
                    logger.log(adyenLogLevel, strConcat, sbT.toString(), null);
                }
                this.$this_load.setImageResource(this.$errorFallback);
                return Unit.f26487a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ImageLoader imageLoader, String str, ImageView imageView, int i11, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$imageLoader = imageLoader;
            this.$url = str;
            this.$this_load = imageView;
            this.$errorFallback = i11;
        }

        @Override // z70.a
        @NotNull
        public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$imageLoader, this.$url, this.$this_load, this.$errorFallback, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull b0 b0Var, @Nullable c<? super Unit> cVar) {
            return ((AnonymousClass1) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                g.M(obj);
                b0 b0Var = (b0) this.L$0;
                ImageLoader imageLoader = this.$imageLoader;
                String str = this.$url;
                C00221 c00221 = new C00221(this.$this_load, null);
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(b0Var, this.$this_load, this.$errorFallback, this.$url, null);
                this.label = 1;
                if (imageLoader.load(str, c00221, anonymousClass2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g.M(obj);
            }
            return Unit.f26487a;
        }
    }

    private static final String buildLogoPath(LogoSize logoSize, String str, String str2, String str3) {
        if (str2.length() != 0) {
            str = k.m(str, ExpiryDateInput.SEPARATOR, str2);
        }
        return "images/logos/" + logoSize + ExpiryDateInput.SEPARATOR + str + str3 + ".png";
    }

    private static final String getDensityExtension(int i11) {
        return i11 <= 120 ? "-ldpi" : i11 <= 160 ? "" : i11 <= 240 ? "-hdpi" : i11 <= 320 ? "-xhdpi" : i11 <= 480 ? "-xxhdpi" : "-xxxhdpi";
    }

    private static final ImageLoader getImageLoader(Context context) {
        ImageLoader imageLoader = localImageLoader;
        if (imageLoader != null) {
            return imageLoader;
        }
        DefaultImageLoader defaultImageLoader = new DefaultImageLoader(context);
        localImageLoader = defaultImageLoader;
        return defaultImageLoader;
    }

    public static final void load(@NotNull ImageView imageView, @NotNull String str, @NotNull ImageLoader imageLoader, int i11, int i12) {
        imageView.getClass();
        str.getClass();
        imageLoader.getClass();
        if (imageView.getDrawable() == null) {
            imageView.setImageResource(i11);
        }
        LifecycleOwner lifecycleOwnerLoad$getLifecycleOwner = load$getLifecycleOwner(imageView.getContext());
        if (lifecycleOwnerLoad$getLifecycleOwner != null) {
            f0.B(m1.c(lifecycleOwnerLoad$getLifecycleOwner), null, null, new AnonymousClass1(imageLoader, str, imageView, i12, null), 3);
        }
    }

    public static /* synthetic */ void load$default(ImageView imageView, Environment environment, String str, ImageLoader imageLoader, int i11, int i12, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            Context context = imageView.getContext();
            context.getClass();
            imageLoader = getImageLoader(context);
        }
        ImageLoader imageLoader2 = imageLoader;
        if ((i13 & 8) != 0) {
            i11 = R.drawable.ic_placeholder_image;
        }
        int i14 = i11;
        if ((i13 & 16) != 0) {
            i12 = R.drawable.ic_placeholder_image;
        }
        load(imageView, environment, str, imageLoader2, i14, i12);
    }

    private static final LifecycleOwner load$getLifecycleOwner(Context context) {
        Object baseContext = context;
        while (!(baseContext instanceof LifecycleOwner)) {
            if (!(baseContext instanceof ContextWrapper)) {
                return null;
            }
            baseContext = ((ContextWrapper) baseContext).getBaseContext();
        }
        return (LifecycleOwner) baseContext;
    }

    public static final void loadLogo(@NotNull ImageView imageView, @NotNull Environment environment, @NotNull String str, @NotNull String str2, @NotNull LogoSize logoSize, @NotNull ImageLoader imageLoader, int i11, int i12) {
        imageView.getClass();
        environment.getClass();
        str.getClass();
        str2.getClass();
        logoSize.getClass();
        imageLoader.getClass();
        load(imageView, environment, buildLogoPath(logoSize, str, str2, getDensityExtension(imageView.getResources().getDisplayMetrics().densityDpi)), imageLoader, i11, i12);
    }

    public static /* synthetic */ void loadLogo$default(ImageView imageView, Environment environment, String str, String str2, LogoSize logoSize, ImageLoader imageLoader, int i11, int i12, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            str2 = "";
        }
        String str3 = str2;
        if ((i13 & 8) != 0) {
            logoSize = LogoSize.SMALL;
        }
        LogoSize logoSize2 = logoSize;
        if ((i13 & 16) != 0) {
            Context context = imageView.getContext();
            context.getClass();
            imageLoader = getImageLoader(context);
        }
        ImageLoader imageLoader2 = imageLoader;
        if ((i13 & 32) != 0) {
            i11 = R.drawable.ic_placeholder_image;
        }
        loadLogo(imageView, environment, str, str3, logoSize2, imageLoader2, i11, (i13 & 64) != 0 ? R.drawable.ic_placeholder_image : i12);
    }

    public static /* synthetic */ void load$default(ImageView imageView, String str, ImageLoader imageLoader, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            Context context = imageView.getContext();
            context.getClass();
            imageLoader = getImageLoader(context);
        }
        if ((i13 & 4) != 0) {
            i11 = R.drawable.ic_placeholder_image;
        }
        if ((i13 & 8) != 0) {
            i12 = R.drawable.ic_placeholder_image;
        }
        load(imageView, str, imageLoader, i11, i12);
    }

    public static final void load(@NotNull ImageView imageView, @NotNull Environment environment, @NotNull String str, @NotNull ImageLoader imageLoader, int i11, int i12) {
        imageView.getClass();
        environment.getClass();
        str.getClass();
        imageLoader.getClass();
        load(imageView, k.l(environment.getCheckoutShopperBaseUrl().toString(), str), imageLoader, i11, i12);
    }
}
