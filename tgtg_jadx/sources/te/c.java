package te;

import android.view.animation.Interpolator;
import com.braze.Constants;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a60.n f40063a = a60.n.b(Constants.BRAZE_PUSH_CONTENT_KEY, Constants.BRAZE_PUSH_PRIORITY_KEY, Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY, "rz", "r", "o", "so", "eo", "sk", "sa", "rx", "ry");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a60.n f40064b = a60.n.b("k");

    public static void a(pe.b bVar, he.k kVar) {
        Float fValueOf = Float.valueOf(0.0f);
        List list = (List) bVar.f21216b;
        if (list.isEmpty()) {
            list.add(new we.a(kVar, fValueOf, fValueOf, (Interpolator) null, 0.0f, Float.valueOf(kVar.f21937m)));
        } else if (((we.a) list.get(0)).f43388b == null) {
            list.set(0, new we.a(kVar, fValueOf, fValueOf, (Interpolator) null, 0.0f, Float.valueOf(kVar.f21937m)));
        }
    }

    public static boolean b(pe.b bVar) {
        if (bVar != null) {
            return bVar.isStatic() && ((Float) ((we.a) ((List) bVar.f21216b).get(0)).f43388b).floatValue() == 0.0f;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static pe.d c(ue.e r27, he.k r28) {
        /*
            Method dump skipped, instruction units count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: te.c.c(ue.e, he.k):pe.d");
    }
}
