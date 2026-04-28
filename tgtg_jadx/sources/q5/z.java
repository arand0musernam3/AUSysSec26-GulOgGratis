package q5;

import android.graphics.Typeface;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class z implements y {
    public static Typeface a(String str, r rVar, int i11) {
        if (i11 == 0 && Intrinsics.areEqual(rVar, r.f36043h) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), rVar.f36049a, i11 == 1);
    }

    @Override // q5.y
    public final Typeface b(r rVar, int i11) {
        return a(null, rVar, i11);
    }

    @Override // q5.y
    public final Typeface c(t tVar, r rVar, int i11) {
        return a(tVar.f36051f, rVar, i11);
    }
}
