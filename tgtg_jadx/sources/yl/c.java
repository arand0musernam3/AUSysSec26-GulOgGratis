package yl;

import com.app.tgtg.feature.logincharity.ui.model.AuthEmailState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AuthEmailState f46143a;

    public c(AuthEmailState authEmailState) {
        authEmailState.getClass();
        this.f46143a = authEmailState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.areEqual(this.f46143a, ((c) obj).f46143a);
    }

    public final int hashCode() {
        return this.f46143a.hashCode();
    }

    public final String toString() {
        return "Next(state=" + this.f46143a + ")";
    }
}
