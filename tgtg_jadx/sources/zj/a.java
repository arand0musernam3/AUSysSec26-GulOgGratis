package zj;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import c50.w;
import com.app.tgtg.R;
import p70.k;
import pg.b1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b1 f47930a;

    public a(k kVar, int i11, boolean z11) {
        super(kVar, null, 0);
        View viewInflate = LayoutInflater.from(kVar).inflate(R.layout.filters_radio_button_item, (ViewGroup) this, false);
        addView(viewInflate);
        int i12 = R.id.checked;
        RadioButton radioButton = (RadioButton) pd.g.t(R.id.checked, viewInflate);
        if (radioButton != null) {
            i12 = R.id.icon;
            ImageView imageView = (ImageView) pd.g.t(R.id.icon, viewInflate);
            if (imageView != null) {
                i12 = R.id.title;
                TextView textView = (TextView) pd.g.t(R.id.title, viewInflate);
                if (textView != null) {
                    this.f47930a = new b1((ConstraintLayout) viewInflate, radioButton, imageView, textView, 0);
                    imageView.setVisibility(8);
                    textView.setText(getResources().getText(i11));
                    a(z11);
                    return;
                }
            }
        }
        w.l("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i12)));
        throw null;
    }

    public final void a(boolean z11) {
        b1 b1Var = this.f47930a;
        ((RadioButton) b1Var.f34796d).setChecked(z11);
        ((TextView) b1Var.f34795c).setTextAppearance(z11 ? R.style.Body1_Bold_Green : R.style.Body1_Gray);
        RadioButton radioButton = (RadioButton) b1Var.f34796d;
        Context context = getContext();
        int i11 = R.color.neutral_40;
        radioButton.setButtonTintList(ColorStateList.valueOf(context.getColor(z11 ? R.color.primary_30 : R.color.neutral_40)));
        ImageView imageView = (ImageView) b1Var.f34797e;
        Context context2 = getContext();
        if (z11) {
            i11 = R.color.primary_30;
        }
        imageView.setImageTintList(ColorStateList.valueOf(context2.getColor(i11)));
    }
}
