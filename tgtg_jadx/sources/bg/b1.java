package bg;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.adyen.checkout.components.core.action.Action;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.order.response.PaymentProvider;
import com.app.tgtg.model.remote.payment.EdenredPayload;
import com.app.tgtg.model.remote.payment.SatispayPayload;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lbg/b1;", "Landroidx/fragment/app/y;", "<init>", "()V", "en/g", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWaitingThirdPartyView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WaitingThirdPartyView.kt\ncom/app/tgtg/customview/WaitingThirdPartyView\n+ 2 Extensions.kt\ncom/app/tgtg/util/ExtensionsKt\n*L\n1#1,233:1\n26#2,7:234\n*S KotlinDebug\n*F\n+ 1 WaitingThirdPartyView.kt\ncom/app/tgtg/customview/WaitingThirdPartyView\n*L\n102#1:234,7\n*E\n"})
public final class b1 extends a0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public cv.b f6125f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public pg.k f6126g;

    public static void r(b1 b1Var, PaymentProvider paymentProvider, Action action, SatispayPayload satispayPayload, EdenredPayload edenredPayload, int i11) {
        Action action2 = (i11 & 2) != 0 ? null : action;
        SatispayPayload satispayPayload2 = (i11 & 4) != 0 ? null : satispayPayload;
        EdenredPayload edenredPayload2 = (i11 & 8) != 0 ? null : edenredPayload;
        b1Var.getClass();
        paymentProvider.getClass();
        pg.k kVar = b1Var.f6126g;
        if (kVar != null) {
            ((Button) kVar.f34930d).setVisibility(0);
        }
        pg.k kVar2 = b1Var.f6126g;
        if (kVar2 != null) {
            ((Button) kVar2.f34930d).setEnabled(true);
        }
        pg.k kVar3 = b1Var.f6126g;
        if (kVar3 != null) {
            mv.d.x((Button) kVar3.f34930d, new a1(b1Var, paymentProvider, action2, satispayPayload2, edenredPayload2, 0));
        }
    }

    @Override // androidx.fragment.app.y, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, R.style.full_screen_dialog);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View viewInflate = layoutInflater.inflate(R.layout.wait_for_third_party_view, viewGroup, false);
        int i11 = R.id.btnCancel;
        Button button = (Button) pd.g.t(R.id.btnCancel, viewInflate);
        if (button != null) {
            i11 = R.id.btnCheckPaymentStatus;
            Button button2 = (Button) pd.g.t(R.id.btnCheckPaymentStatus, viewInflate);
            if (button2 != null) {
                i11 = R.id.description_middle;
                TextView textView = (TextView) pd.g.t(R.id.description_middle, viewInflate);
                if (textView != null) {
                    i11 = R.id.description_top;
                    if (((TextView) pd.g.t(R.id.description_top, viewInflate)) != null) {
                        i11 = R.id.paymentLogo;
                        ImageView imageView = (ImageView) pd.g.t(R.id.paymentLogo, viewInflate);
                        if (imageView != null) {
                            i11 = R.id.title;
                            if (((TextView) pd.g.t(R.id.title, viewInflate)) != null) {
                                i11 = R.id.topGuideLine;
                                if (((Guideline) pd.g.t(R.id.topGuideLine, viewInflate)) != null) {
                                    i11 = R.id.tvHeader;
                                    if (((TextView) pd.g.t(R.id.tvHeader, viewInflate)) != null) {
                                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                        this.f6126g = new pg.k(constraintLayout, button, button2, textView, imageView, 4);
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
        c50.w.l("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
        return null;
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

    /* JADX WARN: Removed duplicated region for block: B:40:0x0102  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r7, android.os.Bundle r8) {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bg.b1.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
