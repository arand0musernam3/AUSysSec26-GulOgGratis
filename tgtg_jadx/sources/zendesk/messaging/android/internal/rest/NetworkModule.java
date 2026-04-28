package zendesk.messaging.android.internal.rest;

import com.google.firebase.messaging.a0;
import kotlin.Metadata;
import kotlin.text.Regex;
import n90.c;
import o30.e0;
import oa0.j;
import oa0.o0;
import org.jetbrains.annotations.NotNull;
import q90.c0;
import q90.d0;
import q90.y;
import q90.z;
import zendesk.messaging.android.internal.di.MessagingScope;
import zendesk.okhttp.NetworkExtKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lzendesk/messaging/android/internal/rest/NetworkModule;", "", "<init>", "()V", "Lzendesk/messaging/android/internal/rest/HeaderFactory;", "headerFactory", "Lq90/d0;", "okHttpClient", "(Lzendesk/messaging/android/internal/rest/HeaderFactory;)Lq90/d0;", "", "baseUrl", "Loa0/j;", "converterFactory", "Loa0/o0;", "retrofit", "(Ljava/lang/String;Lq90/d0;Loa0/j;)Loa0/o0;", "Ln90/c;", "json", "provideKotlinSerialization", "(Ln90/c;)Loa0/j;", "Companion", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NetworkModule {

    @NotNull
    public static final String CONTENT_TYPE = "application/json";

    @MessagingScope
    @NotNull
    public final d0 okHttpClient(@NotNull HeaderFactory headerFactory) {
        headerFactory.getClass();
        c0 c0VarAddInterceptors = NetworkExtKt.addInterceptors(new c0(), headerFactory.createHeaderInterceptor(), headerFactory.loggingInterceptor());
        c0VarAddInterceptors.getClass();
        return new d0(c0VarAddInterceptors);
    }

    @MessagingScope
    @NotNull
    public final j provideKotlinSerialization(@NotNull c json) {
        json.getClass();
        Regex regex = z.f36633e;
        return e0.q(json, y.a("application/json"));
    }

    @MessagingScope
    @NotNull
    public final o0 retrofit(@NotNull String baseUrl, @NotNull d0 okHttpClient, @NotNull j converterFactory) {
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
