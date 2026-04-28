package kotlin.io;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/io/AccessDeniedException;", "Lkotlin/io/FileSystemException;", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AccessDeniedException extends FileSystemException {
    /* JADX WARN: Illegal instructions before constructor call */
    public AccessDeniedException(File file, File file2, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        file2 = (i11 & 2) != 0 ? null : file2;
        str = (i11 & 4) != 0 ? null : str;
        file.getClass();
        super(file, file2, str);
    }
}
