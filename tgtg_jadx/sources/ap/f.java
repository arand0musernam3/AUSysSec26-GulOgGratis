package ap;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.app.tgtg.feature.tabprofile.impact.co2esaved.Co2eSavedActivity;
import com.app.tgtg.feature.tabprofile.impact.moneysaved.MoneySavedActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import mv.a0;
import mv.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f4532b;

    public /* synthetic */ f(Activity activity, int i11) {
        this.f4531a = i11;
        this.f4532b = activity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i11 = this.f4531a;
        Activity activity = this.f4532b;
        switch (i11) {
            case 0:
                if (activity != null) {
                    a0 a0Var = new a0();
                    z zVar = z.PROFILE;
                    zVar.getClass();
                    a0Var.f30138a = zVar;
                    a0Var.c(activity);
                }
                break;
            case 1:
                if (activity != null) {
                    activity.finish();
                }
                break;
            case 2:
                if (activity != null) {
                    activity.finish();
                }
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                new a0().c(activity);
                break;
            case 7:
                if (activity != null) {
                    activity.finish();
                }
                break;
            case 8:
                Intent intent = new Intent();
                intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", activity.getPackageName(), null));
                activity.startActivity(intent);
                break;
            case 9:
                if (activity != null) {
                    int i12 = Co2eSavedActivity.f9306g;
                    activity.startActivity(new Intent(activity, (Class<?>) Co2eSavedActivity.class), mv.a.b(activity));
                }
                break;
            default:
                if (activity != null) {
                    int i13 = MoneySavedActivity.f9312g;
                    activity.startActivity(new Intent(activity, (Class<?>) MoneySavedActivity.class), mv.a.b(activity));
                }
                break;
        }
        return Unit.f26487a;
    }
}
