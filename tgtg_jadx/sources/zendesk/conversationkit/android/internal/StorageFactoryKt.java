package zendesk.conversationkit.android.internal;

import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "Ljava/lang/Class;", "Ln90/c;", "json", "Lkotlinx/serialization/KSerializer;", "serializer", "(Ljava/lang/Class;Ln90/c;)Lkotlinx/serialization/KSerializer;", "zendesk.conversationkit_conversationkit-android"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class StorageFactoryKt {
    @NotNull
    public static final <T> KSerializer serializer(@NotNull Class<T> cls, @NotNull n90.c cVar) {
        cls.getClass();
        cVar.getClass();
        return ba0.g.G(cVar.f30750b, cls);
    }
}
