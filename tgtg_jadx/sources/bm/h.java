package bm;

import com.app.tgtg.feature.logincharity.ui.model.AuthEmailState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AuthEmailState f6361a;

    public h(AuthEmailState.Authenticated authenticated) {
        authenticated.getClass();
        this.f6361a = authenticated;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && Intrinsics.areEqual(this.f6361a, ((h) obj).f6361a);
    }

    public final int hashCode() {
        return this.f6361a.hashCode();
    }

    public final String toString() {
        return "Next(state=" + this.f6361a + ")";
    }
}
