package cw;

import a50.c;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.net.Uri;
import androidx.activity.result.ActivityResultLauncher;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelProvider$Factory;
import at.b0;
import b5.o;
import co.datadome.sdk.x;
import com.app.tgtg.customview.TGTGLoadingView;
import com.app.tgtg.feature.charity.ui.help.CharityContactUsActivity;
import com.app.tgtg.feature.login.LoginActivity;
import com.app.tgtg.feature.login.email.EmailAccessActivity;
import com.app.tgtg.feature.login.email.EmailCodeAccessActivity;
import com.app.tgtg.feature.main.fragments.delivery.parcelitemdetails.ManufacturerItemDetailsActivity;
import com.app.tgtg.feature.recipegenerator.RecipeGeneratorActivity;
import com.app.tgtg.feature.survey.bringmagic.BringBackMagicActivity;
import com.app.tgtg.feature.survey.rewards.RewardsSurveyActivity;
import com.app.tgtg.feature.tabprofile.legal.privacy.trackingconsent.TrackingConsentDetailActivity;
import com.app.tgtg.model.remote.item.response.HeroComponentResponse;
import com.braze.enums.DeviceKey;
import com.braze.h2;
import com.braze.models.outgoing.g;
import com.braze.models.q;
import com.google.firebase.messaging.a0;
import dq.i;
import e.n;
import ea.f;
import eo.d;
import f0.c1;
import g3.f3;
import g4.l;
import g4.p;
import ga0.k;
import h2.e0;
import h2.h0;
import i.e;
import java.util.concurrent.Executor;
import jb.s;
import jb.u;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.c0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import od.h;
import org.bouncycastle.iana.AEADAlgorithm;
import pg.x0;
import v80.r0;
import zendesk.messaging.android.internal.conversationscreen.delegates.MessageLoadMoreAdapterDelegate;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13457b;

    public /* synthetic */ b(Object obj, int i11) {
        this.f13456a = i11;
        this.f13457b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int largeMemoryClass;
        int i11 = this.f13456a;
        int i12 = 0;
        Object obj = this.f13457b;
        switch (i11) {
            case 0:
                return g.a((DeviceKey) obj);
            case 1:
                ((r0) obj).a();
                return Unit.f26487a;
            case 2:
                ((n) obj).a(u.o(new e()), null);
                return Unit.f26487a;
            case 3:
                ((i) ((BringBackMagicActivity) obj).f9258f.getValue()).f15156a.f17871a.a(LoginActivity.f9032j);
                return Unit.f26487a;
            case 4:
                ((b0) ((c) obj).f822b).a(new at.b());
                return Unit.f26487a;
            case 5:
                return com.braze.models.outgoing.event.a.b((q) obj);
            case 6:
                f fVar = (f) obj;
                fVar.getLifecycle().a(new ea.b(fVar, i12));
                return Unit.f26487a;
            case 7:
                ManufacturerItemDetailsActivity manufacturerItemDetailsActivity = (ManufacturerItemDetailsActivity) obj;
                int i13 = ManufacturerItemDetailsActivity.f9137q;
                Point point = new Point();
                manufacturerItemDetailsActivity.getWindowManager().getDefaultDisplay().getRealSize(point);
                int i14 = point.y;
                manufacturerItemDetailsActivity.getWindowManager().getDefaultDisplay().getSize(point);
                return Integer.valueOf(i14 - point.y);
            case 8:
                eo.f fVar2 = ((d) obj).f16197a;
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse("package:" + fVar2.requireActivity().getPackageName()));
                intent.addCategory("android.intent.category.DEFAULT");
                intent.setFlags(268435456);
                fVar2.startActivity(intent);
                return Unit.f26487a;
            case 9:
                int i15 = RecipeGeneratorActivity.f9238k;
                ((RecipeGeneratorActivity) obj).finish();
                return Unit.f26487a;
            case 10:
                ((ActivityResultLauncher) ((k8.d) obj).f26135c).a(u.o(i.d.f22568a), null);
                return Unit.f26487a;
            case 11:
                return (h1.e) ((c1) obj).f16586d.get();
            case 12:
                o.h((f3.a) obj);
                return Unit.f26487a;
            case 13:
                return c0.c((Pair) obj);
            case 14:
                Context context = (Context) ((a0) obj).f12779b;
                double d3 = 0.2d;
                try {
                    Object systemService = context.getSystemService((Class<Object>) ActivityManager.class);
                    systemService.getClass();
                    if (((ActivityManager) systemService).isLowRamDevice()) {
                        d3 = 0.15d;
                    }
                } catch (Exception unused) {
                }
                if (0.0d > d3 || d3 > 1.0d) {
                    i4.a.f("percent must be in the range [0.0, 1.0].");
                    return null;
                }
                h hVar = new h(0);
                try {
                    Object systemService2 = context.getSystemService((Class<Object>) ActivityManager.class);
                    systemService2.getClass();
                    ActivityManager activityManager = (ActivityManager) systemService2;
                    largeMemoryClass = (context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
                    break;
                } catch (Exception unused2) {
                    largeMemoryClass = 256;
                }
                return new od.d(new x((long) (d3 * ((long) largeMemoryClass) * 1048576), hVar), hVar);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                ((p) ((l) obj)).b(true);
                return Unit.f26487a;
            case 16:
                x0 x0Var = ((EmailAccessActivity) obj).f9045g;
                x0Var.getClass();
                ((TGTGLoadingView) x0Var.f35269j).setVisibility(8);
                return Unit.f26487a;
            case 17:
                EmailCodeAccessActivity emailCodeAccessActivity = (EmailCodeAccessActivity) obj;
                int i16 = EmailCodeAccessActivity.f9048k;
                s sVarD = s.d(emailCodeAccessActivity);
                sVarD.getClass();
                sVarD.a("UserPolling2");
                al.p pVarA0 = emailCodeAccessActivity.a0();
                if (Intrinsics.areEqual("email", "email")) {
                    pVarA0.f1575n.a(true, true);
                } else {
                    Intrinsics.areEqual("email", "landing");
                }
                return Unit.f26487a;
            case 18:
                ((f3) obj).f18591a.invoke();
                return Unit.f26487a;
            case 19:
                l9.c cVar = ((g9.l) obj).f20169h;
                if (!cVar.f27522i) {
                    h2.b("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
                    return null;
                }
                if (cVar.f27523j.f3435d != Lifecycle.State.DESTROYED) {
                    return ((l9.b) r40.d.k(cVar.f27514a, (ViewModelProvider$Factory) cVar.f27525m.getValue(), 4).a(Reflection.getOrCreateKotlinClass(l9.b.class))).f27513a;
                }
                h2.b("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.");
                return null;
            case 20:
                r90.e.b((k) obj);
                return Unit.f26487a;
            case 21:
                u90.n nVar = ((ga0.g) obj).f20293h;
                nVar.getClass();
                nVar.cancel();
                return Unit.f26487a;
            case 22:
                return ((HeroComponentResponse) obj).getBackgroundAnimationId();
            case 23:
                return Boolean.valueOf(((dn.k) obj).n());
            case 24:
                ((gq.d) ((RewardsSurveyActivity) obj).f9262f.getValue()).f20796a.f17871a.a(LoginActivity.f9032j);
                return Unit.f26487a;
            case 25:
                int i17 = TrackingConsentDetailActivity.f9342g;
                ((TrackingConsentDetailActivity) obj).getOnBackPressedDispatcher().d();
                return Unit.f26487a;
            case 26:
                return (Executor) ((g0.f) obj).invoke();
            case 27:
                e0 e0Var = ((h0) obj).f21124j;
                if (e0Var != null) {
                    o.h(e0Var);
                }
                return Unit.f26487a;
            case 28:
                return MessageLoadMoreAdapterDelegate.ViewHolder.bind$lambda$2$lambda$0((MessageLoadMoreAdapterDelegate.ViewHolder) obj);
            default:
                int i18 = CharityContactUsActivity.f8983f;
                ((CharityContactUsActivity) obj).finish();
                return Unit.f26487a;
        }
    }
}
