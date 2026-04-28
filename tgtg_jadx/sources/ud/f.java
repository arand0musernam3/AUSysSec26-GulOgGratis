package ud;

import ad.j;
import ad.k;
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
    public final View f41058a;

    public f(ImageView imageView) {
        this.f41058a = imageView;
    }

    public static c b(int i11, int i12, int i13) {
        if (i11 == -2) {
            return b.f41056a;
        }
        int i14 = i11 - i13;
        if (i14 > 0) {
            dx.f.a(i14);
            return new a(i14);
        }
        int i15 = i12 - i13;
        if (i15 <= 0) {
            return null;
        }
        dx.f.a(i15);
        return new a(i15);
    }

    @Override // ud.i
    public final Object a(x70.c cVar) {
        h hVarC = c();
        if (hVarC != null) {
            return hVarC;
        }
        l lVar = new l(1, y70.f.b(cVar));
        lVar.t();
        ViewTreeObserver viewTreeObserver = this.f41058a.getViewTreeObserver();
        k kVar = new k(this, viewTreeObserver, lVar, 1);
        viewTreeObserver.addOnPreDrawListener(kVar);
        lVar.v(new j(this, viewTreeObserver, kVar, 3));
        Object objS = lVar.s();
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        return objS;
    }

    public final h c() {
        View view = this.f41058a;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        c cVarB = b(layoutParams != null ? layoutParams.width : -1, view.getWidth(), view.getPaddingRight() + view.getPaddingLeft());
        if (cVarB == null) {
            return null;
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        c cVarB2 = b(layoutParams2 != null ? layoutParams2.height : -1, view.getHeight(), view.getPaddingBottom() + view.getPaddingTop());
        if (cVarB2 == null) {
            return null;
        }
        return new h(cVarB, cVarB2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Intrinsics.areEqual(this.f41058a, ((f) obj).f41058a);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f41058a.hashCode() * 31);
    }

    public final String toString() {
        return "RealViewSizeResolver(view=" + this.f41058a + ", subtractPadding=true)";
    }
}
