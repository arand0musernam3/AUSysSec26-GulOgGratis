package mv;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.Toast;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.Country;
import com.app.tgtg.model.remote.item.ItemTagInfo;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.internal.measurement.cg;
import com.google.i18n.phonenumbers.NumberParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;
import t1.w1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class r0 {
    public static final String a(Context context, BasicItem basicItem) {
        context.getClass();
        basicItem.getClass();
        return d.m(basicItem).getStoreNameAndBranch() + "... " + i(context, basicItem) + "... " + ((Object) l(basicItem.getItemTags())) + ((CharSequence) p0.m(context, d.l(basicItem), d.j(basicItem), false, false)) + "... " + d.h(basicItem.getDistance()) + "... " + d.i(basicItem.getInformation().getDisplayPrice(), 1) + "... ";
    }

    public static final void b(ImageView imageView) {
        imageView.getClass();
        lx.u.H(imageView).a();
    }

    public static final boolean c(Activity activity) {
        activity.getClass();
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.f11044d;
        int iB = googleApiAvailability.b(activity, com.google.android.gms.common.a.f11047a);
        if (iB == 0) {
            return true;
        }
        AtomicBoolean atomicBoolean = pz.e.f35655a;
        if (iB != 1 && iB != 2 && iB != 3 && iB != 9) {
            Toast.makeText(activity, "This device is not supported", 1).show();
            return false;
        }
        AlertDialog alertDialogC = googleApiAvailability.c(activity, iB, 400, null);
        if (alertDialogC == null) {
            return false;
        }
        alertDialogC.show();
        return false;
    }

    public static final Country d(Context context, ArrayList arrayList) {
        Object next;
        context.getClass();
        arrayList.getClass();
        String strH = h(context);
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (kotlin.text.y.k(((Country) next).getIso(), strH, true)) {
                break;
            }
        }
        return (Country) next;
    }

    public static final Activity e(Context context) {
        context.getClass();
        do {
            Activity activity = context instanceof Activity ? (Activity) context : null;
            if (activity != null) {
                return activity;
            }
            ContextWrapper contextWrapper = context instanceof ContextWrapper ? (ContextWrapper) context : null;
            if (contextWrapper == null) {
                break;
            }
            context = contextWrapper.getBaseContext();
        } while (context != null);
        return null;
    }

    public static final String f(Context context, String str) {
        context.getClass();
        if (Intrinsics.areEqual(str, jg.c.DE.toString())) {
            String string = context.getString(R.string.mnu_bottle_deposit_de_item);
            string.getClass();
            return string;
        }
        if (Intrinsics.areEqual(str, jg.c.PL.toString())) {
            String string2 = context.getString(R.string.mnu_bottle_deposit_pl_item);
            string2.getClass();
            return string2;
        }
        String string3 = context.getString(R.string.mnu_bottle_deposit);
        string3.getClass();
        return string3;
    }

    public static final long g(String str) {
        Object pVar;
        str.getClass();
        try {
            u70.o oVar = u70.q.f40850b;
            pVar = new i4.v(i4.g0.c(Color.parseColor(str)));
        } catch (Throwable th2) {
            u70.o oVar2 = u70.q.f40850b;
            pVar = new u70.p(th2);
        }
        int i11 = lv.s.f28226f0;
        Object vVar = new i4.v(lv.s.J);
        if (pVar instanceof u70.p) {
            pVar = vVar;
        }
        return ((i4.v) pVar).f23317a;
    }

    public static final String h(Context context) {
        context.getClass();
        Object systemService = context.getSystemService("phone");
        systemService.getClass();
        String networkCountryIso = ((TelephonyManager) systemService).getNetworkCountryIso();
        networkCountryIso.getClass();
        if (!Intrinsics.areEqual(networkCountryIso, "")) {
            return networkCountryIso;
        }
        String country = Locale.getDefault().getCountry();
        country.getClass();
        return country;
    }

    public static final String i(Context context, BasicItem basicItem) {
        basicItem.getClass();
        if (context == null) {
            sa0.a.f38953a.a("context null, returning empty name", new Object[0]);
            return "";
        }
        String name = basicItem.getInformation().getName();
        if (name == null || name.length() == 0) {
            String string = context.getString(R.string.item_view_default_item_name);
            string.getClass();
            return string;
        }
        String name2 = basicItem.getInformation().getName();
        name2.getClass();
        return name2;
    }

    public static void j(Context context, BasicItem basicItem) {
        basicItem.getClass();
        int i11 = q0.$EnumSwitchMapping$0[d.j(basicItem).ordinal()];
        int i12 = R.drawable.item_view_status_gray;
        switch (i11) {
            case 1:
            case 2:
            case 3:
            case 6:
                break;
            case 4:
                i12 = R.drawable.item_view_status_green;
                break;
            case 5:
                i12 = R.drawable.item_view_status_yellow;
                break;
            default:
                e40.a.f();
                return;
        }
        b0.a0.x(context, i12);
    }

    public static final double k() {
        double dJ = ft.c.j();
        return dJ == 0.0d ? d.A() ? xk.d.DEFAULT.a() * 1.609d : xk.c.DEFAULT.a() : dJ;
    }

    public static final String l(List list) {
        ArrayList arrayList;
        if (list != null) {
            arrayList = new ArrayList(kotlin.collections.e0.o(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((ItemTagInfo) it.next()).getShortText());
            }
        } else {
            arrayList = null;
        }
        if (!cg.q(arrayList)) {
            return "";
        }
        return arrayList + "... ";
    }

    public static final void m(k.h hVar, boolean z11, boolean z12) {
        hVar.getClass();
        if (z11) {
            p(hVar);
        }
        if (z12 && hVar.isTaskRoot()) {
            new a0().c(hVar);
        }
        hVar.finish();
    }

    public static final void o(Context context, Throwable th2) {
        context.getClass();
        th2.getClass();
        new Handler(Looper.getMainLooper()).post(new mr.h(1, context, th2));
    }

    public static final void p(Activity activity) {
        activity.getClass();
        if (activity.getCurrentFocus() != null) {
            Object systemService = activity.getSystemService("input_method");
            systemService.getClass();
            View currentFocus = activity.getCurrentFocus();
            currentFocus.getClass();
            ((InputMethodManager) systemService).hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }

    public static final boolean q(Context context) {
        context.getClass();
        Object systemService = context.getSystemService("accessibility");
        systemService.getClass();
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        return accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled();
    }

    public static final boolean r(Context context) {
        context.getClass();
        Object systemService = context.getSystemService("phone");
        systemService.getClass();
        return ((TelephonyManager) systemService).getPhoneType() == 0 || context.getResources().getBoolean(R.bool.isTablet);
    }

    public static final boolean s(String str) {
        return str == null || TextUtils.isEmpty(str) || !Patterns.EMAIL_ADDRESS.matcher(str).matches();
    }

    public static final boolean t(BasicItem basicItem) {
        basicItem.getClass();
        int i11 = q0.$EnumSwitchMapping$0[d.j(basicItem).ordinal()];
        return (i11 == 1 || i11 == 2 || i11 == 3 || basicItem.getItemsAvailable() <= 0) ? false : true;
    }

    public static final boolean u(Context context) {
        context.getClass();
        Object systemService = context.getSystemService("connectivity");
        systemService.getClass();
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public static final boolean v(String str) {
        return str == null || str.length() == 0;
    }

    public static final boolean w(String str) {
        h50.d dVar;
        boolean zI;
        Logger logger = h50.d.f21419h;
        synchronized (h50.d.class) {
            try {
                if (h50.d.f21431u == null) {
                    j50.a aVar = j50.a.f24735d;
                    k50.a aVar2 = aVar.f24737b;
                    if (aVar2 == null) {
                        throw new IllegalArgumentException("metadataLoader could not be null.");
                    }
                    h50.d dVar2 = new h50.d(new k8.d(aVar.f24738c, aVar2, aVar.f24736a), ox.h.z());
                    synchronized (h50.d.class) {
                        h50.d.f21431u = dVar2;
                    }
                }
                dVar = h50.d.f21431u;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        try {
            zI = dVar.i(dVar.n(str));
        } catch (NumberParseException unused) {
            zI = false;
        }
        return !zI;
    }

    public static final void x(String str, ImageView imageView) {
        imageView.getClass();
        if (v(str)) {
            return;
        }
        fd.t tVarA = fd.w.a(imageView.getContext());
        td.e eVar = new td.e(imageView.getContext());
        eVar.f39959c = str;
        td.k.b(eVar, imageView);
        eVar.f39967k = new w1(2);
        eVar.l = new f2.y(R.color.neutral_10, 6);
        eVar.f39970o = ud.g.FIT;
        tVarA.a(eVar.a());
    }

    public static final void y(String str, ImageView imageView, int i11) {
        imageView.getClass();
        if (v(str)) {
            return;
        }
        fd.t tVarA = fd.w.a(imageView.getContext());
        td.e eVar = new td.e(imageView.getContext());
        eVar.f39959c = str;
        td.k.b(eVar, imageView);
        yd.b[] bVarArr = {new yd.a()};
        fd.j jVar = td.j.f40016a;
        td.j.a(eVar, kotlin.collections.y.T(bVarArr));
        eVar.f39961e = new a3.j(imageView, i11, eVar);
        tVarA.a(eVar.a());
    }
}
