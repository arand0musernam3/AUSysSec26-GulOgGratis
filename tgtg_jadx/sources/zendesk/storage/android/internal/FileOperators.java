package zendesk.storage.android.internal;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u0006¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lzendesk/storage/android/internal/FileOperators;", "", "<init>", "()V", "Ljava/io/File;", "file", "Lkotlin/Function1;", "Ljava/io/FileReader;", "", "block", "reader", "(Ljava/io/File;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;", "Ljava/io/FileWriter;", "", "writer", "(Ljava/io/File;Lkotlin/jvm/functions/Function1;)V", "zendesk.storage_storage-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FileOperators {
    @NotNull
    public final String reader(@NotNull File file, @NotNull Function1<? super FileReader, String> block) {
        file.getClass();
        block.getClass();
        FileReader fileReader = new FileReader(file);
        try {
            Object objInvoke = block.invoke(fileReader);
            fileReader.close();
            return (String) objInvoke;
        } finally {
        }
    }

    public final void writer(@NotNull File file, @NotNull Function1<? super FileWriter, Unit> block) {
        file.getClass();
        block.getClass();
        FileWriter fileWriter = new FileWriter(file);
        try {
            block.invoke(fileWriter);
            fileWriter.close();
        } finally {
        }
    }
}
