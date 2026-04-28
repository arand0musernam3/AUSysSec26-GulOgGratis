package jg;

import java.util.List;
import kotlin.Pair;
import kotlin.collections.x0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f25162a = x0.e(new Pair("IT", 2), new Pair("US", 3), new Pair("ES", 2));

    public static List a(String str) {
        str.getClass();
        int iHashCode = str.hashCode();
        if (iHashCode == 2222) {
            if (str.equals("ES")) {
                return lg.b.f27774a;
            }
            return null;
        }
        if (iHashCode == 2347) {
            if (str.equals("IT")) {
                return lg.a.f27773a;
            }
            return null;
        }
        if (iHashCode == 2718 && str.equals("US")) {
            return lg.c.f27775a;
        }
        return null;
    }
}
