package bg;

import android.app.Activity;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.app.tgtg.R;
import com.app.tgtg.feature.main.MainActivity;
import com.app.tgtg.model.remote.item.AverageItemRating;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.item.response.ItemState;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f6188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f6189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f6190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f6191d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f6192e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public BasicItem f6193f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f6194g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Integer f6195h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f6196i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public yk.d f6197j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ep.l f6198k;

    public l(MainActivity mainActivity) {
        this.f6188a = mainActivity;
    }

    public final PopupWindow a() {
        int i11;
        int i12;
        CharSequence charSequenceM;
        Activity activity = this.f6188a;
        if (activity == null || activity.isFinishing()) {
            return null;
        }
        e0 e0Var = new e0(activity);
        Point point = new Point();
        activity.getWindowManager().getDefaultDisplay().getSize(point);
        int iA = point.x - d70.b.a(32);
        int iA2 = point.y - d70.b.a(32);
        View.inflate(e0Var.getContext(), R.layout.cancelled_with_recommendation_popup, e0Var);
        e0Var.f6143a = iA2;
        final PopupWindow popupWindow = new PopupWindow(e0Var, iA, -2);
        TextView textView = (TextView) e0Var.findViewById(R.id.tvTitle);
        TextView textView2 = (TextView) e0Var.findViewById(R.id.tvDescription);
        TextView textView3 = (TextView) e0Var.findViewById(R.id.tvHelperText);
        CardView cardView = (CardView) e0Var.findViewById(R.id.clContainer);
        ImageView imageView = (ImageView) e0Var.findViewById(R.id.btnClose);
        Button button = (Button) e0Var.findViewById(R.id.btnPositive);
        ImageView imageView2 = (ImageView) e0Var.findViewById(R.id.ivCover);
        View viewFindViewById = e0Var.findViewById(R.id.recommendationContainer);
        TextView textView4 = (TextView) e0Var.findViewById(R.id.storeName);
        ImageView imageView3 = (ImageView) e0Var.findViewById(R.id.storeCoverImage);
        ImageView imageView4 = (ImageView) e0Var.findViewById(R.id.ivStoreLogo);
        LinearLayout linearLayout = (LinearLayout) e0Var.findViewById(R.id.gradient);
        TextView textView5 = (TextView) e0Var.findViewById(R.id.pickupTime);
        TextView textView6 = (TextView) e0Var.findViewById(R.id.itemName);
        TextView textView7 = (TextView) e0Var.findViewById(R.id.price);
        TextView textView8 = (TextView) e0Var.findViewById(R.id.distance);
        ImageView imageView5 = (ImageView) e0Var.findViewById(R.id.dynamicPricingImageView);
        TextView textView9 = (TextView) e0Var.findViewById(R.id.recommendationTitle);
        textView.getClass();
        String str = this.f6189b;
        if (str != null) {
            textView.setText(str);
        } else {
            textView.setVisibility(8);
        }
        int visibility = textView.getVisibility();
        final int i13 = 0;
        if (visibility == 8) {
            ViewGroup.LayoutParams layoutParams = textView2.getLayoutParams();
            layoutParams.getClass();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.setMargins(0, d70.b.a(24), 0, 0);
            textView2.setLayoutParams(layoutParams2);
        }
        Integer num = this.f6195h;
        if (num != null) {
            imageView2.setImageResource(num.intValue());
            i11 = 8;
        } else {
            i11 = 8;
            imageView2.setVisibility(8);
        }
        cardView.getClass();
        mv.d.x(cardView, new Function1(this) { // from class: bg.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f6155b;

            {
                this.f6155b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                View view = (View) obj;
                switch (i13) {
                    case 0:
                        view.getClass();
                        ep.l lVar = this.f6155b.f6198k;
                        if (lVar != null) {
                            lVar.invoke();
                        }
                        popupWindow.dismiss();
                        break;
                    default:
                        view.getClass();
                        yk.d dVar = this.f6155b.f6197j;
                        if (dVar != null) {
                            dVar.invoke();
                        }
                        popupWindow.dismiss();
                        break;
                }
                return Unit.f26487a;
            }
        });
        textView2.getClass();
        String str2 = this.f6190c;
        if (str2 != null) {
            textView2.setText(str2);
        } else {
            textView2.setVisibility(i11);
        }
        textView3.getClass();
        String str3 = this.f6192e;
        if (str3 != null) {
            textView3.setText(str3);
        } else {
            textView3.setVisibility(i11);
        }
        viewFindViewById.getClass();
        viewFindViewById.setVisibility(this.f6193f == null ? 8 : 0);
        button.getClass();
        button.setVisibility(this.f6193f == null ? 0 : 8);
        button.setText(this.f6191d);
        final int i14 = 1;
        mv.d.x(button, new Function1(this) { // from class: bg.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f6155b;

            {
                this.f6155b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                View view = (View) obj;
                switch (i14) {
                    case 0:
                        view.getClass();
                        ep.l lVar = this.f6155b.f6198k;
                        if (lVar != null) {
                            lVar.invoke();
                        }
                        popupWindow.dismiss();
                        break;
                    default:
                        view.getClass();
                        yk.d dVar = this.f6155b.f6197j;
                        if (dVar != null) {
                            dVar.invoke();
                        }
                        popupWindow.dismiss();
                        break;
                }
                return Unit.f26487a;
            }
        });
        BasicItem basicItem = this.f6193f;
        if (basicItem != null) {
            textView9.setText(this.f6194g ? activity.getString(R.string.collection_recommendation_title_manufacture) : activity.getString(R.string.collection_recommendation_title));
            if (mv.r0.v(mv.d.m(basicItem).getStoreNameAndBranch())) {
                textView4.setVisibility(4);
            } else {
                textView4.setText(mv.d.m(basicItem).getStoreNameAndBranch());
                textView4.setVisibility(0);
            }
            if (mv.r0.v(basicItem.getInformation().getCoverPicture().getCurrentUrl())) {
                imageView3.setImageResource(android.R.color.transparent);
            } else {
                String currentUrl = basicItem.getInformation().getCoverPicture().getCurrentUrl();
                imageView3.getClass();
                mv.r0.x(currentUrl, imageView3);
            }
            if (mv.r0.v(mv.d.k(basicItem).getCurrentUrl())) {
                imageView4.setImageResource(android.R.color.transparent);
            } else {
                String currentUrl2 = mv.d.k(basicItem).getCurrentUrl();
                imageView4.getClass();
                mv.r0.y(currentUrl2, imageView4, R.drawable.default_logo);
            }
            imageView3.setAlpha(mv.r0.t(basicItem) ? 1.0f : 0.4f);
            linearLayout.setAlpha(mv.r0.t(basicItem) ? 1.0f : 0.4f);
            textView5.getClass();
            textView5.setVisibility(0);
            boolean zB = mv.p0.B(mv.d.l(basicItem).getIntervalStart());
            int i15 = R.color.primary_30;
            textView5.setTextColor(activity.getColor(zB ? R.color.neutral_80 : R.color.primary_30));
            if (mv.d.j(basicItem) == ItemState.INACTIVE_TODAY || mv.d.l(basicItem).getIntervalStart() == null || mv.d.l(basicItem).getIntervalEnd() == null) {
                textView5.setText(activity.getString(R.string.store_item_label_closed));
            } else {
                if (mv.p0.A(mv.d.l(basicItem).getIntervalStart())) {
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    String string = activity.getString(R.string.discover_pickup_time_today);
                    string.getClass();
                    charSequenceM = String.format(string, Arrays.copyOf(new Object[]{mv.p0.u(activity, mv.d.l(basicItem))}, 1));
                } else if (mv.p0.C(mv.d.l(basicItem).getIntervalStart())) {
                    StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                    String string2 = activity.getString(R.string.discover_pickup_time_tomorrow);
                    string2.getClass();
                    charSequenceM = String.format(string2, Arrays.copyOf(new Object[]{mv.p0.u(activity, mv.d.l(basicItem))}, 1));
                } else {
                    charSequenceM = mv.p0.m(activity, mv.d.l(basicItem), mv.d.j(basicItem), true, false);
                }
                textView5.setText(charSequenceM);
            }
            textView6.setText(mv.r0.i(activity, basicItem));
            textView6.setVisibility(0);
            textView7.setText(mv.d.i(basicItem.getInformation().getDisplayPrice(), 1));
            if (!mv.r0.t(basicItem)) {
                i15 = R.color.neutral_60;
            }
            textView7.setTextColor(activity.getColor(i15));
            cardView.setContentDescription(mv.d.m(basicItem).getStoreNameAndBranch() + "... " + mv.r0.i(activity, basicItem) + "... " + ((Object) mv.r0.l(basicItem.getItemTags())) + ((CharSequence) mv.p0.m(activity, mv.d.l(basicItem), mv.d.j(basicItem), false, false)) + "... " + mv.d.h(basicItem.getDistance()) + "... " + mv.d.i(basicItem.getInformation().getDisplayPrice(), 1) + "... ");
            textView8.setText(mv.d.h(basicItem.getDistance()));
            if (basicItem.getDistance() == 0.0d) {
                textView8.setVisibility(8);
            } else {
                p30.b.E(textView8, true);
            }
            TextView textView10 = (TextView) e0Var.findViewById(R.id.itemRating);
            ImageView imageView6 = (ImageView) e0Var.findViewById(R.id.ratingIcon);
            View viewFindViewById2 = e0Var.findViewById(R.id.distanceSeparator);
            View viewFindViewById3 = e0Var.findViewById(R.id.space);
            if (basicItem.getInformation().getAverageItemRating() != null) {
                textView10.getClass();
                p30.b.E(textView10, true);
                imageView6.getClass();
                p30.b.E(imageView6, true);
                viewFindViewById2.getClass();
                p30.b.E(viewFindViewById2, true);
                viewFindViewById3.getClass();
                p30.b.E(viewFindViewById3, true);
                AverageItemRating averageItemRating = basicItem.getInformation().getAverageItemRating();
                String displayValue = averageItemRating != null ? averageItemRating.getDisplayValue() : null;
                if (displayValue == null) {
                    displayValue = "";
                }
                textView10.setText(displayValue);
                if (basicItem.getDistance() == 0.0d) {
                    i12 = 8;
                    viewFindViewById2.setVisibility(8);
                    viewFindViewById3.setVisibility(8);
                } else {
                    i12 = 8;
                    p30.b.E(viewFindViewById2, true);
                    p30.b.E(viewFindViewById3, true);
                }
            } else {
                i12 = 8;
                textView10.getClass();
                textView10.setVisibility(8);
                imageView6.getClass();
                imageView6.setVisibility(8);
                viewFindViewById2.getClass();
                viewFindViewById2.setVisibility(8);
                viewFindViewById3.getClass();
                viewFindViewById3.setVisibility(8);
            }
            imageView5.getClass();
            imageView5.setVisibility(basicItem.getInformation().getDynamicPriceInfo() != null ? 0 : i12);
        }
        imageView.getClass();
        mv.d.x(imageView, new i(popupWindow, 0));
        popupWindow.setOnDismissListener(new j());
        popupWindow.setFocusable(true);
        popupWindow.setOutsideTouchable(true);
        if (this.f6196i) {
            popupWindow.setAnimationStyle(R.anim.fade_in_duration_500);
        }
        try {
            View viewFindViewById4 = activity.findViewById(android.R.id.content);
            viewFindViewById4.post(new k(popupWindow, viewFindViewById4, 0));
            return popupWindow;
        } catch (Throwable th2) {
            mv.m0 m0Var = sa0.a.f38953a;
            m0Var.h("CHANGED_ORDER");
            m0Var.a("Throwable, " + th2, new Object[0]);
            return null;
        }
    }
}
