package zendesk.conversationkit.android.internal.serialization;

import defpackage.g;
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
import zendesk.core.android.internal.serializer.AnySerializer;
import zendesk.core.android.internal.serializer.DateSerializer;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lzendesk/conversationkit/android/internal/serialization/SerializationProvider;", "", "<init>", "()V", "Ln90/c;", "json", "Ln90/c;", "getJson", "()Ln90/c;", "getJson$annotations", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSerializationProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SerializationProvider.kt\nzendesk/conversationkit/android/internal/serialization/SerializationProvider\n+ 2 SerializersModuleBuilders.kt\nkotlinx/serialization/modules/SerializersModuleBuildersKt\n*L\n1#1,28:1\n31#2,2:29\n234#2:31\n234#2:32\n33#2:33\n*S KotlinDebug\n*F\n+ 1 SerializationProvider.kt\nzendesk/conversationkit/android/internal/serialization/SerializationProvider\n*L\n22#1:29,2\n23#1:31\n24#1:32\n22#1:33\n*E\n"})
public final class SerializationProvider {

    @NotNull
    public static final SerializationProvider INSTANCE = new SerializationProvider();

    @NotNull
    private static final c json = w.h(new g(19));

    private SerializationProvider() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit json$lambda$1(h hVar) {
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
    public final c getJson() {
        return json;
    }

    public static /* synthetic */ void getJson$annotations() {
    }
}
