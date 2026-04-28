package oo;

import ao.g3;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.invitation.Invitation;
import com.app.tgtg.model.remote.order.Order;
import com.app.tgtg.model.remote.user.requests.CollectionTime;
import com.app.tgtg.model.remote.user.requests.DietaryPreferences;
import com.app.tgtg.model.remote.user.requests.UserGender;
import d2.m2;
import d2.z1;
import g3.r9;
import i4.g0;
import i4.r0;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.c0;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import m3.b1;
import m5.u0;
import mv.p0;
import o30.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class k implements i80.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32795a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f32796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f32797c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f32798d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u70.f f32799e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f32800f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f32801g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f32802h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f32803i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f32804j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f32805k;
    public final /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f32806m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f32807n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f32808o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f32809p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f32810q;

    public /* synthetic */ k(Invitation invitation, Function0 function0, Function0 function02, Function0 function03, b1 b1Var, b1 b1Var2, Integer num, Order order, Long l, Boolean bool, Function0 function04, Function0 function05, b1 b1Var3, Function0 function06, boolean z11, b1 b1Var4) {
        this.f32797c = invitation;
        this.f32798d = function0;
        this.f32799e = function02;
        this.f32800f = function03;
        this.f32804j = b1Var;
        this.f32805k = b1Var2;
        this.f32807n = num;
        this.f32808o = order;
        this.f32809p = l;
        this.f32810q = bool;
        this.f32801g = function04;
        this.f32802h = function05;
        this.l = b1Var3;
        this.f32803i = function06;
        this.f32796b = z11;
        this.f32806m = b1Var4;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String strP;
        String strJ;
        boolean z11;
        Iterable iterable;
        String str;
        String str2;
        String str3;
        int i11 = this.f32795a;
        Object obj4 = this.f32810q;
        Object obj5 = this.f32809p;
        Object obj6 = this.f32808o;
        Object obj7 = this.f32807n;
        Object obj8 = this.f32806m;
        Object obj9 = this.l;
        Object obj10 = this.f32805k;
        Object obj11 = this.f32804j;
        Object obj12 = this.f32803i;
        Object obj13 = this.f32802h;
        Object obj14 = this.f32801g;
        Object obj15 = this.f32800f;
        u70.f fVar = this.f32799e;
        Object obj16 = this.f32798d;
        Object obj17 = this.f32797c;
        switch (i11) {
            case 0:
                Invitation invitation = (Invitation) obj17;
                Function0 function0 = (Function0) obj16;
                Function0 function02 = (Function0) fVar;
                Function0 function03 = (Function0) obj15;
                b1 b1Var = (b1) obj11;
                b1 b1Var2 = (b1) obj10;
                Integer num = (Integer) obj7;
                Order order = (Order) obj6;
                Long l = (Long) obj5;
                Boolean bool = (Boolean) obj4;
                Function0 function04 = (Function0) obj14;
                Function0 function05 = (Function0) obj13;
                b1 b1Var3 = (b1) obj9;
                Function0 function06 = (Function0) obj12;
                b1 b1Var4 = (b1) obj8;
                m3.n nVar = (m3.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((d2.z) obj).getClass();
                m3.s sVar = (m3.s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    a.Q(invitation, function0, function02, function03, b1Var, b1Var2, num, u3.e.e(-1860068913, sVar, new i(order, bool, l, function04, function05, function06, b1Var3, b1Var4, this.f32796b)), sVar, 12582912);
                } else {
                    sVar.U();
                }
                break;
            default:
                Throwable th2 = (Throwable) obj17;
                String str4 = (String) obj16;
                Function1 function1 = (Function1) fVar;
                String str5 = (String) obj15;
                String str6 = (String) obj14;
                String str7 = (String) obj13;
                ir.h hVar = (ir.h) obj12;
                String str8 = (String) obj11;
                Function1 function12 = (Function1) obj10;
                UserGender userGender = (UserGender) obj9;
                DietaryPreferences dietaryPreferences = (DietaryPreferences) obj8;
                Function1 function13 = (Function1) obj7;
                List list = (List) obj6;
                Function1 function14 = (Function1) obj5;
                Function1 function15 = (Function1) obj4;
                z1 z1Var = (z1) obj;
                m3.n nVar2 = (m3.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                z1Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((m3.s) nVar2).f(z1Var) ? 4 : 2;
                }
                m3.s sVar2 = (m3.s) nVar2;
                if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    long j9 = lv.s.J;
                    r0 r0Var = g0.f23254b;
                    b4.q qVar = b4.q.f5711a;
                    b4.t tVarY = d2.c.y(v1.n.j(qVar, j9, r0Var), z1Var);
                    d2.g0 g0Var = m2.f13850c;
                    b4.t tVarR = d2.c.r(v1.n.r(tVarY.then(g0Var), v1.n.q(sVar2), true));
                    d2.d dVar = d2.i.f13803c;
                    b4.i iVar = b4.d.f5694m;
                    d2.y yVarA = d2.w.a(dVar, iVar, sVar2, 0);
                    int iHashCode = Long.hashCode(sVar2.T);
                    u3.i iVarL = sVar2.l();
                    b4.t tVarC = b4.a.c(tVarR, sVar2);
                    b5.j.R.getClass();
                    b5.h hVar2 = b5.i.f5839b;
                    sVar2.e0();
                    if (sVar2.S) {
                        sVar2.k(hVar2);
                    } else {
                        sVar2.n0();
                    }
                    b5.g gVar = b5.i.f5843f;
                    m3.i.C(yVarA, gVar, sVar2);
                    b5.g gVar2 = b5.i.f5842e;
                    m3.i.C(iVarL, gVar2, sVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    b5.g gVar3 = b5.i.f5844g;
                    m3.i.v(sVar2, numValueOf, gVar3);
                    b5.d dVar2 = b5.i.f5845h;
                    m3.i.z(sVar2, dVar2);
                    b5.g gVar4 = b5.i.f5841d;
                    m3.i.C(tVarC, gVar4, sVar2);
                    d2.y yVarA2 = d2.w.a(dVar, iVar, sVar2, 0);
                    int iHashCode2 = Long.hashCode(sVar2.T);
                    u3.i iVarL2 = sVar2.l();
                    b4.t tVarC2 = b4.a.c(g0Var, sVar2);
                    sVar2.e0();
                    if (sVar2.S) {
                        sVar2.k(hVar2);
                    } else {
                        sVar2.n0();
                    }
                    m3.i.C(yVarA2, gVar, sVar2);
                    m3.i.C(iVarL2, gVar2, sVar2);
                    w.a0.y(iHashCode2, sVar2, gVar3, sVar2, dVar2);
                    m3.i.C(tVarC2, gVar4, sVar2);
                    float f11 = lv.t.f28253g;
                    float f12 = lv.t.f28254h;
                    float f13 = lv.t.f28252f;
                    int i12 = 3;
                    b4.t tVarU = m2.u(d2.c.D(qVar, f11, f12, 0.0f, f13, 4), null, 3);
                    String strU = f0.U(sVar2, R.string.profile_personal_info_title);
                    u0 u0Var = lv.v.f28275o;
                    long j11 = lv.s.C;
                    r9.d(strU, tVarU, j11, 0L, null, 0L, null, new x5.k(5), 0L, 0, false, 0, 0, null, u0Var, sVar2, 432, 12582912, 130040);
                    sVar2.a0(-731741412);
                    if (StringsKt.H(str4)) {
                        String strU2 = f0.U(sVar2, R.string.profile_edit_name_optional);
                        Locale locale = Locale.getDefault();
                        locale.getClass();
                        String lowerCase = strU2.toLowerCase(locale);
                        lowerCase.getClass();
                        strP = w.a0.p("(", lowerCase, ")");
                    } else {
                        strP = str4;
                    }
                    sVar2.q(false);
                    boolean zF = sVar2.f(function1);
                    Object objM = sVar2.M();
                    m3.f fVar2 = m3.m.f29332a;
                    if (zF || objM == fVar2) {
                        objM = new defpackage.c(function1, 28);
                        sVar2.k0(objM);
                    }
                    android.support.v4.media.session.a.a(R.string.profile_menu_item_name, null, null, strP, false, (Function0) objM, sVar2, 0, 46);
                    boolean zF2 = sVar2.f(function1);
                    Object objM2 = sVar2.M();
                    if (zF2 || objM2 == fVar2) {
                        objM2 = new qr.f(function1, 0);
                        sVar2.k0(objM2);
                    }
                    android.support.v4.media.session.a.a(R.string.profile_menu_item_email, null, null, str5, this.f32796b, (Function0) objM2, sVar2, 0, 14);
                    boolean zF3 = sVar2.f(function1);
                    Object objM3 = sVar2.M();
                    if (zF3 || objM3 == fVar2) {
                        objM3 = new qr.f(function1, 1);
                        sVar2.k0(objM3);
                    }
                    android.support.v4.media.session.a.a(R.string.profile_menu_item_phonenumber, null, null, str6, false, (Function0) objM3, sVar2, 0, 46);
                    if (str7 == null) {
                        strJ = b3.i.j(-731704801, R.string.country_unknown, sVar2, sVar2, false);
                    } else {
                        sVar2.a0(-731705142);
                        sVar2.q(false);
                        strJ = str7;
                    }
                    boolean zF4 = sVar2.f(function1);
                    Object objM4 = sVar2.M();
                    if (zF4 || objM4 == fVar2) {
                        objM4 = new qr.f(function1, 2);
                        sVar2.k0(objM4);
                    }
                    android.support.v4.media.session.a.a(R.string.profile_menu_item_country, null, null, strJ, false, (Function0) objM4, sVar2, 0, 46);
                    g3 g3Var = hVar.f24124a;
                    if (g3Var.n().isCharityUser()) {
                        sVar2.a0(-1206067285);
                        sVar2.q(false);
                    } else {
                        sVar2.a0(-1207746152);
                        str8.getClass();
                        if (str8.length() > 0) {
                            LocalDate localDateE = p0.E(str8);
                            int year = localDateE.getYear();
                            int value = localDateE.getMonth().getValue() - 1;
                            int dayOfMonth = localDateE.getDayOfMonth();
                            Calendar calendar = Calendar.getInstance();
                            calendar.set(year, value, dayOfMonth);
                            str = new SimpleDateFormat("dd MMMM yyyy", Locale.getDefault()).format(calendar.getTime());
                            str.getClass();
                        } else {
                            str = "";
                        }
                        String str9 = str;
                        boolean zF5 = sVar2.f(function12) | sVar2.f(str8);
                        Object objM5 = sVar2.M();
                        if (zF5 || objM5 == fVar2) {
                            objM5 = new iq.e(function12, str8, 3);
                            sVar2.k0(objM5);
                        }
                        android.support.v4.media.session.a.a(R.string.profile_menu_item_birth_date, null, null, str9, false, (Function0) objM5, sVar2, 0, 46);
                        Integer numValueOf2 = userGender != null ? Integer.valueOf(userGender.getRes()) : null;
                        if (numValueOf2 == null) {
                            sVar2.a0(-1207310820);
                            sVar2.q(false);
                            str2 = null;
                        } else {
                            sVar2.a0(-1207310819);
                            String strU3 = f0.U(sVar2, numValueOf2.intValue());
                            sVar2.q(false);
                            str2 = strU3;
                        }
                        boolean zF6 = sVar2.f(function1) | sVar2.h(hVar);
                        Object objM6 = sVar2.M();
                        if (zF6 || objM6 == fVar2) {
                            objM6 = new qr.e(function1, hVar, 0);
                            sVar2.k0(objM6);
                        }
                        android.support.v4.media.session.a.a(R.string.profile_menu_item_gender, null, null, str2, false, (Function0) objM6, sVar2, 0, 46);
                        Integer numValueOf3 = dietaryPreferences != null ? Integer.valueOf(dietaryPreferences.getRes()) : null;
                        if (numValueOf3 == null) {
                            sVar2.a0(-1206657092);
                            sVar2.q(false);
                            str3 = null;
                        } else {
                            sVar2.a0(-1206657091);
                            String strU4 = f0.U(sVar2, numValueOf3.intValue());
                            sVar2.q(false);
                            str3 = strU4;
                        }
                        boolean zF7 = sVar2.f(function1) | sVar2.h(hVar);
                        Object objM7 = sVar2.M();
                        if (zF7 || objM7 == fVar2) {
                            objM7 = new qr.e(function1, hVar, 1);
                            sVar2.k0(objM7);
                        }
                        android.support.v4.media.session.a.a(R.string.profile_menu_item_dietary, null, null, str3, false, (Function0) objM7, sVar2, 0, 46);
                        sVar2.q(false);
                    }
                    if (g3Var.n().getShowManufacturerItems()) {
                        sVar2.a0(-1205941580);
                        r9.d(f0.U(sVar2, R.string.profile_delivery_addresses_title), d2.c.D(qVar, f11, lv.t.f28255i, 0.0f, f13, 4), j11, 0L, null, 0L, null, new x5.k(5), 0L, 0, false, 0, 0, null, u0Var, sVar2, 432, 12582912, 130040);
                        String strC = hVar.c(nr.a.HOME);
                        boolean zF8 = sVar2.f(function13) | sVar2.h(hVar);
                        Object objM8 = sVar2.M();
                        if (zF8 || objM8 == fVar2) {
                            objM8 = new qr.e(function13, hVar, 2);
                            sVar2.k0(objM8);
                        }
                        android.support.v4.media.session.a.a(R.string.profile_menu_item_home, null, null, strC, false, (Function0) objM8, sVar2, 0, 46);
                        String strC2 = hVar.c(nr.a.WORK);
                        boolean zF9 = sVar2.f(function13) | sVar2.h(hVar);
                        Object objM9 = sVar2.M();
                        if (zF9 || objM9 == fVar2) {
                            objM9 = new qr.e(function13, hVar, i12);
                            sVar2.k0(objM9);
                        }
                        android.support.v4.media.session.a.a(R.string.profile_menu_item_work, null, null, strC2, false, (Function0) objM9, sVar2, 0, 46);
                        String strC3 = hVar.c(nr.a.OTHER);
                        boolean zF10 = sVar2.f(function13) | sVar2.h(hVar);
                        Object objM10 = sVar2.M();
                        if (zF10 || objM10 == fVar2) {
                            objM10 = new qr.e(function13, hVar, 4);
                            sVar2.k0(objM10);
                        }
                        android.support.v4.media.session.a.a(R.string.profile_menu_item_other, null, null, strC3, false, (Function0) objM10, sVar2, 0, 46);
                        sVar2.q(false);
                    } else {
                        sVar2.a0(-1203582325);
                        sVar2.q(false);
                    }
                    mv.u uVar = hVar.f24127d;
                    uVar.getClass();
                    if (uVar.a(mv.k.APPTRK_CM_EDIT_PICKUP_TIMES) != null) {
                        sVar2.a0(-1203473484);
                        r9.d(f0.U(sVar2, R.string.profile_collection_times_title), d2.c.D(qVar, f11, lv.t.f28255i, 0.0f, f13, 4), j11, 0L, null, 0L, null, new x5.k(5), 0L, 0, false, 0, 0, null, u0Var, sVar2, 432, 12582912, 130040);
                        if (list == null || list.isEmpty()) {
                            sVar2.a0(-1202848710);
                            List listC = c0.c(f0.U(sVar2, R.string.profile_collection_times_default));
                            sVar2.q(false);
                            iterable = listC;
                        } else {
                            sVar2.a0(-1202730941);
                            ArrayList arrayList = new ArrayList(e0.o(list, 10));
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                arrayList.add(f0.U(sVar2, ((CollectionTime) it.next()).getShortLabelRes()));
                            }
                            sVar2.q(false);
                            iterable = arrayList;
                        }
                        String strU5 = CollectionsKt.U(iterable, ", ", null, null, null, 62);
                        boolean zH = sVar2.h(hVar) | sVar2.f(function1);
                        Object objM11 = sVar2.M();
                        if (zH || objM11 == fVar2) {
                            objM11 = new qr.e(hVar, function1);
                            sVar2.k0(objM11);
                        }
                        b0.z.d(strU5, (Function0) objM11, sVar2, 0);
                        sVar2.q(false);
                    } else {
                        sVar2.a0(-1201944533);
                        sVar2.q(false);
                    }
                    d2.c.f(d2.c.z(qVar, lv.t.f28253g), sVar2);
                    if (g3Var.n().isBusiness()) {
                        z11 = false;
                        sVar2.a0(-1201328501);
                        sVar2.q(false);
                    } else {
                        sVar2.a0(-1201810923);
                        i4.v vVar = new i4.v(lv.s.f28231k);
                        Integer numValueOf4 = Integer.valueOf(R.drawable.system_icon_delete);
                        boolean zF11 = sVar2.f(function14);
                        Object objM12 = sVar2.M();
                        if (zF11 || objM12 == fVar2) {
                            objM12 = new defpackage.c(function14, 29);
                            sVar2.k0(objM12);
                        }
                        android.support.v4.media.session.a.a(R.string.privacy_delete_account_menu_item, vVar, numValueOf4, null, false, (Function0) objM12, sVar2, 48, 52);
                        d2.c.f(d2.c.z(qVar, lv.t.f28252f), sVar2);
                        z11 = false;
                        sVar2.q(false);
                    }
                    sVar2.q(true);
                    sVar2.q(true);
                    if (th2 == null) {
                        sVar2.a0(1888472805);
                        sVar2.q(z11);
                    } else {
                        sVar2.a0(1888472806);
                        function15.invoke(f0.U(sVar2, R.string.generic_err_undefined_error));
                        sVar2.q(z11);
                    }
                } else {
                    sVar2.U();
                }
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ k(Throwable th2, String str, Function1 function1, String str2, boolean z11, String str3, String str4, ir.h hVar, String str5, Function1 function12, UserGender userGender, DietaryPreferences dietaryPreferences, Function1 function13, List list, Function1 function14, Function1 function15) {
        this.f32797c = th2;
        this.f32798d = str;
        this.f32799e = function1;
        this.f32800f = str2;
        this.f32796b = z11;
        this.f32801g = str3;
        this.f32802h = str4;
        this.f32803i = hVar;
        this.f32804j = str5;
        this.f32805k = function12;
        this.l = userGender;
        this.f32806m = dietaryPreferences;
        this.f32807n = function13;
        this.f32808o = list;
        this.f32809p = function14;
        this.f32810q = function15;
    }
}
