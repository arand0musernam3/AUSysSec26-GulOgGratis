package zendesk.analyticskit.android.internal.di;

import android.content.Context;
import android.os.Build;
import ba0.g;
import com.braze.h2;
import com.google.firebase.messaging.a0;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.Regex;
import o30.e0;
import oa0.j;
import oa0.o0;
import org.jetbrains.annotations.NotNull;
import q90.c0;
import q90.d0;
import q90.f;
import q90.y;
import q90.z;
import wy.o;
import x70.c;
import y70.a;
import z70.e;
import z70.i;
import zendesk.analyticskit.android.internal.data.AnalyticsService;
import zendesk.core.android.BuildConfig;
import zendesk.core.ui.android.internal.local.LocaleProvider;
import zendesk.logger.Logger;
import zendesk.okhttp.HeaderInterceptor;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 '2\u00020\u0001:\u0001'B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010!\u001a\u00020 2\b\b\u0001\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u0019H\u0007¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020 H\u0007¢\u0006\u0004\b%\u0010&¨\u0006("}, d2 = {"Lzendesk/analyticskit/android/internal/di/AnalyticsKitNetworkModule;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Ljava/io/File;", "providesCacheDir", "(Landroid/content/Context;)Ljava/io/File;", "Lha0/c;", "providesHttpLoggingInterceptor", "()Lha0/c;", "Lzendesk/core/ui/android/internal/local/LocaleProvider;", "localeProvider", "Lzendesk/okhttp/HeaderInterceptor;", "providesHeaderInterceptor", "(Lzendesk/core/ui/android/internal/local/LocaleProvider;)Lzendesk/okhttp/HeaderInterceptor;", "loggingInterceptor", "headerInterceptor", "cacheDir", "Lq90/d0;", "providesOkHttpClient", "(Lha0/c;Lzendesk/okhttp/HeaderInterceptor;Ljava/io/File;)Lq90/d0;", "Ln90/c;", "json", "Loa0/j;", "provideKotlinSerialization", "(Ln90/c;)Loa0/j;", "", "baseUrl", "okHttpClient", "converterFactory", "Loa0/o0;", "providesRetrofit", "(Ljava/lang/String;Lq90/d0;Loa0/j;)Loa0/o0;", "retrofit", "Lzendesk/analyticskit/android/internal/data/AnalyticsService;", "providesAnalyticsService", "(Loa0/o0;)Lzendesk/analyticskit/android/internal/data/AnalyticsService;", "Companion", "zendesk.analyticskit_analyticskit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AnalyticsKitNetworkModule {

    @NotNull
    public static final String BASE_URL = "baseUrl";

    @NotNull
    private static final String CACHE_DIR_NAME = "zendesk.analyticskit.android";
    private static final long CACHE_SIZE = 20971520;

    @NotNull
    private static final String CLIENT = "mobile/android/sdk/messaging";

    @NotNull
    private static final String CONTENT_TYPE = "application/json";

    @NotNull
    private static final String HEADER_ACCEPT = "Accept";

    @NotNull
    private static final String HEADER_ACCEPT_LANGUAGE = "Accept-Language";

    @NotNull
    private static final String HEADER_CONTENT_TYPE = "Content-Type";

    @NotNull
    private static final String HEADER_USER_AGENT = "User-Agent";

    @NotNull
    private static final String HEADER_X_ZENDESK_CLIENT = "X-Zendesk-Client";

    @NotNull
    private static final String HEADER_X_ZENDESK_CLIENT_VERSION = "X-Zendesk-Client-Version";

    @NotNull
    private static final String LOGGING_INTERCEPTOR_LOG_TAG = "HttpLoggingInterceptor";

    @NotNull
    private static final String LOGGING_REDACT_HEADER = "Authorization";

    @NotNull
    private static final String USER_AGENT = "Zendesk-SDK/%s Android/%s Variant/Messaging";

    /* JADX INFO: renamed from: zendesk.analyticskit.android.internal.di.AnalyticsKitNetworkModule$providesHeaderInterceptor$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.analyticskit.android.internal.di.AnalyticsKitNetworkModule$providesHeaderInterceptor$1", f = "AnalyticsKitNetworkModule.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass1 extends i implements Function1<c<? super String>, Object> {
        int label;

        public AnonymousClass1(c<? super AnonymousClass1> cVar) {
            super(1, cVar);
        }

        @Override // z70.a
        public final c<Unit> create(c<?> cVar) {
            return new AnonymousClass1(cVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(c<? super String> cVar) {
            return ((AnonymousClass1) create(cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                g.M(obj);
                return "application/json";
            }
            h2.b("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX INFO: renamed from: zendesk.analyticskit.android.internal.di.AnalyticsKitNetworkModule$providesHeaderInterceptor$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.analyticskit.android.internal.di.AnalyticsKitNetworkModule$providesHeaderInterceptor$2", f = "AnalyticsKitNetworkModule.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass2 extends i implements Function1<c<? super String>, Object> {
        int label;

        public AnonymousClass2(c<? super AnonymousClass2> cVar) {
            super(1, cVar);
        }

        @Override // z70.a
        public final c<Unit> create(c<?> cVar) {
            return new AnonymousClass2(cVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(c<? super String> cVar) {
            return ((AnonymousClass2) create(cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                g.M(obj);
                return "application/json";
            }
            h2.b("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX INFO: renamed from: zendesk.analyticskit.android.internal.di.AnalyticsKitNetworkModule$providesHeaderInterceptor$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.analyticskit.android.internal.di.AnalyticsKitNetworkModule$providesHeaderInterceptor$3", f = "AnalyticsKitNetworkModule.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass3 extends i implements Function1<c<? super String>, Object> {
        final /* synthetic */ LocaleProvider $localeProvider;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(LocaleProvider localeProvider, c<? super AnonymousClass3> cVar) {
            super(1, cVar);
            this.$localeProvider = localeProvider;
        }

        @Override // z70.a
        public final c<Unit> create(c<?> cVar) {
            return new AnonymousClass3(this.$localeProvider, cVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(c<? super String> cVar) {
            return ((AnonymousClass3) create(cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                g.M(obj);
                return this.$localeProvider.getLocale().toLanguageTag();
            }
            h2.b("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX INFO: renamed from: zendesk.analyticskit.android.internal.di.AnalyticsKitNetworkModule$providesHeaderInterceptor$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.analyticskit.android.internal.di.AnalyticsKitNetworkModule$providesHeaderInterceptor$4", f = "AnalyticsKitNetworkModule.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass4 extends i implements Function1<c<? super String>, Object> {
        int label;

        public AnonymousClass4(c<? super AnonymousClass4> cVar) {
            super(1, cVar);
        }

        @Override // z70.a
        public final c<Unit> create(c<?> cVar) {
            return new AnonymousClass4(cVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(c<? super String> cVar) {
            return ((AnonymousClass4) create(cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                g.M(obj);
                return String.format("Zendesk-SDK/%s Android/%s Variant/Messaging", Arrays.copyOf(new Object[]{BuildConfig.VERSION_NAME, Build.VERSION.RELEASE}, 2));
            }
            h2.b("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX INFO: renamed from: zendesk.analyticskit.android.internal.di.AnalyticsKitNetworkModule$providesHeaderInterceptor$5, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.analyticskit.android.internal.di.AnalyticsKitNetworkModule$providesHeaderInterceptor$5", f = "AnalyticsKitNetworkModule.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass5 extends i implements Function1<c<? super String>, Object> {
        int label;

        public AnonymousClass5(c<? super AnonymousClass5> cVar) {
            super(1, cVar);
        }

        @Override // z70.a
        public final c<Unit> create(c<?> cVar) {
            return new AnonymousClass5(cVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(c<? super String> cVar) {
            return ((AnonymousClass5) create(cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                g.M(obj);
                return "mobile/android/sdk/messaging";
            }
            h2.b("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX INFO: renamed from: zendesk.analyticskit.android.internal.di.AnalyticsKitNetworkModule$providesHeaderInterceptor$6, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.analyticskit.android.internal.di.AnalyticsKitNetworkModule$providesHeaderInterceptor$6", f = "AnalyticsKitNetworkModule.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass6 extends i implements Function1<c<? super String>, Object> {
        int label;

        public AnonymousClass6(c<? super AnonymousClass6> cVar) {
            super(1, cVar);
        }

        @Override // z70.a
        public final c<Unit> create(c<?> cVar) {
            return new AnonymousClass6(cVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(c<? super String> cVar) {
            return ((AnonymousClass6) create(cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                g.M(obj);
                return BuildConfig.VERSION_NAME;
            }
            h2.b("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void providesHttpLoggingInterceptor$lambda$0(String str) {
        str.getClass();
        Logger.i(LOGGING_INTERCEPTOR_LOG_TAG, str, new Object[0]);
    }

    @AnalyticsKitScope
    @NotNull
    public final j provideKotlinSerialization(@NotNull n90.c json) {
        json.getClass();
        Regex regex = z.f36633e;
        return e0.q(json, y.a("application/json"));
    }

    @AnalyticsKitScope
    @NotNull
    public final AnalyticsService providesAnalyticsService(@NotNull o0 retrofit) {
        retrofit.getClass();
        Object objB = retrofit.b(AnalyticsService.class);
        objB.getClass();
        return (AnalyticsService) objB;
    }

    @AnalyticsKitScope
    @NotNull
    public final File providesCacheDir(@NotNull Context context) {
        context.getClass();
        return new File(context.getCacheDir(), CACHE_DIR_NAME);
    }

    @AnalyticsKitScope
    @NotNull
    public final HeaderInterceptor providesHeaderInterceptor(@NotNull LocaleProvider localeProvider) {
        localeProvider.getClass();
        return new HeaderInterceptor(kotlin.collections.y.W(new Pair[]{new Pair(HEADER_ACCEPT, new AnonymousClass1(null)), new Pair(HEADER_CONTENT_TYPE, new AnonymousClass2(null)), new Pair(HEADER_ACCEPT_LANGUAGE, new AnonymousClass3(localeProvider, null)), new Pair(HEADER_USER_AGENT, new AnonymousClass4(null)), new Pair(HEADER_X_ZENDESK_CLIENT, new AnonymousClass5(null)), new Pair(HEADER_X_ZENDESK_CLIENT_VERSION, new AnonymousClass6(null))}));
    }

    @AnalyticsKitScope
    @NotNull
    public final ha0.c providesHttpLoggingInterceptor() {
        ha0.c cVar = new ha0.c(new o(19));
        ha0.a aVar = ha0.a.NONE;
        aVar.getClass();
        cVar.f21677d = aVar;
        cVar.b();
        return cVar;
    }

    @AnalyticsKitScope
    @NotNull
    public final d0 providesOkHttpClient(@NotNull ha0.c loggingInterceptor, @NotNull HeaderInterceptor headerInterceptor, @NotNull File cacheDir) {
        loggingInterceptor.getClass();
        headerInterceptor.getClass();
        cacheDir.getClass();
        c0 c0Var = new c0();
        ArrayList arrayList = c0Var.f36429c;
        arrayList.add(loggingInterceptor);
        arrayList.add(headerInterceptor);
        c0Var.l = new f(cacheDir);
        return new d0(c0Var);
    }

    @AnalyticsKitScope
    @NotNull
    public final o0 providesRetrofit(@NotNull String baseUrl, @NotNull d0 okHttpClient, @NotNull j converterFactory) {
        baseUrl.getClass();
        okHttpClient.getClass();
        converterFactory.getClass();
        a0 a0Var = new a0(18);
        a0Var.w(baseUrl);
        a0Var.f12779b = okHttpClient;
        a0Var.u(converterFactory);
        return a0Var.y();
    }
}
