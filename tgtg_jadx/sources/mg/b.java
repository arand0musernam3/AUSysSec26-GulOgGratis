package mg;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.tgtg.customview.npsratingview.NpsRatingView;
import pg.p2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29936a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f29937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f29938c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f29939d;

    public /* synthetic */ b(a aVar, g gVar, int i11) {
        this.f29937b = aVar;
        this.f29938c = gVar;
        this.f29939d = i11;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f29936a) {
            case 0:
                g gVar = this.f29938c;
                gVar.f29953c = true;
                p2 p2Var = gVar.f29951a;
                NpsRatingView npsRatingView = gVar.f29954d;
                a aVar = this.f29937b;
                int i11 = this.f29939d;
                if (npsRatingView != null) {
                    npsRatingView.q(aVar, i11);
                }
                Object systemService = p2Var.f986f.getContext().getSystemService("input_method");
                systemService.getClass();
                ((InputMethodManager) systemService).hideSoftInputFromWindow(p2Var.f986f.getWindowToken(), 0);
                ConstraintLayout constraintLayout = (ConstraintLayout) p2Var.f35069u.f29922b;
                constraintLayout.getClass();
                View view2 = p2Var.f35073y.f986f;
                view2.getClass();
                gVar.e(constraintLayout, view2, aVar, false, j.ViewStateRating, i11);
                break;
            default:
                g gVar2 = this.f29938c;
                String string = ((EditText) gVar2.f29951a.f35069u.f29924d).getText().toString();
                a aVar2 = this.f29937b;
                aVar2.f29932e = string;
                p2 p2Var2 = gVar2.f29951a;
                Object systemService2 = p2Var2.f986f.getContext().getSystemService("input_method");
                systemService2.getClass();
                ((InputMethodManager) systemService2).hideSoftInputFromWindow(p2Var2.f986f.getWindowToken(), 0);
                ConstraintLayout constraintLayout2 = (ConstraintLayout) p2Var2.f35069u.f29922b;
                constraintLayout2.getClass();
                View view3 = p2Var2.f35074z.f986f;
                view3.getClass();
                gVar2.e(constraintLayout2, view3, aVar2, true, j.ViewStateThankYou, this.f29939d);
                break;
        }
    }

    public /* synthetic */ b(g gVar, a aVar, int i11) {
        this.f29938c = gVar;
        this.f29937b = aVar;
        this.f29939d = i11;
    }
}
