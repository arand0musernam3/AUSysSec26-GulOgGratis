package gl;

import androidx.lifecycle.s1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class j extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f20545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f20546c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(l lVar, u70.j jVar, int i11) {
        super(0);
        this.f20544a = i11;
        this.f20545b = lVar;
        this.f20546c = jVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, u70.j] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, u70.j] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f20544a) {
            case 0:
                s1 s1Var = (s1) this.f20546c.getValue();
                androidx.lifecycle.p pVar = s1Var instanceof androidx.lifecycle.p ? (androidx.lifecycle.p) s1Var : null;
                if (pVar == null || (r0 = pVar.getDefaultViewModelProviderFactory()) == null) {
                }
                break;
            default:
                s1 s1Var2 = (s1) this.f20546c.getValue();
                androidx.lifecycle.p pVar2 = s1Var2 instanceof androidx.lifecycle.p ? (androidx.lifecycle.p) s1Var2 : null;
                if (pVar2 == null || (r0 = pVar2.getDefaultViewModelProviderFactory()) == null) {
                }
                break;
        }
        return this.f20545b.getDefaultViewModelProviderFactory();
    }
}
