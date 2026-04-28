package b6;

import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static String a(List list, String str, Function1 function1, int i11) {
        if ((i11 & 1) != 0) {
            str = ", ";
        }
        String str2 = (i11 & 2) != 0 ? "" : "[\n\t";
        String str3 = (i11 & 4) == 0 ? "\n]" : "";
        if ((i11 & 32) != 0) {
            function1 = null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) str2);
        int size = list.size();
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            Object obj = list.get(i13);
            i12++;
            if (i12 > 1) {
                sb2.append((CharSequence) str);
            }
            if (function1 != null) {
                sb2.append((CharSequence) function1.invoke(obj));
            } else if (obj != null ? obj instanceof CharSequence : true) {
                sb2.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb2.append(((Character) obj).charValue());
            } else {
                sb2.append((CharSequence) obj.toString());
            }
        }
        sb2.append((CharSequence) str3);
        return sb2.toString();
    }

    @NotNull
    public static final Void b(@NotNull String str) {
        throw new NoSuchElementException(str);
    }

    public static final void c(@NotNull String str) {
        throw new UnsupportedOperationException(str);
    }
}
