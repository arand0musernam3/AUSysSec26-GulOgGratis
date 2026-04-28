package f2;

import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17131b;

    public /* synthetic */ k(Object obj, int i11) {
        this.f17130a = i11;
        this.f17131b = obj;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlinx.serialization.descriptors.SerialDescriptor] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Integer num = (Integer) obj;
        switch (this.f17130a) {
            case 0:
                num.intValue();
                return this.f17131b;
            default:
                int iIntValue = num.intValue();
                StringBuilder sb2 = new StringBuilder();
                ?? r12 = this.f17131b;
                sb2.append(r12.f(iIntValue));
                sb2.append(": ");
                sb2.append(r12.h(iIntValue).a());
                return sb2.toString();
        }
    }
}
