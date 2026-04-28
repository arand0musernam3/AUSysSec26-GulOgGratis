package zendesk.android.internal.storage;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n90.c;
import n90.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y9.w;
import yj.m;
import zendesk.faye.internal.Bayeux;
import zendesk.storage.android.Serializer;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\u000b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00062\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u000e\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u00062\u0006\u0010\r\u001a\u00028\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010¨\u0006\u0011"}, d2 = {"Lzendesk/android/internal/storage/ZendeskStorageSerializer;", "Lzendesk/storage/android/Serializer;", "Ln90/c;", "json", "<init>", "(Ln90/c;)V", "T", "", "source", "Ljava/lang/Class;", "type", "deserialize", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", Bayeux.KEY_DATA, "serialize", "(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/String;", "Ln90/c;", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ZendeskStorageSerializer implements Serializer {

    @NotNull
    private final c json;

    public /* synthetic */ ZendeskStorageSerializer(c cVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? w.h(new m(14)) : cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(h hVar) {
        hVar.getClass();
        hVar.f30766c = true;
        return Unit.f26487a;
    }

    @Override // zendesk.storage.android.Serializer
    @Nullable
    public <T> T deserialize(@NotNull String source, @NotNull Class<T> type) {
        source.getClass();
        type.getClass();
        try {
            c cVar = this.json;
            return (T) cVar.b(ZendeskStorageSerializerKt.serializer(type, cVar), source);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // zendesk.storage.android.Serializer
    @NotNull
    public <T> String serialize(T data, @NotNull Class<T> type) {
        type.getClass();
        c cVar = this.json;
        return cVar.c(ZendeskStorageSerializerKt.serializer(type, cVar), data);
    }

    public ZendeskStorageSerializer(@NotNull c cVar) {
        cVar.getClass();
        this.json = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ZendeskStorageSerializer() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
