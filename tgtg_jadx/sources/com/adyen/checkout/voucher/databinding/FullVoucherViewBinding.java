package com.adyen.checkout.voucher.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.recyclerview.widget.RecyclerView;
import c50.w;
import com.adyen.checkout.ui.core.internal.ui.view.RoundCornerImageView;
import com.adyen.checkout.voucher.R;
import com.google.android.material.button.MaterialButton;
import pd.g;
import sa.a;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class FullVoucherViewBinding implements a {

    @NonNull
    public final MaterialButton buttonCopyCode;

    @NonNull
    public final MaterialButton buttonDownloadPdf;

    @NonNull
    public final MaterialButton buttonSaveImage;

    @NonNull
    public final RoundCornerImageView imageViewLogo;

    @NonNull
    public final Flow layoutButtons;

    @NonNull
    public final View paymentReferenceSeparator;

    @NonNull
    public final View paymentReferenceSeparator2;

    @NonNull
    public final RecyclerView recyclerViewInformationFields;

    @NonNull
    private final View rootView;

    @NonNull
    public final Space spaceButtons;

    @NonNull
    public final Space spaceInformationFields;

    @NonNull
    public final TextView textViewAmount;

    @NonNull
    public final TextView textViewIntroduction;

    @NonNull
    public final TextView textViewPaymentReference;

    @NonNull
    public final TextView textViewReadInstructions;

    @NonNull
    public final TextView textViewReferenceCode;

    private FullVoucherViewBinding(@NonNull View view, @NonNull MaterialButton materialButton, @NonNull MaterialButton materialButton2, @NonNull MaterialButton materialButton3, @NonNull RoundCornerImageView roundCornerImageView, @NonNull Flow flow, @NonNull View view2, @NonNull View view3, @NonNull RecyclerView recyclerView, @NonNull Space space, @NonNull Space space2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5) {
        this.rootView = view;
        this.buttonCopyCode = materialButton;
        this.buttonDownloadPdf = materialButton2;
        this.buttonSaveImage = materialButton3;
        this.imageViewLogo = roundCornerImageView;
        this.layoutButtons = flow;
        this.paymentReferenceSeparator = view2;
        this.paymentReferenceSeparator2 = view3;
        this.recyclerViewInformationFields = recyclerView;
        this.spaceButtons = space;
        this.spaceInformationFields = space2;
        this.textViewAmount = textView;
        this.textViewIntroduction = textView2;
        this.textViewPaymentReference = textView3;
        this.textViewReadInstructions = textView4;
        this.textViewReferenceCode = textView5;
    }

    @NonNull
    public static FullVoucherViewBinding bind(@NonNull View view) {
        View viewT;
        View viewT2;
        int i11 = R.id.button_copyCode;
        MaterialButton materialButton = (MaterialButton) g.t(i11, view);
        if (materialButton != null) {
            i11 = R.id.button_downloadPdf;
            MaterialButton materialButton2 = (MaterialButton) g.t(i11, view);
            if (materialButton2 != null) {
                i11 = R.id.button_saveImage;
                MaterialButton materialButton3 = (MaterialButton) g.t(i11, view);
                if (materialButton3 != null) {
                    i11 = R.id.imageView_logo;
                    RoundCornerImageView roundCornerImageView = (RoundCornerImageView) g.t(i11, view);
                    if (roundCornerImageView != null) {
                        i11 = R.id.layout_buttons;
                        Flow flow = (Flow) g.t(i11, view);
                        if (flow != null && (viewT = g.t((i11 = R.id.paymentReferenceSeparator), view)) != null && (viewT2 = g.t((i11 = R.id.paymentReferenceSeparator2), view)) != null) {
                            i11 = R.id.recyclerView_informationFields;
                            RecyclerView recyclerView = (RecyclerView) g.t(i11, view);
                            if (recyclerView != null) {
                                i11 = R.id.space_buttons;
                                Space space = (Space) g.t(i11, view);
                                if (space != null) {
                                    i11 = R.id.space_informationFields;
                                    Space space2 = (Space) g.t(i11, view);
                                    if (space2 != null) {
                                        i11 = R.id.textView_amount;
                                        TextView textView = (TextView) g.t(i11, view);
                                        if (textView != null) {
                                            i11 = R.id.textView_introduction;
                                            TextView textView2 = (TextView) g.t(i11, view);
                                            if (textView2 != null) {
                                                i11 = R.id.textView_paymentReference;
                                                TextView textView3 = (TextView) g.t(i11, view);
                                                if (textView3 != null) {
                                                    i11 = R.id.textView_readInstructions;
                                                    TextView textView4 = (TextView) g.t(i11, view);
                                                    if (textView4 != null) {
                                                        i11 = R.id.textView_reference_code;
                                                        TextView textView5 = (TextView) g.t(i11, view);
                                                        if (textView5 != null) {
                                                            return new FullVoucherViewBinding(view, materialButton, materialButton2, materialButton3, roundCornerImageView, flow, viewT, viewT2, recyclerView, space, space2, textView, textView2, textView3, textView4, textView5);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        w.l("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
        return null;
    }

    @NonNull
    public static FullVoucherViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.full_voucher_view, viewGroup);
            return bind(viewGroup);
        }
        w.l("parent");
        return null;
    }

    @Override // sa.a
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
