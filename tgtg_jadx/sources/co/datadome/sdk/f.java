package co.datadome.sdk;

import android.widget.ProgressBar;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes.dex */
public final class f extends k80.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ChallengeActivity f8654b;

    /* JADX WARN: Illegal instructions before constructor call */
    public f(ChallengeActivity challengeActivity, int i11) {
        this.f8653a = i11;
        switch (i11) {
            case 1:
                Boolean bool = Boolean.TRUE;
                this.f8654b = challengeActivity;
                super(bool);
                break;
            default:
                Boolean bool2 = Boolean.TRUE;
                this.f8654b = challengeActivity;
                super(bool2);
                break;
        }
    }

    @Override // k80.b
    public final void afterChange(KProperty kProperty, Object obj, Object obj2) {
        int i11 = this.f8653a;
        ChallengeActivity challengeActivity = this.f8654b;
        kProperty.getClass();
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        ((Boolean) obj).getClass();
        switch (i11) {
            case 0:
                mc.a aVar = challengeActivity.f8615b;
                if (aVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    aVar = null;
                }
                ((ProgressBar) aVar.f29923c).setVisibility(zBooleanValue & ((Boolean) challengeActivity.l.getValue(challengeActivity, ChallengeActivity.f8613m[1])).booleanValue() ? 0 : 8);
                break;
            default:
                KProperty[] kPropertyArr = ChallengeActivity.f8613m;
                challengeActivity.runOnUiThread(new bg.u(!zBooleanValue, challengeActivity));
                break;
        }
    }
}
