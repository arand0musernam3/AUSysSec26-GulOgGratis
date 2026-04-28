package c5;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class z2 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z2 f7483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z2 f7484c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7485a;

    static {
        int i11 = 0;
        f7483b = new z2(i11, 0);
        f7484c = new z2(i11, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z2(int i11, int i12) {
        super(i11);
        this.f7485a = i12;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f7485a) {
            case 0:
                return null;
            default:
                return Boolean.FALSE;
        }
    }
}
