package zm;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.o0;
import c50.w;
import com.app.tgtg.R;
import com.app.tgtg.feature.main.fragments.delivery.parcelfeed.about.ManufacturerAboutActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import pg.b1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzm/c;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public pg.a f47990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ManufacturerAboutActivity f47991b;

    public final void o(final CardView cardView, final TextView textView, final int i11) {
        cardView.setActivated(false);
        cardView.setOnClickListener(new View.OnClickListener() { // from class: zm.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CardView cardView2 = cardView;
                cardView2.setClickable(true);
                boolean zIsActivated = cardView2.isActivated();
                c cVar = this;
                TextView textView2 = textView;
                int i12 = i11;
                ManufacturerAboutActivity manufacturerAboutActivity = null;
                if (zIsActivated) {
                    cardView2.setCardBackgroundColor(cVar.requireContext().getColor(R.color.neutral_10));
                    textView2.setTextColor(cVar.requireContext().getColor(R.color.primary_30));
                    cardView2.setActivated(false);
                    ManufacturerAboutActivity manufacturerAboutActivity2 = cVar.f47991b;
                    if (manufacturerAboutActivity2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("answerCallback");
                    } else {
                        manufacturerAboutActivity = manufacturerAboutActivity2;
                    }
                    manufacturerAboutActivity.f9124h[i12] = Boolean.FALSE;
                    return;
                }
                cardView2.setCardBackgroundColor(cVar.requireContext().getColor(R.color.primary_30));
                textView2.setTextColor(cVar.requireContext().getColor(R.color.neutral_10));
                cardView2.setActivated(true);
                ManufacturerAboutActivity manufacturerAboutActivity3 = cVar.f47991b;
                if (manufacturerAboutActivity3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("answerCallback");
                } else {
                    manufacturerAboutActivity = manufacturerAboutActivity3;
                }
                manufacturerAboutActivity.f9124h[i12] = Boolean.TRUE;
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.manufacturer_about2, viewGroup, false);
        int i11 = R.id.about2BodyTv;
        if (((AppCompatTextView) pd.g.t(R.id.about2BodyTv, viewInflate)) != null) {
            i11 = R.id.about2Button0;
            View viewT = pd.g.t(R.id.about2Button0, viewInflate);
            if (viewT != null) {
                b1 b1VarA = b1.a(viewT);
                i11 = R.id.about2Button1;
                View viewT2 = pd.g.t(R.id.about2Button1, viewInflate);
                if (viewT2 != null) {
                    b1 b1VarA2 = b1.a(viewT2);
                    i11 = R.id.about2Button2;
                    View viewT3 = pd.g.t(R.id.about2Button2, viewInflate);
                    if (viewT3 != null) {
                        b1 b1VarA3 = b1.a(viewT3);
                        i11 = R.id.about2Button3;
                        View viewT4 = pd.g.t(R.id.about2Button3, viewInflate);
                        if (viewT4 != null) {
                            b1 b1VarA4 = b1.a(viewT4);
                            i11 = R.id.about2Button4;
                            View viewT5 = pd.g.t(R.id.about2Button4, viewInflate);
                            if (viewT5 != null) {
                                b1 b1VarA5 = b1.a(viewT5);
                                i11 = R.id.about2TitleTv;
                                if (((AppCompatTextView) pd.g.t(R.id.about2TitleTv, viewInflate)) != null) {
                                    i11 = R.id.topGuide;
                                    if (((Guideline) pd.g.t(R.id.topGuide, viewInflate)) != null) {
                                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                        this.f47990a = new pg.a(constraintLayout, b1VarA, b1VarA2, b1VarA3, b1VarA4, b1VarA5, 3);
                                        constraintLayout.getClass();
                                        return constraintLayout;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        w.l("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Resources resources;
        view.getClass();
        super.onViewCreated(view, bundle);
        if (getActivity() instanceof ManufacturerAboutActivity) {
            o0 activity = getActivity();
            activity.getClass();
            this.f47991b = (ManufacturerAboutActivity) activity;
        }
        pg.a aVar = this.f47990a;
        aVar.getClass();
        b1 b1Var = (b1) aVar.f34761c;
        TextView textView = (TextView) b1Var.f34795c;
        textView.setText(getString(R.string.mnu_about2_button0));
        b1 b1Var2 = (b1) aVar.f34762d;
        TextView textView2 = (TextView) b1Var2.f34795c;
        textView2.setText(getString(R.string.mnu_about2_button1));
        b1 b1Var3 = (b1) aVar.f34763e;
        TextView textView3 = (TextView) b1Var3.f34795c;
        textView3.setText(getString(R.string.mnu_about2_button2));
        b1 b1Var4 = (b1) aVar.f34764f;
        TextView textView4 = (TextView) b1Var4.f34795c;
        textView4.setText(getString(R.string.mnu_about2_button3_v2));
        b1 b1Var5 = (b1) aVar.f34765g;
        TextView textView5 = (TextView) b1Var5.f34795c;
        textView5.setText(getString(R.string.mnu_about2_button4));
        o((CardView) b1Var.f34797e, textView, 0);
        o((CardView) b1Var2.f34797e, textView2, 1);
        o((CardView) b1Var3.f34797e, textView3, 2);
        o((CardView) b1Var4.f34797e, textView4, 3);
        o((CardView) b1Var5.f34797e, textView5, 4);
        Context context = getContext();
        Configuration configuration = (context == null || (resources = context.getResources()) == null) ? null : resources.getConfiguration();
        Integer numValueOf = configuration != null ? Integer.valueOf(d70.b.b(Integer.valueOf(configuration.screenWidthDp))) : null;
        Integer numValueOf2 = configuration != null ? Integer.valueOf(d70.b.b(Integer.valueOf(configuration.screenHeightDp))) : null;
        sa0.a.f38953a.a("width = " + numValueOf + ",    height = " + numValueOf2, new Object[0]);
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            if (numValueOf2 != null) {
                int iIntValue2 = numValueOf2.intValue();
                if (iIntValue < 1060 || iIntValue2 < 2000) {
                    pg.a aVar2 = this.f47990a;
                    aVar2.getClass();
                    ((ConstraintLayout) ((b1) aVar2.f34761c).f34794b).setPadding(d70.b.a(8), d70.b.a(8), d70.b.a(8), d70.b.a(8));
                    ((ConstraintLayout) ((b1) aVar2.f34762d).f34794b).setPadding(d70.b.a(8), d70.b.a(8), d70.b.a(8), d70.b.a(8));
                    ((ConstraintLayout) ((b1) aVar2.f34763e).f34794b).setPadding(d70.b.a(8), d70.b.a(8), d70.b.a(8), d70.b.a(8));
                    ((ConstraintLayout) ((b1) aVar2.f34764f).f34794b).setPadding(d70.b.a(8), d70.b.a(8), d70.b.a(8), d70.b.a(8));
                    ((ConstraintLayout) ((b1) aVar2.f34765g).f34794b).setPadding(d70.b.a(8), d70.b.a(8), d70.b.a(8), d70.b.a(8));
                }
            }
        }
    }
}
