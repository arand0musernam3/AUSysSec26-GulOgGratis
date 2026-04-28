package bg;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.airbnb.lottie.LottieAnimationView;
import com.app.tgtg.R;
import com.braze.models.inappmessage.InAppMessageBase;
import kotlin.Metadata;
import org.bouncycastle.i18n.MessageBundle;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lbg/g0;", "Landroidx/fragment/app/y;", "<init>", "()V", "en/g", "lz/i", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g0 extends androidx.fragment.app.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public pg.b1 f6153a;

    @Override // androidx.fragment.app.y, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, R.style.full_screen_dialog);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View viewInflate = layoutInflater.inflate(R.layout.payment_error, viewGroup, false);
        int i11 = R.id.description;
        TextView textView = (TextView) pd.g.t(R.id.description, viewInflate);
        if (textView != null) {
            i11 = R.id.errorImage;
            if (((LottieAnimationView) pd.g.t(R.id.errorImage, viewInflate)) != null) {
                i11 = R.id.guide50;
                if (((Guideline) pd.g.t(R.id.guide50, viewInflate)) != null) {
                    i11 = R.id.okBtn;
                    Button button = (Button) pd.g.t(R.id.okBtn, viewInflate);
                    if (button != null) {
                        i11 = R.id.title;
                        TextView textView2 = (TextView) pd.g.t(R.id.title, viewInflate);
                        if (textView2 != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                            this.f6153a = new pg.b1(constraintLayout, textView, button, textView2);
                            constraintLayout.getClass();
                            return constraintLayout;
                        }
                    }
                }
            }
        }
        c50.w.l("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
        return null;
    }

    @Override // androidx.fragment.app.y, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f6153a = null;
    }

    @Override // androidx.fragment.app.y, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        yi.f0 f0VarB;
        dialogInterface.getClass();
        super.onDismiss(dialogInterface);
        androidx.fragment.app.o0 activity = getActivity();
        if (activity instanceof en.g) {
            en.g gVar = (en.g) activity;
            if (gVar.isFinishing() || gVar.isDestroyed() || (f0VarB = gVar.B()) == null || !f0VarB.isAdded()) {
                return;
            }
            f0VarB.dismiss();
        }
    }

    @Override // androidx.fragment.app.y, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null) {
            Window window = dialog.getWindow();
            window.getClass();
            window.setLayout(-1, -1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        Window window = dialog != null ? dialog.getWindow() : null;
        window.getClass();
        window.setWindowAnimations(R.style.waiting_third_party_popup_animation);
        Object obj = requireArguments().get(MessageBundle.TITLE_ENTRY);
        pg.b1 b1Var = this.f6153a;
        if (obj != null) {
            b1Var.getClass();
            ((TextView) b1Var.f34797e).setText(requireActivity().getString(requireArguments().getInt(MessageBundle.TITLE_ENTRY)));
        } else {
            b1Var.getClass();
            ((TextView) b1Var.f34797e).setText("");
        }
        if (requireArguments().get(InAppMessageBase.MESSAGE) != null) {
            pg.b1 b1Var2 = this.f6153a;
            b1Var2.getClass();
            ((TextView) b1Var2.f34795c).setText(requireActivity().getString(requireArguments().getInt(InAppMessageBase.MESSAGE)));
        } else if (requireArguments().get("message_text") != null) {
            pg.b1 b1Var3 = this.f6153a;
            b1Var3.getClass();
            ((TextView) b1Var3.f34795c).setText(requireArguments().getString("message_text"));
        }
        if (requireArguments().get("button_text") != null) {
            pg.b1 b1Var4 = this.f6153a;
            b1Var4.getClass();
            ((Button) b1Var4.f34796d).setText(requireArguments().getInt("button_text"));
        }
        requireArguments().getBoolean("close_on_dismiss", false);
        pg.b1 b1Var5 = this.f6153a;
        b1Var5.getClass();
        ((Button) b1Var5.f34796d).setOnClickListener(new ax.s(this, 3));
    }
}
