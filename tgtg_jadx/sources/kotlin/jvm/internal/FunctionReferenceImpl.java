package kotlin.jvm.internal;

import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public class FunctionReferenceImpl extends FunctionReference {
    public FunctionReferenceImpl(int i11, KDeclarationContainer kDeclarationContainer, String str, String str2) {
        super(i11, CallableReference.NO_RECEIVER, ((ClassBasedDeclarationContainer) kDeclarationContainer).getJClass(), str, str2, !(kDeclarationContainer instanceof KClass) ? 1 : 0);
    }

    public FunctionReferenceImpl(int i11, Class cls, String str, String str2, int i12) {
        super(i11, CallableReference.NO_RECEIVER, cls, str, str2, i12);
    }

    public FunctionReferenceImpl(int i11, Object obj, Class cls, String str, String str2, int i12) {
        super(i11, obj, cls, str, str2, i12);
    }
}
