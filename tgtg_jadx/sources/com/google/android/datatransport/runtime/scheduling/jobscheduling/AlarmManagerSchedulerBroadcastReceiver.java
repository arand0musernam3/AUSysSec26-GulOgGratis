package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import bx.c;
import com.braze.models.inappmessage.InAppMessageBase;
import cz.d;
import cz.j;
import java.util.concurrent.Executor;
import t5.a;
import wy.i;
import wy.p;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f11005a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter(InAppMessageBase.EXTRAS);
        int iIntValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i11 = intent.getExtras().getInt("attemptNumber");
        p.b(context);
        a aVarA = i.a();
        aVarA.J(queryParameter);
        aVarA.f39793d = gz.a.b(iIntValue);
        if (queryParameter2 != null) {
            aVarA.f39792c = Base64.decode(queryParameter2, 0);
        }
        j jVar = p.a().f43592d;
        ((Executor) jVar.f13637g).execute(new d(jVar, aVarA.f(), i11, new c(10)));
    }
}
