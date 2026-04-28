package zendesk.android.internal.network;

import ba0.g;
import com.braze.h2;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.y;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import q90.x;
import x70.c;
import y70.a;
import z70.e;
import z70.i;
import zendesk.android.internal.ZendeskLoggingInterceptor;
import zendesk.android.internal.di.ZendeskComponentConfig;
import zendesk.core.ui.android.internal.local.LocaleProvider;
import zendesk.okhttp.HeaderInterceptor;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B!\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012R\u0014\u0010\u000e\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0014¨\u0006\u0015"}, d2 = {"Lzendesk/android/internal/network/HeaderFactory;", "", "Lzendesk/android/internal/di/ZendeskComponentConfig;", "componentConfig", "Lzendesk/android/internal/network/NetworkData;", "networkData", "Lzendesk/core/ui/android/internal/local/LocaleProvider;", "localeProvider", "<init>", "(Lzendesk/android/internal/di/ZendeskComponentConfig;Lzendesk/android/internal/network/NetworkData;Lzendesk/core/ui/android/internal/local/LocaleProvider;)V", "Lzendesk/okhttp/HeaderInterceptor;", "createHeaderInterceptor", "()Lzendesk/okhttp/HeaderInterceptor;", "Lq90/x;", "loggingInterceptor", "()Lq90/x;", "Lzendesk/android/internal/di/ZendeskComponentConfig;", "Lzendesk/android/internal/network/NetworkData;", "Lzendesk/core/ui/android/internal/local/LocaleProvider;", "Lzendesk/android/internal/ZendeskLoggingInterceptor;", "Lzendesk/android/internal/ZendeskLoggingInterceptor;", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HeaderFactory {

    @NotNull
    private final ZendeskComponentConfig componentConfig;

    @NotNull
    private final LocaleProvider localeProvider;

    @NotNull
    private final ZendeskLoggingInterceptor loggingInterceptor;

    @NotNull
    private final NetworkData networkData;

    /* JADX INFO: renamed from: zendesk.android.internal.network.HeaderFactory$createHeaderInterceptor$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.android.internal.network.HeaderFactory$createHeaderInterceptor$1", f = "HeaderFactory.kt", l = {}, m = "invokeSuspend")
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

    /* JADX INFO: renamed from: zendesk.android.internal.network.HeaderFactory$createHeaderInterceptor$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.android.internal.network.HeaderFactory$createHeaderInterceptor$2", f = "HeaderFactory.kt", l = {}, m = "invokeSuspend")
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

    /* JADX INFO: renamed from: zendesk.android.internal.network.HeaderFactory$createHeaderInterceptor$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.android.internal.network.HeaderFactory$createHeaderInterceptor$3", f = "HeaderFactory.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass3 extends i implements Function1<c<? super String>, Object> {
        int label;

        public AnonymousClass3(c<? super AnonymousClass3> cVar) {
            super(1, cVar);
        }

        @Override // z70.a
        public final c<Unit> create(c<?> cVar) {
            return HeaderFactory.this.new AnonymousClass3(cVar);
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
                return HeaderFactory.this.localeProvider.getLocale().toLanguageTag();
            }
            h2.b("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX INFO: renamed from: zendesk.android.internal.network.HeaderFactory$createHeaderInterceptor$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.android.internal.network.HeaderFactory$createHeaderInterceptor$4", f = "HeaderFactory.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass4 extends i implements Function1<c<? super String>, Object> {
        int label;

        public AnonymousClass4(c<? super AnonymousClass4> cVar) {
            super(1, cVar);
        }

        @Override // z70.a
        public final c<Unit> create(c<?> cVar) {
            return HeaderFactory.this.new AnonymousClass4(cVar);
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
                return HeaderFactory.this.networkData.userAgent();
            }
            h2.b("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX INFO: renamed from: zendesk.android.internal.network.HeaderFactory$createHeaderInterceptor$5, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.android.internal.network.HeaderFactory$createHeaderInterceptor$5", f = "HeaderFactory.kt", l = {}, m = "invokeSuspend")
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

    /* JADX INFO: renamed from: zendesk.android.internal.network.HeaderFactory$createHeaderInterceptor$6, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.android.internal.network.HeaderFactory$createHeaderInterceptor$6", f = "HeaderFactory.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass6 extends i implements Function1<c<? super String>, Object> {
        int label;

        public AnonymousClass6(c<? super AnonymousClass6> cVar) {
            super(1, cVar);
        }

        @Override // z70.a
        public final c<Unit> create(c<?> cVar) {
            return HeaderFactory.this.new AnonymousClass6(cVar);
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
                return HeaderFactory.this.componentConfig.getVersionName();
            }
            h2.b("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    public HeaderFactory(@NotNull ZendeskComponentConfig zendeskComponentConfig, @NotNull NetworkData networkData, @NotNull LocaleProvider localeProvider) {
        zendeskComponentConfig.getClass();
        networkData.getClass();
        localeProvider.getClass();
        this.componentConfig = zendeskComponentConfig;
        this.networkData = networkData;
        this.localeProvider = localeProvider;
        this.loggingInterceptor = new ZendeskLoggingInterceptor();
    }

    @NotNull
    public final HeaderInterceptor createHeaderInterceptor() {
        return new HeaderInterceptor(y.W(new Pair[]{new Pair("Accept", new AnonymousClass1(null)), new Pair("Content-Type", new AnonymousClass2(null)), new Pair("Accept-Language", new AnonymousClass3(null)), new Pair("User-Agent", new AnonymousClass4(null)), new Pair("X-Zendesk-Client", new AnonymousClass5(null)), new Pair("X-Zendesk-Client-Version", new AnonymousClass6(null))}));
    }

    @NotNull
    public final x loggingInterceptor() {
        return this.loggingInterceptor;
    }
}
