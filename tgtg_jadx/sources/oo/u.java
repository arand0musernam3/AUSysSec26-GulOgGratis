package oo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.app.tgtg.R;
import com.app.tgtg.feature.orderview.OrderRedeemer;
import kotlin.jvm.internal.FunctionReferenceImpl;
import pg.y2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class u extends FunctionReferenceImpl implements i80.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f32870a = new u(3, y2.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/app/tgtg/databinding/OrderRedeemBottomSheetBinding;", 0);

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.order_redeem_bottom_sheet, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i11 = R.id.animationView;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) pd.g.t(R.id.animationView, viewInflate);
        if (lottieAnimationView != null) {
            i11 = R.id.animationViewStep2;
            LottieAnimationView lottieAnimationView2 = (LottieAnimationView) pd.g.t(R.id.animationViewStep2, viewInflate);
            if (lottieAnimationView2 != null) {
                i11 = R.id.bigOrderIdRedeem;
                TextView textView = (TextView) pd.g.t(R.id.bigOrderIdRedeem, viewInflate);
                if (textView != null) {
                    i11 = R.id.collectionConfirmedLayout;
                    LinearLayout linearLayout = (LinearLayout) pd.g.t(R.id.collectionConfirmedLayout, viewInflate);
                    if (linearLayout != null) {
                        i11 = R.id.imClose;
                        ImageView imageView = (ImageView) pd.g.t(R.id.imClose, viewInflate);
                        if (imageView != null) {
                            i11 = R.id.infoTitle;
                            if (((TextView) pd.g.t(R.id.infoTitle, viewInflate)) != null) {
                                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) viewInflate;
                                i11 = R.id.orderInfoView;
                                RelativeLayout relativeLayout = (RelativeLayout) pd.g.t(R.id.orderInfoView, viewInflate);
                                if (relativeLayout != null) {
                                    i11 = R.id.orderRedeemer;
                                    OrderRedeemer orderRedeemer = (OrderRedeemer) pd.g.t(R.id.orderRedeemer, viewInflate);
                                    if (orderRedeemer != null) {
                                        i11 = R.id.specialRewardClaimedCard;
                                        if (((ComposeView) pd.g.t(R.id.specialRewardClaimedCard, viewInflate)) != null) {
                                            i11 = R.id.storeNameBottomSheet;
                                            TextView textView2 = (TextView) pd.g.t(R.id.storeNameBottomSheet, viewInflate);
                                            if (textView2 != null) {
                                                i11 = R.id.tapToCollectBtn;
                                                if (((Button) pd.g.t(R.id.tapToCollectBtn, viewInflate)) != null) {
                                                    i11 = R.id.tapToCollectView;
                                                    LinearLayout linearLayout2 = (LinearLayout) pd.g.t(R.id.tapToCollectView, viewInflate);
                                                    if (linearLayout2 != null) {
                                                        i11 = R.id.tvBottomSheetQuantityLabel;
                                                        TextView textView3 = (TextView) pd.g.t(R.id.tvBottomSheetQuantityLabel, viewInflate);
                                                        if (textView3 != null) {
                                                            i11 = R.id.tvBottomsheetItemName;
                                                            TextView textView4 = (TextView) pd.g.t(R.id.tvBottomsheetItemName, viewInflate);
                                                            if (textView4 != null) {
                                                                i11 = R.id.viewRedeem;
                                                                if (pd.g.t(R.id.viewRedeem, viewInflate) != null) {
                                                                    return new y2(coordinatorLayout, lottieAnimationView, lottieAnimationView2, textView, linearLayout, imageView, coordinatorLayout, relativeLayout, orderRedeemer, textView2, linearLayout2, textView3, textView4);
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
            }
        }
        c50.w.l("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
        return null;
    }
}
