package pg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.app.tgtg.R;
import com.app.tgtg.customview.ExpandableTextView;
import com.app.tgtg.customview.TGTGLoadingView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends n {
    public static final SparseIntArray J;
    public long I;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        J = sparseIntArray;
        sparseIntArray.put(R.id.mainContentModular, 2);
        sparseIntArray.put(R.id.coverImageMnu, 3);
        sparseIntArray.put(R.id.imageOverlayMnu, 4);
        sparseIntArray.put(R.id.collapsibleBottomShadowMnu, 5);
        sparseIntArray.put(R.id.tagLayout, 6);
        sparseIntArray.put(R.id.dietContainerMnu, 7);
        sparseIntArray.put(R.id.dietContainer, 8);
        sparseIntArray.put(R.id.tagLeaf1, 9);
        sparseIntArray.put(R.id.tagLeaf2, 10);
        sparseIntArray.put(R.id.dietMnuTv, 11);
        sparseIntArray.put(R.id.topNamesLayoutMnu, 12);
        sparseIntArray.put(R.id.itemNameTopTvMnu, 13);
        sparseIntArray.put(R.id.spacerMnu, 14);
        sparseIntArray.put(R.id.ibBackContainerMnu, 15);
        sparseIntArray.put(R.id.ibBackMnu, 16);
        sparseIntArray.put(R.id.ibShareContainerMnu, 17);
        sparseIntArray.put(R.id.ibShareMnu, 18);
        sparseIntArray.put(R.id.brandLogoContainer, 19);
        sparseIntArray.put(R.id.ivBrandLogo, 20);
        sparseIntArray.put(R.id.bottomNavMnu, 21);
        sparseIntArray.put(R.id.bottomNavShadowMnu, 22);
        sparseIntArray.put(R.id.bottomNavLayoutMnu, 23);
        sparseIntArray.put(R.id.btnPositiveMnu, 24);
        sparseIntArray.put(R.id.loadingView, 25);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public o(View view) {
        Object obj;
        p pVar;
        Object[] objArrB0 = a8.k.b0(view, 26, null, J);
        LinearLayout linearLayout = (LinearLayout) objArrB0[23];
        LinearLayout linearLayout2 = (LinearLayout) objArrB0[21];
        ImageView imageView = (ImageView) objArrB0[22];
        Button button = (Button) objArrB0[24];
        ImageView imageView2 = (ImageView) objArrB0[3];
        LinearLayout linearLayout3 = (LinearLayout) objArrB0[15];
        ImageButton imageButton = (ImageButton) objArrB0[16];
        LinearLayout linearLayout4 = (LinearLayout) objArrB0[17];
        ImageButton imageButton2 = (ImageButton) objArrB0[18];
        TextView textView = (TextView) objArrB0[13];
        NestedScrollView nestedScrollView = (NestedScrollView) objArrB0[1];
        ImageView imageView3 = (ImageView) objArrB0[20];
        TGTGLoadingView tGTGLoadingView = (TGTGLoadingView) objArrB0[25];
        Object obj2 = objArrB0[2];
        if (obj2 != null) {
            View view2 = (View) obj2;
            obj = null;
            int i11 = R.id.DeliveryTimeTv;
            TextView textView2 = (TextView) pd.g.t(R.id.DeliveryTimeTv, view2);
            if (textView2 != null) {
                i11 = R.id.allergensBtn;
                ConstraintLayout constraintLayout = (ConstraintLayout) pd.g.t(R.id.allergensBtn, view2);
                if (constraintLayout != null) {
                    i11 = R.id.allergensIcon;
                    if (((ImageView) pd.g.t(R.id.allergensIcon, view2)) != null) {
                        i11 = R.id.badgeContainer;
                        FrameLayout frameLayout = (FrameLayout) pd.g.t(R.id.badgeContainer, view2);
                        if (frameLayout != null) {
                            i11 = R.id.bottomTabText;
                            if (((TextView) pd.g.t(R.id.bottomTabText, view2)) != null) {
                                i11 = R.id.descriptionTv;
                                ExpandableTextView expandableTextView = (ExpandableTextView) pd.g.t(R.id.descriptionTv, view2);
                                if (expandableTextView != null) {
                                    i11 = R.id.dietContainer;
                                    LinearLayout linearLayout5 = (LinearLayout) pd.g.t(R.id.dietContainer, view2);
                                    if (linearLayout5 != null) {
                                        i11 = R.id.dietContainerMnu;
                                        LinearLayout linearLayout6 = (LinearLayout) pd.g.t(R.id.dietContainerMnu, view2);
                                        if (linearLayout6 != null) {
                                            i11 = R.id.dietMnuTv;
                                            TextView textView3 = (TextView) pd.g.t(R.id.dietMnuTv, view2);
                                            if (textView3 != null) {
                                                i11 = R.id.faqItemLayout;
                                                LinearLayout linearLayout7 = (LinearLayout) pd.g.t(R.id.faqItemLayout, view2);
                                                if (linearLayout7 != null) {
                                                    i11 = R.id.faqTitleTv;
                                                    TextView textView4 = (TextView) pd.g.t(R.id.faqTitleTv, view2);
                                                    if (textView4 != null) {
                                                        i11 = R.id.horizontalLine;
                                                        if (pd.g.t(R.id.horizontalLine, view2) != null) {
                                                            i11 = R.id.horizontalLine2;
                                                            if (pd.g.t(R.id.horizontalLine2, view2) != null) {
                                                                i11 = R.id.itemDetailsNameTvMnu;
                                                                TextView textView5 = (TextView) pd.g.t(R.id.itemDetailsNameTvMnu, view2);
                                                                if (textView5 != null) {
                                                                    LinearLayout linearLayout8 = (LinearLayout) view2;
                                                                    i11 = R.id.newPriceDesign;
                                                                    if (((ConstraintLayout) pd.g.t(R.id.newPriceDesign, view2)) != null) {
                                                                        i11 = R.id.preDiscountDescriptionTv;
                                                                        if (((TextView) pd.g.t(R.id.preDiscountDescriptionTv, view2)) != null) {
                                                                            i11 = R.id.preDiscountLayout;
                                                                            ConstraintLayout constraintLayout2 = (ConstraintLayout) pd.g.t(R.id.preDiscountLayout, view2);
                                                                            if (constraintLayout2 != null) {
                                                                                i11 = R.id.preDiscountValueTv;
                                                                                if (((TextView) pd.g.t(R.id.preDiscountValueTv, view2)) != null) {
                                                                                    i11 = R.id.priceTvNormal;
                                                                                    TextView textView6 = (TextView) pd.g.t(R.id.priceTvNormal, view2);
                                                                                    if (textView6 != null) {
                                                                                        i11 = R.id.ratingComposeView;
                                                                                        ComposeView composeView = (ComposeView) pd.g.t(R.id.ratingComposeView, view2);
                                                                                        if (composeView != null) {
                                                                                            i11 = R.id.space;
                                                                                            if (pd.g.t(R.id.space, view2) != null) {
                                                                                                i11 = R.id.statusContainerMnu;
                                                                                                if (((LinearLayout) pd.g.t(R.id.statusContainerMnu, view2)) != null) {
                                                                                                    i11 = R.id.statusMnu;
                                                                                                    TextView textView7 = (TextView) pd.g.t(R.id.statusMnu, view2);
                                                                                                    if (textView7 != null) {
                                                                                                        i11 = R.id.tagLayout;
                                                                                                        LinearLayout linearLayout9 = (LinearLayout) pd.g.t(R.id.tagLayout, view2);
                                                                                                        if (linearLayout9 != null) {
                                                                                                            i11 = R.id.tagLeaf1;
                                                                                                            if (((ImageView) pd.g.t(R.id.tagLeaf1, view2)) != null) {
                                                                                                                i11 = R.id.tagLeaf2;
                                                                                                                ImageView imageView4 = (ImageView) pd.g.t(R.id.tagLeaf2, view2);
                                                                                                                if (imageView4 != null) {
                                                                                                                    i11 = R.id.truckIv;
                                                                                                                    if (((ImageView) pd.g.t(R.id.truckIv, view2)) != null) {
                                                                                                                        i11 = R.id.tvBrandName;
                                                                                                                        TextView textView8 = (TextView) pd.g.t(R.id.tvBrandName, view2);
                                                                                                                        if (textView8 != null) {
                                                                                                                            i11 = R.id.valueDescriptionTv;
                                                                                                                            if (((TextView) pd.g.t(R.id.valueDescriptionTv, view2)) != null) {
                                                                                                                                i11 = R.id.valueTv;
                                                                                                                                TextView textView9 = (TextView) pd.g.t(R.id.valueTv, view2);
                                                                                                                                if (textView9 != null) {
                                                                                                                                    i11 = R.id.whatYouNeedToKnowHeader;
                                                                                                                                    TextView textView10 = (TextView) pd.g.t(R.id.whatYouNeedToKnowHeader, view2);
                                                                                                                                    if (textView10 != null) {
                                                                                                                                        i11 = R.id.whatYouNeedToKnowLabel;
                                                                                                                                        pVar = ((TextView) pd.g.t(R.id.whatYouNeedToKnowLabel, view2)) != null ? new p(linearLayout8, textView2, constraintLayout, frameLayout, expandableTextView, linearLayout5, linearLayout6, textView3, linearLayout7, textView4, textView5, linearLayout8, constraintLayout2, textView6, composeView, textView7, linearLayout9, imageView4, textView8, textView9, textView10) : pVar;
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
            c50.w.l("Missing required view with ID: ".concat(view2.getResources().getResourceName(i11)));
            throw null;
        }
        obj = null;
        pVar = null;
        MotionLayout motionLayout = (MotionLayout) objArrB0[0];
        Object obj3 = obj;
        super(null, view, linearLayout, linearLayout2, imageView, button, imageView2, linearLayout3, imageButton, linearLayout4, imageButton2, textView, nestedScrollView, imageView3, tGTGLoadingView, pVar, motionLayout);
        this.I = -1L;
        this.C.setTag(obj3);
        this.G.setTag(obj3);
        view.setTag(R.id.dataBinding, this);
        synchronized (this) {
            this.I = 1L;
        }
        e0();
    }

    @Override // a8.k
    public final void V() {
        synchronized (this) {
            this.I = 0L;
        }
    }

    @Override // a8.k
    public final boolean Y() {
        synchronized (this) {
            try {
                return this.I != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // a8.k
    public final boolean c0(int i11, Object obj) {
        return false;
    }
}
