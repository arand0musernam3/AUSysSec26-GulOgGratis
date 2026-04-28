package c5;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7388b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(int i11, int i12) {
        super(1);
        this.f7387a = i12;
        this.f7388b = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f7387a) {
            case 0:
                return Boolean.valueOf(((g4.g0) obj).S0(this.f7388b));
            case 1:
                return Boolean.valueOf(((g4.g0) obj).S0(this.f7388b));
            case 2:
                return Boolean.valueOf(((g4.g0) obj).S0(this.f7388b));
            case 3:
                return Boolean.valueOf(((g4.g0) obj).S0(this.f7388b));
            default:
                return Boolean.valueOf(((g4.g0) obj).L0(this.f7388b));
        }
    }
}
