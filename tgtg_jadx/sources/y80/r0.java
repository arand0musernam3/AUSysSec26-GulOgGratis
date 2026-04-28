package y80;

import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class r0 implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f45566b;

    public /* synthetic */ r0(Ref.ObjectRef objectRef, int i11) {
        this.f45565a = i11;
        this.f45566b = objectRef;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // y80.j
    public final Object emit(Object obj, x70.c cVar) {
        switch (this.f45565a) {
            case 0:
                this.f45566b.element = obj;
                throw new AbortFlowException(this);
            default:
                this.f45566b.element = obj;
                throw new AbortFlowException(this);
        }
    }
}
