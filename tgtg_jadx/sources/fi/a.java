package fi;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import m3.g1;
import z4.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1 f17744b;

    public /* synthetic */ a(g1 g1Var, int i11) {
        this.f17743a = i11;
        this.f17744b = g1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f17743a) {
            case 0:
                z zVar = (z) obj;
                zVar.getClass();
                this.f17744b.i((((int) (zVar.u() >> 32)) / 2.0f) + Float.intBitsToFloat((int) (zVar.e(0L) >> 32)));
                break;
            case 1:
                this.f17744b.i(((Float) obj).floatValue());
                break;
            default:
                ((z) obj).getClass();
                this.f17744b.i((int) (r5.u() >> 32));
                break;
        }
        return Unit.f26487a;
    }
}
