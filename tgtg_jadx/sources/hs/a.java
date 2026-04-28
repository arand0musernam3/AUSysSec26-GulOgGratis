package hs;

import androidx.activity.result.ActivityResultLauncher;
import com.app.tgtg.feature.tabprofile.manageaccount.accountdetails.edit.EditDataActivity;
import com.app.tgtg.feature.tabprofile.manageaccount.notificationsettings.ui.NotificationSettingsActivity;
import ep.l;
import f70.k;
import jb.u;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import mv.r0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NotificationSettingsActivity f22461b;

    public /* synthetic */ a(NotificationSettingsActivity notificationSettingsActivity, int i11) {
        this.f22460a = i11;
        this.f22461b = notificationSettingsActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i11 = this.f22460a;
        NotificationSettingsActivity notificationSettingsActivity = this.f22461b;
        switch (i11) {
            case 0:
                int i12 = NotificationSettingsActivity.f9422k;
                notificationSettingsActivity.getOnBackPressedDispatcher().d();
                break;
            case 1:
                int i13 = NotificationSettingsActivity.f9422k;
                h hVarA0 = notificationSettingsActivity.a0();
                or.a aVar = or.a.EMAIL;
                hVarA0.getClass();
                aVar.getClass();
                cs.a aVar2 = hVarA0.f22476e;
                aVar2.getClass();
                aVar2.f13425a.a(new f70.b(EditDataActivity.class, u.x(new Pair("DATA", aVar)), false, false, false, null, null, null, null, false, 1020));
                break;
            case 2:
                int i14 = NotificationSettingsActivity.f9422k;
                Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                ActivityResultLauncher activityResultLauncher = notificationSettingsActivity.f9424g;
                if (activityResultLauncher == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("requestPermissionLauncher");
                    activityResultLauncher = null;
                }
                mv.d.c(notificationSettingsActivity, activityResultLauncher, null, new l(26, booleanRef, notificationSettingsActivity));
                break;
            case 3:
                int i15 = NotificationSettingsActivity.f9422k;
                break;
            case 4:
                int i16 = NotificationSettingsActivity.f9422k;
                notificationSettingsActivity.a0().f22476e.f13425a.a(k.f17493a);
                break;
            case 5:
                int i17 = NotificationSettingsActivity.f9422k;
                h hVarA02 = notificationSettingsActivity.a0();
                notificationSettingsActivity.d0(false);
                hVarA02.d(notificationSettingsActivity.b0());
                break;
            case 6:
                int i18 = NotificationSettingsActivity.f9422k;
                notificationSettingsActivity.d0(true);
                break;
            default:
                r0.m(notificationSettingsActivity, (6 & 2) == 0, (6 & 4) == 0);
                break;
        }
        return Unit.f26487a;
    }
}
