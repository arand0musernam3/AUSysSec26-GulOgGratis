package hb0;

import al.n;
import android.app.Activity;
import android.app.DatePickerDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.TextureView;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.DatePicker;
import androidx.datastore.core.CorruptionException;
import androidx.fragment.app.o0;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.m1;
import androidx.lifecycle.w;
import bg.k0;
import c5.a1;
import c5.f1;
import c5.s0;
import cj.e0;
import com.app.tgtg.R;
import com.app.tgtg.customview.manufactureaddressfragment.XmlCheckoutAddressFragment;
import com.app.tgtg.customview.npsratingview.NpsRatingView;
import com.app.tgtg.feature.main.MainActivity;
import com.app.tgtg.feature.orderview.manufacture.ManufacturerOrderActivity;
import com.app.tgtg.model.remote.DailyReminder;
import com.app.tgtg.model.remote.brief.BriefOrder;
import com.app.tgtg.model.remote.discover.response.DiscoverBucket;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.user.response.AddressField;
import com.app.tgtg.model.remote.user.response.AddressViolation;
import com.braze.storage.DataStoreProvider;
import g3.f9;
import g3.j8;
import i3.y;
import i4.g0;
import i4.v0;
import i9.x;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.d0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m2.e1;
import m3.b1;
import m3.c3;
import m3.h1;
import m3.l0;
import mv.a0;
import mv.p0;
import mv.z;
import org.bouncycastle.iana.AEADAlgorithm;
import v80.f0;
import z4.l1;
import zendesk.messaging.android.internal.UriHandler;
import zendesk.messaging.android.internal.conversationscreen.delegates.QuickReplyAdapterDelegate;
import zendesk.messaging.android.internal.conversationscreen.delegates.TextMessageContainerAdapterDelegate;
import zendesk.messaging.android.internal.model.MessageLogEntry;
import zendesk.storage.android.internal.BasicStorage;
import zendesk.ui.android.conversation.quickreply.QuickReplyOption;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f21775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f21776c;

    public /* synthetic */ o(int i11, Object obj, Object obj2) {
        this.f21774a = i11;
        this.f21775b = obj;
        this.f21776c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [android.util.AttributeSet, kotlin.jvm.internal.DefaultConstructorMarker, x70.c] */
    /* JADX WARN: Type inference failed for: r10v10 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int dayOfMonth;
        int value;
        int year;
        int i11 = this.f21774a;
        int i12 = 4;
        int i13 = 7;
        int i14 = 6;
        int i15 = 5;
        int i16 = 9;
        int i17 = 2;
        int i18 = 0;
        int i19 = 1;
        Object obj2 = this.f21776c;
        Object obj3 = this.f21775b;
        switch (i11) {
            case 0:
                return QuickReplyAdapterDelegate.ViewHolder.bind$lambda$4$lambda$3((Function1) obj3, (MessageLogEntry.QuickReply) obj2, (QuickReplyOption) obj);
            case 1:
                return TextMessageContainerAdapterDelegate.ViewHolder.renderContent$lambda$1((UriHandler) obj3, (MessageLogEntry.TextMessageContainer) obj2, (String) obj);
            case 2:
                MainActivity mainActivity = (MainActivity) obj3;
                List list = (List) obj2;
                BasicItem basicItem = (BasicItem) obj;
                ae.c cVar = mainActivity.f9083j;
                cVar.g(new yn.v((BriefOrder) list.get(0), new hm.h(mainActivity, i19), new ep.l(23, mainActivity, list), basicItem, new ep.l(24, basicItem, mainActivity)));
                cVar.i("end high prio // Order change", mainActivity.g0().c());
                hm.v vVarG0 = mainActivity.g0();
                BriefOrder briefOrder = (BriefOrder) list.get(0);
                briefOrder.getClass();
                f0.B(m1.d(vVarG0), null, null, new gf.g(vVarG0, briefOrder, str, i12), 3);
                return Unit.f26487a;
            case 3:
                hq.c cVar2 = (hq.c) obj3;
                int i21 = hq.c.f22343r;
                ((View) obj).getClass();
                DiscoverBucket discoverBucket = (DiscoverBucket) ((nq.d) obj2);
                String displayType = discoverBucket.getDisplayType();
                if (Intrinsics.areEqual(displayType, "FAVORITES")) {
                    Context contextD = p70.g.d(cVar2.getContext());
                    contextD.getClass();
                    a0 a0Var = new a0();
                    z zVar = z.FAVORITES;
                    zVar.getClass();
                    a0Var.f30138a = zVar;
                    f70.i iVar = f70.i.FAVORITE_BUCKET;
                    iVar.getClass();
                    a0Var.f30139b = iVar;
                    a0Var.f30143f = true;
                    a0Var.f30145h = 0;
                    a0Var.f30146i = 0;
                    a0Var.c((MainActivity) contextD);
                } else if (Intrinsics.areEqual(displayType, "MANUFACTURER")) {
                    Context contextD2 = p70.g.d(cVar2.getContext());
                    contextD2.getClass();
                    a0 a0Var2 = new a0();
                    z zVar2 = z.MANUFACTURER;
                    zVar2.getClass();
                    a0Var2.f30138a = zVar2;
                    f70.i iVar2 = f70.i.MANUFACTURER_BUCKET;
                    iVar2.getClass();
                    a0Var2.f30139b = iVar2;
                    a0Var2.f30143f = true;
                    a0Var2.f30145h = 0;
                    a0Var2.f30146i = 0;
                    a0Var2.c((MainActivity) contextD2);
                } else {
                    cVar2.d(discoverBucket);
                }
                cVar2.getEventTrackingManager().c(cv.i.ACTION_SEE_ALL_CLICKED, h0.g.E(new Pair(dv.a.DISCOVER_BUCKET, new dv.c(discoverBucket.getFillerType()))));
                return Unit.f26487a;
            case 4:
                int i22 = hq.o.f22390h;
                ((View) obj).getClass();
                DiscoverBucket discoverBucket2 = ((nq.f) obj2).f31355a;
                i80.n nVar = ((hq.o) obj3).f22393f;
                if (nVar != null) {
                    nVar.invoke(discoverBucket2.getFillerType(), discoverBucket2.getDisplayType(), discoverBucket2.getTitle());
                }
                return Unit.f26487a;
            case 5:
                y yVar = (y) obj3;
                AccessibilityManager accessibilityManager = (AccessibilityManager) obj2;
                if (((w) obj) == w.ON_RESUME) {
                    yVar.e(accessibilityManager);
                }
                return Unit.f26487a;
            case 6:
                f4.c cVar3 = (f4.c) obj;
                return cVar3.b(new androidx.fragment.app.r(new o(i13, ((v0) obj3).a(cVar3.f17292a.d(), cVar3.f17292a.getLayoutDirection(), cVar3), (f9) obj2), 15));
            case 7:
                g0.m((k4.d) obj, (g0) obj3, ((f9) obj2).a());
                return Unit.f26487a;
            case 8:
                ((g9.f0) obj3).l((LifecycleOwner) obj2);
                return new x();
            case 9:
                return new s0(8, (c3) obj3, (i9.i) obj2);
            case 10:
                LifecycleOwner lifecycleOwner = (LifecycleOwner) obj3;
                ((l0) obj).getClass();
                androidx.lifecycle.s sVar = new androidx.lifecycle.s((Function2) obj2, i12);
                lifecycleOwner.getLifecycle().a(sVar);
                return new s0(i16, lifecycleOwner, sVar);
            case 11:
                Activity activity = (Activity) obj3;
                final ir.h hVar = (ir.h) obj2;
                String str = (String) obj;
                str.getClass();
                if (activity != null) {
                    if (str.length() == 0) {
                        Calendar calendar = Calendar.getInstance();
                        dayOfMonth = calendar.get(5);
                        value = calendar.get(2);
                        year = calendar.get(1);
                    } else {
                        LocalDate localDateE = p0.E(str);
                        dayOfMonth = localDateE.getDayOfMonth();
                        value = localDateE.getMonth().getValue() - 1;
                        year = localDateE.getYear();
                    }
                    DatePickerDialog datePickerDialog = new DatePickerDialog(activity, new DatePickerDialog.OnDateSetListener() { // from class: ir.c
                        @Override // android.app.DatePickerDialog.OnDateSetListener
                        public final void onDateSet(DatePicker datePicker, int i23, int i24, int i25) {
                            a1 a1Var = p0.f30209a;
                            Calendar calendar2 = Calendar.getInstance();
                            calendar2.set(i23, i24, i25);
                            String str2 = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(calendar2.getTime());
                            str2.getClass();
                            h hVar2 = hVar;
                            f0.B(m1.d(hVar2), null, null, new n(hVar2, str2, (Boolean) null, (x70.c) null), 3);
                            hVar2.d(cv.i.TEMP_ACTION_ACCT_DETAILS_FIELD_SAVE, h0.g.E(new Pair(dv.a.SCREEN, new dv.c("birthday"))));
                        }
                    }, year, value, dayOfMonth);
                    datePickerDialog.getDatePicker().setMaxDate(Calendar.getInstance().getTimeInMillis());
                    datePickerDialog.getDatePicker().setMinDate(Calendar.getInstance().getTimeInMillis() - 3153600000000L);
                    datePickerDialog.setButton(-3, activity.getString(R.string.profile_menu_item_birth_date_dialog_delete_button), new cy.h(hVar, i17));
                    datePickerDialog.setButton(-1, activity.getString(R.string.profile_menu_item_birth_date_dialog_ok_button), datePickerDialog);
                    datePickerDialog.setButton(-2, activity.getString(R.string.profile_menu_item_birth_date_dialog_cancel_button), datePickerDialog);
                    datePickerDialog.show();
                    Button button = datePickerDialog.getButton(-1);
                    if (button != null) {
                        button.setAllCaps(false);
                    }
                    Button button2 = datePickerDialog.getButton(-2);
                    if (button2 != null) {
                        button2.setAllCaps(false);
                    }
                    Button button3 = datePickerDialog.getButton(-3);
                    if (button3 != null) {
                        button3.setTextColor(activity.getColor(R.color.red_40));
                        button3.setAllCaps(false);
                    }
                }
                return Unit.f26487a;
            case 12:
                e0 e0Var = (e0) obj3;
                nr.a aVar = (nr.a) obj;
                aVar.getClass();
                e0Var.T = aVar;
                e0Var.S = null;
                g9.p.e((g9.f0) obj2, qr.b.INSTANCE);
                return Unit.f26487a;
            case 13:
                Function1 function1 = (Function1) obj3;
                ((Boolean) obj).booleanValue();
                if (((Boolean) ((Function0) obj2).invoke()).booleanValue()) {
                    function1.invoke(Boolean.TRUE);
                }
                return Unit.f26487a;
            case 14:
                hs.h hVar2 = (hs.h) obj3;
                b1 b1Var = (b1) obj2;
                DailyReminder dailyReminder = (DailyReminder) obj;
                dailyReminder.getClass();
                hVar2.f22482k.setDailyReminder(dailyReminder);
                DailyReminder dailyReminder2 = hVar2.f22482k.getDailyReminder();
                if (dailyReminder2 != null) {
                    List listH = d0.h(Boolean.valueOf(dailyReminder2.getMonday()), Boolean.valueOf(dailyReminder2.getTuesday()), Boolean.valueOf(dailyReminder2.getWednesday()), Boolean.valueOf(dailyReminder2.getThursday()), Boolean.valueOf(dailyReminder2.getFriday()), Boolean.valueOf(dailyReminder2.getSaturday()), Boolean.valueOf(dailyReminder2.getSunday()));
                    if (listH == null || !listH.isEmpty()) {
                        Iterator it = listH.iterator();
                        while (it.hasNext()) {
                            if (((Boolean) it.next()).booleanValue() && (i18 = i18 + 1) < 0) {
                                d0.m();
                                throw null;
                            }
                        }
                    }
                    hVar2.l = i18;
                }
                b0.z.m(b1Var, hVar2.c());
                return Unit.f26487a;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                jg.p pVar = (jg.p) obj2;
                ((View) obj).getClass();
                c40.q qVar = ((jg.m) obj3).f25208b;
                jg.a0 a0Var3 = (jg.a0) qVar.f7095e;
                XmlCheckoutAddressFragment xmlCheckoutAddressFragment = a0Var3.f25148d;
                pVar.getClass();
                jg.a aVar2 = pVar.f25213a;
                if (qVar.f7092b) {
                    List list2 = (List) qVar.f7093c;
                    if (list2 != null && !list2.isEmpty()) {
                        Iterator it2 = list2.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                AddressViolation addressViolation = (AddressViolation) it2.next();
                                if ((addressViolation != null ? addressViolation.getField() : null) == AddressField.STATE) {
                                    list2.removeIf(new fn.h(new im.a(i14), i19));
                                }
                            }
                        }
                    }
                    List list3 = (List) qVar.f7094d;
                    if (list3 != null && !list3.isEmpty()) {
                        Iterator it3 = list3.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                AddressViolation addressViolation2 = (AddressViolation) it3.next();
                                if ((addressViolation2 != null ? addressViolation2.getField() : null) == AddressField.STATE) {
                                    list3.removeIf(new fn.h(new im.a(i13), i17));
                                }
                            }
                        }
                    }
                    xmlCheckoutAddressFragment.I();
                }
                boolean z11 = a0Var3.f25156m;
                pg.r rVar = a0Var3.f25145a;
                if (z11) {
                    rVar.H.setText((aVar2 != null ? aVar2.f25142b : null) + " (" + (aVar2 != null ? aVar2.f25141a : null) + ")");
                    rVar.H.setTextAppearance(R.style.Body1_Black);
                    a0Var3.g(aVar2 != null ? aVar2.f25141a : 0);
                    xmlCheckoutAddressFragment.I();
                    a0Var3.f();
                    a0Var3.f25156m = false;
                    new Handler(Looper.getMainLooper()).postDelayed(new d1.e(a0Var3, 25), 500L);
                }
                return Unit.f26487a;
            case 16:
                jg.a0 a0Var4 = (jg.a0) obj3;
                ((View) obj).getClass();
                a0Var4.f25148d.A();
                a0Var4.f25145a.f35109v.clearFocus();
                k0 k0Var = new k0((o0) obj2);
                k0Var.e(R.string.profile_edit_address_delete_dialog_title);
                k0Var.a(R.string.profile_edit_address_delete_dialog_message);
                k0Var.c(R.string.profile_edit_address_delete_positive_button);
                k0Var.l = new hi.d(a0Var4, 28);
                k0Var.f6176g = Integer.valueOf(R.drawable.button_primary_warning_bg);
                k0Var.b(R.string.profile_edit_address_delete_negative_button);
                k0Var.f6177h = Integer.valueOf(R.color.neutral_80);
                k0Var.f();
                return Unit.f26487a;
            case 17:
                f1 f1Var = (f1) obj2;
                int iIntValue = ((Integer) obj).intValue();
                m5.f fVar = (m5.f) CollectionsKt.firstOrNull(((m5.h) obj3).b(iIntValue, iIntValue, "TAG_URL"));
                if (fVar != null) {
                    f1Var.a((String) fVar.f29529a);
                }
                return Unit.f26487a;
            case 18:
                z4.z zVar3 = (z4.z) obj;
                zVar3.getClass();
                ((h1) obj3).i((int) (zVar3.u() >> 32));
                ((h1) obj2).i((int) (zVar3.u() & 4294967295L));
                return Unit.f26487a;
            case 19:
                hk.c cVar4 = (hk.c) obj3;
                f2.l lVar = (f2.l) obj;
                lVar.getClass();
                f2.l.s(lVar, cVar4.f22091c.size(), null, new u3.d(new dm.e(i15, cVar4, (ek.q) obj2), true, -975029336), 6);
                return Unit.f26487a;
            case 20:
                return BasicStorage.set$lambda$0(obj3, (String) obj2, (SharedPreferences.Editor) obj);
            case 21:
                ArrayList arrayList = (ArrayList) obj3;
                Context context = (Context) obj;
                int i23 = ManufacturerOrderActivity.f9167q;
                context.getClass();
                NpsRatingView npsRatingView = new NpsRatingView(context, str, i17, str);
                npsRatingView.a(arrayList, 0, new k8.d(i16, arrayList, (ManufacturerOrderActivity) obj2));
                return npsRatingView;
            case 22:
                z3.r rVar2 = (z3.r) obj2;
                Uri uri = (Uri) obj;
                uri.getClass();
                ((Function0) obj3).invoke();
                int iIndexOf = rVar2.indexOf(uri);
                if (iIndexOf != -1) {
                    rVar2.set(iIndexOf, null);
                }
                return Unit.f26487a;
            case 23:
                ep.d0 d0Var = (ep.d0) obj3;
                hp.g gVar = (hp.g) obj2;
                int iIntValue2 = ((Integer) obj).intValue();
                dv.d dVar = iIntValue2 != 0 ? iIntValue2 != 1 ? dv.d.NONE : dv.d.INSTRUCTIONS : dv.d.INGREDIENTS;
                d0Var.r(cv.i.ACTION_TAP_RECIPE_TAB, h0.g.E(new Pair(dv.a.TAB, new dv.c(dVar != null ? dVar.a() : null)), new Pair(dv.a.TITLE, new dv.c(gVar.f22276b))));
                return Unit.f26487a;
            case 24:
                Uri uri2 = (Uri) obj3;
                Function0 function0 = (Function0) obj2;
                TextureView textureView = (TextureView) obj;
                textureView.getClass();
                Object tag = textureView.getTag(-1412567294);
                if (Intrinsics.areEqual(tag instanceof Uri ? (Uri) tag : null, uri2)) {
                    return Unit.f26487a;
                }
                textureView.setTag(-1412567294, uri2);
                if (textureView.getSurfaceTexture() != null) {
                    lp.r.k(textureView, uri2, function0);
                }
                return Unit.f26487a;
            case 25:
                return DataStoreProvider.createOrGetDataStore$lambda$10$lambda$9((String) obj3, (DataStoreProvider) obj2, (CorruptionException) obj);
            case 26:
                Function1 function12 = (Function1) obj3;
                r5.y yVar2 = (r5.y) obj;
                if (!Intrinsics.areEqual((r5.y) obj2, yVar2)) {
                    function12.invoke(yVar2);
                }
                return Unit.f26487a;
            case 27:
                e1 e1Var = (e1) obj3;
                i4.r rVar3 = (i4.r) obj2;
                b5.o0 o0Var = (b5.o0) obj;
                o0Var.b();
                if (((Boolean) e1Var.f28835s.getValue()).booleanValue() || ((Boolean) e1Var.f28836t.getValue()).booleanValue()) {
                    k4.d.A0(o0Var, rVar3, 0L, 0L, 0.0f, null, 0, 126);
                }
                return Unit.f26487a;
            case 28:
                l1 l1Var = (l1) obj;
                ArrayList arrayListQ = m2.g0.q((List) obj3, (Function0) ((j8) obj2).f18909b);
                if (arrayListQ != null) {
                    int size = arrayListQ.size();
                    while (i18 < size) {
                        Pair pair = (Pair) arrayListQ.get(i18);
                        z4.m1 m1Var = (z4.m1) pair.f26485a;
                        Function0 function02 = (Function0) pair.f26486b;
                        l1.n(l1Var, m1Var, function02 != null ? ((z5.j) function02.invoke()).f47280a : 0L);
                        i18++;
                    }
                }
                return Unit.f26487a;
            default:
                return new s0(10, (b1) obj3, (b2.l) obj2);
        }
    }

    public /* synthetic */ o(int i11, Object obj, Function1 function1) {
        this.f21774a = i11;
        this.f21776c = obj;
        this.f21775b = function1;
    }
}
