package com.app.tgtg;

import a40.d0;
import a8.a;
import a8.k;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import c50.w;
import com.app.tgtg.customview.BasketButtonRow;
import com.app.tgtg.customview.ExpandableTextView;
import com.app.tgtg.customview.GenericErrorView;
import com.app.tgtg.customview.TGTGLoadingView;
import com.app.tgtg.feature.main.fragments.delivery.parcelfeed.compose.vertitems.DeliveryCategoryCarousel;
import com.app.tgtg.feature.main.fragments.delivery.parcelfeed.compose.vertitems.DeliverySortingBottomSheet;
import com.app.tgtg.feature.tabdiscover.discoverbuckets.DiscoverDeliveryTabComposeView;
import com.app.tgtg.feature.tabdiscover.discoverbuckets.StoreReferralCardComposeView;
import com.appsflyer.attribution.RequestError;
import j4.s;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.iana.AEADAlgorithm;
import pg.a0;
import pg.a3;
import pg.b0;
import pg.b2;
import pg.b3;
import pg.c0;
import pg.c3;
import pg.d1;
import pg.d2;
import pg.e;
import pg.e0;
import pg.e3;
import pg.f0;
import pg.g;
import pg.g0;
import pg.g2;
import pg.g3;
import pg.h;
import pg.h2;
import pg.i0;
import pg.i1;
import pg.i3;
import pg.j;
import pg.j2;
import pg.k0;
import pg.k1;
import pg.k2;
import pg.l3;
import pg.m;
import pg.m1;
import pg.m2;
import pg.n0;
import pg.n3;
import pg.o;
import pg.o1;
import pg.o2;
import pg.p0;
import pg.p3;
import pg.q1;
import pg.q2;
import pg.r2;
import pg.r3;
import pg.s2;
import pg.t;
import pg.t1;
import pg.t3;
import pg.u0;
import pg.v0;
import pg.v1;
import pg.v2;
import pg.x1;
import pg.x2;
import pg.y;
import pg.z1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class DataBinderMapperImpl extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f8871a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(55);
        f8871a = sparseIntArray;
        sparseIntArray.put(R.layout.activity_settings, 1);
        sparseIntArray.put(R.layout.address_edittext_layout, 2);
        sparseIntArray.put(R.layout.bad_order_rating_tag, 3);
        sparseIntArray.put(R.layout.browse_flash_sales_item, 4);
        sparseIntArray.put(R.layout.bullet_text_view, 5);
        sparseIntArray.put(R.layout.catering_item_details, 6);
        sparseIntArray.put(R.layout.consent_service_view, 7);
        sparseIntArray.put(R.layout.cookies_detail_dialog_fragment, 8);
        sparseIntArray.put(R.layout.cookies_dialog_fragment, 9);
        sparseIntArray.put(R.layout.country_popup, 10);
        sparseIntArray.put(R.layout.delivery_adapter_compose_view, 11);
        sparseIntArray.put(R.layout.delivery_adapter_info_item, 12);
        sparseIntArray.put(R.layout.delivery_adapter_item_carousel_v2, 13);
        sparseIntArray.put(R.layout.delivery_adapter_list_basket_item, 14);
        sparseIntArray.put(R.layout.discover_bucket_view, 15);
        sparseIntArray.put(R.layout.discover_delivery_card, 16);
        sparseIntArray.put(R.layout.discover_flash_sales_view, 17);
        sparseIntArray.put(R.layout.discover_location_card, 18);
        sparseIntArray.put(R.layout.discover_search_extras_card, 19);
        sparseIntArray.put(R.layout.discover_store_referral, 20);
        sparseIntArray.put(R.layout.flash_sales_favorite_card, 21);
        sparseIntArray.put(R.layout.large_icon_button, 22);
        sparseIntArray.put(R.layout.list_item_manufacturer_about, 23);
        sparseIntArray.put(R.layout.list_item_manufacturer_more, 24);
        sparseIntArray.put(R.layout.list_item_mnu_address_province, 25);
        sparseIntArray.put(R.layout.list_item_mnu_address_province_header, 26);
        sparseIntArray.put(R.layout.list_item_view, 27);
        sparseIntArray.put(R.layout.locationpicker_distance_item, 28);
        sparseIntArray.put(R.layout.main_view, 29);
        sparseIntArray.put(R.layout.manufacturer_about1, 30);
        sparseIntArray.put(R.layout.manufacturer_about3, 31);
        sparseIntArray.put(R.layout.manufacturer_item_details, 32);
        sparseIntArray.put(R.layout.manufacturer_list, 33);
        sparseIntArray.put(R.layout.mnu_about_fragment, 34);
        sparseIntArray.put(R.layout.mnu_bucket_item, 35);
        sparseIntArray.put(R.layout.mnu_faq_item, 36);
        sparseIntArray.put(R.layout.mnu_list_item_nps, 37);
        sparseIntArray.put(R.layout.mystore_webview_container, 38);
        sparseIntArray.put(R.layout.nps_rating_page_base, 39);
        sparseIntArray.put(R.layout.nps_rating_page_rating, 40);
        sparseIntArray.put(R.layout.nps_rating_page_thanks, 41);
        sparseIntArray.put(R.layout.order_list_item_new, 42);
        sparseIntArray.put(R.layout.order_list_month_item, 43);
        sparseIntArray.put(R.layout.post_manufacturer_purchase_popup, 44);
        sparseIntArray.put(R.layout.post_purchase_email_prompt_view, 45);
        sparseIntArray.put(R.layout.post_purchase_phone_prompt_view, 46);
        sparseIntArray.put(R.layout.profile_view, 47);
        sparseIntArray.put(R.layout.recycler_item_loading, 48);
        sparseIntArray.put(R.layout.search_and_filter_card, 49);
        sparseIntArray.put(R.layout.server_message_view, 50);
        sparseIntArray.put(R.layout.storage_description_view, 51);
        sparseIntArray.put(R.layout.table_reservation_item_in_browse_list, 52);
        sparseIntArray.put(R.layout.track_and_trace_button, 53);
        sparseIntArray.put(R.layout.tracking_consent_view, 54);
        sparseIntArray.put(R.layout.tracking_detail_view, 55);
    }

    @Override // a8.a
    public final List a() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // a8.a
    public final k b(int i11, View view) {
        k2 k2Var;
        char c3;
        mc.a aVar;
        int i12 = f8871a.get(i11);
        if (i12 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            d0.k("view must have a tag");
            return null;
        }
        int i13 = (i12 - 1) / 50;
        int i14 = 4;
        if (i13 != 0) {
            if (i13 != 1) {
                return null;
            }
            switch (i12) {
                case 51:
                    if (!"layout/storage_description_view_0".equals(tag)) {
                        i4.a.f(s.j(tag, "The tag for storage_description_view is invalid. Received: "));
                        return null;
                    }
                    Object[] objArrB0 = k.b0(view, 2, null, l3.f34978v);
                    l3 l3Var = new l3(null, view, (TextView) objArrB0[1]);
                    l3Var.f34979u = -1L;
                    ((ConstraintLayout) objArrB0[0]).setTag(null);
                    view.setTag(R.id.dataBinding, l3Var);
                    synchronized (l3Var) {
                        l3Var.f34979u = 1L;
                        break;
                    }
                    l3Var.e0();
                    return l3Var;
                case 52:
                    if ("layout/table_reservation_item_in_browse_list_0".equals(tag)) {
                        return new n3(view);
                    }
                    i4.a.f(s.j(tag, "The tag for table_reservation_item_in_browse_list is invalid. Received: "));
                    return null;
                case 53:
                    if (!"layout/track_and_trace_button_0".equals(tag)) {
                        i4.a.f(s.j(tag, "The tag for track_and_trace_button is invalid. Received: "));
                        return null;
                    }
                    Object[] objArrB02 = k.b0(view, 2, null, p3.f35075t);
                    p3 p3Var = new p3(0, view, null);
                    p3Var.f35076s = -1L;
                    ((FrameLayout) objArrB02[0]).setTag(null);
                    view.setTag(R.id.dataBinding, p3Var);
                    synchronized (p3Var) {
                        p3Var.f35076s = 1L;
                        break;
                    }
                    p3Var.e0();
                    return p3Var;
                case 54:
                    if (!"layout/tracking_consent_view_0".equals(tag)) {
                        i4.a.f(s.j(tag, "The tag for tracking_consent_view is invalid. Received: "));
                        return null;
                    }
                    Object[] objArrB03 = k.b0(view, 26, null, r3.B);
                    ComposeView composeView = (ComposeView) objArrB03[23];
                    ComposeView composeView2 = (ComposeView) objArrB03[24];
                    SwitchCompat switchCompat = (SwitchCompat) objArrB03[15];
                    ComposeView composeView3 = (ComposeView) objArrB03[2];
                    TextView textView = (TextView) objArrB03[17];
                    TextView textView2 = (TextView) objArrB03[21];
                    TextView textView3 = (TextView) objArrB03[11];
                    r3 r3Var = new r3(null, view, composeView, composeView2, switchCompat, composeView3, textView, textView2, textView3);
                    r3Var.A = -1L;
                    ((ConstraintLayout) objArrB03[0]).setTag(null);
                    view.setTag(R.id.dataBinding, r3Var);
                    synchronized (r3Var) {
                        r3Var.A = 1L;
                        break;
                    }
                    r3Var.e0();
                    return r3Var;
                case 55:
                    if (!"layout/tracking_detail_view_0".equals(tag)) {
                        i4.a.f(s.j(tag, "The tag for tracking_detail_view is invalid. Received: "));
                        return null;
                    }
                    Object[] objArrB04 = k.b0(view, 6, null, t3.f35175w);
                    LinearLayout linearLayout = (LinearLayout) objArrB04[5];
                    t3 t3Var = new t3(null, view, linearLayout, (ComposeView) objArrB04[2]);
                    t3Var.f35176v = -1L;
                    ((ConstraintLayout) objArrB04[0]).setTag(null);
                    view.setTag(R.id.dataBinding, t3Var);
                    synchronized (t3Var) {
                        t3Var.f35176v = 1L;
                        break;
                    }
                    t3Var.e0();
                    return t3Var;
                default:
                    return null;
            }
        }
        switch (i12) {
            case 1:
                if ("layout/activity_settings_0".equals(tag)) {
                    return new e(view);
                }
                i4.a.f(s.j(tag, "The tag for activity_settings is invalid. Received: "));
                return null;
            case 2:
                if ("layout/address_edittext_layout_0".equals(tag)) {
                    return new g(view);
                }
                i4.a.f(s.j(tag, "The tag for address_edittext_layout is invalid. Received: "));
                return null;
            case 3:
                if ("layout/bad_order_rating_tag_0".equals(tag)) {
                    return new h(view);
                }
                i4.a.f(s.j(tag, "The tag for bad_order_rating_tag is invalid. Received: "));
                return null;
            case 4:
                if ("layout/browse_flash_sales_item_0".equals(tag)) {
                    return new j(view);
                }
                i4.a.f(s.j(tag, "The tag for browse_flash_sales_item is invalid. Received: "));
                return null;
            case 5:
                if (!"layout/bullet_text_view_0".equals(tag)) {
                    i4.a.f(s.j(tag, "The tag for bullet_text_view is invalid. Received: "));
                    return null;
                }
                Object[] objArrB05 = k.b0(view, 4, null, m.f34980y);
                RelativeLayout relativeLayout = (RelativeLayout) objArrB05[0];
                TextView textView4 = (TextView) objArrB05[3];
                m mVar = new m(null, view, relativeLayout, textView4, (TextView) objArrB05[1]);
                mVar.f34981x = -1L;
                mVar.f34965s.setTag(null);
                mVar.f34967u.setTag(null);
                view.setTag(R.id.dataBinding, mVar);
                mVar.g0();
                return mVar;
            case 6:
                if ("layout/catering_item_details_0".equals(tag)) {
                    return new o(view);
                }
                i4.a.f(s.j(tag, "The tag for catering_item_details is invalid. Received: "));
                return null;
            case 7:
                if ("layout/consent_service_view_0".equals(tag)) {
                    return new t(view);
                }
                i4.a.f(s.j(tag, "The tag for consent_service_view is invalid. Received: "));
                return null;
            case 8:
                if ("layout/cookies_detail_dialog_fragment_0".equals(tag)) {
                    return new y(view);
                }
                i4.a.f(s.j(tag, "The tag for cookies_detail_dialog_fragment is invalid. Received: "));
                return null;
            case 9:
                if ("layout/cookies_dialog_fragment_0".equals(tag)) {
                    return new a0(view);
                }
                i4.a.f(s.j(tag, "The tag for cookies_dialog_fragment is invalid. Received: "));
                return null;
            case 10:
                if ("layout/country_popup_0".equals(tag)) {
                    return new b0(view);
                }
                i4.a.f(s.j(tag, "The tag for country_popup is invalid. Received: "));
                return null;
            case 11:
                if (!"layout/delivery_adapter_compose_view_0".equals(tag)) {
                    i4.a.f(s.j(tag, "The tag for delivery_adapter_compose_view is invalid. Received: "));
                    return null;
                }
                c0 c0Var = new c0(null, view, (ComposeView) k.b0(view, 1, null, null)[0]);
                c0Var.f34810t = -1L;
                c0Var.f34809s.setTag(null);
                view.setTag(R.id.dataBinding, c0Var);
                c0Var.f0();
                return c0Var;
            case 12:
                if (!"layout/delivery_adapter_info_item_0".equals(tag)) {
                    i4.a.f(s.j(tag, "The tag for delivery_adapter_info_item is invalid. Received: "));
                    return null;
                }
                Object[] objArrB06 = k.b0(view, 5, null, e0.f34838v);
                ConstraintLayout constraintLayout = (ConstraintLayout) objArrB06[0];
                e0 e0Var = new e0(null, view, constraintLayout);
                e0Var.f34839u = -1L;
                e0Var.f34834s.setTag(null);
                view.setTag(R.id.dataBinding, e0Var);
                e0Var.f0();
                return e0Var;
            case 13:
                if ("layout/delivery_adapter_item_carousel_v2_0".equals(tag)) {
                    return new f0(view);
                }
                i4.a.f(s.j(tag, "The tag for delivery_adapter_item_carousel_v2 is invalid. Received: "));
                return null;
            case 14:
                if (!"layout/delivery_adapter_list_basket_item_0".equals(tag)) {
                    i4.a.f(s.j(tag, "The tag for delivery_adapter_list_basket_item is invalid. Received: "));
                    return null;
                }
                g0 g0Var = new g0(null, view, (ComposeView) k.b0(view, 1, null, null)[0]);
                g0Var.f34874t = -1L;
                g0Var.f34873s.setTag(null);
                view.setTag(R.id.dataBinding, g0Var);
                g0Var.f0();
                return g0Var;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                if ("layout/discover_bucket_view_0".equals(tag)) {
                    return new i0(view);
                }
                i4.a.f(s.j(tag, "The tag for discover_bucket_view is invalid. Received: "));
                return null;
            case 16:
                if (!"layout/discover_delivery_card_0".equals(tag)) {
                    i4.a.f(s.j(tag, "The tag for discover_delivery_card is invalid. Received: "));
                    return null;
                }
                Object[] objArrB07 = k.b0(view, 2, null, k0.f34933w);
                k0 k0Var = new k0(null, view, (DiscoverDeliveryTabComposeView) objArrB07[1], (LinearLayout) objArrB07[0]);
                k0Var.f34934v = -1L;
                k0Var.f34920t.setTag(null);
                view.setTag(R.id.dataBinding, k0Var);
                k0Var.f0();
                return k0Var;
            case 17:
                if ("layout/discover_flash_sales_view_0".equals(tag)) {
                    return new n0(view);
                }
                i4.a.f(s.j(tag, "The tag for discover_flash_sales_view is invalid. Received: "));
                return null;
            case 18:
                if ("layout/discover_location_card_0".equals(tag)) {
                    return new p0(view);
                }
                i4.a.f(s.j(tag, "The tag for discover_location_card is invalid. Received: "));
                return null;
            case 19:
                if ("layout/discover_search_extras_card_0".equals(tag)) {
                    return new u0(view);
                }
                i4.a.f(s.j(tag, "The tag for discover_search_extras_card is invalid. Received: "));
                return null;
            case 20:
                if (!"layout/discover_store_referral_0".equals(tag)) {
                    i4.a.f(s.j(tag, "The tag for discover_store_referral is invalid. Received: "));
                    return null;
                }
                v0 v0Var = new v0(null, view, (StoreReferralCardComposeView) k.b0(view, 1, null, null)[0]);
                v0Var.f35205t = -1L;
                v0Var.f35204s.setTag(null);
                view.setTag(R.id.dataBinding, v0Var);
                v0Var.f0();
                return v0Var;
            case 21:
                if ("layout/flash_sales_favorite_card_0".equals(tag)) {
                    return new d1(view);
                }
                i4.a.f(s.j(tag, "The tag for flash_sales_favorite_card is invalid. Received: "));
                return null;
            case 22:
                if ("layout/large_icon_button_0".equals(tag)) {
                    return new i1(view);
                }
                i4.a.f(s.j(tag, "The tag for large_icon_button is invalid. Received: "));
                return null;
            case 23:
                if ("layout/list_item_manufacturer_about_0".equals(tag)) {
                    return new k1(0, view);
                }
                i4.a.f(s.j(tag, "The tag for list_item_manufacturer_about is invalid. Received: "));
                return null;
            case 24:
                if ("layout/list_item_manufacturer_more_0".equals(tag)) {
                    return new k1(1, view);
                }
                i4.a.f(s.j(tag, "The tag for list_item_manufacturer_more is invalid. Received: "));
                return null;
            case 25:
                if ("layout/list_item_mnu_address_province_0".equals(tag)) {
                    return new m1(view);
                }
                i4.a.f(s.j(tag, "The tag for list_item_mnu_address_province is invalid. Received: "));
                return null;
            case 26:
                if ("layout/list_item_mnu_address_province_header_0".equals(tag)) {
                    return new o1(view);
                }
                i4.a.f(s.j(tag, "The tag for list_item_mnu_address_province_header is invalid. Received: "));
                return null;
            case 27:
                if ("layout/list_item_view_0".equals(tag)) {
                    return new q1(view);
                }
                i4.a.f(s.j(tag, "The tag for list_item_view is invalid. Received: "));
                return null;
            case 28:
                if ("layout/locationpicker_distance_item_0".equals(tag)) {
                    return new t1(view);
                }
                i4.a.f(s.j(tag, "The tag for locationpicker_distance_item is invalid. Received: "));
                return null;
            case 29:
                if ("layout/main_view_0".equals(tag)) {
                    return new v1(view);
                }
                i4.a.f(s.j(tag, "The tag for main_view is invalid. Received: "));
                return null;
            case 30:
                if ("layout/manufacturer_about1_0".equals(tag)) {
                    return new x1(view);
                }
                i4.a.f(s.j(tag, "The tag for manufacturer_about1 is invalid. Received: "));
                return null;
            case BERTags.DATE /* 31 */:
                if ("layout/manufacturer_about3_0".equals(tag)) {
                    return new z1(view);
                }
                i4.a.f(s.j(tag, "The tag for manufacturer_about3 is invalid. Received: "));
                return null;
            case 32:
                if (!"layout/manufacturer_item_details_0".equals(tag)) {
                    i4.a.f(s.j(tag, "The tag for manufacturer_item_details is invalid. Received: "));
                    return null;
                }
                Object[] objArrB08 = k.b0(view, 28, null, b2.L);
                BasketButtonRow basketButtonRow = (BasketButtonRow) objArrB08[26];
                LinearLayout linearLayout2 = (LinearLayout) objArrB08[23];
                LinearLayout linearLayout3 = (LinearLayout) objArrB08[25];
                LinearLayout linearLayout4 = (LinearLayout) objArrB08[21];
                ImageView imageView = (ImageView) objArrB08[22];
                Button button = (Button) objArrB08[24];
                ImageView imageView2 = (ImageView) objArrB08[3];
                LinearLayout linearLayout5 = (LinearLayout) objArrB08[15];
                ImageButton imageButton = (ImageButton) objArrB08[16];
                LinearLayout linearLayout6 = (LinearLayout) objArrB08[17];
                ImageButton imageButton2 = (ImageButton) objArrB08[18];
                TextView textView5 = (TextView) objArrB08[13];
                NestedScrollView nestedScrollView = (NestedScrollView) objArrB08[1];
                ImageView imageView3 = (ImageView) objArrB08[20];
                TGTGLoadingView tGTGLoadingView = (TGTGLoadingView) objArrB08[27];
                Object obj = objArrB08[2];
                if (obj != null) {
                    View view2 = (View) obj;
                    int i15 = R.id.DeliveryTimeTv;
                    TextView textView6 = (TextView) pd.g.t(R.id.DeliveryTimeTv, view2);
                    if (textView6 != null) {
                        i15 = R.id.badgeContainer;
                        FrameLayout frameLayout = (FrameLayout) pd.g.t(R.id.badgeContainer, view2);
                        if (frameLayout != null) {
                            i15 = R.id.bottleDepositIv;
                            ImageView imageView4 = (ImageView) pd.g.t(R.id.bottleDepositIv, view2);
                            if (imageView4 != null) {
                                i15 = R.id.bottleDepositTv;
                                TextView textView7 = (TextView) pd.g.t(R.id.bottleDepositTv, view2);
                                if (textView7 != null) {
                                    i15 = R.id.descriptionTv;
                                    ExpandableTextView expandableTextView = (ExpandableTextView) pd.g.t(R.id.descriptionTv, view2);
                                    if (expandableTextView != null) {
                                        i15 = R.id.dietContainer;
                                        LinearLayout linearLayout7 = (LinearLayout) pd.g.t(R.id.dietContainer, view2);
                                        if (linearLayout7 != null) {
                                            i15 = R.id.dietContainerMnu;
                                            LinearLayout linearLayout8 = (LinearLayout) pd.g.t(R.id.dietContainerMnu, view2);
                                            if (linearLayout8 != null) {
                                                i15 = R.id.dietMnuTv;
                                                TextView textView8 = (TextView) pd.g.t(R.id.dietMnuTv, view2);
                                                if (textView8 != null) {
                                                    i15 = R.id.faqItemLayout;
                                                    LinearLayout linearLayout9 = (LinearLayout) pd.g.t(R.id.faqItemLayout, view2);
                                                    if (linearLayout9 != null) {
                                                        i15 = R.id.faqTitleTv;
                                                        TextView textView9 = (TextView) pd.g.t(R.id.faqTitleTv, view2);
                                                        if (textView9 != null) {
                                                            i15 = R.id.freeDeliveryTv;
                                                            TextView textView10 = (TextView) pd.g.t(R.id.freeDeliveryTv, view2);
                                                            if (textView10 != null) {
                                                                i15 = R.id.horizontalLine;
                                                                if (pd.g.t(R.id.horizontalLine, view2) != null) {
                                                                    i15 = R.id.imageContainer;
                                                                    LinearLayout linearLayout10 = (LinearLayout) pd.g.t(R.id.imageContainer, view2);
                                                                    if (linearLayout10 != null) {
                                                                        i15 = R.id.itemCountImage;
                                                                        if (((ImageView) pd.g.t(R.id.itemCountImage, view2)) != null) {
                                                                            i15 = R.id.itemCountTv;
                                                                            TextView textView11 = (TextView) pd.g.t(R.id.itemCountTv, view2);
                                                                            if (textView11 != null) {
                                                                                i15 = R.id.itemDetailsNameTvMnu;
                                                                                TextView textView12 = (TextView) pd.g.t(R.id.itemDetailsNameTvMnu, view2);
                                                                                if (textView12 != null) {
                                                                                    LinearLayout linearLayout11 = (LinearLayout) view2;
                                                                                    i15 = R.id.newPriceDesign;
                                                                                    if (((ConstraintLayout) pd.g.t(R.id.newPriceDesign, view2)) != null) {
                                                                                        i15 = R.id.parcelIv;
                                                                                        ImageView imageView5 = (ImageView) pd.g.t(R.id.parcelIv, view2);
                                                                                        if (imageView5 != null) {
                                                                                            i15 = R.id.preDiscountDescriptionTv;
                                                                                            if (((TextView) pd.g.t(R.id.preDiscountDescriptionTv, view2)) != null) {
                                                                                                i15 = R.id.preDiscountLayout;
                                                                                                ConstraintLayout constraintLayout2 = (ConstraintLayout) pd.g.t(R.id.preDiscountLayout, view2);
                                                                                                if (constraintLayout2 != null) {
                                                                                                    i15 = R.id.preDiscountValueTv;
                                                                                                    TextView textView13 = (TextView) pd.g.t(R.id.preDiscountValueTv, view2);
                                                                                                    if (textView13 != null) {
                                                                                                        i15 = R.id.priceBottleDeposit;
                                                                                                        TextView textView14 = (TextView) pd.g.t(R.id.priceBottleDeposit, view2);
                                                                                                        if (textView14 != null) {
                                                                                                            i15 = R.id.priceBottleThirdLine;
                                                                                                            TextView textView15 = (TextView) pd.g.t(R.id.priceBottleThirdLine, view2);
                                                                                                            if (textView15 != null) {
                                                                                                                i15 = R.id.priceTvNormal;
                                                                                                                TextView textView16 = (TextView) pd.g.t(R.id.priceTvNormal, view2);
                                                                                                                if (textView16 != null) {
                                                                                                                    i15 = R.id.priceTvThirdLine;
                                                                                                                    TextView textView17 = (TextView) pd.g.t(R.id.priceTvThirdLine, view2);
                                                                                                                    if (textView17 != null) {
                                                                                                                        i15 = R.id.recommendationComposeContainer;
                                                                                                                        ComposeView composeView4 = (ComposeView) pd.g.t(R.id.recommendationComposeContainer, view2);
                                                                                                                        if (composeView4 != null) {
                                                                                                                            i15 = R.id.seeSmellTasteIv;
                                                                                                                            ImageView imageView6 = (ImageView) pd.g.t(R.id.seeSmellTasteIv, view2);
                                                                                                                            if (imageView6 != null) {
                                                                                                                                i15 = R.id.smileyIv;
                                                                                                                                ImageView imageView7 = (ImageView) pd.g.t(R.id.smileyIv, view2);
                                                                                                                                if (imageView7 != null) {
                                                                                                                                    i15 = R.id.space;
                                                                                                                                    if (pd.g.t(R.id.space, view2) != null) {
                                                                                                                                        i15 = R.id.statusContainerMnu;
                                                                                                                                        if (((LinearLayout) pd.g.t(R.id.statusContainerMnu, view2)) != null) {
                                                                                                                                            i15 = R.id.statusMnu;
                                                                                                                                            TextView textView18 = (TextView) pd.g.t(R.id.statusMnu, view2);
                                                                                                                                            if (textView18 != null) {
                                                                                                                                                i15 = R.id.tagLayout;
                                                                                                                                                LinearLayout linearLayout12 = (LinearLayout) pd.g.t(R.id.tagLayout, view2);
                                                                                                                                                if (linearLayout12 != null) {
                                                                                                                                                    i15 = R.id.tagLeaf1;
                                                                                                                                                    ImageView imageView8 = (ImageView) pd.g.t(R.id.tagLeaf1, view2);
                                                                                                                                                    if (imageView8 != null) {
                                                                                                                                                        i15 = R.id.tagLeaf2;
                                                                                                                                                        ImageView imageView9 = (ImageView) pd.g.t(R.id.tagLeaf2, view2);
                                                                                                                                                        if (imageView9 != null) {
                                                                                                                                                            i15 = R.id.thirdLineLayout;
                                                                                                                                                            ConstraintLayout constraintLayout3 = (ConstraintLayout) pd.g.t(R.id.thirdLineLayout, view2);
                                                                                                                                                            if (constraintLayout3 != null) {
                                                                                                                                                                i15 = R.id.truckIv;
                                                                                                                                                                if (((ImageView) pd.g.t(R.id.truckIv, view2)) != null) {
                                                                                                                                                                    i15 = R.id.tvBrandName;
                                                                                                                                                                    TextView textView19 = (TextView) pd.g.t(R.id.tvBrandName, view2);
                                                                                                                                                                    if (textView19 != null) {
                                                                                                                                                                        i15 = R.id.valueDescriptionTv;
                                                                                                                                                                        if (((TextView) pd.g.t(R.id.valueDescriptionTv, view2)) != null) {
                                                                                                                                                                            i15 = R.id.valueTv;
                                                                                                                                                                            TextView textView20 = (TextView) pd.g.t(R.id.valueTv, view2);
                                                                                                                                                                            if (textView20 != null) {
                                                                                                                                                                                k2Var = new k2(linearLayout11, textView6, frameLayout, imageView4, textView7, expandableTextView, linearLayout7, linearLayout8, textView8, linearLayout9, textView9, textView10, linearLayout10, textView11, textView12, linearLayout11, imageView5, constraintLayout2, textView13, textView14, textView15, textView16, textView17, composeView4, imageView6, imageView7, textView18, linearLayout12, imageView8, imageView9, constraintLayout3, textView19, textView20);
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
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    w.l("Missing required view with ID: ".concat(view2.getResources().getResourceName(i15)));
                    return null;
                }
                k2Var = null;
                MotionLayout motionLayout = (MotionLayout) objArrB08[0];
                b2 b2Var = new b2(null, view, basketButtonRow, linearLayout2, linearLayout3, linearLayout4, imageView, button, imageView2, linearLayout5, imageButton, linearLayout6, imageButton2, textView5, nestedScrollView, imageView3, tGTGLoadingView, k2Var, motionLayout);
                b2Var.K = -1L;
                b2Var.E.setTag(null);
                b2Var.I.setTag(null);
                view.setTag(R.id.dataBinding, b2Var);
                b2Var.f0();
                return b2Var;
            case 33:
                if (!"layout/manufacturer_list_0".equals(tag)) {
                    i4.a.f(s.j(tag, "The tag for manufacturer_list is invalid. Received: "));
                    return null;
                }
                Object[] objArrB09 = k.b0(view, 25, null, d2.P);
                TextView textView21 = (TextView) objArrB09[16];
                ConstraintLayout constraintLayout4 = (ConstraintLayout) objArrB09[18];
                TextView textView22 = (TextView) objArrB09[22];
                LinearLayout linearLayout13 = (LinearLayout) objArrB09[14];
                ConstraintLayout constraintLayout5 = (ConstraintLayout) objArrB09[15];
                TextView textView23 = (TextView) objArrB09[21];
                TextView textView24 = (TextView) objArrB09[20];
                DeliveryCategoryCarousel deliveryCategoryCarousel = (DeliveryCategoryCarousel) objArrB09[9];
                GenericErrorView genericErrorView = (GenericErrorView) objArrB09[24];
                ImageView imageView10 = (ImageView) objArrB09[5];
                RecyclerView recyclerView = (RecyclerView) objArrB09[13];
                ProgressBar progressBar = (ProgressBar) objArrB09[17];
                ConstraintLayout constraintLayout6 = (ConstraintLayout) objArrB09[0];
                ImageView imageView11 = (ImageView) objArrB09[7];
                LinearLayout linearLayout14 = (LinearLayout) objArrB09[6];
                ImageButton imageButton3 = (ImageButton) objArrB09[4];
                ConstraintLayout constraintLayout7 = (ConstraintLayout) objArrB09[3];
                DeliverySortingBottomSheet deliverySortingBottomSheet = (DeliverySortingBottomSheet) objArrB09[23];
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) objArrB09[10];
                d2 d2Var = new d2(null, view, textView21, constraintLayout4, textView22, linearLayout13, constraintLayout5, textView23, textView24, deliveryCategoryCarousel, genericErrorView, imageView10, recyclerView, progressBar, constraintLayout6, imageView11, linearLayout14, imageButton3, constraintLayout7, deliverySortingBottomSheet, swipeRefreshLayout, (TextView) objArrB09[8], (TextView) objArrB09[2]);
                d2Var.O = -1L;
                d2Var.E.setTag(null);
                view.setTag(R.id.dataBinding, d2Var);
                d2Var.f0();
                return d2Var;
            case BERTags.DURATION /* 34 */:
                if ("layout/mnu_about_fragment_0".equals(tag)) {
                    return new g2(view);
                }
                i4.a.f(s.j(tag, "The tag for mnu_about_fragment is invalid. Received: "));
                return null;
            case BERTags.OBJECT_IDENTIFIER_IRI /* 35 */:
                if ("layout/mnu_bucket_item_0".equals(tag)) {
                    return new h2(view);
                }
                i4.a.f(s.j(tag, "The tag for mnu_bucket_item is invalid. Received: "));
                return null;
            case 36:
                if (!"layout/mnu_faq_item_0".equals(tag)) {
                    i4.a.f(s.j(tag, "The tag for mnu_faq_item is invalid. Received: "));
                    return null;
                }
                Object[] objArrB010 = k.b0(view, 9, null, j2.D);
                j2 j2Var = new j2(null, view, (LinearLayout) objArrB010[4], (TextView) objArrB010[5], (ImageView) objArrB010[3], (ConstraintLayout) objArrB010[0], (TextView) objArrB010[7], (TextView) objArrB010[2], (View) objArrB010[8], (LinearLayout) objArrB010[6], (LinearLayout) objArrB010[1]);
                j2Var.C = -1L;
                j2Var.f34911v.setTag(null);
                view.setTag(R.id.dataBinding, j2Var);
                j2Var.f0();
                return j2Var;
            case 37:
                if ("layout/mnu_list_item_nps_0".equals(tag)) {
                    return new m2(view);
                }
                i4.a.f(s.j(tag, "The tag for mnu_list_item_nps is invalid. Received: "));
                return null;
            case 38:
                if ("layout/mystore_webview_container_0".equals(tag)) {
                    return new o2(view);
                }
                i4.a.f(s.j(tag, "The tag for mystore_webview_container is invalid. Received: "));
                return null;
            case 39:
                if (!"layout/nps_rating_page_base_0".equals(tag)) {
                    i4.a.f(s.j(tag, "The tag for nps_rating_page_base is invalid. Received: "));
                    return null;
                }
                Object[] objArrB011 = k.b0(view, 8, q2.C, q2.D);
                ConstraintLayout constraintLayout8 = (ConstraintLayout) objArrB011[0];
                FrameLayout frameLayout2 = (FrameLayout) objArrB011[1];
                Object obj2 = objArrB011[2];
                if (obj2 != null) {
                    View view3 = (View) obj2;
                    int i16 = R.id.btnSubmit;
                    TextView textView25 = (TextView) pd.g.t(R.id.btnSubmit, view3);
                    if (textView25 != null) {
                        i16 = R.id.etFeedback;
                        c3 = 6;
                        EditText editText = (EditText) pd.g.t(R.id.etFeedback, view3);
                        if (editText != null) {
                            i16 = R.id.tittleTv;
                            if (((TextView) pd.g.t(R.id.tittleTv, view3)) != null) {
                                aVar = new mc.a((ConstraintLayout) view3, textView25, editText, i14);
                            }
                        }
                    }
                    w.l("Missing required view with ID: ".concat(view3.getResources().getResourceName(i16)));
                    return null;
                }
                c3 = 6;
                aVar = null;
                q2 q2Var = new q2(null, view, constraintLayout8, frameLayout2, aVar, (TextView) objArrB011[c3], (ImageView) objArrB011[5], (ImageView) objArrB011[7], (r2) objArrB011[3], (s2) objArrB011[4]);
                q2Var.B = -1L;
                q2Var.f35067s.setTag(null);
                q2Var.f35068t.setTag(null);
                r2 r2Var = q2Var.f35073y;
                if (r2Var != null) {
                    r2Var.f991k = q2Var;
                }
                s2 s2Var = q2Var.f35074z;
                if (s2Var != null) {
                    s2Var.f991k = q2Var;
                }
                view.setTag(R.id.dataBinding, q2Var);
                q2Var.f0();
                return q2Var;
            case 40:
                if ("layout/nps_rating_page_rating_0".equals(tag)) {
                    return new r2(view);
                }
                i4.a.f(s.j(tag, "The tag for nps_rating_page_rating is invalid. Received: "));
                return null;
            case RequestError.NO_DEV_KEY /* 41 */:
                if (!"layout/nps_rating_page_thanks_0".equals(tag)) {
                    i4.a.f(s.j(tag, "The tag for nps_rating_page_thanks is invalid. Received: "));
                    return null;
                }
                Object[] objArrB012 = k.b0(view, 1, null, null);
                s2 s2Var2 = new s2(0, view, null);
                s2Var2.f35156s = -1L;
                ((ConstraintLayout) objArrB012[0]).setTag(null);
                view.setTag(R.id.dataBinding, s2Var2);
                s2Var2.f0();
                return s2Var2;
            case 42:
                if ("layout/order_list_item_new_0".equals(tag)) {
                    return new v2(view);
                }
                i4.a.f(s.j(tag, "The tag for order_list_item_new is invalid. Received: "));
                return null;
            case 43:
                if (!"layout/order_list_month_item_0".equals(tag)) {
                    i4.a.f(s.j(tag, "The tag for order_list_month_item is invalid. Received: "));
                    return null;
                }
                Object[] objArrB013 = k.b0(view, 4, null, x2.f35272y);
                x2 x2Var = new x2(null, view, (ConstraintLayout) objArrB013[0], (RecyclerView) objArrB013[3], (TextView) objArrB013[2], (TextView) objArrB013[1]);
                x2Var.f35273x = -1L;
                x2Var.f35252s.setTag(null);
                view.setTag(R.id.dataBinding, x2Var);
                x2Var.f0();
                return x2Var;
            case 44:
                if ("layout/post_manufacturer_purchase_popup_0".equals(tag)) {
                    return new a3(view);
                }
                i4.a.f(s.j(tag, "The tag for post_manufacturer_purchase_popup is invalid. Received: "));
                return null;
            case 45:
                if ("layout/post_purchase_email_prompt_view_0".equals(tag)) {
                    return new b3(view);
                }
                i4.a.f(s.j(tag, "The tag for post_purchase_email_prompt_view is invalid. Received: "));
                return null;
            case 46:
                if ("layout/post_purchase_phone_prompt_view_0".equals(tag)) {
                    return new c3(view);
                }
                i4.a.f(s.j(tag, "The tag for post_purchase_phone_prompt_view is invalid. Received: "));
                return null;
            case 47:
                if ("layout/profile_view_0".equals(tag)) {
                    return new k1(2, view);
                }
                i4.a.f(s.j(tag, "The tag for profile_view is invalid. Received: "));
                return null;
            case 48:
                if ("layout/recycler_item_loading_0".equals(tag)) {
                    return new e3(view);
                }
                i4.a.f(s.j(tag, "The tag for recycler_item_loading is invalid. Received: "));
                return null;
            case 49:
                if ("layout/search_and_filter_card_0".equals(tag)) {
                    return new g3(view);
                }
                i4.a.f(s.j(tag, "The tag for search_and_filter_card is invalid. Received: "));
                return null;
            case 50:
                if ("layout/server_message_view_0".equals(tag)) {
                    return new i3(view);
                }
                i4.a.f(s.j(tag, "The tag for server_message_view is invalid. Received: "));
                return null;
            default:
                return null;
        }
    }

    @Override // a8.a
    public final k c(int i11, View[] viewArr) {
        if (viewArr.length == 0 || f8871a.get(i11) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        d0.k("view must have a tag");
        return null;
    }
}
