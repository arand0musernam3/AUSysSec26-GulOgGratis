package zendesk.storage.android.internal;

import android.content.Context;
import android.content.SharedPreferences;
import gt.e;
import hb0.o;
import k9.f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zendesk.logger.Logger;
import zendesk.storage.android.Storage;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\f\u001a\u0004\u0018\u0001H\r\"\u0004\b\u0000\u0010\r2\u0006\u0010\u000e\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\r0\u0010H\u0016¢\u0006\u0002\u0010\u0011J3\u0010\u0012\u001a\u00020\u0013\"\u0004\b\u0000\u0010\r2\u0006\u0010\u000e\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u0001H\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\r0\u0010H\u0016¢\u0006\u0002\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u0003H\u0016J\b\u0010\u0017\u001a\u00020\u0013H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lzendesk/storage/android/internal/BasicStorage;", "Lzendesk/storage/android/Storage;", "namespace", "", "context", "Landroid/content/Context;", "<init>", "(Ljava/lang/String;Landroid/content/Context;)V", "getNamespace", "()Ljava/lang/String;", "sharedPreferences", "Landroid/content/SharedPreferences;", "get", "T", "key", "type", "Ljava/lang/Class;", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "set", "", "value", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Class;)V", "remove", "clear", "Companion", "zendesk.storage_storage-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BasicStorage implements Storage {

    @NotNull
    private static final String LOG_TAG = "SimpleStorage";

    @NotNull
    private final String namespace;

    @NotNull
    private final SharedPreferences sharedPreferences;

    public BasicStorage(@NotNull String str, @NotNull Context context) {
        str.getClass();
        context.getClass();
        this.namespace = str;
        SharedPreferences sharedPreferences = context.getSharedPreferences(getNamespace(), 0);
        sharedPreferences.getClass();
        this.sharedPreferences = sharedPreferences;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit clear$lambda$2(SharedPreferences.Editor editor) {
        editor.getClass();
        editor.clear();
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit remove$lambda$1(String str, SharedPreferences.Editor editor) {
        editor.getClass();
        editor.remove(str);
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit set$lambda$0(Object obj, String str, SharedPreferences.Editor editor) {
        editor.getClass();
        if (obj == null) {
            editor.remove(str);
            return Unit.f26487a;
        }
        if (obj instanceof String) {
            editor.putString(str, (String) obj);
        } else if (obj instanceof Integer) {
            editor.putInt(str, ((Number) obj).intValue());
        } else if (obj instanceof Boolean) {
            editor.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Float) {
            editor.putFloat(str, ((Number) obj).floatValue());
        } else if (obj instanceof Long) {
            editor.putLong(str, ((Number) obj).longValue());
        } else {
            Logger.e(LOG_TAG, "Unable to store the value provided as it is not a supported type", new Object[0]);
        }
        return Unit.f26487a;
    }

    @Override // zendesk.storage.android.Storage
    public void clear() {
        BasicStorageKt.edit(this.sharedPreferences, new f(11));
    }

    @Override // zendesk.storage.android.Storage
    @Nullable
    public <T> T get(@NotNull String key, @NotNull Class<T> type) {
        key.getClass();
        type.getClass();
        if (!this.sharedPreferences.contains(key)) {
            Logger.w(LOG_TAG, "There is no stored data for the given key", new Object[0]);
            return null;
        }
        try {
            if (Intrinsics.areEqual(type, String.class)) {
                return (T) this.sharedPreferences.getString(key, null);
            }
            if (Intrinsics.areEqual(type, Integer.TYPE)) {
                return (T) Integer.valueOf(this.sharedPreferences.getInt(key, 0));
            }
            if (Intrinsics.areEqual(type, Boolean.TYPE)) {
                return (T) Boolean.valueOf(this.sharedPreferences.getBoolean(key, false));
            }
            if (Intrinsics.areEqual(type, Float.TYPE)) {
                return (T) Float.valueOf(this.sharedPreferences.getFloat(key, 0.0f));
            }
            if (Intrinsics.areEqual(type, Long.TYPE)) {
                return (T) Long.valueOf(this.sharedPreferences.getLong(key, 0L));
            }
            return null;
        } catch (ClassCastException e5) {
            Logger.e(LOG_TAG, "The stored data did not match the requested type", e5, new Object[0]);
            return null;
        }
    }

    @Override // zendesk.storage.android.Storage
    @NotNull
    public String getNamespace() {
        return this.namespace;
    }

    @Override // zendesk.storage.android.Storage
    public void remove(@NotNull String key) {
        key.getClass();
        BasicStorageKt.edit(this.sharedPreferences, new e(key, 16));
    }

    @Override // zendesk.storage.android.Storage
    public <T> void set(@NotNull String key, @Nullable T value, @NotNull Class<T> type) {
        key.getClass();
        type.getClass();
        BasicStorageKt.edit(this.sharedPreferences, new o(20, value, key));
    }
}
