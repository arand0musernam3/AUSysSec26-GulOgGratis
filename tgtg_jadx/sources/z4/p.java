package z4;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends Lambda implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q[] f47193b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(q[] qVarArr, int i11) {
        super(2);
        this.f47192a = i11;
        this.f47193b = qVarArr;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f47192a) {
            case 0:
                return Float.valueOf(q1.a((l1) obj, true, this.f47193b, ((Number) obj2).floatValue()));
            default:
                return Float.valueOf(q1.a((l1) obj, false, this.f47193b, ((Number) obj2).floatValue()));
        }
    }
}
