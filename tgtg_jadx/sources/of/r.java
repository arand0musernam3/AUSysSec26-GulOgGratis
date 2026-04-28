package of;

import java.io.File;
import java.io.FileFilter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements FileFilter {
    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        if (file.isFile()) {
            if (Intrinsics.areEqual(file.getName(), "events.log")) {
                return true;
            }
            String name = file.getName();
            name.getClass();
            if (kotlin.text.y.p(name, "events-", false)) {
                String name2 = file.getName();
                name2.getClass();
                if (kotlin.text.y.j(name2, ".log", false)) {
                    return true;
                }
            }
        }
        return false;
    }
}
