package jg;

import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.app.tgtg.R;
import pg.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l1 f25207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c40.q f25208b;

    /* JADX WARN: Illegal instructions before constructor call */
    public m(l1 l1Var, c40.q qVar) {
        l1Var.getClass();
        qVar.getClass();
        View view = l1Var.f986f;
        view.getClass();
        super(view);
        this.f25207a = l1Var;
        this.f25208b = qVar;
    }

    @Override // jg.k
    public final void a(p pVar, boolean z11) {
        pVar.getClass();
        a aVar = pVar.f25213a;
        if (aVar == null) {
            return;
        }
        l1 l1Var = this.f25207a;
        TextView textView = l1Var.f34973t;
        LinearLayout linearLayout = l1Var.f34974u;
        TextView textView2 = l1Var.f34973t;
        ImageView imageView = l1Var.f34975v;
        View view = l1Var.f986f;
        TextView textView3 = l1Var.f34972s;
        textView.setText(aVar.f25142b);
        textView3.setText("(" + aVar.f25141a + ")");
        if (aVar.f25144d) {
            textView3.setTextAppearance(R.style.Body1_Green);
            if (z11) {
                linearLayout.setPadding(d70.b.a(8), d70.b.a(2), 0, d70.b.a(2));
                textView2.setTextAppearance(R.style.Body1_Green);
                Resources resources = view.getResources();
                ThreadLocal threadLocal = w6.j.f43256a;
                view.setBackgroundColor(resources.getColor(R.color.beige_10, null));
                imageView.setVisibility(8);
            } else {
                linearLayout.setPadding(d70.b.a(8), 0, 0, 0);
                textView2.setTextAppearance(R.style.Body1_Bold_Green);
                Resources resources2 = view.getResources();
                ThreadLocal threadLocal2 = w6.j.f43256a;
                view.setBackgroundColor(resources2.getColor(R.color.white, null));
                imageView.setVisibility(0);
            }
        } else {
            linearLayout.setPadding(0, 0, 0, 0);
            imageView.setVisibility(8);
            textView2.setTextAppearance(R.style.Body1_Black);
            textView3.setTextAppearance(R.style.Body1_Black);
            Resources resources3 = view.getResources();
            ThreadLocal threadLocal3 = w6.j.f43256a;
            view.setBackgroundColor(resources3.getColor(R.color.white, null));
        }
        view.getClass();
        mv.d.x(view, new hb0.o(15, this, pVar));
    }
}
