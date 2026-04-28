package a50;

import a2.n;
import a3.u2;
import an.g;
import an.i;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Region;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsetsController;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.lifecycle.Lifecycle;
import at.b0;
import ax.a0;
import b5.m0;
import b5.m2;
import b5.o;
import c20.h;
import c5.s3;
import c5.t3;
import com.app.tgtg.feature.main.MainActivity;
import com.app.tgtg.model.remote.item.response.BasketIntroBannerMnu;
import com.app.tgtg.model.remote.item.response.CategoryCarouselMnuV2;
import com.app.tgtg.model.remote.item.response.ElementMnuV2;
import com.app.tgtg.model.remote.item.response.GroupHeaderMnuV2;
import com.app.tgtg.model.remote.item.response.HeaderItem;
import com.app.tgtg.model.remote.item.response.HeroCarouselMnu;
import com.app.tgtg.model.remote.item.response.HighlightedItemCardsCarouselMnuV2;
import com.app.tgtg.model.remote.item.response.HighlightedItemMnuV2;
import com.app.tgtg.model.remote.item.response.IntroBanner;
import com.app.tgtg.model.remote.item.response.ItemCarouselMnu;
import com.app.tgtg.model.remote.item.response.ItemCarouselMnuV2;
import com.app.tgtg.model.remote.item.response.ItemMnu;
import com.app.tgtg.model.remote.item.response.SeparatorItem;
import com.app.tgtg.model.remote.item.response.TextMnu;
import com.app.tgtg.model.remote.item.response.TextMnuV2;
import com.app.tgtg.model.remote.item.response.TypedItemCardsCarouselMnu;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import d10.e;
import d10.f;
import f0.a4;
import f0.w0;
import f0.y3;
import h7.e0;
import h7.g0;
import i0.w;
import i4.v;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.MissingFormatArgumentException;
import java.util.Objects;
import java.util.regex.Matcher;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import m0.d0;
import org.json.JSONArray;
import org.json.JSONException;
import pg.c0;
import qz.q;
import s0.i1;
import ym.y;
import ym.z;
import z1.q2;
import z5.p;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements a2.b, f, h, s3, d0, e, i30.f, bt.a, q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile c f820c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f822b;

    public c(int i11) {
        this.f821a = i11;
        switch (i11) {
            case 6:
                SharedPreferences sharedPreferences = a0.a().getSharedPreferences("com.facebook.AuthenticationTokenManager.SharedPreferences", 0);
                sharedPreferences.getClass();
                sharedPreferences.getClass();
                this.f822b = sharedPreferences;
                break;
            case 7:
                this.f822b = new m2(o.f5907a);
                break;
            case 12:
                this.f822b = i1.h();
                break;
            case 26:
                this.f822b = new se.b(27);
                break;
            case 28:
                this.f822b = new Region();
                break;
            default:
                this.f822b = new HashSet();
                break;
        }
    }

    public static String E(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    public static void o(c cVar, ElementMnuV2 elementMnuV2, boolean z11, y yVar, z zVar, int i11, Integer num, Boolean bool, String str, int i12) {
        if ((i12 & 2) != 0) {
            z11 = true;
        }
        if ((i12 & 4) != 0) {
            yVar = null;
        }
        if ((i12 & 8) != 0) {
            zVar = null;
        }
        if ((i12 & 16) != 0) {
            i11 = 0;
        }
        if ((i12 & 32) != 0) {
            num = null;
        }
        if ((i12 & 64) != 0) {
            bool = null;
        }
        if ((i12 & 128) != 0) {
            str = null;
        }
        c0 c0Var = (c0) cVar.f822b;
        if (elementMnuV2 instanceof GroupHeaderMnuV2) {
            c0Var.f34809s.setContent(new u3.d(new an.f((GroupHeaderMnuV2) elementMnuV2), true, -86472542));
            return;
        }
        if ((elementMnuV2 instanceof TextMnuV2) || (elementMnuV2 instanceof TextMnu)) {
            c0Var.f34809s.setContent(new u3.d(new an.b(elementMnuV2, z11, 0), true, -681522542));
            return;
        }
        if (elementMnuV2 instanceof HeaderItem) {
            c0Var.f34809s.setContent(new u3.d(new g((HeaderItem) elementMnuV2), true, -1017102558));
            return;
        }
        if (elementMnuV2 instanceof SeparatorItem) {
            c0Var.f34809s.setContent(an.a.f1616a);
            return;
        }
        if (elementMnuV2 instanceof BasketIntroBannerMnu) {
            c0Var.f34809s.setContent(new u3.d(new an.d((BasketIntroBannerMnu) elementMnuV2, cVar, yVar, 0), true, -26788468));
            return;
        }
        if (elementMnuV2 instanceof HighlightedItemMnuV2) {
            c0Var.f34809s.setContent(new u3.d(new an.e((HighlightedItemMnuV2) elementMnuV2, str, yVar), true, -329702159));
            return;
        }
        if (elementMnuV2 instanceof ItemMnu) {
            c0Var.f34809s.setContent(new u3.d(new u2(2, (ItemMnu) elementMnuV2, yVar), true, -234712582));
            return;
        }
        if (elementMnuV2 instanceof TypedItemCardsCarouselMnu) {
            if (num == null || bool == null) {
                return;
            }
            z zVar2 = zVar;
            c0Var.f34809s.setContent(new u3.d(new an.h(i11, num.intValue(), (TypedItemCardsCarouselMnu) elementMnuV2, yVar, zVar2, bool.booleanValue()), true, -2012519683));
            return;
        }
        y yVar2 = yVar;
        int i13 = i11;
        if ((elementMnuV2 instanceof CategoryCarouselMnuV2) || (elementMnuV2 instanceof ItemCarouselMnu) || (elementMnuV2 instanceof HighlightedItemCardsCarouselMnuV2) || (elementMnuV2 instanceof ItemCarouselMnuV2) || (elementMnuV2 instanceof HeroCarouselMnu)) {
            c0Var.f34809s.setContent(new u3.d(new i(elementMnuV2, str, i13, yVar2, 0), true, -1814673237));
        } else if (elementMnuV2 instanceof IntroBanner) {
            c0Var.f34809s.setContent(new u3.d(new an.d((IntroBanner) elementMnuV2, cVar, yVar2, 1), true, 585602088));
        }
    }

    public static boolean y(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    public void A(w0 w0Var) {
        if (w0Var.f16939b) {
            return;
        }
        w wVar = (w) this.f822b;
        synchronized (((ArrayList) wVar.f22748e)) {
            ((ArrayList) wVar.f22748e).remove(w0Var);
        }
    }

    public Bundle B() {
        Bundle bundle = (Bundle) this.f822b;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    public void C() {
        r80.d dVar = (r80.d) this.f822b;
        a4 a4Var = a4.CREATED;
        dVar.getClass();
        if (r80.d.f37784b.getAndSet(dVar, a4Var) == a4.CREATING) {
            throw null;
        }
    }

    public boolean D(m0 m0Var) {
        if (!m0Var.I()) {
            y4.a.b("DepthSortedSet.remove called on an unattached node");
        }
        return ((m2) this.f822b).remove(m0Var);
    }

    @Override // a2.b
    public Object a(q2 q2Var, Float f11, Float f12, Function1 function1, a2.i iVar) {
        float fFloatValue = f11.floatValue();
        float fFloatValue2 = f12.floatValue();
        Object objB = n.b(q2Var, Math.signum(fFloatValue2) * Math.abs(fFloatValue), fFloatValue, t1.c.b(0.0f, fFloatValue2, 28), (t1.i) this.f822b, function1, iVar);
        return objB == y70.a.COROUTINE_SUSPENDED ? objB : (a2.a) objB;
    }

    @Override // qz.q
    public void accept(Object obj, Object obj2) {
        r00.i iVar = (r00.i) obj;
        e10.i iVar2 = (e10.i) this.f822b;
        Bundle bundleB = iVar.b();
        r00.h hVar = new r00.h(1, (d10.g) obj2);
        try {
            r00.g gVar = (r00.g) iVar.getService();
            gVar.getClass();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(gVar.f11628i);
            r00.a.c(parcelObtain, iVar2);
            r00.a.c(parcelObtain, bundleB);
            r00.a.d(parcelObtain, hVar);
            gVar.M(24, parcelObtain);
        } catch (RemoteException e5) {
            Log.e("WalletClientImpl", "RemoteException during getPaymentCardRecognitionIntent", e5);
        }
    }

    @Override // c20.h
    public int b() {
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) this.f822b;
        return ((extendedFloatingActionButton.getMeasuredWidth() - extendedFloatingActionButton.getPaddingStart()) - extendedFloatingActionButton.getPaddingEnd()) + extendedFloatingActionButton.f12451h + extendedFloatingActionButton.f12452i;
    }

    @Override // c20.h
    public int c() {
        return ((ExtendedFloatingActionButton) this.f822b).f12452i;
    }

    @Override // m0.d0
    public i1 d() {
        throw null;
    }

    @Override // bt.a
    public void e() {
        ((b0) this.f822b).a(at.g.f4776j);
    }

    @Override // c20.h
    public ViewGroup.LayoutParams g() {
        return new ViewGroup.LayoutParams(-2, -2);
    }

    @Override // c20.h
    public int getHeight() {
        return ((ExtendedFloatingActionButton) this.f822b).getMeasuredHeight();
    }

    @Override // d10.f
    public Task h(Object obj) {
        i40.b bVar = (i40.b) obj;
        w2.z zVar = (w2.z) this.f822b;
        if (bVar == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
            return Tasks.d(null);
        }
        a40.o oVar = (a40.o) zVar.f43084c;
        a40.o.a(oVar);
        oVar.f758m.n(null, oVar.f751e.f5742a);
        oVar.f762q.d(null);
        return Tasks.d(null);
    }

    @Override // bt.a
    public void i(Uri uri) {
        uri.getClass();
        ((b0) this.f822b).a(new at.d(uri));
    }

    @Override // c5.s3
    public Function0 j(c5.a aVar) {
        return t3.a(aVar, (Lifecycle) this.f822b);
    }

    @Override // c20.h
    public int k() {
        return ((ExtendedFloatingActionButton) this.f822b).f12451h;
    }

    public void l(m0 m0Var) {
        if (!m0Var.I()) {
            y4.a.b("DepthSortedSet.add called on an unattached node");
        }
        ((m2) this.f822b).add(m0Var);
    }

    @Override // bt.a
    public void m(Uri uri) {
        uri.getClass();
        ((b0) this.f822b).a(new at.e(uri));
    }

    public void n(String str, y yVar) {
        ((c0) this.f822b).f986f.animate().scaleX(0.0f).scaleY(0.0f).alpha(0.0f).setDuration(100L).setInterpolator(new AccelerateDecelerateInterpolator()).setListener(new c70.b(null, new an.c(this, yVar, str, 0), 13)).start();
    }

    @Override // bt.a
    public void onPageFinished() {
        ((b0) this.f822b).a(at.f.f4774j);
    }

    @Override // d10.e
    public void onSuccess(Object obj) {
        ((d10.g) ((se.d) this.f822b).f39013b).f13697a.s();
    }

    @Override // bt.a
    public void p(RuntimeException runtimeException) {
        ((b0) this.f822b).a(new at.h(runtimeException));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object q(z70.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof f0.b4
            if (r0 == 0) goto L13
            r0 = r5
            f0.b4 r0 = (f0.b4) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            f0.b4 r0 = new f0.b4
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f16580j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r0 = r0.l
            if (r0 == 0) goto L40
            r1 = 1
            if (r0 != r1) goto L39
            ba0.g.M(r5)
            java.lang.Object r5 = r4.f822b
            r80.d r5 = (r80.d) r5
            f0.a4 r0 = f0.a4.PENDING
            f0.a4 r1 = f0.a4.CREATING
            boolean r5 = r5.a(r0, r1)
            if (r5 == 0) goto L37
            kotlin.Unit r5 = kotlin.Unit.f26487a
            return r5
        L37:
            r5 = 0
            throw r5
        L39:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L40:
            ba0.g.M(r5)
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a50.c.q(z70.c):java.lang.Object");
    }

    public long r() {
        int i11 = v.f23316i;
        long j9 = ((Parcel) this.f822b).readLong();
        long j11 = 63 & j9;
        if (j11 >= 16) {
            j9 = (j9 & (-64)) | (j11 + 1);
        }
        u70.b0 b0Var = u70.c0.f40833b;
        return j9;
    }

    public long s() {
        Parcel parcel = (Parcel) this.f822b;
        byte b8 = parcel.readByte();
        long j9 = b8 == 1 ? 4294967296L : b8 == 2 ? 8589934592L : 0L;
        return p.a(j9, 0L) ? z5.o.f47289c : b0.a0.F(parcel.readFloat(), j9);
    }

    public boolean t(String str) {
        String strX = x(str);
        return "1".equals(strX) || Boolean.parseBoolean(strX);
    }

    public String toString() {
        switch (this.f821a) {
            case 7:
                return ((m2) this.f822b).toString();
            default:
                return super.toString();
        }
    }

    public Integer u(String str) {
        String strX = x(str);
        if (TextUtils.isEmpty(strX)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(strX));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + E(str) + "(" + strX + ") into an int");
            return null;
        }
    }

    public JSONArray v(String str) {
        String strX = x(str);
        if (TextUtils.isEmpty(strX)) {
            return null;
        }
        try {
            return new JSONArray(strX);
        } catch (JSONException unused) {
            Log.w("NotificationParams", "Malformed JSON for key " + E(str) + ": " + strX + ", falling back to default");
            return null;
        }
    }

    public String w(Resources resources, String str, String str2) {
        String[] strArr;
        String strX = x(str2);
        if (!TextUtils.isEmpty(strX)) {
            return strX;
        }
        String strX2 = x(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(strX2)) {
            return null;
        }
        int identifier = resources.getIdentifier(strX2, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", E(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        JSONArray jSONArrayV = v(str2.concat("_loc_args"));
        if (jSONArrayV == null) {
            strArr = null;
        } else {
            int length = jSONArrayV.length();
            strArr = new String[length];
            for (int i11 = 0; i11 < length; i11++) {
                strArr[i11] = jSONArrayV.optString(i11);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException e5) {
            Log.w("NotificationParams", "Missing format argument for " + E(str2) + ": " + Arrays.toString(strArr) + " Default value will be used.", e5);
            return null;
        }
    }

    public String x(String str) {
        Bundle bundle = (Bundle) this.f822b;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String strReplace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(strReplace)) {
                str = strReplace;
            }
        }
        return bundle.getString(str);
    }

    public boolean z(CharSequence charSequence, h50.h hVar) {
        String str = hVar.f21478b;
        if (str.length() != 0) {
            Matcher matcher = ((se.b) this.f822b).m(str).matcher(charSequence);
            return matcher.lookingAt() && matcher.matches();
        }
        return false;
    }

    @Override // i30.h
    public /* bridge */ /* synthetic */ Object a() {
        return new d30.a((d30.e) ((i30.e) this.f822b).a());
    }

    public /* synthetic */ c(Object obj, int i11) {
        this.f821a = i11;
        this.f822b = obj;
    }

    public c(String str, int i11) {
        this.f821a = i11;
        switch (i11) {
            case 8:
                Parcel parcelObtain = Parcel.obtain();
                this.f822b = parcelObtain;
                byte[] bArrDecode = Base64.decode(str, 0);
                parcelObtain.unmarshall(bArrDecode, 0, bArrDecode.length);
                parcelObtain.setDataPosition(0);
                break;
            default:
                str.getClass();
                this.f822b = str;
                break;
        }
    }

    public c(se.b bVar, se.d dVar) {
        this.f821a = 13;
        this.f822b = dVar;
        Objects.requireNonNull(bVar);
    }

    public c(b0 b0Var) {
        this.f821a = 15;
        b0Var.getClass();
        this.f822b = b0Var;
    }

    public /* synthetic */ c(int i11, boolean z11) {
        this.f821a = i11;
    }

    public c(c0 c0Var) {
        this.f821a = 4;
        c0Var.getClass();
        this.f822b = c0Var;
    }

    public c(y3.b bVar) {
        this.f821a = 29;
        this.f822b = new WeakReference(bVar);
    }

    public c(View view) {
        this.f821a = 22;
        if (Build.VERSION.SDK_INT >= 30) {
            g0 g0Var = new g0(view);
            g0Var.f21539b = view;
            this.f822b = g0Var;
            return;
        }
        this.f822b = new e0(view);
    }

    public c(Bundle bundle) {
        this.f821a = 11;
        this.f822b = new Bundle(bundle);
    }

    public c(WindowInsetsController windowInsetsController) {
        this.f821a = 22;
        g0 g0Var = new g0(null);
        g0Var.f21540c = windowInsetsController;
        this.f822b = g0Var;
    }

    public c(y3 y3Var) {
        this.f821a = 17;
        y3Var.getClass();
        this.f822b = w.b.r(a4.PENDING);
    }

    public c(MainActivity mainActivity) {
        this.f821a = 10;
        this.f822b = mainActivity.getLifecycle();
    }
}
