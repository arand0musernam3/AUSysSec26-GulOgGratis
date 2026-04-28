package fn;

import androidx.lifecycle.s1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class r extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f17844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17845c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(t tVar, u70.j jVar, int i11) {
        super(0);
        this.f17843a = i11;
        this.f17844b = tVar;
        this.f17845c = jVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, u70.j] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, u70.j] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, u70.j] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f17843a) {
            case 0:
                s1 s1Var = (s1) this.f17845c.getValue();
                androidx.lifecycle.p pVar = s1Var instanceof androidx.lifecycle.p ? (androidx.lifecycle.p) s1Var : null;
                if (pVar == null || (r0 = pVar.getDefaultViewModelProviderFactory()) == null) {
                }
                break;
            case 1:
                s1 s1Var2 = (s1) this.f17845c.getValue();
                androidx.lifecycle.p pVar2 = s1Var2 instanceof androidx.lifecycle.p ? (androidx.lifecycle.p) s1Var2 : null;
                if (pVar2 == null || (r0 = pVar2.getDefaultViewModelProviderFactory()) == null) {
                }
                break;
            default:
                s1 s1Var3 = (s1) this.f17845c.getValue();
                androidx.lifecycle.p pVar3 = s1Var3 instanceof androidx.lifecycle.p ? (androidx.lifecycle.p) s1Var3 : null;
                if (pVar3 == null || (r0 = pVar3.getDefaultViewModelProviderFactory()) == null) {
                }
                break;
        }
        return this.f17844b.getDefaultViewModelProviderFactory();
    }
}
