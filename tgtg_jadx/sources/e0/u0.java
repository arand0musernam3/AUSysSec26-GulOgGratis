package e0;

import java.util.HashMap;
import kotlin.reflect.KClass;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashMap f15409c = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final KClass f15411b;

    public u0(String str, KClass kClass) {
        this.f15410a = str;
        this.f15411b = kClass;
    }

    public final String toString() {
        return w2.l1.f(new StringBuilder("Metadata.Key("), this.f15410a, ')');
    }
}
