package dx;

import com.app.tgtg.model.local.AppConstants;
import java.util.HashSet;
import java.util.List;
import kotlin.collections.h1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashSet f15211a = h1.c(200, Integer.valueOf(AppConstants.PERMISSIONS_REQUEST_CALL_PHONE));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashSet f15212b = h1.c(503, 504, 429);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static o f15213c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static List f15214d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f15215e;

    public static List a() {
        List list = f15214d;
        if (list != null) {
            return list;
        }
        Intrinsics.throwUninitializedPropertyAccessException("transformedEvents");
        return null;
    }
}
