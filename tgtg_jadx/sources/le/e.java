package le;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f27670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f27671c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(h hVar, int i11, int i12) {
        super(1);
        this.f27669a = i12;
        this.f27670b = hVar;
        this.f27671c = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f27669a) {
            case 0:
                return Boolean.valueOf(h.b(this.f27670b, this.f27671c, ((Number) obj).longValue()));
            default:
                return Boolean.valueOf(h.b(this.f27670b, this.f27671c, ((Number) obj).longValue()));
        }
    }
}
