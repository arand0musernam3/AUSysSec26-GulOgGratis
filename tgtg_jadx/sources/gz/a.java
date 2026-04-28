package gz;

import android.util.SparseArray;
import j4.s;
import java.util.HashMap;
import ty.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseArray f20928a = new SparseArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f20929b;

    static {
        HashMap map = new HashMap();
        f20929b = map;
        map.put(d.DEFAULT, 0);
        map.put(d.VERY_LOW, 1);
        map.put(d.HIGHEST, 2);
        for (d dVar : map.keySet()) {
            f20928a.append(((Integer) f20929b.get(dVar)).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = (Integer) f20929b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        j4.d.e(dVar, "PriorityMapping is missing known Priority value ");
        return 0;
    }

    public static d b(int i11) {
        d dVar = (d) f20928a.get(i11);
        if (dVar != null) {
            return dVar;
        }
        i4.a.f(s.f(i11, "Unknown Priority for value "));
        return null;
    }
}
