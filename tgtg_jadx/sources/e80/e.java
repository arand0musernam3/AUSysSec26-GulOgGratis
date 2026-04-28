package e80;

import java.io.File;
import kotlin.io.AccessDeniedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f15856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public File[] f15857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15858d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g f15859e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, File file) {
        super(file);
        file.getClass();
        this.f15859e = gVar;
    }

    @Override // e80.h
    public final File a() {
        Function2 function2;
        i iVar = this.f15859e.f15861b;
        boolean z11 = this.f15856b;
        File file = this.f15862a;
        if (z11) {
            File[] fileArr = this.f15857c;
            if (fileArr == null || this.f15858d < fileArr.length) {
                if (fileArr == null) {
                    File[] fileArrListFiles = file.listFiles();
                    this.f15857c = fileArrListFiles;
                    if (fileArrListFiles == null && (function2 = iVar.f15867e) != null) {
                        File file2 = this.f15862a;
                        function2.invoke(file2, new AccessDeniedException(file2, null, "Cannot list files in a directory", 2, null));
                    }
                    File[] fileArr2 = this.f15857c;
                    if (fileArr2 == null || fileArr2.length == 0) {
                        Function1 function1 = iVar.f15866d;
                        if (function1 != null) {
                            function1.invoke(file);
                        }
                    }
                }
                File[] fileArr3 = this.f15857c;
                fileArr3.getClass();
                int i11 = this.f15858d;
                this.f15858d = i11 + 1;
                return fileArr3[i11];
            }
            Function1 function12 = iVar.f15866d;
            if (function12 != null) {
                function12.invoke(file);
                return null;
            }
        } else {
            Function1 function13 = iVar.f15865c;
            if (function13 == null || ((Boolean) function13.invoke(file)).booleanValue()) {
                this.f15856b = true;
                return file;
            }
        }
        return null;
    }
}
