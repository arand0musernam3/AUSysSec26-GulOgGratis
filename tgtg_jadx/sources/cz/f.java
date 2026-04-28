package cz;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.app.tgtg.feature.main.MainActivity;
import fn.t;
import h7.w;
import j4.s;
import pg.b1;
import pg.o0;
import pg.v;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f implements ez.a, w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13619c;

    public /* synthetic */ f(j jVar, wy.i iVar, int i11) {
        this.f13618b = jVar;
        this.f13619c = iVar;
        this.f13617a = i11;
    }

    @Override // ez.a
    public Object e() {
        j jVar = (j) this.f13618b;
        ((a8.h) jVar.f13636f).z((wy.i) this.f13619c, this.f13617a + 1, false);
        return null;
    }

    @Override // h7.w
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        t tVar = (t) this.f13618b;
        MainActivity mainActivity = (MainActivity) this.f13619c;
        x6.d dVarX = s.x(view, windowInsetsCompat);
        o0 o0Var = tVar.f17859s;
        if (o0Var != null) {
            if (((ConstraintLayout) ((b1) o0Var.f35025k).f34796d).getVisibility() == 0) {
                o0 o0Var2 = tVar.f17859s;
                o0Var2.getClass();
                ViewGroup.LayoutParams layoutParams = ((ConstraintLayout) ((b1) o0Var2.f35025k).f34796d).getLayoutParams();
                layoutParams.getClass();
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = dVarX.f43874b;
            }
            o0 o0Var3 = tVar.f17859s;
            o0Var3.getClass();
            if (((ConstraintLayout) ((v) o0Var3.f35026m).f35202c).getVisibility() == 0) {
                o0 o0Var4 = tVar.f17859s;
                o0Var4.getClass();
                ViewGroup.LayoutParams layoutParams2 = ((ConstraintLayout) ((v) o0Var4.f35026m).f35202c).getLayoutParams();
                layoutParams2.getClass();
                ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = dVarX.f43874b;
            }
            tVar.f17854n = dVarX.f43874b + this.f13617a;
            int iE0 = mainActivity.e0();
            int i11 = dVarX.f43876d;
            if (iE0 > 0) {
                i11 += iE0;
            }
            tVar.f17855o = i11;
            o0 o0Var5 = tVar.f17859s;
            o0Var5.getClass();
            RecyclerView recyclerView = o0Var5.f35016b;
            o0 o0Var6 = tVar.f17859s;
            o0Var6.getClass();
            int paddingLeft = o0Var6.f35016b.getPaddingLeft();
            o0 o0Var7 = tVar.f17859s;
            o0Var7.getClass();
            recyclerView.setPadding(paddingLeft, 0, o0Var7.f35016b.getPaddingRight(), tVar.f17855o);
        }
        return windowInsetsCompat;
    }

    public /* synthetic */ f(t tVar, int i11, MainActivity mainActivity) {
        this.f13618b = tVar;
        this.f13617a = i11;
        this.f13619c = mainActivity;
    }
}
