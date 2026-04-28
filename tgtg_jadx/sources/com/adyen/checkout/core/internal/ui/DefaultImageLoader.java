package com.adyen.checkout.core.internal.ui;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import ba0.g;
import com.adyen.checkout.core.DispatcherProvider;
import com.adyen.checkout.core.exception.HttpException;
import com.braze.Constants;
import com.braze.h2;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q90.d0;
import q90.p0;
import v80.b0;
import v80.f0;
import x70.c;
import y70.a;
import z70.e;
import z70.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J`\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\b2\"\u0010\u000f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\bH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/adyen/checkout/core/internal/ui/DefaultImageLoader;", "Lcom/adyen/checkout/core/internal/ui/ImageLoader;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", Constants.BRAZE_WEBVIEW_URL_EXTRA, "Lkotlin/Function2;", "Landroid/graphics/Bitmap;", "Lx70/c;", "", "", "onSuccess", "", "onError", "load", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lx70/c;)Ljava/lang/Object;", "Lq90/d0;", "okHttpClient", "Lq90/d0;", "Lcom/adyen/checkout/core/internal/ui/InMemoryCache;", "cache", "Lcom/adyen/checkout/core/internal/ui/InMemoryCache;", "Companion", "checkout-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DefaultImageLoader implements ImageLoader {
    private static final int BYTE_CONVERSION = 1024;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int DEFAULT_MEMORY_MEGABYTES = 256;
    private static final double DEFAULT_MEMORY_PERCENT = 0.2d;
    private static final double LOW_MEMORY_PERCENT = 0.15d;

    @NotNull
    private final InMemoryCache cache;

    @NotNull
    private final d0 okHttpClient;

    /* JADX INFO: renamed from: com.adyen.checkout.core.internal.ui.DefaultImageLoader$load$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.core.internal.ui.DefaultImageLoader$load$2", f = "ImageLoader.kt", l = {49, 75, 79, 88}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {1, 9, 0})
    public static final class AnonymousClass2 extends i implements Function2<b0, c<? super Unit>, Object> {
        final /* synthetic */ Function2<Throwable, c<? super Unit>, Object> $onError;
        final /* synthetic */ Function2<Bitmap, c<? super Unit>, Object> $onSuccess;
        final /* synthetic */ String $url;
        Object L$0;
        Object L$1;
        int label;

        /* JADX INFO: renamed from: com.adyen.checkout.core.internal.ui.DefaultImageLoader$load$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @e(c = "com.adyen.checkout.core.internal.ui.DefaultImageLoader$load$2$1", f = "ImageLoader.kt", l = {50}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {1, 9, 0})
        public static final class AnonymousClass1 extends i implements Function2<b0, c<? super Unit>, Object> {
            final /* synthetic */ Bitmap $cachedBitmap;
            final /* synthetic */ Function2<Bitmap, c<? super Unit>, Object> $onSuccess;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(Function2<? super Bitmap, ? super c<? super Unit>, ? extends Object> function2, Bitmap bitmap, c<? super AnonymousClass1> cVar) {
                super(2, cVar);
                this.$onSuccess = function2;
                this.$cachedBitmap = bitmap;
            }

            @Override // z70.a
            @NotNull
            public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
                return new AnonymousClass1(this.$onSuccess, this.$cachedBitmap, cVar);
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
                    Function2<Bitmap, c<? super Unit>, Object> function2 = this.$onSuccess;
                    Bitmap bitmap = this.$cachedBitmap;
                    this.label = 1;
                    if (function2.invoke(bitmap, this) == aVar) {
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

        /* JADX INFO: renamed from: com.adyen.checkout.core.internal.ui.DefaultImageLoader$load$2$2, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @e(c = "com.adyen.checkout.core.internal.ui.DefaultImageLoader$load$2$2", f = "ImageLoader.kt", l = {76}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {1, 9, 0})
        public static final class C00212 extends i implements Function2<b0, c<? super Unit>, Object> {
            final /* synthetic */ Bitmap $bitmap;
            final /* synthetic */ Function2<Bitmap, c<? super Unit>, Object> $onSuccess;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C00212(Function2<? super Bitmap, ? super c<? super Unit>, ? extends Object> function2, Bitmap bitmap, c<? super C00212> cVar) {
                super(2, cVar);
                this.$onSuccess = function2;
                this.$bitmap = bitmap;
            }

            @Override // z70.a
            @NotNull
            public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
                return new C00212(this.$onSuccess, this.$bitmap, cVar);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull b0 b0Var, @Nullable c<? super Unit> cVar) {
                return ((C00212) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
            }

            @Override // z70.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                a aVar = a.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    g.M(obj);
                    Function2<Bitmap, c<? super Unit>, Object> function2 = this.$onSuccess;
                    Bitmap bitmap = this.$bitmap;
                    bitmap.getClass();
                    this.label = 1;
                    if (function2.invoke(bitmap, this) == aVar) {
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

        /* JADX INFO: renamed from: com.adyen.checkout.core.internal.ui.DefaultImageLoader$load$2$3, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @e(c = "com.adyen.checkout.core.internal.ui.DefaultImageLoader$load$2$3", f = "ImageLoader.kt", l = {80}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {1, 9, 0})
        public static final class AnonymousClass3 extends i implements Function2<b0, c<? super Unit>, Object> {
            final /* synthetic */ Function2<Throwable, c<? super Unit>, Object> $onError;
            final /* synthetic */ p0 $response;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass3(Function2<? super Throwable, ? super c<? super Unit>, ? extends Object> function2, p0 p0Var, c<? super AnonymousClass3> cVar) {
                super(2, cVar);
                this.$onError = function2;
                this.$response = p0Var;
            }

            @Override // z70.a
            @NotNull
            public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
                return new AnonymousClass3(this.$onError, this.$response, cVar);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull b0 b0Var, @Nullable c<? super Unit> cVar) {
                return ((AnonymousClass3) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
            }

            @Override // z70.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                a aVar = a.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    g.M(obj);
                    Function2<Throwable, c<? super Unit>, Object> function2 = this.$onError;
                    p0 p0Var = this.$response;
                    HttpException httpException = new HttpException(p0Var.f36585d, p0Var.f36584c, null);
                    this.label = 1;
                    if (function2.invoke(httpException, this) == aVar) {
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

        /* JADX INFO: renamed from: com.adyen.checkout.core.internal.ui.DefaultImageLoader$load$2$4, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @e(c = "com.adyen.checkout.core.internal.ui.DefaultImageLoader$load$2$4", f = "ImageLoader.kt", l = {89}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {1, 9, 0})
        public static final class AnonymousClass4 extends i implements Function2<b0, c<? super Unit>, Object> {
            final /* synthetic */ IOException $e;
            final /* synthetic */ Function2<Throwable, c<? super Unit>, Object> $onError;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass4(Function2<? super Throwable, ? super c<? super Unit>, ? extends Object> function2, IOException iOException, c<? super AnonymousClass4> cVar) {
                super(2, cVar);
                this.$onError = function2;
                this.$e = iOException;
            }

            @Override // z70.a
            @NotNull
            public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
                return new AnonymousClass4(this.$onError, this.$e, cVar);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull b0 b0Var, @Nullable c<? super Unit> cVar) {
                return ((AnonymousClass4) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
            }

            @Override // z70.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                a aVar = a.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    g.M(obj);
                    Function2<Throwable, c<? super Unit>, Object> function2 = this.$onError;
                    IOException iOException = this.$e;
                    this.label = 1;
                    if (function2.invoke(iOException, this) == aVar) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(String str, Function2<? super Bitmap, ? super c<? super Unit>, ? extends Object> function2, Function2<? super Throwable, ? super c<? super Unit>, ? extends Object> function22, c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$url = str;
            this.$onSuccess = function2;
            this.$onError = function22;
        }

        @Override // z70.a
        @NotNull
        public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
            return DefaultImageLoader.this.new AnonymousClass2(this.$url, this.$onSuccess, this.$onError, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull b0 b0Var, @Nullable c<? super Unit> cVar) {
            return ((AnonymousClass2) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
        
            if (v80.f0.K(r1, r2, r9) == r0) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00da, code lost:
        
            if (v80.f0.K(r10, r4, r9) == r0) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00fc, code lost:
        
            if (v80.f0.K(r1, r3, r9) != r0) goto L47;
         */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00e1 A[Catch: IOException -> 0x002c, CancellationException -> 0x00ff, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x00ff, blocks: (B:12:0x0027, B:39:0x00dd, B:41:0x00e1), top: B:50:0x0027 }] */
        @Override // z70.a
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r10) {
            /*
                Method dump skipped, instruction units count: 263
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.adyen.checkout.core.internal.ui.DefaultImageLoader.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public DefaultImageLoader(@NotNull Context context) {
        context.getClass();
        this.okHttpClient = new d0();
        this.cache = new InMemoryCache(INSTANCE.calculateInMemoryCacheSize(context));
    }

    @Override // com.adyen.checkout.core.internal.ui.ImageLoader
    @Nullable
    public Object load(@NotNull String str, @NotNull Function2<? super Bitmap, ? super c<? super Unit>, ? extends Object> function2, @NotNull Function2<? super Throwable, ? super c<? super Unit>, ? extends Object> function22, @NotNull c<? super Unit> cVar) throws Throwable {
        Object objK = f0.K(DispatcherProvider.INSTANCE.getIO(), new AnonymousClass2(str, function2, function22, null), cVar);
        return objK == a.COROUTINE_SUSPENDED ? objK : Unit.f26487a;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/adyen/checkout/core/internal/ui/DefaultImageLoader$Companion;", "", "()V", "BYTE_CONVERSION", "", "DEFAULT_MEMORY_MEGABYTES", "DEFAULT_MEMORY_PERCENT", "", "LOW_MEMORY_PERCENT", "calculateInMemoryCacheSize", "context", "Landroid/content/Context;", "checkout-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int calculateInMemoryCacheSize(Context context) {
            try {
                Object systemService = context.getSystemService("activity");
                systemService.getClass();
                ActivityManager activityManager = (ActivityManager) systemService;
                double d3 = 1024;
                return (int) ((activityManager.isLowRamDevice() ? DefaultImageLoader.LOW_MEMORY_PERCENT : DefaultImageLoader.DEFAULT_MEMORY_PERCENT) * ((double) ((context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass())) * d3 * d3);
            } catch (Exception unused) {
                return 53687091;
            }
        }

        private Companion() {
        }
    }
}
