package z1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f3 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f46509j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ g3 f46510k;
    public final /* synthetic */ float l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f46511m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(g3 g3Var, float f11, float f12, x70.c cVar) {
        super(2, cVar);
        this.f46510k = g3Var;
        this.l = f11;
        this.f46511m = f12;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new f3(this.f46510k, this.l, this.f46511m, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f3) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.f46509j;
        if (i11 == 0) {
            ba0.g.M(obj);
            l3 l3Var = this.f46510k.N;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(this.l)) << 32) | (((long) Float.floatToRawIntBits(this.f46511m)) & 4294967295L);
            this.f46509j = 1;
            if (y2.a(l3Var, jFloatToRawIntBits, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ba0.g.M(obj);
        }
        return Unit.f26487a;
    }
}
