package lz;

import android.content.Context;
import c50.w;
import com.google.android.gms.common.api.o;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a3.j f28443a = new a3.j("GoogleSignInCommon", new String[0]);

    public static void a(Context context) {
        i.H(context).I();
        Set set = o.f11087a;
        synchronized (set) {
        }
        Iterator it = set.iterator();
        if (!it.hasNext()) {
            qz.g.a();
        } else {
            ((o) it.next()).getClass();
            w.d();
        }
    }
}
