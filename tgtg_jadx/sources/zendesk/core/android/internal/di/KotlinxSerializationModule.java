package zendesk.core.android.internal.di;

import i2.x;
import java.util.Date;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import n90.c;
import n90.h;
import org.jetbrains.annotations.NotNull;
import y9.w;
import yj.m;
import zendesk.core.android.internal.InternalZendeskApi;
import zendesk.core.android.internal.serializer.AnySerializer;
import zendesk.core.android.internal.serializer.DateSerializer;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@InternalZendeskApi
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lzendesk/core/android/internal/di/KotlinxSerializationModule;", "", "<init>", "()V", "Ln90/c;", "provideJson", "()Ln90/c;", "zendesk.core_core-utilities"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nKotlinxSerializationModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KotlinxSerializationModule.kt\nzendesk/core/android/internal/di/KotlinxSerializationModule\n+ 2 SerializersModuleBuilders.kt\nkotlinx/serialization/modules/SerializersModuleBuildersKt\n*L\n1#1,32:1\n31#2,2:33\n234#2:35\n234#2:36\n33#2:37\n*S KotlinDebug\n*F\n+ 1 KotlinxSerializationModule.kt\nzendesk/core/android/internal/di/KotlinxSerializationModule\n*L\n25#1:33,2\n26#1:35\n27#1:36\n25#1:37\n*E\n"})
public final class KotlinxSerializationModule {

    @NotNull
    public static final KotlinxSerializationModule INSTANCE = new KotlinxSerializationModule();

    private KotlinxSerializationModule() {
    }

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
        hVar.f30768e = xVar.a();
        return Unit.f26487a;
    }

    @NotNull
    public final c provideJson() {
        return w.h(new m(25));
    }
}
