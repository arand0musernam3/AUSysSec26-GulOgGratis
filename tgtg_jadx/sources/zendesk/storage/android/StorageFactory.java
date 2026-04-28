package zendesk.storage.android;

import android.content.Context;
import com.adyen.checkout.ui.core.internal.ui.view.ExpiryDateInput;
import e40.a;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import zendesk.storage.android.StorageType;
import zendesk.storage.android.internal.BasicStorage;
import zendesk.storage.android.internal.ComplexStorage;
import zendesk.storage.android.internal.FileOperators;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0007J\u001d\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0000¢\u0006\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lzendesk/storage/android/StorageFactory;", "", "<init>", "()V", "create", "Lzendesk/storage/android/Storage;", "namespace", "", "context", "Landroid/content/Context;", "type", "Lzendesk/storage/android/StorageType;", "identifier", "getDirectory", "Ljava/io/File;", "getDirectory$zendesk_storage_storage_android", "zendesk.storage_storage-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nStorageFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StorageFactory.kt\nzendesk/storage/android/StorageFactory\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,56:1\n1#2:57\n*E\n"})
public final class StorageFactory {

    @NotNull
    public static final StorageFactory INSTANCE = new StorageFactory();

    private StorageFactory() {
    }

    @NotNull
    public final Storage create(@NotNull String namespace, @NotNull Context context, @NotNull StorageType type, @Nullable String identifier) {
        namespace.getClass();
        context.getClass();
        type.getClass();
        if (type instanceof StorageType.Basic) {
            return new BasicStorage(namespace, context);
        }
        if (!(type instanceof StorageType.Complex)) {
            a.f();
            return null;
        }
        return new ComplexStorage(k.l(namespace, identifier != null ? ".".concat(identifier) : ""), getDirectory$zendesk_storage_storage_android(namespace, context), getDirectory$zendesk_storage_storage_android(namespace + (identifier != null ? ".".concat(identifier) : ""), context), ((StorageType.Complex) type).getSerializer(), new FileOperators());
    }

    @NotNull
    public final File getDirectory$zendesk_storage_storage_android(@NotNull String namespace, @NotNull Context context) {
        namespace.getClass();
        context.getClass();
        return new File(k.m(context.getCacheDir().getPath(), ExpiryDateInput.SEPARATOR, namespace));
    }
}
