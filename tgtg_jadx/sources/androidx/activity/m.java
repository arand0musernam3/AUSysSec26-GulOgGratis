package androidx.activity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.contract.ActivityResultContract;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends ActivityResultRegistry {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ComponentActivity f1741h;

    public m(ComponentActivity componentActivity) {
        this.f1741h = componentActivity;
    }

    @Override // androidx.activity.result.ActivityResultRegistry
    public final void b(int i11, ActivityResultContract activityResultContract, Object obj, se.b bVar) {
        Bundle bundle;
        int i12;
        activityResultContract.getClass();
        ComponentActivity componentActivity = this.f1741h;
        fd.j jVarB = activityResultContract.b(componentActivity, obj);
        if (jVarB != null) {
            new Handler(Looper.getMainLooper()).post(new l(this, i11, jVarB, 0));
            return;
        }
        Intent intentA = activityResultContract.a(componentActivity, obj);
        if (intentA.getExtras() != null) {
            Bundle extras = intentA.getExtras();
            extras.getClass();
            if (extras.getClassLoader() == null) {
                intentA.setExtrasClassLoader(componentActivity.getClassLoader());
            }
        }
        if (intentA.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundle = intentA.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intentA.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundle = bVar != null ? ((ActivityOptions) bVar.f39010b).toBundle() : null;
        }
        Bundle bundle2 = bundle;
        if (Intrinsics.areEqual("androidx.activity.result.contract.action.REQUEST_PERMISSIONS", intentA.getAction())) {
            String[] stringArrayExtra = intentA.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            androidx.core.app.e.k(componentActivity, stringArrayExtra, i11);
            return;
        }
        if (!Intrinsics.areEqual("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST", intentA.getAction())) {
            componentActivity.startActivityForResult(intentA, i11, bundle2);
            return;
        }
        h.g gVar = (h.g) intentA.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try {
            gVar.getClass();
            i12 = i11;
            try {
                componentActivity.startIntentSenderForResult(gVar.f20949a, i12, gVar.f20950b, gVar.f20951c, gVar.f20952d, 0, bundle2);
            } catch (IntentSender.SendIntentException e5) {
                e = e5;
                new Handler(Looper.getMainLooper()).post(new l(this, i12, e, 1));
            }
        } catch (IntentSender.SendIntentException e11) {
            e = e11;
            i12 = i11;
        }
    }
}
