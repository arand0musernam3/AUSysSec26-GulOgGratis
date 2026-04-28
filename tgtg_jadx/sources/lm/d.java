package lm;

import android.view.View;
import android.widget.RelativeLayout;
import androidx.core.view.WindowInsetsCompat;
import com.app.tgtg.R;
import com.app.tgtg.feature.main.MainActivity;
import h7.w;
import j4.s;
import kotlin.jvm.internal.Intrinsics;
import s20.l;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements l, w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f27909a;

    public /* synthetic */ d(i iVar) {
        this.f27909a = iVar;
    }

    @Override // s20.l
    public void b(s20.g gVar, int i11) {
        i iVar = this.f27909a;
        mm.a aVar = null;
        if (i11 == 0) {
            gVar.b(iVar.getString(R.string.browse_tab_list));
            mm.a aVar2 = iVar.f27923m;
            if (aVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewPagerAdapter");
            } else {
                aVar = aVar2;
            }
            gVar.a(aVar.j(0));
            return;
        }
        gVar.b(iVar.getString(R.string.browse_tab_map));
        mm.a aVar3 = iVar.f27923m;
        if (aVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPagerAdapter");
        } else {
            aVar = aVar3;
        }
        gVar.a(aVar.j(1));
    }

    @Override // h7.w
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        x6.d dVarX = s.x(view, windowInsetsCompat);
        i iVar = this.f27909a;
        MainActivity mainActivity = iVar.f27924n;
        if (mainActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mainActivity");
            mainActivity = null;
        }
        int iE0 = mainActivity.e0();
        pg.b bVar = iVar.f27926p;
        if (bVar != null) {
            RelativeLayout relativeLayout = (RelativeLayout) bVar.f34781b;
            int paddingLeft = relativeLayout.getPaddingLeft();
            int i11 = dVarX.f43874b;
            pg.b bVar2 = iVar.f27926p;
            bVar2.getClass();
            int paddingRight = ((RelativeLayout) bVar2.f34781b).getPaddingRight();
            int i12 = dVarX.f43876d;
            if (iE0 > 0) {
                i12 += iE0;
            }
            relativeLayout.setPadding(paddingLeft, i11, paddingRight, i12);
        }
        return windowInsetsCompat;
    }
}
