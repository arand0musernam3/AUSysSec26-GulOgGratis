package c5;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.app.tgtg.R;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k4 implements m3.w, androidx.lifecycle.c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f7276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m3.a0 f7277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f7278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Lifecycle f7279d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Function2 f7280e = w1.f7401a;

    public k4(y yVar, m3.a0 a0Var) {
        this.f7276a = yVar;
        this.f7277b = a0Var;
    }

    public final void a() {
        if (!this.f7278c) {
            this.f7278c = true;
            this.f7276a.getView().setTag(R.id.wrapped_composition_tag, null);
            Lifecycle lifecycle = this.f7279d;
            if (lifecycle != null) {
                lifecycle.d(this);
            }
        }
        this.f7277b.p();
    }

    public final void b(Function2 function2) {
        this.f7276a.setOnViewTreeOwnersAvailable(new j4(this, function2));
    }

    @Override // androidx.lifecycle.c0
    public final void onStateChanged(LifecycleOwner lifecycleOwner, androidx.lifecycle.w wVar) {
        if (wVar == androidx.lifecycle.w.ON_DESTROY) {
            a();
        } else {
            if (wVar != androidx.lifecycle.w.ON_CREATE || this.f7278c) {
                return;
            }
            b(this.f7280e);
        }
    }
}
