package i9;

import androidx.lifecycle.c1;
import androidx.lifecycle.l1;
import java.lang.ref.WeakReference;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a50.c f23502b;

    public a(@NotNull c1 c1Var) {
        String string = (String) c1Var.a("SaveableStateHolder_BackStackEntryKey");
        if (string == null) {
            string = UUID.randomUUID().toString();
            c1Var.d(string, "SaveableStateHolder_BackStackEntryKey");
        }
        this.f23501a = string;
    }

    @Override // androidx.lifecycle.l1
    public final void onCleared() {
        super.onCleared();
        a50.c cVar = this.f23502b;
        a50.c cVar2 = null;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("saveableStateHolderRef");
            cVar = null;
        }
        y3.b bVar = (y3.b) ((WeakReference) cVar.f822b).get();
        if (bVar != null) {
            bVar.f(this.f23501a);
        }
        a50.c cVar3 = this.f23502b;
        if (cVar3 != null) {
            cVar2 = cVar3;
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("saveableStateHolderRef");
        }
        ((WeakReference) cVar2.f822b).clear();
    }
}
