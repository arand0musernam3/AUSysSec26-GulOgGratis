package sr;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import bg.n0;
import com.app.tgtg.R;
import com.app.tgtg.feature.tabprofile.manageaccount.contactus.ContactUsActivity;
import com.app.tgtg.model.remote.brief.BriefItemInfo;
import com.app.tgtg.model.remote.brief.BriefOrder;
import com.app.tgtg.model.remote.brief.BriefStoreInfo;
import com.app.tgtg.model.remote.order.OrderType;
import java.text.ParseException;
import mv.p0;
import mv.r0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i extends ConstraintLayout {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f39104c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pg.u f39105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ContactUsActivity f39106b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ContactUsActivity contactUsActivity, Context context) {
        super(context);
        context.getClass();
        this.f39106b = contactUsActivity;
        View viewInflate = contactUsActivity.getLayoutInflater().inflate(R.layout.contact_us_receipt_item, (ViewGroup) this, false);
        addView(viewInflate);
        int i11 = R.id.ivLogo;
        ImageView imageView = (ImageView) pd.g.t(R.id.ivLogo, viewInflate);
        if (imageView != null) {
            i11 = R.id.tvOrderDate;
            TextView textView = (TextView) pd.g.t(R.id.tvOrderDate, viewInflate);
            if (textView != null) {
                i11 = R.id.tvStoreName;
                TextView textView2 = (TextView) pd.g.t(R.id.tvStoreName, viewInflate);
                if (textView2 != null) {
                    this.f39105a = new pg.u((ConstraintLayout) viewInflate, imageView, textView, textView2, 0);
                    return;
                }
            }
        }
        c50.w.l("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
        throw null;
    }

    public final void j(BriefOrder briefOrder, boolean z11) {
        String storeLogoUrl;
        briefOrder.getClass();
        OrderType orderType = briefOrder.getOrderType();
        OrderType orderType2 = OrderType.MANUFACTURER;
        pg.u uVar = this.f39105a;
        if (orderType == orderType2) {
            TextView textView = uVar.f35181e;
            BriefItemInfo briefItemInfo = briefOrder.getBriefItemInfo();
            textView.setText(briefItemInfo != null ? briefItemInfo.getItemName() : null);
            BriefStoreInfo briefStoreInfo = briefOrder.getBriefStoreInfo();
            if (briefStoreInfo == null || (storeLogoUrl = briefStoreInfo.getStoreLogoUrl()) == null) {
                BriefItemInfo briefItemInfo2 = briefOrder.getBriefItemInfo();
                if (briefItemInfo2 != null) {
                    itemLogoUrl = briefItemInfo2.getItemLogoUrl();
                }
            } else {
                itemLogoUrl = storeLogoUrl;
            }
            r0.y(itemLogoUrl, uVar.f35179c, R.drawable.default_logo);
        } else {
            TextView textView2 = uVar.f35181e;
            BriefStoreInfo briefStoreInfo2 = briefOrder.getBriefStoreInfo();
            textView2.setText(briefStoreInfo2 != null ? briefStoreInfo2.getStoreDisplayName() : null);
            BriefStoreInfo briefStoreInfo3 = briefOrder.getBriefStoreInfo();
            if ((briefStoreInfo3 != null ? briefStoreInfo3.getStoreLogoUrl() : null) != null) {
                r0.y(briefOrder.getBriefStoreInfo().getStoreLogoUrl(), uVar.f35179c, R.drawable.default_logo);
            }
        }
        try {
            TextView textView3 = uVar.f35180d;
            Context context = getContext();
            context.getClass();
            textView3.setText(p0.c(context, briefOrder.getTimeOfPurchase()));
        } catch (ParseException e5) {
            uVar.f35180d.setText(briefOrder.getTimeOfPurchase());
            sa0.a.f38953a.d(e5);
        }
        if (z11) {
            setOnClickListener(new n0(17, this.f39106b, briefOrder));
        }
    }

    public final void setInactive() {
        pg.u uVar = this.f39105a;
        uVar.f35181e.setTextColor(getContext().getColor(R.color.neutral_40));
        uVar.f35180d.setTextColor(getContext().getColor(R.color.neutral_40));
        setOnClickListener(null);
    }
}
