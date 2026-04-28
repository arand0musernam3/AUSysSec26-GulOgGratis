package zendesk.messaging.android.internal.rest;

import android.os.Build;
import ba0.g;
import com.braze.h2;
import ha0.b;
import ha0.c;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.y;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import q90.x;
import y70.a;
import z70.e;
import z70.i;
import zendesk.core.ui.android.internal.local.LocaleProvider;
import zendesk.messaging.BuildConfig;
import zendesk.okhttp.HeaderInterceptor;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0011\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u000e\u001a\n \r*\u0004\u0018\u00010\f0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\n\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0011¨\u0006\u0013"}, d2 = {"Lzendesk/messaging/android/internal/rest/HeaderFactory;", "", "Lzendesk/core/ui/android/internal/local/LocaleProvider;", "localeProvider", "<init>", "(Lzendesk/core/ui/android/internal/local/LocaleProvider;)V", "Lzendesk/okhttp/HeaderInterceptor;", "createHeaderInterceptor", "()Lzendesk/okhttp/HeaderInterceptor;", "Lq90/x;", "loggingInterceptor", "()Lq90/x;", "", "kotlin.jvm.PlatformType", "localeString", "Ljava/lang/String;", "Lha0/c;", "Lha0/c;", "Companion", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HeaderFactory {

    @NotNull
    public static final String CLIENT = "mobile/android/sdk/messaging";

    @NotNull
    public static final String CONTENT_TYPE = "application/json";

    @NotNull
    public static final String USER_AGENT = "Zendesk-SDK/%s Android/%s Variant/Messaging";
    private final String localeString;

    @NotNull
    private final c loggingInterceptor;

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.rest.HeaderFactory$createHeaderInterceptor$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.messaging.android.internal.rest.HeaderFactory$createHeaderInterceptor$1", f = "HeaderFactory.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass1 extends i implements Function1<x70.c<? super String>, Object> {
        int label;

        public AnonymousClass1(x70.c<? super AnonymousClass1> cVar) {
            super(1, cVar);
        }

        @Override // z70.a
        public final x70.c<Unit> create(x70.c<?> cVar) {
            return new AnonymousClass1(cVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(x70.c<? super String> cVar) {
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

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.rest.HeaderFactory$createHeaderInterceptor$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.messaging.android.internal.rest.HeaderFactory$createHeaderInterceptor$2", f = "HeaderFactory.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass2 extends i implements Function1<x70.c<? super String>, Object> {
        int label;

        public AnonymousClass2(x70.c<? super AnonymousClass2> cVar) {
            super(1, cVar);
        }

        @Override // z70.a
        public final x70.c<Unit> create(x70.c<?> cVar) {
            return new AnonymousClass2(cVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(x70.c<? super String> cVar) {
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

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.rest.HeaderFactory$createHeaderInterceptor$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.messaging.android.internal.rest.HeaderFactory$createHeaderInterceptor$3", f = "HeaderFactory.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass3 extends i implements Function1<x70.c<? super String>, Object> {
        int label;

        public AnonymousClass3(x70.c<? super AnonymousClass3> cVar) {
            super(1, cVar);
        }

        @Override // z70.a
        public final x70.c<Unit> create(x70.c<?> cVar) {
            return HeaderFactory.this.new AnonymousClass3(cVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(x70.c<? super String> cVar) {
            return ((AnonymousClass3) create(cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                g.M(obj);
                return HeaderFactory.this.localeString;
            }
            h2.b("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.rest.HeaderFactory$createHeaderInterceptor$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.messaging.android.internal.rest.HeaderFactory$createHeaderInterceptor$4", f = "HeaderFactory.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass4 extends i implements Function1<x70.c<? super String>, Object> {
        int label;

        public AnonymousClass4(x70.c<? super AnonymousClass4> cVar) {
            super(1, cVar);
        }

        @Override // z70.a
        public final x70.c<Unit> create(x70.c<?> cVar) {
            return new AnonymousClass4(cVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(x70.c<? super String> cVar) {
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

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.rest.HeaderFactory$createHeaderInterceptor$5, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.messaging.android.internal.rest.HeaderFactory$createHeaderInterceptor$5", f = "HeaderFactory.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass5 extends i implements Function1<x70.c<? super String>, Object> {
        int label;

        public AnonymousClass5(x70.c<? super AnonymousClass5> cVar) {
            super(1, cVar);
        }

        @Override // z70.a
        public final x70.c<Unit> create(x70.c<?> cVar) {
            return new AnonymousClass5(cVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(x70.c<? super String> cVar) {
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

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.rest.HeaderFactory$createHeaderInterceptor$6, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.messaging.android.internal.rest.HeaderFactory$createHeaderInterceptor$6", f = "HeaderFactory.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass6 extends i implements Function1<x70.c<? super String>, Object> {
        int label;

        public AnonymousClass6(x70.c<? super AnonymousClass6> cVar) {
            super(1, cVar);
        }

        @Override // z70.a
        public final x70.c<Unit> create(x70.c<?> cVar) {
            return new AnonymousClass6(cVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(x70.c<? super String> cVar) {
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

    public HeaderFactory(@NotNull LocaleProvider localeProvider) {
        localeProvider.getClass();
        this.localeString = localeProvider.getLocale().toLanguageTag();
        c cVar = new c(b.f21673j0);
        ha0.a aVar = ha0.a.NONE;
        aVar.getClass();
        cVar.f21677d = aVar;
        cVar.b();
        this.loggingInterceptor = cVar;
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
