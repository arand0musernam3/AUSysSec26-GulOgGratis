package zendesk.storage.android;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lzendesk/storage/android/StorageType;", "", "<init>", "()V", "Basic", "Complex", "Lzendesk/storage/android/StorageType$Basic;", "Lzendesk/storage/android/StorageType$Complex;", "zendesk.storage_storage-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class StorageType {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzendesk/storage/android/StorageType$Basic;", "Lzendesk/storage/android/StorageType;", "<init>", "()V", "zendesk.storage_storage-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Basic extends StorageType {

        @NotNull
        public static final Basic INSTANCE = new Basic();

        private Basic() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lzendesk/storage/android/StorageType$Complex;", "Lzendesk/storage/android/StorageType;", "serializer", "Lzendesk/storage/android/Serializer;", "<init>", "(Lzendesk/storage/android/Serializer;)V", "getSerializer", "()Lzendesk/storage/android/Serializer;", "zendesk.storage_storage-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Complex extends StorageType {

        @NotNull
        private final Serializer serializer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Complex(@NotNull Serializer serializer) {
            super(null);
            serializer.getClass();
            this.serializer = serializer;
        }

        @NotNull
        public final Serializer getSerializer() {
            return this.serializer;
        }
    }

    public /* synthetic */ StorageType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private StorageType() {
    }
}
