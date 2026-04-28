package z70;

import kotlin.jvm.internal.FunctionBase;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class i extends c implements FunctionBase {
    private final int arity;

    public i(int i11, x70.c cVar) {
        super(cVar);
        this.arity = i11;
    }

    @Override // kotlin.jvm.internal.FunctionBase
    public int getArity() {
        return this.arity;
    }

    @Override // z70.a
    @NotNull
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String strRenderLambdaToString = Reflection.renderLambdaToString(this);
        strRenderLambdaToString.getClass();
        return strRenderLambdaToString;
    }
}
