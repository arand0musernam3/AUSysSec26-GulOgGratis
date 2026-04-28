package b5;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends Lambda implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f5832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f5833c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5834a;

    static {
        int i11 = 0;
        f5832b = new h(i11, 0);
        f5833c = new h(i11, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i11, int i12) {
        super(i11);
        this.f5834a = i12;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f5834a) {
            case 0:
                return new m0(2);
            default:
                return new m0(3);
        }
    }
}
