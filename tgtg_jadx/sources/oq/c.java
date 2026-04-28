package oq;

import at.c0;
import com.app.tgtg.R;
import com.app.tgtg.feature.tabprofile.manageaccount.notificationsettings.ui.NotificationSettingsActivity;
import com.app.tgtg.model.remote.user.response.C2CReferralResponse;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f32920j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ n f32921k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i11, n nVar, x70.c cVar) {
        super(2, cVar);
        this.f32920j = i11;
        this.f32921k = nVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f32920j) {
            case 0:
                return new c(0, this.f32921k, cVar);
            case 1:
                return new c(1, this.f32921k, cVar);
            case 2:
                return new c(2, this.f32921k, cVar);
            default:
                return new c(3, this.f32921k, cVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        y80.j jVar = (y80.j) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f32920j) {
        }
        return ((c) create(jVar, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f32920j;
        n nVar = this.f32921k;
        switch (i11) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                nVar.f32944c.f32948a.a(new f70.a());
                break;
            case 1:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                cv.b bVar = nVar.f32943b;
                cv.i iVar = cv.i.ACTION_GOTO_NOTIFICATIONS;
                dv.a aVar3 = dv.a.SOURCE;
                dv.d dVar = dv.d.INVITE_FRIENDS;
                bVar.d(iVar, aVar3, dVar != null ? dVar.a() : null);
                nVar.f32944c.f32948a.a(new f70.b(NotificationSettingsActivity.class, jb.u.x(new Pair("OPEN_SYSTEM_SETTINGS", Boolean.FALSE)), false, false, false, null, null, null, null, false, 1020));
                break;
            case 2:
                y70.a aVar4 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                C2CReferralResponse c2CReferralResponseA = nVar.a();
                String termsUrl = c2CReferralResponseA != null ? c2CReferralResponseA.getTermsUrl() : null;
                if (termsUrl == null) {
                    termsUrl = "";
                }
                c0.c(nVar.f32945d, termsUrl, ct.a.TERMS_AND_CONDITIONS_USER_REFERRAL, Integer.valueOf(R.string.c2c_v3_invite_friends_terms), true, 16);
                break;
            default:
                y70.a aVar5 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                nVar.f32943b.b(cv.i.SCREEN_INVITE_FRIENDS);
                nVar.f32943b.b(cv.i.BRAZE_ACTION_REFERRAL_PERSONA_INVITE_FRIENDS_SCREEN_VISITED);
                break;
        }
        return Unit.f26487a;
    }
}
