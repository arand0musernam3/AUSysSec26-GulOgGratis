package xj;

import androidx.lifecycle.p;
import androidx.lifecycle.s1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f44373b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(u70.j jVar, int i11) {
        super(0);
        this.f44372a = i11;
        this.f44373b = jVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, u70.j] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, u70.j] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, u70.j] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, u70.j] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, u70.j] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, u70.j] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object, u70.j] */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.lang.Object, u70.j] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, u70.j] */
    /* JADX WARN: Type inference failed for: r0v53, types: [java.lang.Object, u70.j] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f44372a) {
            case 0:
                return ((s1) this.f44373b.getValue()).getViewModelStore();
            case 1:
                s1 s1Var = (s1) this.f44373b.getValue();
                p pVar = s1Var instanceof p ? (p) s1Var : null;
                return pVar != null ? pVar.getDefaultViewModelCreationExtras() : y8.a.f45423b;
            case 2:
                return ((s1) this.f44373b.getValue()).getViewModelStore();
            case 3:
                s1 s1Var2 = (s1) this.f44373b.getValue();
                p pVar2 = s1Var2 instanceof p ? (p) s1Var2 : null;
                return pVar2 != null ? pVar2.getDefaultViewModelCreationExtras() : y8.a.f45423b;
            case 4:
                return ((s1) this.f44373b.getValue()).getViewModelStore();
            case 5:
                s1 s1Var3 = (s1) this.f44373b.getValue();
                p pVar3 = s1Var3 instanceof p ? (p) s1Var3 : null;
                return pVar3 != null ? pVar3.getDefaultViewModelCreationExtras() : y8.a.f45423b;
            case 6:
                return ((s1) this.f44373b.getValue()).getViewModelStore();
            case 7:
                s1 s1Var4 = (s1) this.f44373b.getValue();
                p pVar4 = s1Var4 instanceof p ? (p) s1Var4 : null;
                return pVar4 != null ? pVar4.getDefaultViewModelCreationExtras() : y8.a.f45423b;
            case 8:
                return ((s1) this.f44373b.getValue()).getViewModelStore();
            default:
                s1 s1Var5 = (s1) this.f44373b.getValue();
                p pVar5 = s1Var5 instanceof p ? (p) s1Var5 : null;
                return pVar5 != null ? pVar5.getDefaultViewModelCreationExtras() : y8.a.f45423b;
        }
    }
}
