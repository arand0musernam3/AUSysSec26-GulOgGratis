package w2;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a extends FunctionReferenceImpl implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b0 f42828a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b0 b0Var) {
        super(1, Intrinsics.Kotlin.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
        this.f42828a = b0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float[] fArr = ((i4.l0) obj).f23269a;
        z4.z zVar = (z4.z) this.f42828a.f42842r.getValue();
        if (zVar != null) {
            if (!zVar.n()) {
                zVar = null;
            }
            if (zVar != null) {
                zVar.o(fArr);
            }
        }
        return Unit.f26487a;
    }
}
