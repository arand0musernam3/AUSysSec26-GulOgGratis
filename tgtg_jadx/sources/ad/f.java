package ad;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import kotlin.jvm.internal.Intrinsics;
import v80.l;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f1225a;

    public f(ImageView imageView) {
        this.f1225a = imageView;
    }

    public static a.a b(int i11, int i12, int i13) {
        if (i11 == -2) {
            return b.f1222b;
        }
        int i14 = i11 - i13;
        if (i14 > 0) {
            return new a(i14);
        }
        int i15 = i12 - i13;
        if (i15 > 0) {
            return new a(i15);
        }
        return null;
    }

    @Override // ad.i
    public Object a(pc.f fVar) {
        h hVarC = c();
        if (hVarC != null) {
            return hVarC;
        }
        l lVar = new l(1, y70.f.b(fVar));
        lVar.t();
        ViewTreeObserver viewTreeObserver = this.f1225a.getViewTreeObserver();
        k kVar = new k(this, viewTreeObserver, lVar, 0);
        viewTreeObserver.addOnPreDrawListener(kVar);
        lVar.v(new j(this, viewTreeObserver, kVar, 0));
        Object objS = lVar.s();
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        return objS;
    }

    public h c() {
        View view = this.f1225a;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        a.a aVarB = b(layoutParams != null ? layoutParams.width : -1, view.getWidth(), view.getPaddingRight() + view.getPaddingLeft());
        if (aVarB == null) {
            return null;
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        a.a aVarB2 = b(layoutParams2 != null ? layoutParams2.height : -1, view.getHeight(), view.getPaddingBottom() + view.getPaddingTop());
        if (aVarB2 == null) {
            return null;
        }
        return new h(aVarB, aVarB2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            return Intrinsics.areEqual(this.f1225a, ((f) obj).f1225a);
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f1225a.hashCode() * 31);
    }
}
