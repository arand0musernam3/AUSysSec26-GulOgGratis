package kotlin.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public class h1 extends g1 {
    public static HashSet c(Object... objArr) {
        HashSet hashSet = new HashSet(w0.a(objArr.length));
        y.O(objArr, hashSet);
        return hashSet;
    }

    public static Set d(Object... objArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(w0.a(objArr.length));
        y.O(objArr, linkedHashSet);
        return linkedHashSet;
    }

    public static Set e(Object... objArr) {
        return y.W(objArr);
    }
}
