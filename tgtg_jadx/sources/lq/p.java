package lq;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import bg.y;
import c50.w;
import com.airbnb.lottie.LottieAnimationView;
import com.app.tgtg.R;
import com.app.tgtg.customview.TagContainerView;
import com.app.tgtg.model.remote.item.AverageItemRating;
import com.app.tgtg.model.remote.item.ItemCardType;
import com.app.tgtg.model.remote.item.ItemCardTypeEnum;
import com.app.tgtg.model.remote.item.ItemTagInfo;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.item.response.Item;
import com.app.tgtg.model.remote.item.response.ItemState;
import com.app.tgtg.model.remote.item.response.ItemType;
import com.app.tgtg.model.remote.item.response.ManufacturerItem;
import com.app.tgtg.model.remote.payment.Price;
import com.google.android.material.imageview.ShapeableImageView;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.d0;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.StringCompanionObject;
import lx.u;
import mv.p0;
import mv.r0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pg.w0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class p extends m {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f28154j = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w0 f28155h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f28156i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        context.getClass();
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.discover_store_view, (ViewGroup) this, false);
        addView(viewInflate);
        CardView cardView = (CardView) viewInflate;
        int i12 = R.id.cardContentLayout;
        if (((ConstraintLayout) pd.g.t(R.id.cardContentLayout, viewInflate)) != null) {
            i12 = R.id.cvTags;
            TagContainerView tagContainerView = (TagContainerView) pd.g.t(R.id.cvTags, viewInflate);
            if (tagContainerView != null) {
                i12 = R.id.distance;
                TextView textView = (TextView) pd.g.t(R.id.distance, viewInflate);
                if (textView != null) {
                    i12 = R.id.distanceSeparator;
                    View viewT = pd.g.t(R.id.distanceSeparator, viewInflate);
                    if (viewT != null) {
                        i12 = R.id.favAnimation;
                        LottieAnimationView lottieAnimationView = (LottieAnimationView) pd.g.t(R.id.favAnimation, viewInflate);
                        if (lottieAnimationView != null) {
                            i12 = R.id.itemName;
                            TextView textView2 = (TextView) pd.g.t(R.id.itemName, viewInflate);
                            if (textView2 != null) {
                                i12 = R.id.itemRating;
                                TextView textView3 = (TextView) pd.g.t(R.id.itemRating, viewInflate);
                                if (textView3 != null) {
                                    i12 = R.id.ivStoreLogo;
                                    ImageView imageView = (ImageView) pd.g.t(R.id.ivStoreLogo, viewInflate);
                                    if (imageView != null) {
                                        i12 = R.id.labelIconImageView;
                                        ImageView imageView2 = (ImageView) pd.g.t(R.id.labelIconImageView, viewInflate);
                                        if (imageView2 != null) {
                                            i12 = R.id.labelTextView;
                                            TextView textView4 = (TextView) pd.g.t(R.id.labelTextView, viewInflate);
                                            if (textView4 != null) {
                                                i12 = R.id.oldPrice;
                                                TextView textView5 = (TextView) pd.g.t(R.id.oldPrice, viewInflate);
                                                if (textView5 != null) {
                                                    i12 = R.id.pickupLayout;
                                                    LinearLayout linearLayout = (LinearLayout) pd.g.t(R.id.pickupLayout, viewInflate);
                                                    if (linearLayout != null) {
                                                        i12 = R.id.pickupTime;
                                                        TextView textView6 = (TextView) pd.g.t(R.id.pickupTime, viewInflate);
                                                        if (textView6 != null) {
                                                            i12 = R.id.price;
                                                            TextView textView7 = (TextView) pd.g.t(R.id.price, viewInflate);
                                                            if (textView7 != null) {
                                                                i12 = R.id.ratingIcon;
                                                                ImageView imageView3 = (ImageView) pd.g.t(R.id.ratingIcon, viewInflate);
                                                                if (imageView3 != null) {
                                                                    i12 = R.id.ratingLayout;
                                                                    LinearLayout linearLayout2 = (LinearLayout) pd.g.t(R.id.ratingLayout, viewInflate);
                                                                    if (linearLayout2 != null) {
                                                                        i12 = R.id.space;
                                                                        View viewT2 = pd.g.t(R.id.space, viewInflate);
                                                                        if (viewT2 != null) {
                                                                            i12 = R.id.stippledLine;
                                                                            if (((ImageView) pd.g.t(R.id.stippledLine, viewInflate)) != null) {
                                                                                i12 = R.id.storeCoverImage;
                                                                                ShapeableImageView shapeableImageView = (ShapeableImageView) pd.g.t(R.id.storeCoverImage, viewInflate);
                                                                                if (shapeableImageView != null) {
                                                                                    i12 = R.id.storeName;
                                                                                    TextView textView8 = (TextView) pd.g.t(R.id.storeName, viewInflate);
                                                                                    if (textView8 != null) {
                                                                                        this.f28155h = new w0(cardView, cardView, tagContainerView, textView, viewT, lottieAnimationView, textView2, textView3, imageView, imageView2, textView4, textView5, linearLayout, textView6, textView7, imageView3, linearLayout2, viewT2, shapeableImageView, textView8);
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

    public static Unit d(BasicItem basicItem, p pVar, boolean z11) {
        if (basicItem.getFavorite() != z11) {
            basicItem.setFavorite(z11);
            pVar.setFavoriteIcon(basicItem);
        }
        return Unit.f26487a;
    }

    public static Unit e(p pVar, BasicItem basicItem, View view) {
        view.getClass();
        Function0<Unit> favoriteOnClickLister = pVar.getFavoriteOnClickLister();
        if (favoriteOnClickLister != null) {
            favoriteOnClickLister.invoke();
        }
        pVar.setFavoriteIcon(basicItem);
        return Unit.f26487a;
    }

    public static final void f(p pVar, float f11, int i11, TextView[] textViewArr, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((ImageView) it.next()).setAlpha(f11);
        }
        for (TextView textView : textViewArr) {
            textView.setTextColor(pVar.getContext().getColor(i11));
        }
    }

    private final void setFavoriteIcon(BasicItem basicItem) {
        boolean favorite = basicItem.getFavorite();
        w0 w0Var = this.f28155h;
        if (favorite) {
            w0Var.f35235f.setContentDescription(getContext().getString(R.string.voice_over_add_to_favorites));
            w0Var.f35235f.setImageResource(R.drawable.ic_favorite_off);
        } else {
            w0Var.f35235f.setContentDescription(getContext().getString(R.string.voice_over_remove_from_favorites));
            he.o.b(w0Var.f35230a.getContext(), "favorite_animation.json").b(new y(w0Var, 5));
        }
    }

    private final void setOldPrice(BasicItem basicItem) {
        Price displayValue = basicItem.getInformation().getDisplayValue();
        w0 w0Var = this.f28155h;
        if (displayValue != null) {
            Price displayValue2 = basicItem.getInformation().getDisplayValue();
            displayValue2.getClass();
            if (displayValue2.getMinorUnits() != 0) {
                TextView textView = w0Var.l;
                textView.setText(mv.d.i(basicItem.getInformation().getDisplayValue(), 1));
                textView.setPaintFlags(textView.getPaintFlags() | 16);
                textView.setVisibility(0);
                return;
            }
        }
        w0Var.l.setVisibility(8);
    }

    private final void setTags(List<ItemTagInfo> list) {
        w0 w0Var = this.f28155h;
        w0Var.f35232c.setTags(list == null ? n0.f26529a : list);
        w0Var.f35232c.setVisibility((list == null || list.isEmpty()) ? 8 : 0);
    }

    private final void setupCharityCard(BasicItem basicItem) {
        w0 w0Var = this.f28155h;
        TextView textView = w0Var.f35243o;
        ImageView imageView = w0Var.f35238i;
        textView.setVisibility(8);
        w0Var.f35235f.setVisibility(8);
        w0Var.f35244p.setVisibility(8);
        w0Var.f35237h.setVisibility(8);
        w0Var.f35234e.setVisibility(8);
        w0Var.f35246r.setVisibility(8);
        if (basicItem.getItemsAvailable() == 1) {
            w0Var.f35232c.setVisibility(8);
        }
        if (r0.v(mv.d.k(basicItem).getCurrentUrl())) {
            imageView.setImageResource(android.R.color.transparent);
        } else {
            r0.y(mv.d.k(basicItem).getCurrentUrl(), imageView, R.drawable.default_logo);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007c A[PHI: r1
      0x007c: PHI (r1v11 java.lang.String) = (r1v10 java.lang.String), (r1v13 java.lang.String) binds: [B:25:0x0086, B:21:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void setupParcelCard(com.app.tgtg.model.remote.item.response.ManufacturerItem r11) {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lq.p.setupParcelCard(com.app.tgtg.model.remote.item.response.ManufacturerItem):void");
    }

    private final void setupStandardCard(BasicItem basicItem) {
        CharSequence charSequenceM;
        w0 w0Var = this.f28155h;
        LinearLayout linearLayout = w0Var.f35245q;
        ImageView imageView = w0Var.f35238i;
        TextView textView = w0Var.f35248t;
        TextView textView2 = w0Var.f35240k;
        ImageView imageView2 = w0Var.f35239j;
        linearLayout.setVisibility(0);
        ImageView imageView3 = w0Var.f35244p;
        imageView3.setVisibility(0);
        w0Var.f35241m.setVisibility(0);
        TextView textView3 = w0Var.f35242n;
        textView3.setVisibility(0);
        TextView textView4 = w0Var.f35237h;
        textView4.setVisibility(0);
        View view = w0Var.f35234e;
        view.setVisibility(0);
        View view2 = w0Var.f35246r;
        view2.setVisibility(0);
        TextView textView5 = w0Var.f35233d;
        textView5.setVisibility(0);
        LottieAnimationView lottieAnimationView = w0Var.f35235f;
        lottieAnimationView.setVisibility(0);
        TextView textView6 = w0Var.f35236g;
        textView6.setVisibility(0);
        w0Var.f35243o.setVisibility(0);
        CardView cardView = w0Var.f35230a;
        ViewGroup.LayoutParams layoutParams = cardView.getLayoutParams();
        layoutParams.height = d70.b.a(270);
        cardView.setLayoutParams(layoutParams);
        ItemCardType itemCardType = basicItem.getItemCardType();
        if ((itemCardType != null ? itemCardType.getItemCardType() : null) == ItemCardTypeEnum.SPECIAL_REWARD && this.f28156i) {
            ItemCardType itemCardType2 = basicItem.getItemCardType();
            String itemCardText = itemCardType2 != null ? itemCardType2.getItemCardText() : null;
            if (itemCardText == null) {
                itemCardText = "";
            }
            textView2.setText(itemCardText);
            textView2.setVisibility(0);
            imageView2.setImageResource(R.drawable.featured_seasonal_and_gifts);
            imageView2.setVisibility(0);
        } else {
            textView2.setVisibility(8);
            imageView2.setVisibility(8);
        }
        ItemCardType itemCardType3 = basicItem.getItemCardType();
        if ((itemCardType3 != null ? itemCardType3.getItemCardType() : null) == ItemCardTypeEnum.DYNAMIC_PRICE) {
            ItemCardType itemCardType4 = basicItem.getItemCardType();
            String itemCardText2 = itemCardType4 != null ? itemCardType4.getItemCardText() : null;
            if (itemCardText2 == null) {
                itemCardText2 = "";
            }
            textView2.setText(itemCardText2);
            textView2.setVisibility(0);
            imageView2.setImageResource(R.drawable.dynamic_pricing_outlined);
            imageView2.setVisibility(0);
        } else {
            textView2.setVisibility(8);
            imageView2.setVisibility(8);
        }
        if (r0.v(mv.d.m(basicItem).getStoreNameAndBranch())) {
            textView.setVisibility(4);
        } else {
            textView.setText(mv.d.m(basicItem).getStoreNameAndBranch());
            textView.setVisibility(0);
        }
        if (mv.d.j(basicItem) == ItemState.INACTIVE_TODAY || mv.d.l(basicItem).getIntervalStart() == null || mv.d.l(basicItem).getIntervalEnd() == null) {
            textView3.setText(getContext().getString(R.string.store_item_label_closed));
        } else {
            String intervalStart = mv.d.l(basicItem).getIntervalStart();
            intervalStart.getClass();
            if (p0.A(intervalStart)) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String string = getContext().getString(R.string.discover_pickup_time_today);
                string.getClass();
                Context context = getContext();
                context.getClass();
                charSequenceM = String.format(string, Arrays.copyOf(new Object[]{p0.u(context, mv.d.l(basicItem))}, 1));
            } else {
                String intervalStart2 = mv.d.l(basicItem).getIntervalStart();
                intervalStart2.getClass();
                if (p0.C(intervalStart2)) {
                    StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                    String string2 = getContext().getString(R.string.discover_pickup_time_tomorrow);
                    string2.getClass();
                    Context context2 = getContext();
                    context2.getClass();
                    charSequenceM = String.format(string2, Arrays.copyOf(new Object[]{p0.u(context2, mv.d.l(basicItem))}, 1));
                } else {
                    Context context3 = getContext();
                    context3.getClass();
                    charSequenceM = p0.m(context3, mv.d.l(basicItem), mv.d.j(basicItem), true, false);
                }
            }
            textView3.setText(charSequenceM);
        }
        textView6.setText(r0.i(getContext(), basicItem));
        if (basicItem.getFavorite()) {
            lottieAnimationView.setContentDescription(getContext().getString(R.string.voice_over_remove_from_favorites));
            lottieAnimationView.setImageResource(R.drawable.ic_favorite_on);
        } else {
            lottieAnimationView.setContentDescription(getContext().getString(R.string.voice_over_add_to_favorites));
            lottieAnimationView.setImageResource(R.drawable.ic_favorite_off);
        }
        mv.d.x(lottieAnimationView, new o(this, basicItem));
        basicItem.setOnFavoriteChangedListener(new o(basicItem, this));
        if (r0.v(mv.d.k(basicItem).getCurrentUrl())) {
            imageView.setImageResource(android.R.color.transparent);
        } else {
            r0.y(mv.d.k(basicItem).getCurrentUrl(), imageView, R.drawable.default_logo);
        }
        textView5.setText(mv.d.h(basicItem.getDistance()));
        if (basicItem.getDistance() == 0.0d) {
            textView5.setVisibility(8);
        } else {
            p30.b.E(textView5, true);
        }
        if (basicItem.getInformation().getAverageItemRating() == null) {
            w0Var.f35245q.setVisibility(8);
            textView4.setVisibility(8);
            imageView3.setVisibility(8);
            p30.b.E(view, true);
            p30.b.E(view2, true);
            return;
        }
        p30.b.E(textView4, true);
        p30.b.E(imageView3, true);
        p30.b.E(view, true);
        p30.b.E(view2, true);
        DecimalFormat decimalFormat = new DecimalFormat("#.0");
        AverageItemRating averageItemRating = basicItem.getInformation().getAverageItemRating();
        textView4.setText(decimalFormat.format(averageItemRating != null ? Double.valueOf(averageItemRating.getAverageOverallRating()) : null));
        if (basicItem.getDistance() == 0.0d) {
            view.setVisibility(8);
            view2.setVisibility(8);
        }
    }

    @Override // lq.m
    public final void b() {
        setItemContainer(this.f28155h.f35231b);
        super.b();
    }

    @Override // lq.m
    @Nullable
    public mq.a getItem() {
        return super.getItem();
    }

    public final boolean getShouldShowSpecialRewards() {
        return this.f28156i;
    }

    @Override // lq.m
    public void setItem(@Nullable mq.a aVar) {
        super.setItem(aVar);
        aVar.getClass();
        BasicItem basicItem = (BasicItem) aVar;
        boolean z11 = aVar instanceof Item;
        if (z11 || (aVar instanceof ManufacturerItem)) {
            setOldPrice(basicItem);
        }
        boolean zV = r0.v(basicItem.getInformation().getCoverPicture().getCurrentUrl());
        w0 w0Var = this.f28155h;
        if (zV) {
            u.H(w0Var.f35247s).a();
            w0Var.f35247s.setImageResource(android.R.color.transparent);
        } else {
            r0.x(basicItem.getInformation().getCoverPicture().getCurrentUrl(), w0Var.f35247s);
        }
        boolean zT = r0.t(basicItem);
        int i11 = R.color.neutral_70;
        if (zT) {
            f(this, 1.0f, R.color.neutral_80, new TextView[]{w0Var.f35237h, w0Var.f35248t, w0Var.f35236g, w0Var.f35233d}, d0.h(w0Var.f35247s, w0Var.f35244p, w0Var.f35238i));
        } else {
            f(this, 0.5f, R.color.neutral_70, new TextView[]{w0Var.f35237h, w0Var.f35248t, w0Var.f35236g, w0Var.f35233d, w0Var.f35242n}, d0.h(w0Var.f35247s, w0Var.f35244p, w0Var.f35238i));
        }
        if (z11 || (aVar instanceof ManufacturerItem)) {
            setTags(basicItem.getItemTags());
        }
        View itemContainer = getItemContainer();
        if (itemContainer != null) {
            Context context = getContext();
            context.getClass();
            itemContainer.setContentDescription(mv.d.m(basicItem).getStoreNameAndBranch() + "... " + r0.i(context, basicItem) + "... " + ((Object) r0.l(basicItem.getItemTags())) + ((CharSequence) p0.m(context, mv.d.l(basicItem), mv.d.j(basicItem), false, false)) + "... " + mv.d.h(basicItem.getDistance()) + "... " + mv.d.i(basicItem.getInformation().getDisplayPrice(), 1) + "... ");
        }
        w0Var.f35243o.setText(mv.d.i(basicItem.getInformation().getDisplayPrice(), 1));
        TextView textView = w0Var.f35243o;
        Context context2 = getContext();
        if (r0.t(basicItem)) {
            i11 = R.color.neutral_80;
        }
        textView.setTextColor(context2.getColor(i11));
        if (basicItem.getItemType() == ItemType.CHARITY) {
            setupCharityCard(basicItem);
        } else if (basicItem instanceof ManufacturerItem) {
            setupParcelCard((ManufacturerItem) basicItem);
        } else {
            setupStandardCard(basicItem);
        }
    }

    public final void setShouldShowSpecialRewards(boolean z11) {
        this.f28156i = z11;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p(@NotNull Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public /* synthetic */ p(Context context, AttributeSet attributeSet, int i11, int i12) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, 0);
    }
}
