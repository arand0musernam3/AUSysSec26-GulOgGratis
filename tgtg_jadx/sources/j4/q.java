package j4;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f24585b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(r rVar, int i11) {
        super(1);
        this.f24584a = i11;
        this.f24585b = rVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f24584a) {
            case 0:
                double dDoubleValue = ((Number) obj).doubleValue();
                return Double.valueOf(this.f24585b.f24596n.a(n80.p.a(dDoubleValue, r10.f24588e, r10.f24589f)));
            default:
                return Double.valueOf(n80.p.a(this.f24585b.f24594k.a(((Number) obj).doubleValue()), r10.f24588e, r10.f24589f));
        }
    }
}
