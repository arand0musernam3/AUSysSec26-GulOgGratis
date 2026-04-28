package k00;

import java.util.Comparator;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Comparator f25672a;

    static {
        Comparator comparator;
        try {
            Object[] enumConstants = Class.forName(n0.class.getName().concat("$UnsafeComparator")).getEnumConstants();
            Objects.requireNonNull(enumConstants);
            comparator = (Comparator) enumConstants[0];
        } catch (Throwable unused) {
            comparator = m0.zza;
        }
        f25672a = comparator;
    }
}
