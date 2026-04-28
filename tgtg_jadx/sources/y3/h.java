package y3;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.f0;
import androidx.savedstate.SavedStateRegistry;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements e, ea.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f45407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f0 f45408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ea.e f45409c;

    public h(f fVar) {
        this.f45407a = fVar;
        Object objC = fVar.c("androidx.savedstate.SavedStateRegistry");
        Bundle bundle = objC instanceof Bundle ? (Bundle) objC : null;
        if (bundle != null) {
            e(bundle);
        }
        fVar.d("androidx.savedstate.SavedStateRegistry", new y.a(this, 4));
    }

    @Override // y3.e
    public final boolean a(Object obj) {
        return this.f45407a.a(obj);
    }

    @Override // y3.e
    public final Map b() {
        return this.f45407a.b();
    }

    @Override // y3.e
    public final Object c(String str) {
        return this.f45407a.c(str);
    }

    @Override // y3.e
    public final d d(String str, Function0 function0) {
        return this.f45407a.d(str, function0);
    }

    public final ea.e e(Bundle bundle) {
        ea.e eVar = this.f45409c;
        if (eVar != null) {
            return eVar;
        }
        ea.e eVar2 = new ea.e(new ga.a(this, new cw.b(this, 6)));
        this.f45409c = eVar2;
        eVar2.b(bundle);
        return eVar2;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        f0 f0Var = this.f45408b;
        if (f0Var != null) {
            return f0Var;
        }
        f0 f0Var2 = new f0(this, false);
        this.f45408b = f0Var2;
        return f0Var2;
    }

    @Override // ea.f
    public final SavedStateRegistry getSavedStateRegistry() {
        return e(null).f15899b;
    }
}
