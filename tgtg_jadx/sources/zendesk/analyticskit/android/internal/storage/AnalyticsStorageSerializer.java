package zendesk.analyticskit.android.internal.storage;

import ba0.g;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import n90.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zendesk.faye.internal.Bayeux;
import zendesk.logger.Logger;
import zendesk.storage.android.Serializer;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ+\u0010\u000e\u001a\u00020\r\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u000b\u001a\u00028\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u0011\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u0010\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013¨\u0006\u0015"}, d2 = {"Lzendesk/analyticskit/android/internal/storage/AnalyticsStorageSerializer;", "Lzendesk/storage/android/Serializer;", "Ln90/c;", "json", "<init>", "(Ln90/c;)V", "T", "Ljava/lang/Class;", "Lkotlinx/serialization/KSerializer;", "serializer", "(Ljava/lang/Class;Ln90/c;)Lkotlinx/serialization/KSerializer;", Bayeux.KEY_DATA, "type", "", "serialize", "(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/String;", "source", "deserialize", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "Ln90/c;", "Companion", "zendesk.analyticskit_analyticskit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AnalyticsStorageSerializer implements Serializer {

    @NotNull
    private static final String LOG_TAG = "AnalyticsStorageSerializer";

    @NotNull
    private final c json;

    public AnalyticsStorageSerializer(@NotNull c cVar) {
        cVar.getClass();
        this.json = cVar;
    }

    private final <T> KSerializer serializer(Class<T> cls, c cVar) {
        return g.G(cVar.f30750b, cls);
    }

    @Override // zendesk.storage.android.Serializer
    @Nullable
    public <T> T deserialize(@NotNull String source, @NotNull Class<T> type) {
        source.getClass();
        type.getClass();
        try {
            c cVar = this.json;
            return (T) cVar.b(serializer(type, cVar), source);
        } catch (Exception e5) {
            Logger.e(LOG_TAG, e5.getMessage(), new Object[0]);
            return null;
        }
    }

    @Override // zendesk.storage.android.Serializer
    @NotNull
    public <T> String serialize(T data, @NotNull Class<T> type) {
        type.getClass();
        c cVar = this.json;
        return cVar.c(serializer(type, cVar), data);
    }
}
