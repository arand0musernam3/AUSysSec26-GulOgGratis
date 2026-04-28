package ad;

import android.content.Context;
import android.util.DisplayMetrics;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1223a;

    public c(Context context) {
        this.f1223a = context;
    }

    @Override // ad.i
    public final Object a(pc.f fVar) {
        DisplayMetrics displayMetrics = this.f1223a.getResources().getDisplayMetrics();
        a aVar = new a(Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels));
        return new h(aVar, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return Intrinsics.areEqual(this.f1223a, ((c) obj).f1223a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1223a.hashCode();
    }
}
