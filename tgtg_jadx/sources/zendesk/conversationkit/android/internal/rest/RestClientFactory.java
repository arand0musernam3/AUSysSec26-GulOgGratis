package zendesk.conversationkit.android.internal.rest;

import ba0.g;
import com.adyen.checkout.ui.core.internal.ui.view.ExpiryDateInput;
import com.braze.h2;
import com.google.firebase.messaging.a0;
import java.io.File;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.g1;
import kotlin.collections.i1;
import kotlin.collections.p0;
import kotlin.jvm.functions.Function1;
import kotlin.text.y;
import oa0.j;
import oa0.o0;
import org.jetbrains.annotations.NotNull;
import q90.c0;
import q90.d0;
import q90.f;
import q90.x;
import wy.o;
import x70.c;
import y70.a;
import z70.e;
import z70.i;
import zendesk.faye.internal.Bayeux;
import zendesk.logger.Logger;
import zendesk.okhttp.HeaderInterceptor;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 02\u00020\u0001:\u00010BQ\u00120\u0010\u0007\u001a,\u0012(\u0012&\u0012\u0004\u0012\u00020\u0004\u0012\u001c\u0012\u001a\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00050\u00030\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJK\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000422\b\u0002\u0010\u0011\u001a,\u0012(\u0012&\u0012\u0004\u0012\u00020\u0004\u0012\u001c\u0012\u001a\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00050\u00030\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001c\u001a\u00020\u001b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0002H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001bH\u0002¢\u0006\u0004\b \u0010!J\u001d\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b$\u0010%J5\u0010*\u001a\u00020)2\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u0004¢\u0006\u0004\b*\u0010+R>\u0010\u0007\u001a,\u0012(\u0012&\u0012\u0004\u0012\u00020\u0004\u0012\u001c\u0012\u001a\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00050\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010,R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010-R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010.R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010/¨\u00061"}, d2 = {"Lzendesk/conversationkit/android/internal/rest/RestClientFactory;", "", "", "Lkotlin/Pair;", "", "Lkotlin/Function1;", "Lx70/c;", "defaultHeaders", "Lzendesk/conversationkit/android/internal/rest/RestClientFiles;", "restClientFiles", "Ljava/io/File;", "cacheDir", "Loa0/j;", "converterFactory", "<init>", "(Ljava/util/Set;Lzendesk/conversationkit/android/internal/rest/RestClientFiles;Ljava/io/File;Loa0/j;)V", "baseUrl", "headers", "Lzendesk/conversationkit/android/internal/rest/SunshineConversationsApi;", "createSunshineConversationsApi", "(Ljava/lang/String;Ljava/util/Set;)Lzendesk/conversationkit/android/internal/rest/SunshineConversationsApi;", "baseUrlWithoutPath", "Lzendesk/conversationkit/android/internal/rest/EndUserExpectationsApi;", "createEndUserExpectationsApi", "(Ljava/lang/String;)Lzendesk/conversationkit/android/internal/rest/EndUserExpectationsApi;", "Lq90/x;", "interceptors", "Lq90/d0;", "buildOkHttpClient", "(Ljava/util/Set;)Lq90/d0;", "okHttpClient", "Loa0/o0;", "buildRetrofit", "(Ljava/lang/String;Lq90/d0;)Loa0/o0;", "appId", "Lzendesk/conversationkit/android/internal/rest/AppRestClient;", "createAppRestClient", "(Ljava/lang/String;Ljava/lang/String;)Lzendesk/conversationkit/android/internal/rest/AppRestClient;", "appUserId", "settingsBaseUrl", Bayeux.KEY_CLIENT_ID, "Lzendesk/conversationkit/android/internal/rest/UserRestClient;", "createUserRestClient", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lzendesk/conversationkit/android/internal/rest/UserRestClient;", "Ljava/util/Set;", "Lzendesk/conversationkit/android/internal/rest/RestClientFiles;", "Ljava/io/File;", "Loa0/j;", "Companion", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RestClientFactory {
    private static final long CACHE_SIZE = 20971520;

    @NotNull
    private final File cacheDir;

    @NotNull
    private final j converterFactory;

    @NotNull
    private final Set<Pair<String, Function1<c<? super String>, Object>>> defaultHeaders;

    @NotNull
    private final RestClientFiles restClientFiles;

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.rest.RestClientFactory$createAppRestClient$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.rest.RestClientFactory$createAppRestClient$1", f = "RestClientFactory.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass1 extends i implements Function1<c<? super String>, Object> {
        final /* synthetic */ String $appId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, c<? super AnonymousClass1> cVar) {
            super(1, cVar);
            this.$appId = str;
        }

        @Override // z70.a
        public final c<Unit> create(c<?> cVar) {
            return new AnonymousClass1(this.$appId, cVar);
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
                return this.$appId;
            }
            h2.b("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.rest.RestClientFactory$createUserRestClient$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.rest.RestClientFactory$createUserRestClient$1", f = "RestClientFactory.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C02541 extends i implements Function1<c<? super String>, Object> {
        final /* synthetic */ String $appId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02541(String str, c<? super C02541> cVar) {
            super(1, cVar);
            this.$appId = str;
        }

        @Override // z70.a
        public final c<Unit> create(c<?> cVar) {
            return new C02541(this.$appId, cVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(c<? super String> cVar) {
            return ((C02541) create(cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                g.M(obj);
                return this.$appId;
            }
            h2.b("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.rest.RestClientFactory$createUserRestClient$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.rest.RestClientFactory$createUserRestClient$2", f = "RestClientFactory.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass2 extends i implements Function1<c<? super String>, Object> {
        final /* synthetic */ String $clientId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, c<? super AnonymousClass2> cVar) {
            super(1, cVar);
            this.$clientId = str;
        }

        @Override // z70.a
        public final c<Unit> create(c<?> cVar) {
            return new AnonymousClass2(this.$clientId, cVar);
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
                return this.$clientId;
            }
            h2.b("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RestClientFactory(@NotNull Set<? extends Pair<String, ? extends Function1<? super c<? super String>, ? extends Object>>> set, @NotNull RestClientFiles restClientFiles, @NotNull File file, @NotNull j jVar) {
        set.getClass();
        restClientFiles.getClass();
        file.getClass();
        jVar.getClass();
        this.defaultHeaders = set;
        this.restClientFiles = restClientFiles;
        this.cacheDir = file;
        this.converterFactory = jVar;
    }

    private final d0 buildOkHttpClient(Set<? extends x> interceptors) {
        c0 c0Var = new c0();
        Iterator<? extends x> it = interceptors.iterator();
        while (it.hasNext()) {
            c0Var.a(it.next());
        }
        c0Var.l = new f(this.cacheDir);
        return new d0(c0Var);
    }

    private final o0 buildRetrofit(String baseUrl, d0 okHttpClient) {
        if (!y.j(baseUrl, ExpiryDateInput.SEPARATOR, false)) {
            baseUrl = baseUrl.concat(ExpiryDateInput.SEPARATOR);
        }
        a0 a0Var = new a0(18);
        a0Var.w(baseUrl);
        a0Var.B(okHttpClient);
        a0Var.u(this.converterFactory);
        return a0Var.y();
    }

    private final EndUserExpectationsApi createEndUserExpectationsApi(String baseUrlWithoutPath) {
        ha0.c cVar = new ha0.c(new o(20));
        ha0.a aVar = ha0.a.NONE;
        aVar.getClass();
        cVar.f21677d = aVar;
        cVar.b();
        Object objB = buildRetrofit(baseUrlWithoutPath, buildOkHttpClient(kotlin.collections.y.W(new x[]{new HeaderInterceptor(this.defaultHeaders), cVar}))).b(EndUserExpectationsApi.class);
        objB.getClass();
        return (EndUserExpectationsApi) objB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createEndUserExpectationsApi$lambda$2(String str) {
        str.getClass();
        Logger.i("HttpLoggingInterceptor", str, new Object[0]);
    }

    private final SunshineConversationsApi createSunshineConversationsApi(String baseUrl, Set<? extends Pair<String, ? extends Function1<? super c<? super String>, ? extends Object>>> headers) {
        ha0.c cVar = new ha0.c(new o(21));
        ha0.a aVar = ha0.a.NONE;
        aVar.getClass();
        cVar.f21677d = aVar;
        cVar.b();
        Object objB = buildRetrofit(baseUrl, buildOkHttpClient(kotlin.collections.y.W(new x[]{new HeaderInterceptor(i1.h(this.defaultHeaders, headers)), cVar}))).b(SunshineConversationsApi.class);
        objB.getClass();
        return (SunshineConversationsApi) objB;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static SunshineConversationsApi createSunshineConversationsApi$default(RestClientFactory restClientFactory, String str, Set set, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            set = p0.f26531a;
        }
        return restClientFactory.createSunshineConversationsApi(str, set);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createSunshineConversationsApi$lambda$0(String str) {
        str.getClass();
        Logger.i("HttpLoggingInterceptor", str, new Object[0]);
    }

    @NotNull
    public final AppRestClient createAppRestClient(@NotNull String appId, @NotNull String baseUrl) {
        appId.getClass();
        baseUrl.getClass();
        return new AppRestClient(appId, createSunshineConversationsApi(baseUrl, g1.b(new Pair("x-smooch-appid", new AnonymousClass1(appId, null)))));
    }

    @NotNull
    public final UserRestClient createUserRestClient(@NotNull String appId, @NotNull String appUserId, @NotNull String baseUrl, @NotNull String settingsBaseUrl, @NotNull String clientId) {
        appId.getClass();
        appUserId.getClass();
        baseUrl.getClass();
        settingsBaseUrl.getClass();
        clientId.getClass();
        return new UserRestClient(appId, appUserId, createSunshineConversationsApi(baseUrl, kotlin.collections.y.W(new Pair[]{new Pair("x-smooch-appid", new C02541(appId, null)), new Pair("x-smooch-clientid", new AnonymousClass2(clientId, null))})), createEndUserExpectationsApi(settingsBaseUrl), this.restClientFiles);
    }
}
