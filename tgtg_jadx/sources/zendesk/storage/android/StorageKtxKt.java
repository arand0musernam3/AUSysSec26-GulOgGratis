package zendesk.storage.android;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a$\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0086\b¢\u0006\u0002\u0010\u0005\u001a*\u0010\u0006\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\b\u001a\u0002H\u0001H\u0086\b¢\u0006\u0002\u0010\t\u001a#\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00010\u000b\"\u0006\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0086\b¨\u0006\f"}, d2 = {"get", "T", "Lzendesk/storage/android/Storage;", "key", "", "(Lzendesk/storage/android/Storage;Ljava/lang/String;)Ljava/lang/Object;", "set", "", "value", "(Lzendesk/storage/android/Storage;Ljava/lang/String;Ljava/lang/Object;)V", "persistedProperty", "Lzendesk/storage/android/PersistedProperty;", "zendesk.storage_storage-android"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class StorageKtxKt {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final /* synthetic */ <T> T get(Storage storage, String str) {
        storage.getClass();
        str.getClass();
        Intrinsics.reifiedOperationMarker(4, "T");
        String name = Object.class.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    T t9 = (T) storage.get(str, Integer.TYPE);
                    Intrinsics.reifiedOperationMarker(1, "T?");
                    return t9;
                }
                break;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    T t11 = (T) storage.get(str, Float.TYPE);
                    Intrinsics.reifiedOperationMarker(1, "T?");
                    return t11;
                }
                break;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    T t12 = (T) storage.get(str, Boolean.TYPE);
                    Intrinsics.reifiedOperationMarker(1, "T?");
                    return t12;
                }
                break;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    T t13 = (T) storage.get(str, Long.TYPE);
                    Intrinsics.reifiedOperationMarker(1, "T?");
                    return t13;
                }
                break;
        }
        Intrinsics.reifiedOperationMarker(4, "T");
        return (T) storage.get(str, Object.class);
    }

    public static final /* synthetic */ <T> PersistedProperty<T> persistedProperty(Storage storage, String str) {
        storage.getClass();
        str.getClass();
        Intrinsics.reifiedOperationMarker(4, "T");
        return new PersistedProperty<>(storage, str, Object.class);
    }

    public static final /* synthetic */ <T> void set(Storage storage, String str, T t9) {
        storage.getClass();
        str.getClass();
        Intrinsics.reifiedOperationMarker(4, "T");
        storage.set(str, t9, Object.class);
    }
}
