package fi;

import g4.b0;
import g4.z;
import i4.s0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f17748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f17749c;

    public /* synthetic */ c(boolean z11, Function0 function0, int i11) {
        this.f17747a = i11;
        this.f17748b = z11;
        this.f17749c = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f17747a) {
            case 0:
                z zVar = (z) obj;
                zVar.getClass();
                if (this.f17748b && ((b0) zVar).c()) {
                    this.f17749c.invoke();
                }
                break;
            default:
                ((s0) obj).c(this.f17748b ? 1.0f : ((Number) this.f17749c.invoke()).floatValue());
                break;
        }
        return Unit.f26487a;
    }
}
