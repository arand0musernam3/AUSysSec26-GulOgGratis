package s20;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends l20.c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f38780e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i11) {
        super(16);
        this.f38780e = i11;
    }

    @Override // l20.c
    public final void w(TabLayout tabLayout, View view, View view2, float f11, Drawable drawable) {
        float fSin;
        float fCos;
        switch (this.f38780e) {
            case 0:
                RectF rectFM = l20.c.m(tabLayout, view);
                RectF rectFM2 = l20.c.m(tabLayout, view2);
                if (rectFM.left < rectFM2.left) {
                    double d3 = (((double) f11) * 3.141592653589793d) / 2.0d;
                    fSin = (float) (1.0d - Math.cos(d3));
                    fCos = (float) Math.sin(d3);
                } else {
                    double d11 = (((double) f11) * 3.141592653589793d) / 2.0d;
                    fSin = (float) Math.sin(d11);
                    fCos = (float) (1.0d - Math.cos(d11));
                }
                drawable.setBounds(k10.a.c((int) rectFM.left, fSin, (int) rectFM2.left), drawable.getBounds().top, k10.a.c((int) rectFM.right, fCos, (int) rectFM2.right), drawable.getBounds().bottom);
                break;
            default:
                if (f11 >= 0.5f) {
                    view = view2;
                }
                RectF rectFM3 = l20.c.m(tabLayout, view);
                float fB = f11 < 0.5f ? k10.a.b(1.0f, 0.0f, 0.0f, 0.5f, f11) : k10.a.b(0.0f, 1.0f, 0.5f, 1.0f, f11);
                drawable.setBounds((int) rectFM3.left, drawable.getBounds().top, (int) rectFM3.right, drawable.getBounds().bottom);
                drawable.setAlpha((int) (fB * 255.0f));
                break;
        }
    }
}
