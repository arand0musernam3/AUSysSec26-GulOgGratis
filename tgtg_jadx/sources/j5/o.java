package j5;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends Lambda implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o f24686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o f24687c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o f24688d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final o f24689e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24690a;

    static {
        int i11 = 0;
        f24686b = new o(i11, 0);
        f24687c = new o(i11, 1);
        f24688d = new o(i11, 2);
        f24689e = new o(i11, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i11, int i12) {
        super(i11);
        this.f24690a = i12;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f24690a) {
            case 0:
                return null;
            case 1:
                return Float.valueOf(0.0f);
            case 2:
                return Float.valueOf(0.0f);
            default:
                return Boolean.FALSE;
        }
    }
}
