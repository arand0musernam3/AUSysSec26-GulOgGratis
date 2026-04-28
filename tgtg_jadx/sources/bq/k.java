package bq;

import android.content.Context;
import android.text.format.DateUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import c50.w;
import com.app.tgtg.R;
import com.app.tgtg.customview.TagContainerView;
import com.app.tgtg.model.remote.item.ItemTagInfo;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.item.response.ItemState;
import java.util.List;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;
import lq.m;
import mv.p0;
import mv.q0;
import mv.r0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class k extends m {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f6611i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f6612j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static Boolean f6613k;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final pg.b f6614h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        context.getClass();
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.store_view_item_view, (ViewGroup) this, false);
        addView(viewInflate);
        int i12 = R.id.arrow;
        if (((ImageView) pd.g.t(R.id.arrow, viewInflate)) != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
            i12 = R.id.cvTags;
            TagContainerView tagContainerView = (TagContainerView) pd.g.t(R.id.cvTags, viewInflate);
            if (tagContainerView != null) {
                i12 = R.id.distance;
                TextView textView = (TextView) pd.g.t(R.id.distance, viewInflate);
                if (textView != null) {
                    i12 = R.id.itemInfo;
                    TextView textView2 = (TextView) pd.g.t(R.id.itemInfo, viewInflate);
                    if (textView2 != null) {
                        i12 = R.id.itemName;
                        TextView textView3 = (TextView) pd.g.t(R.id.itemName, viewInflate);
                        if (textView3 != null) {
                            i12 = R.id.itemPrice;
                            TextView textView4 = (TextView) pd.g.t(R.id.itemPrice, viewInflate);
                            if (textView4 != null) {
                                i12 = R.id.llItemInfo;
                                LinearLayout linearLayout = (LinearLayout) pd.g.t(R.id.llItemInfo, viewInflate);
                                if (linearLayout != null) {
                                    i12 = R.id.logo;
                                    ImageView imageView = (ImageView) pd.g.t(R.id.logo, viewInflate);
                                    if (imageView != null) {
                                        i12 = R.id.rlStoreLogo;
                                        if (((RelativeLayout) pd.g.t(R.id.rlStoreLogo, viewInflate)) != null) {
                                            i12 = R.id.storeName;
                                            TextView textView5 = (TextView) pd.g.t(R.id.storeName, viewInflate);
                                            if (textView5 != null) {
                                                i12 = R.id.titleAndStatus;
                                                if (((ConstraintLayout) pd.g.t(R.id.titleAndStatus, viewInflate)) != null) {
                                                    i12 = R.id.tvBagCount;
                                                    AppCompatTextView appCompatTextView = (AppCompatTextView) pd.g.t(R.id.tvBagCount, viewInflate);
                                                    if (appCompatTextView != null) {
                                                        this.f6614h = new pg.b(constraintLayout, constraintLayout, tagContainerView, textView, textView2, textView3, textView4, linearLayout, imageView, textView5, appCompatTextView);
                                                        b();
                                                        return;
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
        w.l("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i12)));
        throw null;
    }

    private final void setItemAvailability(BasicItem basicItem) {
        AppCompatTextView appCompatTextView = (AppCompatTextView) this.f6614h.l;
        if (r0.t(basicItem) && basicItem.getItemsAvailable() < 5) {
            appCompatTextView.setText(String.valueOf(basicItem.getItemsAvailable()));
            appCompatTextView.setVisibility(0);
            appCompatTextView.setTextColor(appCompatTextView.getContext().getColor(R.color.primary_40));
            appCompatTextView.setBackground(appCompatTextView.getContext().getDrawable(R.drawable.yellow_round_circle_with_border));
            return;
        }
        if (r0.t(basicItem)) {
            appCompatTextView.setVisibility(8);
            return;
        }
        appCompatTextView.setText("-");
        appCompatTextView.setVisibility(0);
        appCompatTextView.setTextColor(appCompatTextView.getContext().getColor(R.color.neutral_70));
        appCompatTextView.setBackground(appCompatTextView.getContext().getDrawable(R.drawable.gray_round_circle_with_border));
    }

    private final void setTags(BasicItem basicItem) {
        pg.b bVar = this.f6614h;
        TagContainerView tagContainerView = (TagContainerView) bVar.f34784e;
        List<ItemTagInfo> itemTags = basicItem.getItemTags();
        if (itemTags == null) {
            itemTags = n0.f26529a;
        }
        tagContainerView.setTags(itemTags);
        TagContainerView tagContainerView2 = (TagContainerView) bVar.f34784e;
        List<ItemTagInfo> itemTags2 = basicItem.getItemTags();
        tagContainerView2.setVisibility((itemTags2 == null || itemTags2.isEmpty()) ? 8 : 0);
    }

    @Override // lq.m
    public final void b() {
        setItemContainer(findViewById(R.id.clContainer));
        if (f6613k == null) {
            Context context = getContext();
            context.getClass();
            f6613k = Boolean.valueOf(r0.r(context));
        }
    }

    @Override // lq.m
    @Nullable
    public mq.a getItem() {
        return super.getItem();
    }

    @Override // lq.m
    public void setItem(@Nullable mq.a aVar) {
        super.setItem(aVar);
        BasicItem basicItem = aVar instanceof BasicItem ? (BasicItem) aVar : null;
        if (basicItem == null) {
            return;
        }
        pg.b bVar = this.f6614h;
        ImageView imageView = (ImageView) bVar.f34789j;
        TextView textView = (TextView) bVar.f34788i;
        TextView textView2 = (TextView) bVar.f34787h;
        r0.b(imageView);
        if (r0.v(basicItem.getInformation().getCoverPicture().getCurrentUrl())) {
            imageView.setImageResource(android.R.color.transparent);
        } else {
            r0.y(basicItem.getInformation().getCoverPicture().getCurrentUrl(), imageView, R.drawable.default_logo);
        }
        ((TextView) bVar.f34785f).setText(mv.d.h(basicItem.getDistance()));
        ((TextView) bVar.f34790k).setText(mv.d.m(basicItem).getStoreNameAndBranch());
        textView2.setText(r0.i(getContext(), basicItem));
        textView2.setVisibility(0);
        Context context = getContext();
        context.getClass();
        CharSequence charSequenceM = p0.m(context, mv.d.l(basicItem), mv.d.j(basicItem), false, false);
        TextView textView3 = (TextView) bVar.f34786g;
        if (mv.d.j(basicItem) == ItemState.SOLD_OUT || mv.d.j(basicItem) == ItemState.SALES_ENDED) {
            Context context2 = getContext();
            context2.getClass();
            switch (q0.$EnumSwitchMapping$0[mv.d.j(basicItem).ordinal()]) {
                case 1:
                    charSequenceM = (r0.v(basicItem.getSoldOutAt()) || Intrinsics.areEqual(p0.G(context2, basicItem.getSoldOutAt()), "-")) ? context2.getString(R.string.store_item_label_sold_out) : p0.A(basicItem.getSoldOutAt()) ? context2.getString(R.string.store_item_sold_out_time_today, p0.G(context2, basicItem.getSoldOutAt())) : DateUtils.isToday(p0.h(basicItem.getSoldOutAt()) + 86400000) ? context2.getString(R.string.store_item_sold_out_time_yesterday, p0.G(context2, basicItem.getSoldOutAt())) : context2.getString(R.string.store_item_label_sold_out);
                    charSequenceM.getClass();
                    break;
                case 2:
                    charSequenceM = context2.getString(R.string.item_state_sales_ended_badge);
                    charSequenceM.getClass();
                    break;
                case 3:
                    charSequenceM = context2.getString(R.string.item_state_inactive_today_badge);
                    charSequenceM.getClass();
                    break;
                case 4:
                case 5:
                    charSequenceM = context2.getString(R.string.store_item_items_left_format, basicItem.getItemsAvailable() > 5 ? "5+" : String.valueOf(basicItem.getItemsAvailable()));
                    charSequenceM.getClass();
                    break;
                case 6:
                    charSequenceM = "";
                    break;
                default:
                    e40.a.f();
                    return;
            }
        }
        textView3.setText(charSequenceM);
        textView.setText(mv.d.i(basicItem.getInformation().getDisplayPrice(), 1));
        if (r0.t(basicItem)) {
            textView2.setTextColor(getContext().getColor(R.color.neutral_80));
            textView.setTextColor(getContext().getColor(R.color.primary_30));
        } else {
            textView2.setTextColor(getContext().getColor(R.color.neutral_60));
            textView.setTextColor(getContext().getColor(R.color.neutral_60));
        }
        setTags(basicItem);
        View itemContainer = getItemContainer();
        if (itemContainer != null) {
            Context context3 = getContext();
            context3.getClass();
            itemContainer.setContentDescription(r0.a(context3, basicItem));
        }
        setItemAvailability(basicItem);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setItemWidth(boolean r4) {
        /*
            r3 = this;
            android.content.Context r0 = r3.getContext()
            android.content.Context r0 = p70.g.d(r0)
            r0.getClass()
            android.app.Activity r0 = (android.app.Activity) r0
            pg.b r1 = r3.f6614h
            android.view.View r1 = r1.f34783d
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            if (r4 == 0) goto L22
            java.lang.Boolean r4 = bq.k.f6613k
            r4.getClass()
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L22
            r4 = 1
            goto L23
        L22:
            r4 = 0
        L23:
            r2 = -1
            if (r4 == 0) goto L48
            int r4 = bq.k.f6612j
            if (r4 != r2) goto L45
            android.graphics.Point r4 = new android.graphics.Point
            r4.<init>()
            android.view.WindowManager r0 = r0.getWindowManager()
            android.view.Display r0 = r0.getDefaultDisplay()
            r0.getSize(r4)
            int r4 = r4.x
            r0 = 32
            int r0 = d70.b.a(r0)
            int r4 = r4 - r0
            bq.k.f6612j = r4
        L45:
            int r4 = bq.k.f6612j
            goto L7e
        L48:
            int r4 = bq.k.f6611i
            if (r4 != r2) goto L7c
            r4 = 360(0x168, float:5.04E-43)
            int r4 = d70.b.a(r4)
            android.graphics.Point r2 = new android.graphics.Point
            r2.<init>()
            android.view.WindowManager r0 = r0.getWindowManager()
            android.view.Display r0 = r0.getDefaultDisplay()
            r0.getSize(r2)
            int r0 = r2.x
            r2 = 56
            int r2 = d70.b.a(r2)
            int r0 = r0 - r2
            if (r0 > r4) goto L7a
            java.lang.Boolean r2 = bq.k.f6613k
            r2.getClass()
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L79
            goto L7a
        L79:
            r4 = r0
        L7a:
            bq.k.f6611i = r4
        L7c:
            int r4 = bq.k.f6611i
        L7e:
            r1.getClass()
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            r0.width = r4
            r1.setLayoutParams(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bq.k.setItemWidth(boolean):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(@NotNull Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public /* synthetic */ k(Context context, AttributeSet attributeSet, int i11, int i12) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, 0);
    }
}
