package ed;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import b0.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zc.c f15926a = new zc.c();

    public static final boolean a(zc.k kVar) {
        ImageView imageView;
        ad.d dVar = kVar.f47470g;
        bd.b bVar = kVar.f47466c;
        ad.i iVar = kVar.f47486x;
        int i11 = g.$EnumSwitchMapping$0[dVar.ordinal()];
        if (i11 == 1) {
            return false;
        }
        if (i11 != 2) {
            if (i11 != 3) {
                e40.a.f();
                return false;
            }
            if ((kVar.G.f47433a != null || !(iVar instanceof ad.c)) && (!(bVar instanceof bd.a) || !(iVar instanceof ad.f) || (imageView = ((bd.a) bVar).f6105b) == null || imageView != ((ad.f) iVar).f1225a)) {
                return false;
            }
        }
        return true;
    }

    public static final Drawable b(zc.k kVar, Drawable drawable, Integer num) {
        if (drawable == null) {
            drawable = null;
            if (num != null) {
                if (num.intValue() == 0) {
                    return null;
                }
                Context context = kVar.f47464a;
                int iIntValue = num.intValue();
                Drawable drawableX = a0.x(context, iIntValue);
                if (drawableX != null) {
                    return drawableX;
                }
                e40.a.g(j4.s.f(iIntValue, "Invalid resource ID: "));
                return null;
            }
        }
        return drawable;
    }
}
