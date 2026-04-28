package w2;

import androidx.camera.core.CameraControl$OperationCanceledException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.xml.sax.Attributes;
import zw.x2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class l1 {
    public static int a(int i11, int i12, int i13, int i14) {
        return (i11 * i12) + i13 + i14;
    }

    public static int b(int i11, int i12, String str) {
        return (str.hashCode() + i11) * i12;
    }

    public static int c(int i11, int i12, m5.u0 u0Var) {
        return (u0Var.hashCode() + i11) * i12;
    }

    public static int d(Attributes attributes, int i11) {
        return x2.a(attributes.getLocalName(i11)).ordinal();
    }

    public static String e(String str, long j9, String str2) {
        return str + j9 + str2;
    }

    public static String f(StringBuilder sb2, String str, char c3) {
        sb2.append(str);
        sb2.append(c3);
        return sb2.toString();
    }

    public static StringBuilder g(String str, long j9, String str2) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(j9);
        sb2.append(str2);
        return sb2;
    }

    public static HashMap h(Class cls, p40.a aVar) {
        HashMap map = new HashMap();
        map.put(cls, aVar);
        return map;
    }

    public static Map i(HashMap map) {
        return Collections.unmodifiableMap(new HashMap(map));
    }

    public static void j(int i11, HashMap map, String str, int i12, String str2) {
        map.put(str, Integer.valueOf(i11));
        map.put(str2, Integer.valueOf(i12));
    }

    public static void k(String str, v80.q qVar) {
        qVar.h0(new CameraControl$OperationCanceledException(str));
    }
}
