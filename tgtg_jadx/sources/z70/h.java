package z70;

import kotlin.jvm.internal.FunctionBase;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class h extends g implements FunctionBase {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f47350j;

    public h(int i11, x70.c cVar) {
        super(cVar);
        this.f47350j = i11;
    }

    @Override // kotlin.jvm.internal.FunctionBase
    public final int getArity() {
        return this.f47350j;
    }

    @Override // z70.a
    public final String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String strRenderLambdaToString = Reflection.renderLambdaToString(this);
        strRenderLambdaToString.getClass();
        return strRenderLambdaToString;
    }
}
