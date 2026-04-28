package zendesk.android.internal.network;

import android.content.Context;
import com.google.firebase.messaging.a0;
import i2.x;
import java.io.File;
import java.util.Date;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import n90.c;
import n90.h;
import o30.e0;
import oa0.j;
import oa0.o0;
import org.jetbrains.annotations.NotNull;
import q90.c0;
import q90.d0;
import q90.f;
import q90.y;
import q90.z;
import y9.w;
import yj.m;
import zendesk.android.internal.di.ZendeskComponentConfig;
import zendesk.android.internal.proactivemessaging.model.Expression;
import zendesk.android.internal.proactivemessaging.model.serializer.ExpressionSerializer;
import zendesk.core.android.internal.serializer.AnySerializer;
import zendesk.core.android.internal.serializer.DateSerializer;
import zendesk.okhttp.NetworkExtKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lzendesk/android/internal/network/NetworkModule;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Ljava/io/File;", "cacheDir", "(Landroid/content/Context;)Ljava/io/File;", "Lzendesk/android/internal/network/HeaderFactory;", "headerFactory", "Lq90/d0;", "okHttpClient", "(Lzendesk/android/internal/network/HeaderFactory;Ljava/io/File;)Lq90/d0;", "Lzendesk/android/internal/di/ZendeskComponentConfig;", "componentConfig", "Loa0/j;", "converterFactory", "Loa0/o0;", "retrofit", "(Lzendesk/android/internal/di/ZendeskComponentConfig;Lq90/d0;Loa0/j;)Loa0/o0;", "Ln90/c;", "json", "provideKotlinSerialization", "(Ln90/c;)Loa0/j;", "provideJson", "()Ln90/c;", "Companion", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNetworkModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkModule.kt\nzendesk/android/internal/network/NetworkModule\n+ 2 SerializersModuleBuilders.kt\nkotlinx/serialization/modules/SerializersModuleBuildersKt\n*L\n1#1,85:1\n31#2,2:86\n234#2:88\n234#2:89\n33#2:90\n*S KotlinDebug\n*F\n+ 1 NetworkModule.kt\nzendesk/android/internal/network/NetworkModule\n*L\n71#1:86,2\n72#1:88\n73#1:89\n71#1:90\n*E\n"})
public final class NetworkModule {
    public static final long CACHE_SIZE = 20971520;

    @NotNull
    public static final String CONTENT_TYPE = "application/json";

    @NotNull
    public static final String ZENDESK_ANDROID_DIR_NAME = "zendesk.android";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideJson$lambda$1(h hVar) {
        hVar.getClass();
        hVar.f30764a = true;
        hVar.f30766c = true;
        hVar.f30765b = false;
        hVar.f30767d = true;
        x xVar = new x();
        xVar.b(Reflection.getOrCreateKotlinClass(Date.class), DateSerializer.INSTANCE);
        xVar.b(Reflection.getOrCreateKotlinClass(Object.class), AnySerializer.INSTANCE);
        xVar.b(Reflection.getOrCreateKotlinClass(Expression.class), ExpressionSerializer.INSTANCE);
        hVar.f30768e = xVar.a();
        return Unit.f26487a;
    }

    @NotNull
    public final File cacheDir(@NotNull Context context) {
        context.getClass();
        return new File(context.getCacheDir(), "zendesk.android");
    }

    @NotNull
    public final d0 okHttpClient(@NotNull HeaderFactory headerFactory, @NotNull File cacheDir) {
        headerFactory.getClass();
        cacheDir.getClass();
        c0 c0VarAddInterceptors = NetworkExtKt.addInterceptors(new c0(), headerFactory.createHeaderInterceptor(), headerFactory.loggingInterceptor());
        c0VarAddInterceptors.l = new f(cacheDir);
        return new d0(c0VarAddInterceptors);
    }

    @NotNull
    public final c provideJson() {
        return w.h(new m(17));
    }

    @NotNull
    public final j provideKotlinSerialization(@NotNull c json) {
        json.getClass();
        Regex regex = z.f36633e;
        return e0.q(json, y.a("application/json"));
    }

    @NotNull
    public final o0 retrofit(@NotNull ZendeskComponentConfig componentConfig, @NotNull d0 okHttpClient, @NotNull j converterFactory) {
        componentConfig.getClass();
        okHttpClient.getClass();
        converterFactory.getClass();
        a0 a0Var = new a0(18);
        a0Var.w(componentConfig.getBaseUrl());
        a0Var.f12779b = okHttpClient;
        a0Var.u(converterFactory);
        return a0Var.y();
    }
}
