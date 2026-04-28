package g8;

import aa.l0;
import android.content.Context;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinkedHashSet f20094a = new LinkedHashSet();

    public static final f8.b a(Context context, String str, Set set) {
        context.getClass();
        set.getClass();
        int i11 = 3;
        x70.c cVar = null;
        return set == f20094a ? new f8.b(context, str, new l0(set, cVar, 23), new ah.j(i11, cVar, 3), 4) : new f8.b(context, str, set, new l0(set, cVar, 23), new ah.j(i11, cVar, 3));
    }
}
