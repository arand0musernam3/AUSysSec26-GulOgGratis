package g3;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import androidx.lifecycle.LifecycleOwner;
import com.app.tgtg.customview.DiscoverLocationView;
import com.app.tgtg.model.remote.user.response.C2CReferralResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f6 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f18613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f18614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f18615d;

    public /* synthetic */ f6(k1.g gVar, Function1 function1, boolean z11) {
        this.f18612a = 5;
        this.f18614c = gVar;
        this.f18615d = function1;
        this.f18613b = z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [kotlin.collections.n0] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ?? arrayList;
        int i11 = this.f18612a;
        int i12 = 1;
        int i13 = 0;
        Object obj2 = this.f18615d;
        Object obj3 = this.f18614c;
        final boolean z11 = this.f18613b;
        switch (i11) {
            case 0:
                ((z4.l1) obj).j((z4.m1) obj2, 0, 0, ((Number) ((m3.c3) obj3).getValue()).floatValue() + (z11 ? 5.0f : 0.0f));
                break;
            case 1:
                String str = (String) obj3;
                d7 d7Var = (d7) obj2;
                j5.b0 b0Var = (j5.b0) obj;
                if (z11) {
                    j5.z.k(b0Var, 0);
                }
                b7 b7Var = new b7(d7Var, 0);
                KProperty[] kPropertyArr = j5.z.f24734a;
                b0Var.b(j5.m.f24677v, new j5.a(null, b7Var));
                j5.z.l(str, b0Var);
                break;
            case 2:
                DiscoverLocationView discoverLocationView = (DiscoverLocationView) obj;
                discoverLocationView.getClass();
                discoverLocationView.setOnChangeLocation((Function0) obj3);
                discoverLocationView.setupLocation(z11, (String) obj2);
                break;
            case 3:
                i2.e0 e0Var = (i2.e0) obj3;
                v80.b0 b0Var2 = (v80.b0) obj2;
                j5.b0 b0Var3 = (j5.b0) obj;
                if (z11) {
                    i2.o oVar = new i2.o(e0Var, b0Var2, i13);
                    KProperty[] kPropertyArr2 = j5.z.f24734a;
                    b0Var3.b(j5.m.f24680y, new j5.a(null, oVar));
                    b0Var3.b(j5.m.A, new j5.a(null, new i2.o(e0Var, b0Var2, i12)));
                } else {
                    i2.o oVar2 = new i2.o(e0Var, b0Var2, 2);
                    KProperty[] kPropertyArr3 = j5.z.f24734a;
                    b0Var3.b(j5.m.f24681z, new j5.a(null, oVar2));
                    b0Var3.b(j5.m.B, new j5.a(null, new i2.o(e0Var, b0Var2, 3)));
                }
                break;
            case 4:
                final g9.l lVar = (g9.l) obj3;
                final List list = (List) obj2;
                androidx.lifecycle.c0 c0Var = new androidx.lifecycle.c0() { // from class: i9.k
                    @Override // androidx.lifecycle.c0
                    public final void onStateChanged(LifecycleOwner lifecycleOwner, androidx.lifecycle.w wVar) {
                        boolean z12 = z11;
                        List list2 = list;
                        g9.l lVar2 = lVar;
                        if (z12 && !list2.contains(lVar2)) {
                            list2.add(lVar2);
                        }
                        if (wVar == androidx.lifecycle.w.ON_START && !list2.contains(lVar2)) {
                            list2.add(lVar2);
                        }
                        if (wVar == androidx.lifecycle.w.ON_STOP) {
                            list2.remove(lVar2);
                        }
                    }
                };
                lVar.f20169h.f27523j.a(c0Var);
                break;
            case 5:
                k1.g gVar = (k1.g) obj3;
                Function1 function1 = (Function1) obj2;
                k1.f fVar = (k1.f) obj;
                if (fVar.getAttachedState() != gVar) {
                    gVar.f25728f = fVar;
                    fVar.setAttachedState(gVar);
                    function1.invoke(gVar);
                }
                if (z5.l.a(0L, 0L)) {
                    fVar.getHolder().setSizeFromLayout();
                } else {
                    fVar.getHolder().setFixedSize((int) 0, (int) 0);
                }
                fVar.getHolder().setFormat(z11 ? -1 : -3);
                fVar.setSecure(false);
                break;
            default:
                oq.n nVar = (oq.n) obj3;
                C2CReferralResponse c2CReferralResponse = (C2CReferralResponse) obj2;
                String str2 = (String) obj;
                str2.getClass();
                if (z11) {
                    nVar.f32943b.b(cv.i.BRAZE_ACTION_REFERRAL_PERSONA_CLICK_INVITE_FRIENDS);
                }
                cv.b bVar = nVar.f32943b;
                cv.i iVar = cv.i.ACTION_SEND_INVITE_V3;
                dv.a aVar = dv.a.SOURCE;
                dv.d dVar = dv.d.INVITE_FRIENDS;
                bVar.d(iVar, aVar, dVar != null ? dVar.a() : null);
                if (kotlin.text.y.k(c2CReferralResponse.getCountryIsoCode(), "US", true)) {
                    qq.c cVar = nVar.f32942a;
                    cVar.getClass();
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("text/plain");
                    List<ResolveInfo> listQueryIntentActivities = cVar.f37233a.getPackageManager().queryIntentActivities(intent, 0);
                    listQueryIntentActivities.getClass();
                    arrayList = new ArrayList();
                    Set setW = kotlin.collections.y.W(new String[]{"me.bluemail.mail", "io.cleanfox.android", "com.google.android.gm", "com.microsoft.office.outlook", "com.ninefolders.hd3", "com.samsung.android.email.provide", "ch.protonmail.android", "com.readdle.spark", "com.tempmail", "com.trtf.blue", "park.outlook.sign.in.client", "com.yahoo.mobile.client.android.mail"});
                    for (ResolveInfo resolveInfo : listQueryIntentActivities) {
                        if (setW.contains(resolveInfo.activityInfo.packageName)) {
                            ActivityInfo activityInfo = resolveInfo.activityInfo;
                            arrayList.add(new ComponentName(activityInfo.packageName, activityInfo.name));
                        }
                    }
                } else {
                    arrayList = kotlin.collections.n0.f26529a;
                }
                oq.o oVar3 = nVar.f32944c;
                oVar3.getClass();
                arrayList.getClass();
                oVar3.f32948a.a(new pq.g(str2, arrayList));
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ f6(Object obj, boolean z11, Object obj2, int i11) {
        this.f18612a = i11;
        this.f18614c = obj;
        this.f18613b = z11;
        this.f18615d = obj2;
    }

    public /* synthetic */ f6(boolean z11, Object obj, Object obj2, int i11) {
        this.f18612a = i11;
        this.f18613b = z11;
        this.f18614c = obj;
        this.f18615d = obj2;
    }
}
