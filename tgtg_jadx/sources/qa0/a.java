package qa0;

import kotlin.text.Regex;
import oa0.k;
import q90.n0;
import q90.y;
import q90.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f36774a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z f36775b;

    static {
        Regex regex = z.f36633e;
        f36775b = y.a("text/plain; charset=UTF-8");
    }

    @Override // oa0.k
    public final Object f(Object obj) {
        return n0.create(f36775b, String.valueOf(obj));
    }
}
