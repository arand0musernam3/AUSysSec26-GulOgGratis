package qa0;

import java.io.IOException;
import oa0.k;
import q90.r0;
import wy.o;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f36776b = new b(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f36777c = new b(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f36778d = new b(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f36779e = new b(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f36780f = new b(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f36781g = new b(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f36782h = new b(6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f36783i = new b(7);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final b f36784j = new b(8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36785a;

    public /* synthetic */ b(int i11) {
        this.f36785a = i11;
    }

    @Override // oa0.k
    public final Object f(Object obj) throws IOException {
        switch (this.f36785a) {
            case 0:
                return Boolean.valueOf(((r0) obj).p());
            case 1:
                return Byte.valueOf(((r0) obj).p());
            case 2:
                String strP = ((r0) obj).p();
                if (strP.length() == 1) {
                    return Character.valueOf(strP.charAt(0));
                }
                o.e(strP.length(), "Expected body of length 1 for Character conversion but was ");
                return null;
            case 3:
                return Double.valueOf(((r0) obj).p());
            case 4:
                return Float.valueOf(((r0) obj).p());
            case 5:
                return Integer.valueOf(((r0) obj).p());
            case 6:
                return Long.valueOf(((r0) obj).p());
            case 7:
                return Short.valueOf(((r0) obj).p());
            default:
                return ((r0) obj).p();
        }
    }
}
