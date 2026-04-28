package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i1 implements s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lifecycle f3232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s1 f3233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e1 f3234c;

    public i1(Lifecycle lifecycle, s1 s1Var, e1 e1Var) {
        this.f3232a = lifecycle;
        this.f3233b = s1Var;
        this.f3234c = e1Var;
    }

    @Override // androidx.fragment.app.s1
    public final void h(Bundle bundle) {
        this.f3233b.h(bundle);
    }
}
