package zendesk.storage.android.internal;

import a3.y0;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import k9.f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v0.n;
import zendesk.logger.Logger;
import zendesk.storage.android.Serializer;
import zendesk.storage.android.Storage;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0000\u0018\u0000 !2\u00020\u0001:\u0001!B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u000f\u001a\u0004\u0018\u0001H\u0010\"\u0004\b\u0000\u0010\u00102\u0006\u0010\u0011\u001a\u00020\u00032\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00100\u0013H\u0016¢\u0006\u0002\u0010\u0014J3\u0010\u0015\u001a\u00020\u0016\"\u0004\b\u0000\u0010\u00102\u0006\u0010\u0011\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u0001H\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00100\u0013H\u0016¢\u0006\u0002\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0003H\u0016J\b\u0010\u001a\u001a\u00020\u0016H\u0016J\u0015\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\u001dJ\u0015\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u0003H\u0000¢\u0006\u0002\b R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lzendesk/storage/android/internal/ComplexStorage;", "Lzendesk/storage/android/Storage;", "namespace", "", "baseDirectory", "Ljava/io/File;", "directory", "serializer", "Lzendesk/storage/android/Serializer;", "fileOperators", "Lzendesk/storage/android/internal/FileOperators;", "<init>", "(Ljava/lang/String;Ljava/io/File;Ljava/io/File;Lzendesk/storage/android/Serializer;Lzendesk/storage/android/internal/FileOperators;)V", "getNamespace", "()Ljava/lang/String;", "get", "T", "key", "type", "Ljava/lang/Class;", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "set", "", "value", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Class;)V", "remove", "clear", "recursiveClear", "file", "recursiveClear$zendesk_storage_storage_android", "getFile", "name", "getFile$zendesk_storage_storage_android", "Companion", "zendesk.storage_storage-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nComplexStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComplexStorage.kt\nzendesk/storage/android/internal/ComplexStorage\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,122:1\n13472#2,2:123\n1310#2,2:125\n*S KotlinDebug\n*F\n+ 1 ComplexStorage.kt\nzendesk/storage/android/internal/ComplexStorage\n*L\n95#1:123,2\n115#1:125,2\n*E\n"})
public final class ComplexStorage implements Storage {

    @NotNull
    private static final String LOG_TAG = "ComplexStorage";

    @NotNull
    private final File baseDirectory;

    @NotNull
    private final File directory;

    @NotNull
    private final FileOperators fileOperators;

    @NotNull
    private final String namespace;

    @NotNull
    private final Serializer serializer;

    public ComplexStorage(@NotNull String str, @NotNull File file, @NotNull File file2, @NotNull Serializer serializer, @NotNull FileOperators fileOperators) {
        str.getClass();
        file.getClass();
        file2.getClass();
        serializer.getClass();
        fileOperators.getClass();
        this.namespace = str;
        this.baseDirectory = file;
        this.directory = file2;
        this.serializer = serializer;
        this.fileOperators = fileOperators;
        if (file.isDirectory()) {
            file.renameTo(file2);
        } else {
            if (file2.isDirectory()) {
                return;
            }
            file2.mkdirs();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String get$lambda$0(FileReader fileReader) {
        fileReader.getClass();
        return n.D(fileReader);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit set$lambda$1(ComplexStorage complexStorage, Object obj, Class cls, FileWriter fileWriter) throws IOException {
        fileWriter.getClass();
        fileWriter.write(complexStorage.serializer.serialize(obj, cls));
        return Unit.f26487a;
    }

    @Override // zendesk.storage.android.Storage
    public void clear() {
        recursiveClear$zendesk_storage_storage_android(this.directory);
    }

    @Override // zendesk.storage.android.Storage
    @Nullable
    public <T> T get(@NotNull String key, @NotNull Class<T> type) {
        key.getClass();
        type.getClass();
        File file$zendesk_storage_storage_android = getFile$zendesk_storage_storage_android(key);
        if (!file$zendesk_storage_storage_android.exists()) {
            Logger.w(LOG_TAG, "There is no stored data for the given key", new Object[0]);
            return null;
        }
        try {
            return (T) this.serializer.deserialize(this.fileOperators.reader(file$zendesk_storage_storage_android, new f(12)), type);
        } catch (FileNotFoundException e5) {
            Logger.w(LOG_TAG, String.valueOf(e5.getMessage()), e5, new Object[0]);
            return null;
        }
    }

    @NotNull
    public final File getFile$zendesk_storage_storage_android(@NotNull String name) {
        File file;
        name.getClass();
        boolean zIsDirectory = this.directory.isDirectory();
        File file2 = this.directory;
        if (!zIsDirectory) {
            file2.mkdirs();
            return new File(this.directory.getPath(), name);
        }
        File[] fileArrListFiles = file2.listFiles();
        if (fileArrListFiles != null) {
            int length = fileArrListFiles.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    file = null;
                    break;
                }
                file = fileArrListFiles[i11];
                if (Intrinsics.areEqual(file.getName(), name)) {
                    break;
                }
                i11++;
            }
            if (file != null) {
                return file;
            }
        }
        return new File(this.directory.getPath(), name);
    }

    @Override // zendesk.storage.android.Storage
    @NotNull
    public String getNamespace() {
        return this.namespace;
    }

    public final void recursiveClear$zendesk_storage_storage_android(@NotNull File file) {
        file.getClass();
        if (!file.isDirectory()) {
            file.delete();
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                recursiveClear$zendesk_storage_storage_android(file2);
            }
        }
        file.delete();
    }

    @Override // zendesk.storage.android.Storage
    public void remove(@NotNull String key) {
        key.getClass();
        File file$zendesk_storage_storage_android = getFile$zendesk_storage_storage_android(key);
        if (file$zendesk_storage_storage_android.exists()) {
            file$zendesk_storage_storage_android.delete();
        }
    }

    @Override // zendesk.storage.android.Storage
    public <T> void set(@NotNull String key, @Nullable T value, @NotNull Class<T> type) {
        key.getClass();
        type.getClass();
        if (value == null) {
            getFile$zendesk_storage_storage_android(key).delete();
            return;
        }
        try {
            this.fileOperators.writer(getFile$zendesk_storage_storage_android(key), new y0(this, value, type, 28));
        } catch (IOException e5) {
            Logger.w(LOG_TAG, String.valueOf(e5.getMessage()), e5, new Object[0]);
        }
    }
}
