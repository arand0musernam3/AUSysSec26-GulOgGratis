package y00;

import android.content.Context;
import android.os.Bundle;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.google.android.gms.internal.measurement.vf;
import java.util.List;
import zendesk.messaging.android.internal.conversationscreen.ConversationTypingEvents;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d0 implements w, y3.i, zz.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ d0 f44666b = new d0(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ d0 f44667c = new d0(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ d0 f44668d = new d0(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ d0 f44669e = new d0(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ d0 f44670f = new d0(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ d0 f44671g = new d0(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ d0 f44672h = new d0(6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44673a;

    public /* synthetic */ d0(int i11) {
        this.f44673a = i11;
    }

    public static yi.r b(boolean z11, BasicItem basicItem, aj.c cVar, String str, boolean z12, yi.v vVar) {
        yi.r rVar = new yi.r();
        rVar.f46020k = vVar;
        rVar.setCancelable(false);
        Bundle bundle = new Bundle();
        bundle.putParcelable("ITEM", basicItem);
        bundle.putString("RETURN_URL", str);
        bundle.putBoolean("SHOULD_CANCEL", true);
        bundle.putBoolean("SHOW_DIALOG", z12);
        bundle.putBoolean("IS_MULTI_ITEM", z11);
        bundle.putParcelable("BASKET_CHECKOUT_DATA", cVar);
        rVar.setArguments(bundle);
        return rVar;
    }

    public static yi.r c(BasicItem basicItem, String str, String str2, yi.v vVar, int i11) {
        if ((i11 & 4) != 0) {
            str2 = null;
        }
        boolean z11 = (i11 & 8) == 0;
        basicItem.getClass();
        str.getClass();
        yi.r rVar = new yi.r();
        rVar.f46020k = vVar;
        rVar.setCancelable(z11);
        Bundle bundle = new Bundle();
        bundle.putParcelable("ITEM", basicItem);
        bundle.putString("RETURN_URL", str);
        bundle.putString("FILLER_TYPE", str2);
        bundle.putBoolean("IS_MULTI_ITEM", false);
        rVar.setArguments(bundle);
        return rVar;
    }

    public static yi.r d(boolean z11, BasicItem basicItem, aj.c cVar, String str, yi.v vVar) {
        yi.r rVar = new yi.r();
        rVar.f46020k = vVar;
        rVar.setCancelable(false);
        Bundle bundle = new Bundle();
        bundle.putParcelable("ITEM", basicItem);
        bundle.putString("RETURN_URL", str);
        bundle.putBoolean("USER_ABORTED", true);
        bundle.putBoolean("IS_MULTI_ITEM", z11);
        bundle.putParcelable("BASKET_CHECKOUT_DATA", cVar);
        rVar.setArguments(bundle);
        return rVar;
    }

    @Override // y00.w
    public Object a() {
        switch (this.f44673a) {
            case 0:
                List list = g0.f44762a;
                return (Boolean) com.google.android.gms.internal.measurement.r3.f11815a.get();
            case 1:
                List list2 = g0.f44762a;
                com.google.android.gms.internal.measurement.d3.f11335b.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.e3.f11370a.f(70, 1000L, "measurement.upload.max_events_per_bundle").get()).longValue());
            case 2:
                List list3 = g0.f44762a;
                com.google.android.gms.internal.measurement.f4.f11406b.get();
                return (Boolean) com.google.android.gms.internal.measurement.g4.f11432a.b("measurement.rb.attribution.client2", 1, true).get();
            case 3:
                List list4 = g0.f44762a;
                com.google.android.gms.internal.measurement.f4.f11406b.get();
                return (Boolean) com.google.android.gms.internal.measurement.g4.f11432a.b("measurement.rb.attribution.service.enable_max_trigger_uris_queried_at_once", 4, true).get();
            case 4:
                List list5 = g0.f44762a;
                return (Boolean) com.google.android.gms.internal.measurement.k4.f11561b.get();
            case 5:
                List list6 = g0.f44762a;
                com.google.android.gms.internal.measurement.d3.f11335b.get();
                return (Long) com.google.android.gms.internal.measurement.e3.f11370a.f(0, ConversationTypingEvents.TIME_INTERVAL_IN_MILLIS, "measurement.ad_id_cache_time").get();
            default:
                return new Boolean(((Boolean) com.google.android.gms.internal.measurement.c4.f11302a.get()).booleanValue());
        }
    }

    @Override // y3.i
    public Object e(Object obj) {
        obj.getClass();
        List list = (List) obj;
        Object obj2 = list.get(0);
        obj2.getClass();
        int iIntValue = ((Integer) obj2).intValue();
        Object obj3 = list.get(1);
        obj3.getClass();
        Object obj4 = list.get(2);
        obj4.getClass();
        Object obj5 = list.get(3);
        obj5.getClass();
        int iIntValue2 = ((Integer) obj5).intValue();
        Object obj6 = list.get(4);
        obj6.getClass();
        long jB = m5.k0.b(iIntValue2, ((Integer) obj6).intValue());
        Object obj7 = list.get(5);
        obj7.getClass();
        int iIntValue3 = ((Integer) obj7).intValue();
        Object obj8 = list.get(6);
        obj8.getClass();
        long jB2 = m5.k0.b(iIntValue3, ((Integer) obj8).intValue());
        Object obj9 = list.get(7);
        obj9.getClass();
        return new y2.d(iIntValue, (String) obj3, (String) obj4, jB, jB2, ((Long) obj9).longValue(), false, 64);
    }

    @Override // zz.c
    public vf g(Context context, String str, zz.b bVar) {
        int iC;
        switch (this.f44673a) {
            case 12:
                vf vfVar = new vf();
                int iC2 = bVar.c(context, str, true);
                vfVar.f11969b = iC2;
                if (iC2 != 0) {
                    vfVar.f11970c = 1;
                } else {
                    int iD = bVar.d(context, str);
                    vfVar.f11968a = iD;
                    if (iD != 0) {
                        vfVar.f11970c = -1;
                    }
                }
                return vfVar;
            default:
                vf vfVar2 = new vf();
                int iD2 = bVar.d(context, str);
                vfVar2.f11968a = iD2;
                int i11 = 1;
                int i12 = 0;
                if (iD2 != 0) {
                    iC = bVar.c(context, str, false);
                    vfVar2.f11969b = iC;
                } else {
                    iC = bVar.c(context, str, true);
                    vfVar2.f11969b = iC;
                }
                int i13 = vfVar2.f11968a;
                if (i13 == 0) {
                    if (iC == 0) {
                        i11 = 0;
                    }
                    vfVar2.f11970c = i11;
                    return vfVar2;
                }
                i12 = i13;
                if (i12 >= iC) {
                    i11 = -1;
                }
                vfVar2.f11970c = i11;
                return vfVar2;
        }
    }

    @Override // y3.i
    public Object i(y3.a aVar, Object obj) {
        y2.d dVar = (y2.d) obj;
        Integer numValueOf = Integer.valueOf(dVar.f45376a);
        String str = dVar.f45377b;
        String str2 = dVar.f45378c;
        long j9 = dVar.f45379d;
        int i11 = m5.t0.f29649c;
        Integer numValueOf2 = Integer.valueOf((int) (j9 >> 32));
        Integer numValueOf3 = Integer.valueOf((int) (j9 & 4294967295L));
        long j11 = dVar.f45380e;
        return kotlin.collections.d0.h(numValueOf, str, str2, numValueOf2, numValueOf3, Integer.valueOf((int) (j11 >> 32)), Integer.valueOf((int) (4294967295L & j11)), Long.valueOf(dVar.f45381f));
    }
}
