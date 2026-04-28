package o9;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import z3.u;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f32138b;

    public /* synthetic */ f(u uVar, int i11) {
        this.f32137a = i11;
        this.f32138b = uVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f32137a) {
            case 0:
                this.f32138b.remove(obj);
                break;
            default:
                Integer num = (Integer) obj;
                num.intValue();
                u uVar = this.f32138b;
                uVar.put(num, Boolean.valueOf(!(((Boolean) uVar.get(num)) != null ? r1.booleanValue() : false)));
                break;
        }
        return Unit.f26487a;
    }
}
