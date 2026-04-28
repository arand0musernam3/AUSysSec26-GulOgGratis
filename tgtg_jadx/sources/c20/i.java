package c20;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jb.b f6969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FloatingActionButton f6970b;

    public i(FloatingActionButton floatingActionButton, jb.b bVar) {
        this.f6970b = floatingActionButton;
        this.f6969a = bVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof i) && ((i) obj).f6969a.equals(this.f6969a);
    }

    public final int hashCode() {
        return this.f6969a.hashCode();
    }
}
