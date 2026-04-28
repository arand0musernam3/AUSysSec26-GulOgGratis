package mv;

import android.app.Activity;
import android.content.ContentUris;
import android.content.Context;
import android.graphics.Rect;
import android.location.Location;
import android.net.Uri;
import android.provider.CalendarContract;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.TextView;
import androidx.activity.result.ActivityResultLauncher;
import com.app.tgtg.R;
import com.app.tgtg.feature.catering.ui.CateringItemDetailsActivity;
import com.app.tgtg.feature.itemview.ui.ItemViewActivity;
import com.app.tgtg.feature.main.fragments.delivery.parcelitemdetails.ManufacturerItemDetailsActivity;
import com.app.tgtg.model.remote.item.DeliveryMethod;
import com.app.tgtg.model.remote.item.ItemTag;
import com.app.tgtg.model.remote.item.ItemTagInfo;
import com.app.tgtg.model.remote.item.LatLngInfo;
import com.app.tgtg.model.remote.item.LocalHero;
import com.app.tgtg.model.remote.item.PickupInterval;
import com.app.tgtg.model.remote.item.Picture;
import com.app.tgtg.model.remote.item.StoreInformation;
import com.app.tgtg.model.remote.item.StoreLegalInformation;
import com.app.tgtg.model.remote.item.StoreLocation;
import com.app.tgtg.model.remote.item.TagVariant;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.item.response.ItemState;
import com.app.tgtg.model.remote.item.response.ItemType;
import com.app.tgtg.model.remote.payment.Price;
import com.app.tgtg.model.remote.token.RefreshToken;
import com.app.tgtg.model.remote.token.RefreshTokenResult;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import m90.z0;
import v80.b2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f30162a = {"_id", "account_name", "calendar_displayName", "ownerAccount", "isPrimary"};

    public static final boolean A() {
        try {
            b bVar = b.f30149d;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("instance");
                bVar = null;
            }
            return bVar.f30151b;
        } catch (Exception unused) {
            return false;
        }
    }

    public static final boolean a(View view) {
        if (!view.isShown()) {
            return false;
        }
        view.getGlobalVisibleRect(new Rect());
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return ((double) ((int) ((((double) 100) * ((double) (rect.height() * rect.width()))) / ((double) (view.getHeight() * view.getWidth()))))) >= 80.0d;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0073 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00c7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x009e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int b(android.content.Context r11, com.app.tgtg.model.remote.order.Order r12, java.lang.String r13) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mv.d.b(android.content.Context, com.app.tgtg.model.remote.order.Order, java.lang.String):int");
    }

    public static final void c(Activity activity, ActivityResultLauncher activityResultLauncher, Function0 function0, Function0 function02) {
        activity.getClass();
        activityResultLauncher.getClass();
        if (!ft.c.D() && !o(activity)) {
            activityResultLauncher.a(new String[]{"android.permission.READ_CALENDAR", "android.permission.WRITE_CALENDAR"}, null);
            return;
        }
        if (function0 != null) {
            function0.invoke();
        }
        bg.k0 k0Var = new bg.k0(activity);
        k0Var.f6171b = null;
        k0Var.a(R.string.notification_settings_calendar_alert_body);
        k0Var.c(R.string.notification_settings_push_notifications_confirm_button);
        k0Var.l = new ap.f(activity, 8);
        k0Var.b(R.string.notification_settings_push_notifications_cancel_button);
        k0Var.f6182n = new ki.a(27, function02);
        k0Var.f6183o = new ki.a(28, function02);
        k0Var.f();
    }

    public static final double d(LatLngInfo latLngInfo, LatLngInfo latLngInfo2) {
        Location.distanceBetween(latLngInfo2.getLatitude(), latLngInfo2.getLongitude(), latLngInfo.getLatitude(), latLngInfo.getLongitude(), new float[2]);
        return r9[0];
    }

    public static final float e(float f11, float f12) {
        double dLog;
        double dLog2;
        double d3;
        if (f12 <= 10.0f) {
            dLog = Math.log(f11 - f12);
            dLog2 = Math.log(4.0d);
        } else {
            if (f12 == f11) {
                d3 = 0.0d;
                return f12 + ((float) d3);
            }
            dLog = Math.log(f11 - f12);
            dLog2 = Math.log(5.0d);
        }
        d3 = dLog / dLog2;
        return f12 + ((float) d3);
    }

    public static final void f(BasicItem basicItem, boolean z11) {
        basicItem.getClass();
        basicItem.setFavorite(z11);
        Function1<Boolean, Unit> onFavoriteChangedListener = basicItem.getOnFavoriteChangedListener();
        if (onFavoriteChangedListener != null) {
            onFavoriteChangedListener.invoke(Boolean.valueOf(z11));
        }
    }

    public static final void g(Context context, Integer num) {
        int iIntValue;
        context.getClass();
        if (num == null || (iIntValue = num.intValue()) == 0 || !o(context)) {
            return;
        }
        Uri uriWithAppendedId = ContentUris.withAppendedId(CalendarContract.Events.CONTENT_URI, iIntValue);
        uriWithAppendedId.getClass();
        context.getContentResolver().delete(uriWithAppendedId, null, null);
    }

    public static final String h(double d3) {
        if (A()) {
            double d11 = 3280.84d * d3;
            if (d11 < 1000.0d) {
                LinkedHashMap linkedHashMap = j0.f30194a;
                return j0.b(Double.valueOf(d11), 0, 4).concat(" ft");
            }
            LinkedHashMap linkedHashMap2 = j0.f30194a;
            return j0.b(Double.valueOf(d3 * 0.621371d), 0, 6).concat(" mi");
        }
        if (d3 < 1.0d) {
            LinkedHashMap linkedHashMap3 = j0.f30194a;
            return j0.b(Double.valueOf(d3 * ((double) 1000)), 0, 4).concat(" m");
        }
        if (d3 < 10.0d) {
            LinkedHashMap linkedHashMap4 = j0.f30194a;
            return j0.b(Double.valueOf(d3), 0, 6).concat(" km");
        }
        LinkedHashMap linkedHashMap5 = j0.f30194a;
        return j0.b(Double.valueOf(d3), 0, 4).concat(" km");
    }

    public static final String i(Price price, int i11) {
        String languageTag;
        LinkedHashMap linkedHashMap = j0.f30194a;
        try {
            b bVar = b.f30149d;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("instance");
                bVar = null;
            }
            languageTag = bVar.a();
        } catch (Exception unused) {
            languageTag = Locale.getDefault().toLanguageTag();
            languageTag.getClass();
        }
        String currency = price != null ? price.getCurrency() : null;
        if (currency == null || currency.length() == 0) {
            return "";
        }
        try {
            i0 i0Var = new i0(languageTag, price.getCurrency(), price.getDecimals());
            LinkedHashMap linkedHashMap2 = j0.f30194a;
            Object obj = linkedHashMap2.get(i0Var);
            Object obj2 = obj;
            if (obj == null) {
                NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(Locale.forLanguageTag(languageTag));
                currencyInstance.setCurrency(Currency.getInstance(price.getCurrency()));
                currencyInstance.setMaximumFractionDigits(price.getDecimals());
                linkedHashMap2.put(i0Var, currencyInstance);
                obj2 = currencyInstance;
            }
            String str = ((NumberFormat) obj2).format(new BigDecimal(price.getMinorUnits()).divide(BigDecimal.TEN.pow(price.getDecimals())).multiply(new BigDecimal(i11)));
            str.getClass();
            return str;
        } catch (Exception e5) {
            sa0.a.f38953a.d(e5);
            return "";
        }
    }

    public static final ItemState j(BasicItem basicItem) {
        basicItem.getClass();
        return !r0.v(basicItem.getSoldOutAt()) ? ItemState.SOLD_OUT : (basicItem.getPurchaseEnd() == null || System.currentTimeMillis() <= p0.h(basicItem.getPurchaseEnd())) ? basicItem.getItemsAvailable() == 0 ? ItemState.INACTIVE_TODAY : basicItem.getItemsAvailable() <= 4 ? ItemState.FEW_LEFT : ItemState.AVAILABLE : ItemState.SALES_ENDED;
    }

    public static final Picture k(BasicItem basicItem) {
        basicItem.getClass();
        return basicItem.getInformation().getLogoPicture().getCurrentUrl() != null ? basicItem.getInformation().getLogoPicture() : m(basicItem).getLogoPicture();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final PickupInterval l(BasicItem basicItem) {
        basicItem.getClass();
        if (basicItem.getPickupIntervalOrNull() == null) {
            basicItem.setPickupIntervalOrNull(new PickupInterval((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0)));
        }
        PickupInterval pickupIntervalOrNull = basicItem.getPickupIntervalOrNull();
        pickupIntervalOrNull.getClass();
        return pickupIntervalOrNull;
    }

    public static final StoreInformation m(BasicItem basicItem) {
        BasicItem basicItem2;
        basicItem.getClass();
        if (basicItem.getStoreInfoOrNull() == null) {
            basicItem2 = basicItem;
            basicItem2.setStoreInfoOrNull(new StoreInformation((String) null, (String) null, (String) null, (String) null, (String) null, (StoreLocation) null, (Picture) null, (String) null, false, (List) null, (List) null, 0.0d, (Picture) null, false, (String) null, (String) null, (String) null, (DeliveryMethod) null, (StoreLegalInformation) null, (LocalHero) null, false, (String) null, 4194303, (DefaultConstructorMarker) null));
        } else {
            basicItem2 = basicItem;
        }
        StoreInformation storeInfoOrNull = basicItem2.getStoreInfoOrNull();
        storeInfoOrNull.getClass();
        return storeInfoOrNull;
    }

    public static final long n(BasicItem basicItem) {
        String intervalEnd;
        basicItem.getClass();
        String intervalStart = l(basicItem).getIntervalStart();
        if (intervalStart == null || (intervalEnd = l(basicItem).getIntervalEnd()) == null) {
            return 0L;
        }
        Date dateI = p0.I(intervalStart);
        Date dateI2 = p0.I(intervalEnd);
        if (dateI2 != null) {
            return dateI2.getTime() - (dateI != null ? dateI.getTime() : 0L);
        }
        return 0L;
    }

    public static final boolean o(Context context) {
        context.getClass();
        return androidx.core.app.e.a(context, "android.permission.READ_CALENDAR") == 0 && androidx.core.app.e.a(context, "android.permission.WRITE_CALENDAR") == 0;
    }

    public static final boolean p(BasicItem basicItem) {
        basicItem.getClass();
        if (basicItem.getItemType() == ItemType.TABLE_RESERVATION) {
            return true;
        }
        List<ItemTagInfo> itemTags = basicItem.getItemTags();
        if (itemTags != null && !itemTags.isEmpty()) {
            Iterator<T> it = itemTags.iterator();
            while (it.hasNext()) {
                if (((ItemTagInfo) it.next()).getId() == ItemTag.DINE_IN) {
                    return true;
                }
            }
        }
        List<ItemTagInfo> itemTags2 = basicItem.getItemTags();
        if (itemTags2 == null || itemTags2.isEmpty()) {
            return false;
        }
        Iterator<T> it2 = itemTags2.iterator();
        while (it2.hasNext()) {
            if (((ItemTagInfo) it2.next()).getVariant() == TagVariant.DINE_IN) {
                return true;
            }
        }
        return false;
    }

    public static final boolean q(BasicItem basicItem) {
        basicItem.getClass();
        int i11 = c.$EnumSwitchMapping$1[j(basicItem).ordinal()];
        return (i11 == 1 || i11 == 2 || i11 == 3 || basicItem.getItemsAvailable() <= 0) ? false : true;
    }

    public static final boolean r(CharSequence charSequence) {
        return !(charSequence == null || charSequence.length() == 0);
    }

    public static final Class s(BasicItem basicItem) {
        basicItem.getClass();
        int i11 = c.$EnumSwitchMapping$0[basicItem.getItemType().ordinal()];
        return i11 != 1 ? i11 != 2 ? ItemViewActivity.class : CateringItemDetailsActivity.class : ManufacturerItemDetailsActivity.class;
    }

    public static final String t(BasicItem basicItem) {
        basicItem.getClass();
        return basicItem.getItemType().name();
    }

    public static void u(a9.a aVar, Function2 function2) {
        kotlin.coroutines.g gVar = kotlin.coroutines.g.f26549a;
        v80.d0 d0Var = v80.d0.DEFAULT;
        gVar.getClass();
        d0Var.getClass();
        v80.f0.A(aVar, gVar, d0Var, new h8.b(function2, null, 2));
    }

    public static b2 v(v80.b0 b0Var, long j9, Function0 function0, Function2 function2, int i11) {
        e eVar = e.f30174a;
        if ((i11 & 4) != 0) {
            function0 = new m60.a(3);
        }
        b0Var.getClass();
        eVar.getClass();
        return v80.f0.B(b0Var, null, null, new a3.w(j9, function2, eVar, function0, (x70.c) null), 3);
    }

    public static boolean w(jt.j jVar, ft.o oVar) throws Throwable {
        jVar.getClass();
        oVar.getClass();
        if (oVar.a()) {
            x70.c cVar = null;
            if (oVar.f17956f == null) {
                oVar.f17956f = (String) v80.f0.E(kotlin.coroutines.g.f26549a, new ft.l(oVar, cVar, 3));
            }
            oa0.n0 n0VarE = jVar.a(new RefreshToken(oVar.f17956f)).e();
            Object obj = n0VarE.f32352b;
            q90.p0 p0Var = n0VarE.f32351a;
            RefreshTokenResult refreshTokenResult = (RefreshTokenResult) obj;
            if (refreshTokenResult != null && p0Var.f36597q) {
                String accessToken = refreshTokenResult.getAccessToken();
                String refreshToken = refreshTokenResult.getRefreshToken();
                long accessTokenTtlSeconds = refreshTokenResult.getAccessTokenTtlSeconds();
                accessToken.getClass();
                refreshToken.getClass();
                v80.f0.E(kotlin.coroutines.g.f26549a, new a3.w(accessTokenTtlSeconds, oVar, accessToken, refreshToken, (x70.c) null));
                return true;
            }
            if (p0Var.f36585d == 401) {
                v80.f0.E(kotlin.coroutines.g.f26549a, new a3.y(oVar, cVar, 9));
            }
        }
        return false;
    }

    public static final void x(View view, Function1 function1) {
        view.getClass();
        pt.c cVar = new pt.c(null);
        cVar.f35624c = function1;
        view.setOnClickListener(cVar);
    }

    public static final void y(TextView textView, Function1 function1) {
        textView.addTextChangedListener(new fl.f(new gn.z(function1, 2), 3));
    }

    public static void z(TextView textView, String str, z0 z0Var, int i11) {
        if ((i11 & 4) != 0) {
            z0Var = null;
        }
        textView.getClass();
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setLinkTextColor(androidx.core.app.e.b(textView.getContext(), R.color.neutral_70));
        SpannableString spannableString = new SpannableString(m0.c.c0(str));
        URLSpan[] uRLSpanArr = (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class);
        uRLSpanArr.getClass();
        for (URLSpan uRLSpan : uRLSpanArr) {
            Context context = textView.getContext();
            context.getClass();
            lw.o oVar = new lw.o(z0Var, uRLSpan, textView, 3);
            String url = uRLSpan.getURL();
            url.getClass();
            g0 g0Var = new g0(context, oVar, url);
            int spanStart = spannableString.getSpanStart(uRLSpan);
            int spanEnd = spannableString.getSpanEnd(uRLSpan);
            spannableString.removeSpan(uRLSpan);
            spannableString.setSpan(g0Var, spanStart, spanEnd, 0);
        }
        textView.setText(spannableString);
    }
}
