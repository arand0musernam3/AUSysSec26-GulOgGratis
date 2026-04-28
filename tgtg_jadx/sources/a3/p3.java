package a3;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p3 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v80.b0 f523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z70.i f524c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ p3(v80.b0 b0Var, Function1 function1, int i11) {
        this.f522a = i11;
        this.f523b = b0Var;
        this.f524c = (z70.i) function1;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.jvm.functions.Function1, z70.i] */
    /* JADX WARN: Type inference failed for: r3v2, types: [kotlin.jvm.functions.Function1, z70.i] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f522a) {
            case 0:
                v80.f0.B(this.f523b, null, v80.d0.UNDISPATCHED, new r3(0, this.f524c, null), 1);
                break;
            default:
                v80.f0.B(this.f523b, null, v80.d0.UNDISPATCHED, new r3(2, this.f524c, null), 1);
                break;
        }
        return Unit.f26487a;
    }
}
