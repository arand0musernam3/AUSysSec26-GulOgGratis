package d6;

import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends Lambda implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f14452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f14453c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f14454d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f14455e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14456a;

    static {
        int i11 = 0;
        f14452b = new e(i11, 0);
        f14453c = new e(i11, 1);
        f14454d = new e(i11, 2);
        f14455e = new e(i11, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i11, int i12) {
        super(i11);
        this.f14456a = i12;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f14456a) {
            case 0:
                return UUID.randomUUID();
            case 1:
                return Boolean.FALSE;
            case 2:
                return "DEFAULT_TEST_TAG";
            default:
                return UUID.randomUUID();
        }
    }
}
